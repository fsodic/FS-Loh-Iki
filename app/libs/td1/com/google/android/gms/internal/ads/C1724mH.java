package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.mH  reason: case insensitive filesystem */
public final class C1724mH<DelegateT, AdapterT> implements AbstractC1793nH<AdapterT> {

    /* renamed from: a  reason: collision with root package name */
    private final AbstractC1793nH<DelegateT> f4928a;

    /* renamed from: b  reason: collision with root package name */
    private final AbstractC1187eV<DelegateT, AdapterT> f4929b;

    public C1724mH(AbstractC1793nH<DelegateT> nHVar, AbstractC1187eV<DelegateT, AdapterT> eVVar) {
        this.f4928a = nHVar;
        this.f4929b = eVVar;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1793nH
    public final SW<AdapterT> a(BR br, C1941pR pRVar) {
        return JW.a(this.f4928a.a(br, pRVar), this.f4929b, C0875_l.f3755a);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1793nH
    public final boolean b(BR br, C1941pR pRVar) {
        return this.f4928a.b(br, pRVar);
    }
}
