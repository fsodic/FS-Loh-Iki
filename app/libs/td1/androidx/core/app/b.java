package androidx.core.app;

import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.util.Log;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public final class b {

    static class a {

        /* renamed from: a  reason: collision with root package name */
        private static Method f176a;

        /* renamed from: b  reason: collision with root package name */
        private static boolean f177b;

        public static void a(Bundle bundle, String str, IBinder iBinder) {
            if (!f177b) {
                try {
                    f176a = Bundle.class.getMethod("putIBinder", String.class, IBinder.class);
                    f176a.setAccessible(true);
                } catch (NoSuchMethodException e) {
                    Log.i("BundleCompatBaseImpl", "Failed to retrieve putIBinder method", e);
                }
                f177b = true;
            }
            Method method = f176a;
            if (method != null) {
                try {
                    method.invoke(bundle, str, iBinder);
                } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException e2) {
                    Log.i("BundleCompatBaseImpl", "Failed to invoke putIBinder via reflection", e2);
                    f176a = null;
                }
            }
        }
    }

    public static void a(Bundle bundle, String str, IBinder iBinder) {
        if (Build.VERSION.SDK_INT >= 18) {
            bundle.putBinder(str, iBinder);
        } else {
            a.a(bundle, str, iBinder);
        }
    }
}
