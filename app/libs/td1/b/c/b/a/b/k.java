package b.c.b.a.b;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.Signature;
import android.util.Log;
import com.google.android.gms.common.internal.r;

public class k {

    /* renamed from: a  reason: collision with root package name */
    private static k f308a;

    /* renamed from: b  reason: collision with root package name */
    private final Context f309b;

    private k(Context context) {
        this.f309b = context.getApplicationContext();
    }

    public static k a(Context context) {
        r.a(context);
        synchronized (k.class) {
            if (f308a == null) {
                q.a(context);
                f308a = new k(context);
            }
        }
        return f308a;
    }

    private static r a(PackageInfo packageInfo, r... rVarArr) {
        Signature[] signatureArr = packageInfo.signatures;
        if (signatureArr == null) {
            return null;
        }
        if (signatureArr.length != 1) {
            Log.w("GoogleSignatureVerifier", "Package has more than one signature.");
            return null;
        }
        s sVar = new s(signatureArr[0].toByteArray());
        for (int i = 0; i < rVarArr.length; i++) {
            if (rVarArr[i].equals(sVar)) {
                return rVarArr[i];
            }
        }
        return null;
    }

    public static boolean a(PackageInfo packageInfo, boolean z) {
        if (!(packageInfo == null || packageInfo.signatures == null)) {
            if (a(packageInfo, z ? u.f316a : new r[]{u.f316a[0]}) != null) {
                return true;
            }
        }
        return false;
    }
}
