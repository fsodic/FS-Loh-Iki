package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.AbstractC2399vu;

/* renamed from: com.google.android.gms.internal.ads.hQ  reason: case insensitive filesystem */
public final class C1389hQ<RequestComponentT extends AbstractC2399vu<AdT>, AdT> implements AbstractC1940pQ<RequestComponentT, AdT> {

    /* renamed from: a  reason: collision with root package name */
    private RequestComponentT f4478a;

    /* access modifiers changed from: private */
    /* renamed from: b */
    public final synchronized RequestComponentT a() {
        return this.f4478a;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1940pQ
    public final synchronized SW<AdT> a(C2284uQ uQVar, AbstractC2077rQ<RequestComponentT> rQVar) {
        this.f4478a = rQVar.a(uQVar.f5717b).a();
        return this.f4478a.a().b();
    }
}
