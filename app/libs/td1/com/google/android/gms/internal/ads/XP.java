package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.AbstractC2399vu;
import com.google.android.gms.internal.ads.C0952at;

final class XP<R extends AbstractC2399vu<AdT>, AdT extends C0952at> implements OS<AdT> {

    /* renamed from: a  reason: collision with root package name */
    private final AbstractC1940pQ<R, CS<AdT>> f3497a;

    public XP(AbstractC1940pQ<R, CS<AdT>> pQVar) {
        this.f3497a = pQVar;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.google.android.gms.internal.ads.pQ<R extends com.google.android.gms.internal.ads.vu<AdT>, com.google.android.gms.internal.ads.CS<AdT extends com.google.android.gms.internal.ads.at>> */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.ads.OS
    public final SW<CS<AdT>> a(RS rs) {
        _P _p = (_P) rs;
        return this.f3497a.a(_p.f3716b, _p.f3715a);
    }

    @Override // com.google.android.gms.internal.ads.OS
    public final void a(CS<AdT> cs) {
        cs.f1694a = this.f3497a.a().a();
    }

    @Override // com.google.android.gms.internal.ads.OS
    public final void a(Throwable th) {
    }
}
