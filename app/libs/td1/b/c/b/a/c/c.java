package b.c.b.a.c;

import android.content.Context;
import android.os.IBinder;
import b.c.b.a.b.j;
import com.google.android.gms.common.internal.r;

public abstract class c<T> {

    /* renamed from: a  reason: collision with root package name */
    private final String f318a;

    /* renamed from: b  reason: collision with root package name */
    private T f319b;

    public static class a extends Exception {
        public a(String str) {
            super(str);
        }

        public a(String str, Throwable th) {
            super(str, th);
        }
    }

    protected c(String str) {
        this.f318a = str;
    }

    /* access modifiers changed from: protected */
    public final T a(Context context) {
        if (this.f319b == null) {
            r.a(context);
            Context c2 = j.c(context);
            if (c2 != null) {
                try {
                    this.f319b = a((IBinder) c2.getClassLoader().loadClass(this.f318a).newInstance());
                } catch (ClassNotFoundException e) {
                    throw new a("Could not load creator class.", e);
                } catch (InstantiationException e2) {
                    throw new a("Could not instantiate creator.", e2);
                } catch (IllegalAccessException e3) {
                    throw new a("Could not access creator.", e3);
                }
            } else {
                throw new a("Could not get remote context.");
            }
        }
        return this.f319b;
    }

    /* access modifiers changed from: protected */
    public abstract T a(IBinder iBinder);
}
