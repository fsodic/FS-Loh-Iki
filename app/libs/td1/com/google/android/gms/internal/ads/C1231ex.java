package com.google.android.gms.internal.ads;

import java.util.Set;

/* renamed from: com.google.android.gms.internal.ads.ex  reason: case insensitive filesystem */
public final class C1231ex implements Sea<C0598Pu> {

    /* renamed from: a  reason: collision with root package name */
    private final C1162dx f4261a;

    /* renamed from: b  reason: collision with root package name */
    private final _ea<Set<C0523Mx<AbstractC0650Ru>>> f4262b;

    private C1231ex(C1162dx dxVar, _ea<Set<C0523Mx<AbstractC0650Ru>>> _ea) {
        this.f4261a = dxVar;
        this.f4262b = _ea;
    }

    public static C1231ex a(C1162dx dxVar, _ea<Set<C0523Mx<AbstractC0650Ru>>> _ea) {
        return new C1231ex(dxVar, _ea);
    }

    @Override // com.google.android.gms.internal.ads._ea
    public final /* synthetic */ Object get() {
        C0598Pu a2 = this.f4261a.a(this.f4262b.get());
        Xea.a(a2, "Cannot return null from a non-@Nullable @Provides method");
        return a2;
    }
}
