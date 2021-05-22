package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* renamed from: com.google.android.gms.internal.ads.gE  reason: case insensitive filesystem */
public final class C1308gE implements Sea<C0523Mx<AbstractC1093cw>> {

    /* renamed from: a  reason: collision with root package name */
    private final _ea<C1170eE> f4367a;

    /* renamed from: b  reason: collision with root package name */
    private final _ea<Executor> f4368b;

    private C1308gE(_ea<C1170eE> _ea, _ea<Executor> _ea2) {
        this.f4367a = _ea;
        this.f4368b = _ea2;
    }

    public static C1308gE a(_ea<C1170eE> _ea, _ea<Executor> _ea2) {
        return new C1308gE(_ea, _ea2);
    }

    @Override // com.google.android.gms.internal.ads._ea
    public final /* synthetic */ Object get() {
        C0523Mx mx = new C0523Mx(this.f4367a.get(), this.f4368b.get());
        Xea.a(mx, "Cannot return null from a non-@Nullable @Provides method");
        return mx;
    }
}
