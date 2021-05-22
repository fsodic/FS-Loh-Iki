package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.AbstractC2399vu;
import com.google.android.gms.internal.ads.C0952at;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.gms.internal.ads.bQ  reason: case insensitive filesystem */
public final class C0976bQ<R extends AbstractC2399vu<AdT>, AdT extends C0952at> implements AbstractC1940pQ<R, C1320gQ<AdT>> {

    /* renamed from: a  reason: collision with root package name */
    private final AbstractC2079rS f3892a;

    /* renamed from: b  reason: collision with root package name */
    private final Executor f3893b;

    /* renamed from: c  reason: collision with root package name */
    private GW<Void> f3894c = new C1045cQ(this);

    public C0976bQ(AbstractC2079rS rSVar, Executor executor) {
        this.f3892a = rSVar;
        this.f3893b = executor;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1940pQ
    public final SW<C1320gQ<AdT>> a(C2284uQ uQVar, AbstractC2077rQ<R> rQVar) {
        return AW.c((SW) new C1526jQ(this.f3892a, uQVar.f5717b, rQVar, this.f3893b).a()).a(new C0907aQ(this, uQVar, rQVar), this.f3893b).a(Exception.class, new C1182eQ(this), this.f3893b);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ SW a(C2284uQ uQVar, AbstractC2077rQ rQVar, C1802nQ nQVar) {
        BS bs = nQVar.f5040b;
        C0715Uh uh = nQVar.f5039a;
        CS<?> b2 = bs != null ? this.f3892a.b(bs) : null;
        if (bs == null) {
            return JW.a((Object) null);
        }
        if (!(b2 == null || uh == null)) {
            JW.a(((AbstractC2399vu) rQVar.a(uQVar.f5717b).a()).a().c(uh), this.f3894c, this.f3893b);
        }
        return JW.a(new C1320gQ(bs, uh, b2));
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1940pQ
    public final /* bridge */ /* synthetic */ Object a() {
        return null;
    }
}
