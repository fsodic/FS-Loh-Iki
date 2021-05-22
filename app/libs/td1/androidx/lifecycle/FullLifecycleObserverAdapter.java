package androidx.lifecycle;

import androidx.lifecycle.f;

/* access modifiers changed from: package-private */
public class FullLifecycleObserverAdapter implements e {

    /* renamed from: a  reason: collision with root package name */
    private final b f199a;

    FullLifecycleObserverAdapter(b bVar) {
        this.f199a = bVar;
    }

    @Override // androidx.lifecycle.e
    public void a(h hVar, f.a aVar) {
        switch (c.f216a[aVar.ordinal()]) {
            case 1:
                this.f199a.b(hVar);
                return;
            case 2:
                this.f199a.f(hVar);
                return;
            case 3:
                this.f199a.a(hVar);
                return;
            case 4:
                this.f199a.c(hVar);
                return;
            case 5:
                this.f199a.d(hVar);
                return;
            case 6:
                this.f199a.e(hVar);
                return;
            case 7:
                throw new IllegalArgumentException("ON_ANY must not been send by anybody");
            default:
                return;
        }
    }
}
