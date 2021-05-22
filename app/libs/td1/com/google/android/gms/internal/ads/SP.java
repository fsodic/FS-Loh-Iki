package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.AbstractC2399vu;
import com.google.android.gms.internal.ads.C0952at;
import java.util.concurrent.Executor;

public final class SP<R extends AbstractC2399vu<AdT>, AdT extends C0952at> implements AbstractC1940pQ<R, CS<AdT>> {

    /* renamed from: a  reason: collision with root package name */
    private R f3082a;

    /* renamed from: b  reason: collision with root package name */
    private final Executor f3083b = UW.a();

    @Override // com.google.android.gms.internal.ads.AbstractC1940pQ
    public final SW<CS<AdT>> a(C2284uQ uQVar, AbstractC2077rQ<R> rQVar) {
        AbstractC2330uu<R> a2 = rQVar.a(uQVar.f5717b);
        a2.a(new C2353vQ(true));
        this.f3082a = a2.a();
        C2605yt a3 = this.f3082a.a();
        CS cs = new CS();
        C0715Uh uh = uQVar.f5716a;
        return AW.c((SW) (uh != null ? a3.a(uh) : a3.a())).a(new RP(this, cs, a3), this.f3083b).a(new UP(cs), this.f3083b);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1940pQ
    public final /* synthetic */ Object a() {
        return this.f3082a;
    }
}
