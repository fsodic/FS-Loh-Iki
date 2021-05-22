package c.a.a.a.h;

import android.util.Log;

public class b {

    /* renamed from: a  reason: collision with root package name */
    private String f722a;

    /* renamed from: b  reason: collision with root package name */
    private boolean f723b = false;

    /* renamed from: c  reason: collision with root package name */
    private boolean f724c = false;
    private boolean d = false;
    private boolean e = false;
    private boolean f = false;

    public b(Object obj) {
        this.f722a = obj.toString();
    }

    public void a(Object obj) {
        if (a()) {
            Log.d(this.f722a, obj.toString());
        }
    }

    public void a(Object obj, Throwable th) {
        if (a()) {
            Log.d(this.f722a, obj.toString(), th);
        }
    }

    public boolean a() {
        return this.f723b;
    }

    public void b(Object obj) {
        if (b()) {
            Log.e(this.f722a, obj.toString());
        }
    }

    public void b(Object obj, Throwable th) {
        if (d()) {
            Log.w(this.f722a, obj.toString(), th);
        }
    }

    public boolean b() {
        return this.f724c;
    }

    public void c(Object obj) {
        if (c()) {
            Log.i(this.f722a, obj.toString());
        }
    }

    public boolean c() {
        return this.f;
    }

    public void d(Object obj) {
        if (d()) {
            Log.w(this.f722a, obj.toString());
        }
    }

    public boolean d() {
        return this.e;
    }
}
