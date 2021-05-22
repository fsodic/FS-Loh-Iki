package com.google.android.gms.internal.ads;

import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.gz  reason: case insensitive filesystem */
public final class C1371gz implements Sea<C1164dz> {

    /* renamed from: a  reason: collision with root package name */
    private final _ea<Map<String, AbstractC1793nH<C1365gt>>> f4445a;

    /* renamed from: b  reason: collision with root package name */
    private final _ea<Map<String, AbstractC1793nH<C0525Mz>>> f4446b;

    /* renamed from: c  reason: collision with root package name */
    private final _ea<Map<String, AbstractC1932pI<C0525Mz>>> f4447c;
    private final _ea<AbstractC1021bt<AbstractC0951as>> d;
    private final _ea<C1098dA> e;

    public C1371gz(_ea<Map<String, AbstractC1793nH<C1365gt>>> _ea, _ea<Map<String, AbstractC1793nH<C0525Mz>>> _ea2, _ea<Map<String, AbstractC1932pI<C0525Mz>>> _ea3, _ea<AbstractC1021bt<AbstractC0951as>> _ea4, _ea<C1098dA> _ea5) {
        this.f4445a = _ea;
        this.f4446b = _ea2;
        this.f4447c = _ea3;
        this.d = _ea4;
        this.e = _ea5;
    }

    @Override // com.google.android.gms.internal.ads._ea
    public final /* synthetic */ Object get() {
        return new C1164dz(this.f4445a.get(), this.f4446b.get(), this.f4447c.get(), this.d, this.e.get());
    }
}
