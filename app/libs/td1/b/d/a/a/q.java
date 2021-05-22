package b.d.a.a;

import android.os.Looper;
import java.lang.ref.WeakReference;

public class q {

    /* renamed from: a  reason: collision with root package name */
    private final WeakReference<e> f583a;

    public q(e eVar) {
        this.f583a = new WeakReference<>(eVar);
    }

    public boolean a() {
        e eVar = this.f583a.get();
        return eVar == null || eVar.a();
    }

    public boolean a(boolean z) {
        e eVar = this.f583a.get();
        if (eVar == null) {
            return false;
        }
        if (Looper.myLooper() != Looper.getMainLooper()) {
            return eVar.a(z);
        }
        new Thread(new p(this, eVar, z)).start();
        return true;
    }

    public boolean b() {
        e eVar = this.f583a.get();
        return eVar == null || eVar.b();
    }

    public boolean c() {
        boolean z = a() || b();
        if (z) {
            this.f583a.clear();
        }
        return z;
    }
}
