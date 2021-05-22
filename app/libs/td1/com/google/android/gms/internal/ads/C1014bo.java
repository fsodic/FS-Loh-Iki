package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.os.Message;
import android.view.View;
import android.view.WindowManager;
import android.webkit.ConsoleMessage;
import android.webkit.GeolocationPermissions;
import android.webkit.JsPromptResult;
import android.webkit.JsResult;
import android.webkit.PermissionRequest;
import android.webkit.WebChromeClient;
import android.webkit.WebStorage;
import android.webkit.WebView;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.gms.ads.internal.c;
import com.google.android.gms.ads.internal.q;
import com.google.android.gms.common.util.o;

@TargetApi(11)
/* renamed from: com.google.android.gms.internal.ads.bo  reason: case insensitive filesystem */
public final class C1014bo extends WebChromeClient {

    /* renamed from: a  reason: collision with root package name */
    private final AbstractC1564jo f3939a;

    public C1014bo(AbstractC1564jo joVar) {
        this.f3939a = joVar;
    }

    private static Context a(WebView webView) {
        if (!(webView instanceof AbstractC1564jo)) {
            return webView.getContext();
        }
        AbstractC1564jo joVar = (AbstractC1564jo) webView;
        Activity v = joVar.v();
        return v != null ? v : joVar.getContext();
    }

