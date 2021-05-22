package com.google.android.gms.common.api.internal;

import b.c.b.a.g.a.d;
import b.c.b.a.g.a.k;
import java.lang.ref.WeakReference;

final class F extends d {

    /* renamed from: a  reason: collision with root package name */
    private final WeakReference<C0173y> f1210a;

    F(C0173y yVar) {
        this.f1210a = new WeakReference<>(yVar);
    }

    @Override // b.c.b.a.g.a.e
    public final void a(k kVar) {
        C0173y yVar = this.f1210a.get();
        if (yVar != null) {
            yVar.f1309a.a(new G(this, yVar, yVar, kVar));
        }
    }
}
