package com.RoyalGame.tools;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.content.res.Resources;
import android.util.Log;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import org.cocos2dx.lib.R;

class b {

    /* renamed from: a  reason: collision with root package name */
    private static final String[] f984a = {"*Unknown error.", "*Failed to sign in. Please check your network connection and try again.", "*The application is incorrectly configured. Check that the package name and signing certificate match the client ID created in Developer Console. Also, if the application is not yet published, check that the account you are trying to sign in with is listed as a tester account. See logs for more information.", "*License check failed."};

    /* renamed from: b  reason: collision with root package name */
    private static final int[] f985b = {R.string.gamehelper_unknown_error, R.string.gamehelper_sign_in_failed, R.string.gamehelper_app_misconfigured, R.string.gamehelper_license_failed};

    static String a(int i) {
        if (i == -1) {
            return "RESULT_OK";
        }
        if (i == 0) {
            return "RESULT_CANCELED";
        }
        switch (i) {
            case 10001:
                return "RESULT_RECONNECT_REQUIRED";
            case 10002:
                return "SIGN_IN_FAILED";
            case 10003:
                return "RESULT_LICENSE_FAILED";
            case 10004:
                return "RESULT_APP_MISCONFIGURED";
            case 10005:
                return "RESULT_LEFT_ROOM";
            default:
                return String.valueOf(i);
        }
    }

    static String a(Context context) {
        try {
            Resources resources = context.getResources();
            return resources.getString(resources.getIdentifier("app_id", "string", context.getPackageName()));
        } catch (Exception e) {
            e.printStackTrace();
            return "??? (failed to retrieve APP ID)";
        }
    }

    static String a(Context context, int i) {
        if (i < 0 || i >= f985b.length) {
            i = 0;
        }
        int i2 = f985b[i];
        try {
            return context.getString(i2);
        } catch (Exception e) {
            e.printStackTrace();
            Log.w("GameHelper", "*** GameHelper could not found resource id #" + i2 + ". This probably happened because you included it as a stand-alone JAR. BaseGameUtils should be compiled as a LIBRARY PROJECT, so that it can access its resources. Using a fallback string.");
            return f984a[i];
        }
    }

    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:0:0x0000 */
    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: byte */
    /* JADX DEBUG: Multi-variable search result rejected for r4v1, resolved type: int */
    /* JADX DEBUG: Multi-variable search result rejected for r4v4, resolved type: int */
    /* JADX WARN: Multi-variable type inference failed */
    static void a(StringBuilder sb, byte b2) {
        if (b2 < 0) {
            b2 += 256;
        }
        int i = (b2 == true ? 1 : 0) / 16;
        int i2 = b2 % 16;
        sb.append("0123456789ABCDEF".substring(i, i + 1));
        sb.append("0123456789ABCDEF".substring(i2, i2 + 1));
    }

    static String b(int i) {
        switch (i) {
            case 0:
                return "SUCCESS(" + i + ")";
            case 1:
                return "SERVICE_MISSING(" + i + ")";
            case 2:
                return "SERVICE_VERSION_UPDATE_REQUIRED(" + i + ")";
            case 3:
                return "SERVICE_DISABLED(" + i + ")";
            case 4:
                return "SIGN_IN_REQUIRED(" + i + ")";
            case 5:
                return "INVALID_ACCOUNT(" + i + ")";
            case 6:
                return "RESOLUTION_REQUIRED(" + i + ")";
            case 7:
                return "NETWORK_ERROR(" + i + ")";
            case 8:
                return "INTERNAL_ERROR(" + i + ")";
            case 9:
                return "SERVICE_INVALID(" + i + ")";
            case 10:
                return "DEVELOPER_ERROR(" + i + ")";
            case 11:
                return "LICENSE_CHECK_FAILED(" + i + ")";
            default:
                return "Unknown error code " + i;
        }
    }

    static String b(Context context) {
        try {
            Signature[] signatureArr = context.getPackageManager().getPackageInfo(context.getPackageName(), 64).signatures;
            if (signatureArr.length == 0) {
                return "ERROR: NO SIGNATURE.";
            }
            if (signatureArr.length > 1) {
                return "ERROR: MULTIPLE SIGNATURES";
            }
            byte[] digest = MessageDigest.getInstance("SHA1").digest(signatureArr[0].toByteArray());
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < digest.length; i++) {
                if (i > 0) {
                    sb.append(":");
                }
                a(sb, digest[i]);
            }
            return sb.toString();
        } catch (PackageManager.NameNotFoundException e) {
            e.printStackTrace();
            return "(ERROR: package not found)";
        } catch (NoSuchAlgorithmException e2) {
            e2.printStackTrace();
            return "(ERROR: SHA1 algorithm not found)";
        }
    }

    static void c(Context context) {
        String str;
        Log.w("GameHelper", "****");
        Log.w("GameHelper", "****");
        Log.w("GameHelper", "**** APP NOT CORRECTLY CONFIGURED TO USE GOOGLE PLAY GAME SERVICES");
        Log.w("GameHelper", "**** This is usually caused by one of these reasons:");
        Log.w("GameHelper", "**** (1) Your package name and certificate fingerprint do not match");
        Log.w("GameHelper", "****     the client ID you registered in Developer Console.");
        Log.w("GameHelper", "**** (2) Your App ID was incorrectly entered.");
        Log.w("GameHelper", "**** (3) Your game settings have not been published and you are ");
        Log.w("GameHelper", "****     trying to log in with an account that is not listed as");
        Log.w("GameHelper", "****     a test account.");
        Log.w("GameHelper", "****");
        if (context == null) {
            str = "*** (no Context, so can't print more debug info)";
        } else {
            Log.w("GameHelper", "**** To help you debug, here is the information about this app");
            Log.w("GameHelper", "**** Package name         : " + context.getPackageName());
            Log.w("GameHelper", "**** Cert SHA1 fingerprint: " + b(context));
            Log.w("GameHelper", "**** App ID from          : " + a(context));
            Log.w("GameHelper", "****");
            Log.w("GameHelper", "**** Check that the above information matches your setup in ");
            Log.w("GameHelper", "**** Developer Console. Also, check that you're logging in with the");
            Log.w("GameHelper", "**** right account (it should be listed in the Testers section if");
            Log.w("GameHelper", "**** your project is not yet published).");
            Log.w("GameHelper", "****");
            Log.w("GameHelper", "**** For more information, refer to the troubleshooting guide:");
            str = "****   http://developers.google.com/games/services/android/troubleshooting";
        }
        Log.w("GameHelper", str);
    }
}
