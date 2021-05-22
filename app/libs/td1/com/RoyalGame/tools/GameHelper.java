package com.RoyalGame.tools;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentSender;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import b.c.b.a.b.b;
import b.c.b.a.b.i;
import b.c.b.a.f.c;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.f;
import com.google.android.gms.games.b;
import java.util.ArrayList;

public class GameHelper implements f.b, f.c {
    public static final int CLIENT_ALL = 7;
    public static final int CLIENT_APPSTATE = 4;
    public static final int CLIENT_GAMES = 1;
    public static final int CLIENT_NONE = 0;
    public static final int CLIENT_PLUS = 2;
    static final int DEFAULT_MAX_SIGN_IN_ATTEMPTS = 0;
    static final int RC_RESOLVE = 9001;
    static final int RC_UNUSED = 9002;
    static final String TAG = "GameHelper";
    private final String GAMEHELPER_SHARED_PREFS = "GAMEHELPER_SHARED_PREFS";
    private final String KEY_SIGN_IN_CANCELLATIONS = "KEY_SIGN_IN_CANCELLATIONS";
    Activity mActivity = null;
    Context mAppContext = null;
    a.d.C0027d mAppStateApiOptions = null;
    boolean mConnectOnStart = false;
    private boolean mConnecting = false;
    b mConnectionResult = null;
    boolean mDebugLog = false;
    boolean mExpectingResolution = false;
    b.a mGamesApiOptions = b.a.b().a();
    f mGoogleApiClient = null;
    f.a mGoogleApiClientBuilder = null;
    Handler mHandler;
    com.google.android.gms.games.e.a mInvitation;
    GameHelperListener mListener = null;
    int mMaxAutoSignInAttempts = 0;
    c.a mPlusApiOptions = null;
    int mRequestedClients = 0;
    ArrayList<com.google.android.gms.games.g.a> mRequests;
    private boolean mSetupDone = false;
    boolean mShowErrorDialogs = true;
    boolean mSignInCancelled = false;
    SignInFailureReason mSignInFailureReason = null;
    com.google.android.gms.games.e.b.a mTurnBasedMatch;
    boolean mUserInitiatedSignIn = false;

    public interface GameHelperListener {
        void onSignInFailed();

        void onSignInSucceeded();
    }

    public static class SignInFailureReason {
        public static final int NO_ACTIVITY_RESULT_CODE = -100;
        int mActivityResultCode;
        int mServiceErrorCode;

        public SignInFailureReason(int i) {
            this(i, -100);
        }

        public SignInFailureReason(int i, int i2) {
            this.mServiceErrorCode = 0;
            this.mActivityResultCode = -100;
            this.mServiceErrorCode = i;
            this.mActivityResultCode = i2;
        }

        public int getActivityResultCode() {
            return this.mActivityResultCode;
        }

        public int getServiceErrorCode() {
            return this.mServiceErrorCode;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("SignInFailureReason(serviceErrorCode:");
            sb.append(b.b(this.mServiceErrorCode));
            String str = ")";
            if (this.mActivityResultCode != -100) {
                str = ",activityResultCode:" + b.a(this.mActivityResultCode) + str;
            }
            sb.append(str);
            return sb.toString();
        }
    }

    public GameHelper(Activity activity, int i) {
        this.mActivity = activity;
        this.mAppContext = activity.getApplicationContext();
        this.mRequestedClients = i;
        this.mHandler = new Handler();
    }

    private void doApiOptionsPreCheck() {
        if (this.mGoogleApiClientBuilder != null) {
            logError("GameHelper: you cannot call set*ApiOptions after the client builder has been created. Call it before calling createApiClientBuilder() or setup().");
            throw new IllegalStateException("GameHelper: you cannot call set*ApiOptions after the client builder has been created. Call it before calling createApiClientBuilder() or setup().");
        }
    }

    static Dialog makeSimpleDialog(Activity activity, String str) {
        return new AlertDialog.Builder(activity).setMessage(str).setNeutralButton(17039370, (DialogInterface.OnClickListener) null).create();
    }

    static Dialog makeSimpleDialog(Activity activity, String str, String str2) {
        return new AlertDialog.Builder(activity).setMessage(str2).setTitle(str).setNeutralButton(17039370, (DialogInterface.OnClickListener) null).create();
    }

