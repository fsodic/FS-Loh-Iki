package a.e.a;

import android.view.View;

/* renamed from: a.e.a.p  reason: case insensitive filesystem */
class RunnableC0053p implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ C0054q f128a;

    RunnableC0053p(C0054q qVar) {
        this.f128a = qVar;
    }

    public void run() {
        if (this.f128a.f130c.g() != null) {
            this.f128a.f130c.a((View) null);
            C0054q qVar = this.f128a;
            u uVar = qVar.d;
            ComponentCallbacksC0045h hVar = qVar.f130c;
            uVar.a(hVar, hVar.x(), 0, 0, false);
        }
    }
}
