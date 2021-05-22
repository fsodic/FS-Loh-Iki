package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.g;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.ads.internal.overlay.n;
import com.google.android.gms.ads.internal.overlay.t;
import com.google.android.gms.ads.internal.q;
import org.cocos2dx.lib.BuildConfig;

/* access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.ads.mJ  reason: case insensitive filesystem */
public final class C1726mJ implements AbstractC0732Uy {

    /* renamed from: a  reason: collision with root package name */
    private final Context f4932a;

    /* renamed from: b  reason: collision with root package name */
    private final MC f4933b;

    /* renamed from: c  reason: collision with root package name */
    private final GR f4934c;
    private final C0823Yl d;
    private final C1941pR e;
    private final SW<BC> f;
    private final AbstractC1564jo g;

    private C1726mJ(Context context, MC mc, GR gr, C0823Yl yl, C1941pR pRVar, SW<BC> sw, AbstractC1564jo joVar) {
        this.f4932a = context;
        this.f4933b = mc;
        this.f4934c = gr;
        this.d = yl;
        this.e = pRVar;
        this.f = sw;
        this.g = joVar;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0732Uy
    public final void a(boolean z, Context context) {
        AbstractC1564jo joVar;
        BC bc = (BC) JW.b(this.f);
        try {
            C1941pR pRVar = this.e;
            if (this.g.n()) {
                if (((Boolean) C2392voa.e().a(C2474x.oa)).booleanValue()) {
                    AbstractC1564jo a2 = this.f4933b.a(this.f4934c.e);
                    C0554Oc.a(a2, bc.l());
                    C1032cD cDVar = new C1032cD();
                    cDVar.a(this.f4932a, a2.getView());
                    bc.h().a(a2, true);
                    a2.d().a(new C1933pJ(cDVar, a2));
                    AbstractC0774Wo d2 = a2.d();
                    a2.getClass();
                    d2.a(C1864oJ.a(a2));
                    a2.a(pRVar.p.f5610b, pRVar.p.f5609a, (String) null);
                    joVar = a2;
                    joVar.d(true);
                    q.c();
                    boolean n = C2452wk.n(this.f4932a);
                    C1941pR pRVar2 = this.e;
                    g gVar = new g(false, n, false, 0.0f, -1, z, pRVar2.G, pRVar2.H);
                    q.b();
                    C0472Ky j = bc.j();
                    C1941pR pRVar3 = this.e;
                    int i = pRVar3.I;
                    C0823Yl yl = this.d;
                    String str = pRVar3.y;
                    C2216tR tRVar = pRVar3.p;
                    n.a(context, new AdOverlayInfoParcel((Ona) null, j, (t) null, joVar, i, yl, str, gVar, tRVar.f5610b, tRVar.f5609a), true);
                }
            }
            joVar = this.g;
            joVar.d(true);
            q.c();
            boolean n2 = C2452wk.n(this.f4932a);
            C1941pR pRVar22 = this.e;
            g gVar2 = new g(false, n2, false, 0.0f, -1, z, pRVar22.G, pRVar22.H);
            q.b();
            C0472Ky j2 = bc.j();
            C1941pR pRVar32 = this.e;
            int i2 = pRVar32.I;
            C0823Yl yl2 = this.d;
            String str2 = pRVar32.y;
            C2216tR tRVar2 = pRVar32.p;
            n.a(context, new AdOverlayInfoParcel((Ona) null, j2, (t) null, joVar, i2, yl2, str2, gVar2, tRVar2.f5610b, tRVar2.f5609a), true);
        } catch (C2391vo e2) {
            C0745Vl.b(BuildConfig.FLAVOR, e2);
        }
    }
}
