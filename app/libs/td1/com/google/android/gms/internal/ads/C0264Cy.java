package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* renamed from: com.google.android.gms.internal.ads.Cy  reason: case insensitive filesystem */
public final class C0264Cy implements Sea<C0523Mx<AbstractC0520Mu>> {

    /* renamed from: a  reason: collision with root package name */
    private final C2059qy f1744a;

    /* renamed from: b  reason: collision with root package name */
    private final _ea<C1027bz> f1745b;

    /* renamed from: c  reason: collision with root package name */
    private final _ea<Executor> f1746c;

    private C0264Cy(C2059qy qyVar, _ea<C1027bz> _ea, _ea<Executor> _ea2) {
        this.f1744a = qyVar;
        this.f1745b = _ea;
        this.f1746c = _ea2;
    }

    public static C0264Cy a(C2059qy qyVar, _ea<C1027bz> _ea, _ea<Executor> _ea2) {
        return new C0264Cy(qyVar, _ea, _ea2);
    }

    @Override // com.google.android.gms.internal.ads._ea
    public final /* synthetic */ Object get() {
        C0523Mx mx = new C0523Mx(this.f1745b.get(), this.f1746c.get());
        Xea.a(mx, "Cannot return null from a non-@Nullable @Provides method");
        return mx;
    }
}
