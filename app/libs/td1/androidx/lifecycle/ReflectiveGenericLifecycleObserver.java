package androidx.lifecycle;

import androidx.lifecycle.a;
import androidx.lifecycle.f;

/* access modifiers changed from: package-private */
public class ReflectiveGenericLifecycleObserver implements e {

    /* renamed from: a  reason: collision with root package name */
    private final Object f206a;

    /* renamed from: b  reason: collision with root package name */
    private final a.C0007a f207b = a.f209a.a(this.f206a.getClass());

    ReflectiveGenericLifecycleObserver(Object obj) {
        this.f206a = obj;
    }

    @Override // androidx.lifecycle.e
    public void a(h hVar, f.a aVar) {
        this.f207b.a(hVar, aVar, this.f206a);
    }
}
