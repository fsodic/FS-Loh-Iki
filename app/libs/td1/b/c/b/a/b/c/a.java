package b.c.b.a.b.c;

import android.annotation.SuppressLint;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.util.Log;
import com.google.android.gms.common.util.c;
import java.util.Collections;
import java.util.List;

public class a {

    /* renamed from: a  reason: collision with root package name */
    private static final Object f288a = new Object();

    /* renamed from: b  reason: collision with root package name */
    private static volatile a f289b;

    /* renamed from: c  reason: collision with root package name */
    private static boolean f290c = false;
    private final List<String> d;
    private final List<String> e;
    private final List<String> f;
    private final List<String> g;

    private a() {
        List<String> list = Collections.EMPTY_LIST;
        this.d = list;
        this.e = list;
        this.f = list;
        this.g = list;
    }

    public static a a() {
        if (f289b == null) {
            synchronized (f288a) {
                if (f289b == null) {
                    f289b = new a();
                }
            }
        }
        return f289b;
    }

    @SuppressLint({"UntrackedBindService"})
    public void a(Context context, ServiceConnection serviceConnection) {
        context.unbindService(serviceConnection);
    }

    public boolean a(Context context, Intent intent, ServiceConnection serviceConnection, int i) {
        return a(context, context.getClass().getName(), intent, serviceConnection, i);
    }

    public final boolean a(Context context, String str, Intent intent, ServiceConnection serviceConnection, int i) {
        ComponentName component = intent.getComponent();
        if (!(component == null ? false : c.a(context, component.getPackageName()))) {
            return context.bindService(intent, serviceConnection, i);
        }
        Log.w("ConnectionTracker", "Attempted to bind to a service in a STOPPED package.");
        return false;
    }
}