    public static void showFailureDialog(Activity activity, int i, int i2) {
        int i3;
        if (activity == null) {
            Log.e(TAG, "*** No Activity. Can't show failure dialog!");
            return;
        }
        switch (i) {
            case 10002:
                i3 = 1;
                break;
            case 10003:
                i3 = 3;
                break;
            case 10004:
                i3 = 2;
                break;
            default:
                if (i.a(i2, activity, RC_UNUSED, null) == null) {
                    Log.e(TAG, "No standard error dialog available. Making fallback dialog.");
                    makeSimpleDialog(activity, b.a(activity, 0) + " " + b.b(i2));
                    return;
                }
                return;
        }
        makeSimpleDialog(activity, b.a(activity, i3)).show();
    }

    /* access modifiers changed from: package-private */
    public void assertConfigured(String str) {
        if (!this.mSetupDone) {
            String str2 = "GameHelper error: Operation attempted without setup: " + str + ". The setup() method must be called before attempting any other operation.";
            logError(str2);
            throw new IllegalStateException(str2);
        }
    }

    public void beginUserInitiatedSignIn() {
        debugLog("beginUserInitiatedSignIn: resetting attempt count.");
        resetSignInCancellations();
        this.mSignInCancelled = false;
        this.mConnectOnStart = true;
        if (this.mGoogleApiClient.d()) {
            logWarn("beginUserInitiatedSignIn() called when already connected. Calling listener directly to notify of success.");
            notifyListener(true);
        } else if (this.mConnecting) {
            logWarn("beginUserInitiatedSignIn() called when already connecting. Be patient! You can only call this method after you get an onSignInSucceeded() or onSignInFailed() callback. Suggestion: disable the sign-in button on startup and also when it's clicked, and re-enable when you get the callback.");
        } else {
            debugLog("Starting USER-INITIATED sign-in flow.");
            this.mUserInitiatedSignIn = true;
            if (this.mConnectionResult != null) {
                debugLog("beginUserInitiatedSignIn: continuing pending sign-in flow.");
                this.mConnecting = true;
                resolveConnectionResult();
                return;
            }
            debugLog("beginUserInitiatedSignIn: starting new sign-in flow.");
            this.mConnecting = true;
            connect();
        }
    }

    public void clearInvitation() {
        this.mInvitation = null;
    }

    public void clearRequests() {
        this.mRequests = null;
    }

    public void clearTurnBasedMatch() {
        this.mTurnBasedMatch = null;
    }

    /* access modifiers changed from: package-private */
    public void connect() {
        if (this.mGoogleApiClient.d()) {
            debugLog("Already connected.");
            return;
        }
        debugLog("Starting connection.");
        this.mConnecting = true;
        this.mInvitation = null;
        this.mTurnBasedMatch = null;
        this.mGoogleApiClient.a();
    }

    public f.a createApiClientBuilder() {
        if (!this.mSetupDone) {
            f.a aVar = new f.a(this.mActivity, this, this);
            if ((this.mRequestedClients & 1) != 0) {
                aVar.a(com.google.android.gms.games.b.f, this.mGamesApiOptions);
                aVar.a(com.google.android.gms.games.b.d);
            }
            if ((this.mRequestedClients & 2) != 0) {
                aVar.a(c.f520c, this.mPlusApiOptions);
                aVar.a(c.d);
            }
            this.mGoogleApiClientBuilder = aVar;
            return aVar;
        }
        logError("GameHelper: you called GameHelper.createApiClientBuilder() after calling setup. You can only get a client builder BEFORE performing setup.");
        throw new IllegalStateException("GameHelper: you called GameHelper.createApiClientBuilder() after calling setup. You can only get a client builder BEFORE performing setup.");
    }

    /* access modifiers changed from: package-private */
    public void debugLog(String str) {
        if (this.mDebugLog) {
            Log.d(TAG, "GameHelper: " + str);
        }
    }

    public void disconnect() {
        if (this.mGoogleApiClient.d()) {
            debugLog("Disconnecting client.");
            this.mGoogleApiClient.b();
            return;
        }
        Log.w(TAG, "disconnect() called when client was already disconnected.");
    }

    public void enableDebugLog(boolean z) {
        this.mDebugLog = z;
        if (z) {
            debugLog("Debug log enabled.");
        }
    }

    @Deprecated
    public void enableDebugLog(boolean z, String str) {
        Log.w(TAG, "GameHelper.enableDebugLog(boolean,String) is deprecated. Use GameHelper.enableDebugLog(boolean)");
        enableDebugLog(z);
    }

    public f getApiClient() {
        f fVar = this.mGoogleApiClient;
        if (fVar != null) {
            return fVar;
        }
        throw new IllegalStateException("No GoogleApiClient. Did you call setup()?");
    }

