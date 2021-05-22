package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.Ip  reason: case insensitive filesystem */
public final class C0411Ip implements Sea<AbstractC1862oH<SR, ZH>> {

    /* renamed from: a  reason: collision with root package name */
    private final C0203Ap f2275a;

    /* renamed from: b  reason: collision with root package name */
    private final _ea<C1789nD> f2276b;

    public C0411Ip(C0203Ap ap, _ea<C1789nD> _ea) {
        this.f2275a = ap;
        this.f2276b = _ea;
    }

    @Override // com.google.android.gms.internal.ads._ea
    public final /* synthetic */ Object get() {
        C2001qI qIVar = new C2001qI(this.f2276b.get());
        Xea.a(qIVar, "Cannot return null from a non-@Nullable @Provides method");
        return qIVar;
    }
}
