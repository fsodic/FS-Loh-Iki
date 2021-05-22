package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.AbstractC2399vu;

/* renamed from: com.google.android.gms.internal.ads.kQ  reason: case insensitive filesystem */
public final class C1595kQ<RequestComponentT extends AbstractC2399vu<AdT>, AdT> implements AbstractC1940pQ<RequestComponentT, AdT> {

    /* renamed from: a  reason: collision with root package name */
    private final AbstractC1940pQ<RequestComponentT, AdT> f4765a;

    /* renamed from: b  reason: collision with root package name */
    private RequestComponentT f4766b;

    public C1595kQ(AbstractC1940pQ<RequestComponentT, AdT> pQVar) {
        this.f4765a = pQVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public final synchronized RequestComponentT a() {
        return this.f4766b;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1940pQ
    public final synchronized SW<AdT> a(C2284uQ uQVar, AbstractC2077rQ<RequestComponentT> rQVar) {
        if (uQVar.f5716a != null) {
            this.f4766b = rQVar.a(uQVar.f5717b).a();
            return this.f4766b.a().b(uQVar.f5716a);
        }
        SW<AdT> a2 = this.f4765a.a(uQVar, rQVar);
        this.f4766b = this.f4765a.a();
        return a2;
    }
}