    public com.google.android.gms.games.e.a getInvitation() {
        if (!this.mGoogleApiClient.d()) {
            Log.w(TAG, "Warning: getInvitation() should only be called when signed in, that is, after getting onSignInSuceeded()");
        }
        return this.mInvitation;
    }

    public String getInvitationId() {
        if (!this.mGoogleApiClient.d()) {
            Log.w(TAG, "Warning: getInvitationId() should only be called when signed in, that is, after getting onSignInSuceeded()");
        }
        com.google.android.gms.games.e.a aVar = this.mInvitation;
        if (aVar == null) {
            return null;
        }
        return aVar.E();
    }

    public ArrayList<com.google.android.gms.games.g.a> getRequests() {
        if (!this.mGoogleApiClient.d()) {
            Log.w(TAG, "Warning: getRequests() should only be called when signed in, that is, after getting onSignInSuceeded()");
        }
        return this.mRequests;
    }

    /* access modifiers changed from: package-private */
    public int getSignInCancellations() {
        return this.mAppContext.getSharedPreferences("GAMEHELPER_SHARED_PREFS", 0).getInt("KEY_SIGN_IN_CANCELLATIONS", 0);
    }

    public SignInFailureReason getSignInError() {
        return this.mSignInFailureReason;
    }

    public com.google.android.gms.games.e.b.a getTurnBasedMatch() {
        if (!this.mGoogleApiClient.d()) {
            Log.w(TAG, "Warning: getTurnBasedMatch() should only be called when signed in, that is, after getting onSignInSuceeded()");
        }
        return this.mTurnBasedMatch;
    }

    /* access modifiers changed from: package-private */
    public void giveUp(SignInFailureReason signInFailureReason) {
        this.mConnectOnStart = false;
        disconnect();
        this.mSignInFailureReason = signInFailureReason;
        if (signInFailureReason.mActivityResultCode == 10004) {
            b.c(this.mAppContext);
        }
        showFailureDialog();
        this.mConnecting = false;
        notifyListener(false);
    }

    public boolean hasInvitation() {
        return this.mInvitation != null;
    }

    public boolean hasRequests() {
        return this.mRequests != null;
    }

    public boolean hasSignInError() {
        return this.mSignInFailureReason != null;
    }

    public boolean hasTurnBasedMatch() {
        return this.mTurnBasedMatch != null;
    }

    /* access modifiers changed from: package-private */
    public int incrementSignInCancellations() {
        int signInCancellations = getSignInCancellations();
        SharedPreferences.Editor edit = this.mAppContext.getSharedPreferences("GAMEHELPER_SHARED_PREFS", 0).edit();
        int i = signInCancellations + 1;
        edit.putInt("KEY_SIGN_IN_CANCELLATIONS", i);
        edit.commit();
        return i;
    }

    public boolean isConnecting() {
        return this.mConnecting;
    }

    public boolean isSignedIn() {
        f fVar = this.mGoogleApiClient;
        return fVar != null && fVar.d();
    }

    /* access modifiers changed from: package-private */
    public void logError(String str) {
        Log.e(TAG, "*** GameHelper ERROR: " + str);
    }

    /* access modifiers changed from: package-private */
    public void logWarn(String str) {
        Log.w(TAG, "!!! GameHelper WARNING: " + str);
    }

    public Dialog makeSimpleDialog(String str) {
        Activity activity = this.mActivity;
        if (activity != null) {
            return makeSimpleDialog(activity, str);
        }
        logError("*** makeSimpleDialog failed: no current Activity!");
        return null;
    }

    public Dialog makeSimpleDialog(String str, String str2) {
        Activity activity = this.mActivity;
        if (activity != null) {
            return makeSimpleDialog(activity, str, str2);
        }
        logError("*** makeSimpleDialog failed: no current Activity!");
        return null;
    }

