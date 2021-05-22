package b.c.b.a.b.d;

import android.content.Context;
import com.google.android.gms.common.util.o;

public class a {

    /* renamed from: a  reason: collision with root package name */
    private static Context f294a;

    /* renamed from: b  reason: collision with root package name */
    private static Boolean f295b;

    public static synchronized boolean a(Context context) {
        boolean z;
        synchronized (a.class) {
            Context applicationContext = context.getApplicationContext();
            if (f294a == null || f295b == null || f294a != applicationContext) {
                f295b = null;
                if (o.k()) {
                    z = Boolean.valueOf(applicationContext.getPackageManager().isInstantApp());
                } else {
                    try {
                        context.getClassLoader().loadClass("com.google.android.instantapps.supervisor.InstantAppsRuntime");
                        f295b = true;
                    } catch (ClassNotFoundException unused) {
                        z = false;
                    }
                    f294a = applicationContext;
                    return f295b.booleanValue();
                }
                f295b = z;
                f294a = applicationContext;
                return f295b.booleanValue();
            }
            return f295b.booleanValue();
        }
    }
}
