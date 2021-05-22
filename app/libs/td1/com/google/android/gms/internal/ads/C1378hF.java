package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.hF  reason: case insensitive filesystem */
public final class C1378hF implements Sea<C1103dF> {

    /* renamed from: a  reason: collision with root package name */
    private final _ea<VW> f4453a;

    /* renamed from: b  reason: collision with root package name */
    private final _ea<VW> f4454b;

    /* renamed from: c  reason: collision with root package name */
    private final _ea<PF> f4455c;
    private final _ea<BinderC2067rG> d;

    private C1378hF(_ea<VW> _ea, _ea<VW> _ea2, _ea<PF> _ea3, _ea<BinderC2067rG> _ea4) {
        this.f4453a = _ea;
        this.f4454b = _ea2;
        this.f4455c = _ea3;
        this.d = _ea4;
    }

    public static C1378hF a(_ea<VW> _ea, _ea<VW> _ea2, _ea<PF> _ea3, _ea<BinderC2067rG> _ea4) {
        return new C1378hF(_ea, _ea2, _ea3, _ea4);
    }

    @Override // com.google.android.gms.internal.ads._ea
    public final /* synthetic */ Object get() {
        return new C1103dF(this.f4453a.get(), this.f4454b.get(), this.f4455c.get(), Oea.b(this.d));
    }
}
