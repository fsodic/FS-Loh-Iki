package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* renamed from: com.google.android.gms.internal.ads.cu  reason: case insensitive filesystem */
public final class C1091cu implements Sea<C0523Mx<AbstractC0651Rv>> {

    /* renamed from: a  reason: collision with root package name */
    private final _ea<C0955aw> f4039a;

    /* renamed from: b  reason: collision with root package name */
    private final _ea<Executor> f4040b;

    private C1091cu(_ea<C0955aw> _ea, _ea<Executor> _ea2) {
        this.f4039a = _ea;
        this.f4040b = _ea2;
    }

    public static C1091cu a(_ea<C0955aw> _ea, _ea<Executor> _ea2) {
        return new C1091cu(_ea, _ea2);
    }

    @Override // com.google.android.gms.internal.ads._ea
    public final /* synthetic */ Object get() {
        C0523Mx mx = new C0523Mx(this.f4039a.get(), this.f4040b.get());
        Xea.a(mx, "Cannot return null from a non-@Nullable @Provides method");
        return mx;
    }
}
