package b.c.b.a.b;

import android.content.Context;
import android.util.Log;

/* access modifiers changed from: package-private */
public final class q {

    /* renamed from: a  reason: collision with root package name */
    private static final Object f310a = new Object();

    /* renamed from: b  reason: collision with root package name */
    private static Context f311b;

    static synchronized void a(Context context) {
        synchronized (q.class) {
            if (f311b != null) {
                Log.w("GoogleCertificates", "GoogleCertificates has been initialized already");
            } else if (context != null) {
                f311b = context.getApplicationContext();
            }
        }
    }
}
