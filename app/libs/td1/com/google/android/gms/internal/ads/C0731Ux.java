package com.google.android.gms.internal.ads;

import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.Ux  reason: case insensitive filesystem */
public final class C0731Ux implements AbstractC0757Vx {

    /* renamed from: a  reason: collision with root package name */
    private final List<String> f3305a;

    /* renamed from: b  reason: collision with root package name */
    private final LT f3306b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f3307c;

    public C0731Ux(C1941pR pRVar, LT lt) {
        this.f3305a = pRVar.n;
        this.f3306b = lt;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0757Vx
    public final void a() {
        if (!this.f3307c) {
            this.f3306b.a(this.f3305a);
            this.f3307c = true;
        }
    }
}