    private final boolean a(Context context, String str, String str2, String str3, String str4, JsResult jsResult, JsPromptResult jsPromptResult, boolean z) {
        AlertDialog create;
        c d;
        try {
            if (this.f3939a == null || this.f3939a.d() == null || this.f3939a.d().d() == null || (d = this.f3939a.d().d()) == null || d.b()) {
                AlertDialog.Builder builder = new AlertDialog.Builder(context);
                builder.setTitle(str2);
                if (z) {
                    LinearLayout linearLayout = new LinearLayout(context);
                    linearLayout.setOrientation(1);
                    TextView textView = new TextView(context);
                    textView.setText(str3);
                    EditText editText = new EditText(context);
                    editText.setText(str4);
                    linearLayout.addView(textView);
                    linearLayout.addView(editText);
                    create = builder.setView(linearLayout).setPositiveButton(17039370, new DialogInterface$OnClickListenerC1427ho(jsPromptResult, editText)).setNegativeButton(17039360, new DialogInterface$OnClickListenerC1495io(jsPromptResult)).setOnCancelListener(new DialogInterface$OnCancelListenerC1289fo(jsPromptResult)).create();
                } else {
                    create = builder.setMessage(str3).setPositiveButton(17039370, new DialogInterface$OnClickListenerC1358go(jsResult)).setNegativeButton(17039360, new Cdo(jsResult)).setOnCancelListener(new DialogInterface$OnCancelListenerC1220eo(jsResult)).create();
                }
                create.show();
                return true;
            }
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 11 + String.valueOf(str3).length());
            sb.append("window.");
            sb.append(str);
            sb.append("('");
            sb.append(str3);
            sb.append("')");
            d.a(sb.toString());
            return false;
        } catch (WindowManager.BadTokenException e) {
            C0745Vl.c("Fail to display Dialog.", e);
        }
    }

    public final void onCloseWindow(WebView webView) {
        String str;
        if (!(webView instanceof AbstractC1564jo)) {
            str = "Tried to close a WebView that wasn't an AdWebView.";
        } else {
            com.google.android.gms.ads.internal.overlay.c y = ((AbstractC1564jo) webView).y();
            if (y == null) {
                str = "Tried to close an AdWebView not associated with an overlay.";
            } else {
                y.Wb();
                return;
            }
        }
        C0745Vl.d(str);
    }

    public final boolean onConsoleMessage(ConsoleMessage consoleMessage) {
        String message = consoleMessage.message();
        String sourceId = consoleMessage.sourceId();
        int lineNumber = consoleMessage.lineNumber();
        StringBuilder sb = new StringBuilder(String.valueOf(message).length() + 19 + String.valueOf(sourceId).length());
        sb.append("JS: ");
        sb.append(message);
        sb.append(" (");
        sb.append(sourceId);
        sb.append(":");
        sb.append(lineNumber);
        sb.append(")");
        String sb2 = sb.toString();
        if (sb2.contains("Application Cache")) {
            return super.onConsoleMessage(consoleMessage);
        }
        int i = C1633ko.f4807a[consoleMessage.messageLevel().ordinal()];
        if (i == 1) {
            C0745Vl.b(sb2);
        } else if (i == 2) {
            C0745Vl.d(sb2);
        } else if (i == 3 || i == 4 || i != 5) {
            C0745Vl.c(sb2);
        } else {
            C0745Vl.a(sb2);
        }
        return super.onConsoleMessage(consoleMessage);
    }

    public final boolean onCreateWindow(WebView webView, boolean z, boolean z2, Message message) {
        WebView.WebViewTransport webViewTransport = (WebView.WebViewTransport) message.obj;
        WebView webView2 = new WebView(webView.getContext());
        if (this.f3939a.z() != null) {
            webView2.setWebViewClient(this.f3939a.z());
        }
        webViewTransport.setWebView(webView2);
        message.sendToTarget();
        return true;
    }

    public final void onExceededDatabaseQuota(String str, String str2, long j, long j2, long j3, WebStorage.QuotaUpdater quotaUpdater) {
        long j4 = 5242880 - j3;
        if (j4 <= 0) {
            quotaUpdater.updateQuota(j);
            return;
        }
        if (j != 0) {
            if (j2 == 0) {
                j = Math.min(j + Math.min(131072L, j4), 1048576L);
            } else if (j2 <= Math.min(1048576 - j, j4)) {
                j += j2;
            }
            j2 = j;
        } else if (j2 > j4 || j2 > 1048576) {
            j2 = 0;
        }
        quotaUpdater.updateQuota(j2);
    }

    public final void onGeolocationPermissionsShowPrompt(String str, GeolocationPermissions.Callback callback) {
        boolean z;
        if (callback != null) {
            q.c();
            if (!C2452wk.a(this.f3939a.getContext(), "android.permission.ACCESS_FINE_LOCATION")) {
                q.c();
                if (!C2452wk.a(this.f3939a.getContext(), "android.permission.ACCESS_COARSE_LOCATION")) {
                    z = false;
                    callback.invoke(str, z, true);
                }
            }
            z = true;
            callback.invoke(str, z, true);
        }
    }

    public final void onHideCustomView() {
        com.google.android.gms.ads.internal.overlay.c y = this.f3939a.y();
        if (y == null) {
            C0745Vl.d("Could not get ad overlay when hiding custom view.");
        } else {
            y.Xb();
        }
    }

    public final boolean onJsAlert(WebView webView, String str, String str2, JsResult jsResult) {
        return a(a(webView), "alert", str, str2, null, jsResult, null, false);
    }

    public final boolean onJsBeforeUnload(WebView webView, String str, String str2, JsResult jsResult) {
        return a(a(webView), "onBeforeUnload", str, str2, null, jsResult, null, false);
    }

    public final boolean onJsConfirm(WebView webView, String str, String str2, JsResult jsResult) {
        return a(a(webView), "confirm", str, str2, null, jsResult, null, false);
    }

    public final boolean onJsPrompt(WebView webView, String str, String str2, String str3, JsPromptResult jsPromptResult) {
        return a(a(webView), "prompt", str, str2, str3, null, jsPromptResult, true);
    }

    @TargetApi(21)
    public final void onPermissionRequest(PermissionRequest permissionRequest) {
        if (!o.h() || C0214Ba.f1617a.a().booleanValue()) {
            super.onPermissionRequest(permissionRequest);
            return;
        }
        AbstractC1564jo joVar = this.f3939a;
        if (joVar == null || joVar.d() == null || this.f3939a.d().h() == null) {
            super.onPermissionRequest(permissionRequest);
            return;
        }
        String[] a2 = this.f3939a.d().h().a(permissionRequest.getResources());
        if (a2.length > 0) {
            permissionRequest.grant(a2);
        } else {
            permissionRequest.deny();
        }
    }

    public final void onReachedMaxAppCacheSize(long j, long j2, WebStorage.QuotaUpdater quotaUpdater) {
        long j3 = j + 131072;
        if (5242880 - j2 < j3) {
            quotaUpdater.updateQuota(0);
        } else {
            quotaUpdater.updateQuota(j3);
        }
    }

    @Deprecated
    public final void onShowCustomView(View view, int i, WebChromeClient.CustomViewCallback customViewCallback) {
        com.google.android.gms.ads.internal.overlay.c y = this.f3939a.y();
        if (y == null) {
            C0745Vl.d("Could not get ad overlay when showing custom view.");
            customViewCallback.onCustomViewHidden();
            return;
        }
        y.a(view, customViewCallback);
        y.x(i);
    }

    public final void onShowCustomView(View view, WebChromeClient.CustomViewCallback customViewCallback) {
        onShowCustomView(view, -1, customViewCallback);
    }
}
