package com.google.android.gms.internal.ads;

import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.gms.internal.ads.pL  reason: case insensitive filesystem */
public final class C1935pL implements Sea<SW<C2210tL>> {

    /* renamed from: a  reason: collision with root package name */
    private final _ea<BT> f5218a;

    /* renamed from: b  reason: collision with root package name */
    private final _ea<C2141sL> f5219b;

    /* renamed from: c  reason: collision with root package name */
    private final _ea<C2055qu> f5220c;

    public C1935pL(_ea<BT> _ea, _ea<C2141sL> _ea2, _ea<C2055qu> _ea3) {
        this.f5218a = _ea;
        this.f5219b = _ea2;
        this.f5220c = _ea3;
    }

    @Override // com.google.android.gms.internal.ads._ea
    public final /* synthetic */ Object get() {
        C1598kT a2 = this.f5218a.get().a(EnumC2563yT.GENERATE_SIGNALS, this.f5220c.get().b()).a((AbstractC2221tW) this.f5219b.get()).a((long) ((Integer) C2392voa.e().a(C2474x.xd)).intValue(), TimeUnit.SECONDS).a();
        Xea.a(a2, "Cannot return null from a non-@Nullable @Provides method");
        return a2;
    }
}
