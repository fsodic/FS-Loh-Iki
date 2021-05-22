package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.gms.internal.ads.xH  reason: case insensitive filesystem */
public final class C2482xH implements AbstractC1793nH<AbstractC0951as> {

    /* renamed from: a  reason: collision with root package name */
    private final AbstractC2466ws f5962a;

    /* renamed from: b  reason: collision with root package name */
    private final Context f5963b;

    /* renamed from: c  reason: collision with root package name */
    private final MC f5964c;
    private final GR d;
    private final Executor e;
    private final AbstractC1187eV<C1941pR, C0536Nk> f;

    public C2482xH(AbstractC2466ws wsVar, Context context, Executor executor, MC mc, GR gr, AbstractC1187eV<C1941pR, C0536Nk> eVVar) {
        this.f5963b = context;
        this.f5962a = wsVar;
        this.e = executor;
        this.f5964c = mc;
        this.d = gr;
        this.f = eVVar;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1793nH
    public final SW<AbstractC0951as> a(BR br, C1941pR pRVar) {
        return JW.a(JW.a((Object) null), new AH(this, br, pRVar), this.e);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ SW a(BR br, C1941pR pRVar, Object obj) {
        C1015boa a2 = JR.a(this.f5963b, pRVar.r);
        AbstractC1564jo a3 = this.f5964c.a(a2);
        a3.e(pRVar.N);
        AbstractC2466ws wsVar = this.f5962a;
        C2054qt qtVar = new C2054qt(br, pRVar, null);
        C1101dD dDVar = new C1101dD(this.f5963b, a3.getView(), this.f.apply(pRVar));
        a3.getClass();
        AbstractC1157ds a4 = wsVar.a(qtVar, new C1433hs(dDVar, a3, C2620zH.a(a3), JR.a(a2)));
        a4.h().a(a3, false);
        a4.d().a(new CH(a3), C0875_l.f);
        a4.h();
        C2216tR tRVar = pRVar.p;
        SW<?> a5 = OC.a(a3, tRVar.f5610b, tRVar.f5609a);
        if (pRVar.E) {
            a3.getClass();
            a5.a(BH.a(a3), this.e);
        }
        a5.a(new EH(this, a3), this.e);
        return JW.a(a5, new DH(a4), C0875_l.f);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void a(AbstractC1564jo joVar) {
        joVar.p();
        BinderC0306Eo E = joVar.E();
        C1028c cVar = this.d.f2037b;
        if (cVar != null && E != null) {
            E.b(cVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1793nH
    public final boolean b(BR br, C1941pR pRVar) {
        C2216tR tRVar = pRVar.p;
        return (tRVar == null || tRVar.f5609a == null) ? false : true;
    }
}
