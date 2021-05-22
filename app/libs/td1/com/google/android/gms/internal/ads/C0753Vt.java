package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.c;

/* renamed from: com.google.android.gms.internal.ads.Vt  reason: case insensitive filesystem */
public final class C0753Vt implements Sea<c> {

    /* renamed from: a  reason: collision with root package name */
    private final C0675St f3379a;

    /* renamed from: b  reason: collision with root package name */
    private final _ea<Context> f3380b;

    /* renamed from: c  reason: collision with root package name */
    private final _ea<AbstractC1761mj> f3381c;

    private C0753Vt(C0675St st, _ea<Context> _ea, _ea<AbstractC1761mj> _ea2) {
        this.f3379a = st;
        this.f3380b = _ea;
        this.f3381c = _ea2;
    }

    public static C0753Vt a(C0675St st, _ea<Context> _ea, _ea<AbstractC1761mj> _ea2) {
        return new C0753Vt(st, _ea, _ea2);
    }

    @Override // com.google.android.gms.internal.ads._ea
    public final /* synthetic */ Object get() {
        c cVar = new c(this.f3380b.get(), this.f3381c.get(), null);
        Xea.a(cVar, "Cannot return null from a non-@Nullable @Provides method");
        return cVar;
    }
}
