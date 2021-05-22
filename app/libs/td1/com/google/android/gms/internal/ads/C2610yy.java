package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.overlay.o;

/* renamed from: com.google.android.gms.internal.ads.yy  reason: case insensitive filesystem */
public final class C2610yy implements Sea<C0523Mx<o>> {

    /* renamed from: a  reason: collision with root package name */
    private final C2059qy f6153a;

    /* renamed from: b  reason: collision with root package name */
    private final _ea<C0784Wy> f6154b;

    private C2610yy(C2059qy qyVar, _ea<C0784Wy> _ea) {
        this.f6153a = qyVar;
        this.f6154b = _ea;
    }

    public static C2610yy a(C2059qy qyVar, _ea<C0784Wy> _ea) {
        return new C2610yy(qyVar, _ea);
    }

    @Override // com.google.android.gms.internal.ads._ea
    public final /* synthetic */ Object get() {
        C0523Mx mx = new C0523Mx(this.f6154b.get(), C0875_l.e);
        Xea.a(mx, "Cannot return null from a non-@Nullable @Provides method");
        return mx;
    }
}