    /* access modifiers changed from: package-private */
    public void notifyListener(boolean z) {
        StringBuilder sb = new StringBuilder();
        sb.append("Notifying LISTENER of sign-in ");
        sb.append(z ? "SUCCESS" : this.mSignInFailureReason != null ? "FAILURE (error)" : "FAILURE (no error)");
        debugLog(sb.toString());
        GameHelperListener gameHelperListener = this.mListener;
        if (gameHelperListener == null) {
            return;
        }
        if (z) {
            try {
                gameHelperListener.onSignInSucceeded();
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else {
            gameHelperListener.onSignInFailed();
        }
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        String str;
        String str2;
        StringBuilder sb = new StringBuilder();
        sb.append("onActivityResult: req=");
        sb.append(i == RC_RESOLVE ? "RC_RESOLVE" : String.valueOf(i));
        sb.append(", resp=");
        sb.append(b.a(i2));
        debugLog(sb.toString());
        if (i != RC_RESOLVE) {
            str2 = "onActivityResult: request code not meant for us. Ignoring.";
        } else {
            this.mExpectingResolution = false;
            if (!this.mConnecting) {
                str2 = "onActivityResult: ignoring because we are not connecting.";
            } else {
                if (i2 == -1) {
                    str = "onAR: Resolution was RESULT_OK, so connecting current client again.";
                } else if (i2 == 10001) {
                    str = "onAR: Resolution was RECONNECT_REQUIRED, so reconnecting.";
                } else if (i2 == 0) {
                    debugLog("onAR: Got a cancellation result, so disconnecting.");
                    this.mSignInCancelled = true;
                    this.mConnectOnStart = false;
                    this.mUserInitiatedSignIn = false;
                    this.mSignInFailureReason = null;
                    this.mConnecting = false;
                    this.mGoogleApiClient.b();
                    int signInCancellations = getSignInCancellations();
                    int incrementSignInCancellations = incrementSignInCancellations();
                    debugLog("onAR: # of cancellations " + signInCancellations + " --> " + incrementSignInCancellations + ", max " + this.mMaxAutoSignInAttempts);
                    notifyListener(false);
                    return;
                } else {
                    debugLog("onAR: responseCode=" + b.a(i2) + ", so giving up.");
                    giveUp(new SignInFailureReason(this.mConnectionResult.L(), i2));
                    return;
                }
                debugLog(str);
                connect();
                return;
            }
        }
        debugLog(str2);
    }

    @Override // com.google.android.gms.common.api.f.b
    public void onConnected(Bundle bundle) {
        debugLog("onConnected: connected!");
        if (bundle != null) {
            debugLog("onConnected: connection hint provided. Checking for invite.");
            com.google.android.gms.games.e.a aVar = (com.google.android.gms.games.e.a) bundle.getParcelable("invitation");
            if (!(aVar == null || aVar.E() == null)) {
                debugLog("onConnected: connection hint has a room invite!");
                this.mInvitation = aVar;
                debugLog("Invitation ID: " + this.mInvitation.E());
            }
            this.mRequests = com.google.android.gms.games.b.u.a(bundle);
            if (!this.mRequests.isEmpty()) {
                debugLog("onConnected: connection hint has " + this.mRequests.size() + " request(s)");
            }
            debugLog("onConnected: connection hint provided. Checking for TBMP game.");
            this.mTurnBasedMatch = (com.google.android.gms.games.e.b.a) bundle.getParcelable("turn_based_match");
        }
        succeedSignIn();
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x00b7  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x00c4  */
    @Override // com.google.android.gms.common.api.f.c
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onConnectionFailed(b.c.b.a.b.b r6) {
        /*
        // Method dump skipped, instructions count: 205
        */
        throw new UnsupportedOperationException("Method not decompiled: com.RoyalGame.tools.GameHelper.onConnectionFailed(b.c.b.a.b.b):void");
    }

    @Override // com.google.android.gms.common.api.f.b
    public void onConnectionSuspended(int i) {
        debugLog("onConnectionSuspended, cause=" + i);
        disconnect();
        this.mSignInFailureReason = null;
        debugLog("Making extraordinary call to onSignInFailed callback");
        this.mConnecting = false;
        notifyListener(false);
    }

    public void onStart(Activity activity) {
        this.mActivity = activity;
        this.mAppContext = activity.getApplicationContext();
        debugLog("onStart");
        assertConfigured("onStart");
        if (!this.mConnectOnStart) {
            debugLog("Not attempting to connect becase mConnectOnStart=false");
            debugLog("Instead, reporting a sign-in failure.");
            this.mHandler.postDelayed(new a(this), 1000);
        } else if (this.mGoogleApiClient.d()) {
            Log.w(TAG, "GameHelper: client was already connected on onStart()");
        } else {
            debugLog("Connecting client.");
            this.mConnecting = true;
            this.mGoogleApiClient.a();
        }
    }

    public void onStop() {
        debugLog("onStop");
        assertConfigured("onStop");
        if (this.mGoogleApiClient.d()) {
            debugLog("Disconnecting client due to onStop");
            this.mGoogleApiClient.b();
        } else {
            debugLog("Client already disconnected when we got onStop.");
        }
        this.mConnecting = false;
        this.mExpectingResolution = false;
        this.mActivity = null;
    }

    public void reconnectClient() {
        if (!this.mGoogleApiClient.d()) {
            Log.w(TAG, "reconnectClient() called when client is not connected.");
            connect();
            return;
        }
        debugLog("Reconnecting client.");
        this.mGoogleApiClient.e();
    }

    /* access modifiers changed from: package-private */
    public void resetSignInCancellations() {
        SharedPreferences.Editor edit = this.mAppContext.getSharedPreferences("GAMEHELPER_SHARED_PREFS", 0).edit();
        edit.putInt("KEY_SIGN_IN_CANCELLATIONS", 0);
        edit.commit();
    }

    /* access modifiers changed from: package-private */
    public void resolveConnectionResult() {
        if (this.mExpectingResolution) {
            debugLog("We're already expecting the result of a previous resolution.");
        } else if (this.mActivity == null) {
            Log.e(TAG, "Ignoring attempt to resolve connection result without an active Activity.");
        } else {
            debugLog("resolveConnectionResult: trying to resolve result: " + this.mConnectionResult);
            if (this.mConnectionResult.O()) {
                debugLog("Result has resolution. Starting it.");
                try {
                    this.mExpectingResolution = true;
                    this.mConnectionResult.a(this.mActivity, RC_RESOLVE);
                } catch (IntentSender.SendIntentException unused) {
                    debugLog("SendIntentException, so connecting again.");
                    connect();
                }
            } else {
                debugLog("resolveConnectionResult: result has no resolution. Giving up.");
                giveUp(new SignInFailureReason(this.mConnectionResult.L()));
            }
        }
    }

    public void setAppStateApiOptions(a.d.C0027d dVar) {
        doApiOptionsPreCheck();
        this.mAppStateApiOptions = dVar;
    }

    public void setConnectOnStart(boolean z) {
        debugLog("Forcing mConnectOnStart=" + z);
        this.mConnectOnStart = z;
    }

    public void setGamesApiOptions(b.a aVar) {
        doApiOptionsPreCheck();
        this.mGamesApiOptions = aVar;
    }

    public void setMaxAutoSignInAttempts(int i) {
        this.mMaxAutoSignInAttempts = i;
    }

    public void setPlusApiOptions(c.a aVar) {
        doApiOptionsPreCheck();
        this.mPlusApiOptions = aVar;
    }

    public void setShowErrorDialogs(boolean z) {
        this.mShowErrorDialogs = z;
    }

    public void setup(GameHelperListener gameHelperListener) {
        if (!this.mSetupDone) {
            this.mListener = gameHelperListener;
            debugLog("Setup: requested clients: " + this.mRequestedClients);
            if (this.mGoogleApiClientBuilder == null) {
                createApiClientBuilder();
            }
            this.mGoogleApiClient = this.mGoogleApiClientBuilder.a();
            this.mGoogleApiClientBuilder = null;
            this.mSetupDone = true;
            return;
        }
        logError("GameHelper: you cannot call GameHelper.setup() more than once!");
        throw new IllegalStateException("GameHelper: you cannot call GameHelper.setup() more than once!");
    }

    public void showFailureDialog() {
        SignInFailureReason signInFailureReason = this.mSignInFailureReason;
        if (signInFailureReason != null) {
            int serviceErrorCode = signInFailureReason.getServiceErrorCode();
            int activityResultCode = this.mSignInFailureReason.getActivityResultCode();
            if (this.mShowErrorDialogs) {
                showFailureDialog(this.mActivity, activityResultCode, serviceErrorCode);
                return;
            }
            debugLog("Not showing error dialog because mShowErrorDialogs==false. Error was: " + this.mSignInFailureReason);
        }
    }

    public void signOut() {
        if (!this.mGoogleApiClient.d()) {
            debugLog("signOut: was already disconnected, ignoring.");
            return;
        }
        if ((this.mRequestedClients & 2) != 0) {
            debugLog("Clearing default account on PlusClient.");
            c.g.a(this.mGoogleApiClient);
        }
        if ((this.mRequestedClients & 1) != 0) {
            debugLog("Signing out from the Google API Client.");
            com.google.android.gms.games.b.a(this.mGoogleApiClient);
        }
        debugLog("Disconnecting client.");
        this.mConnectOnStart = false;
        this.mConnecting = false;
        this.mGoogleApiClient.b();
    }

    /* access modifiers changed from: package-private */
    public void succeedSignIn() {
        debugLog("succeedSignIn");
        this.mSignInFailureReason = null;
        this.mConnectOnStart = true;
        this.mUserInitiatedSignIn = false;
        this.mConnecting = false;
        notifyListener(true);
    }
}
