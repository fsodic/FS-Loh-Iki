package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.dK  reason: case insensitive filesystem */
public final class C1108dK implements Sea<C1176eK> {

    /* renamed from: a  reason: collision with root package name */
    private final _ea<C1789nD> f4063a;

    private C1108dK(_ea<C1789nD> _ea) {
        this.f4063a = _ea;
    }

    public static C1108dK a(_ea<C1789nD> _ea) {
        return new C1108dK(_ea);
    }

    @Override // com.google.android.gms.internal.ads._ea
    public final /* synthetic */ Object get() {
        return new C1176eK(this.f4063a.get());
    }
}
