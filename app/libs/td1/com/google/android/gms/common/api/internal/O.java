package com.google.android.gms.common.api.internal;

import java.lang.ref.WeakReference;

/* access modifiers changed from: package-private */
public final class O extends AbstractC0145ea {

    /* renamed from: a  reason: collision with root package name */
    private WeakReference<K> f1230a;

    O(K k) {
        this.f1230a = new WeakReference<>(k);
    }

    @Override // com.google.android.gms.common.api.internal.AbstractC0145ea
    public final void a() {
        K k = this.f1230a.get();
        if (k != null) {
            k.j();
        }
    }
}
