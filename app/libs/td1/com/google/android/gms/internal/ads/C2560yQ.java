package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.g.a;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.android.gms.internal.ads.yQ  reason: case insensitive filesystem */
public final class C2560yQ extends a implements AbstractC0520Mu, AbstractC0650Ru, AbstractC0884_u, AbstractC0261Cv, AbstractC0651Rv, AbstractC2009qQ {

    /* renamed from: a  reason: collision with root package name */
    private final C1873oS f6080a;

    /* renamed from: b  reason: collision with root package name */
    private final AtomicReference<a> f6081b = new AtomicReference<>();

    /* renamed from: c  reason: collision with root package name */
    private final AtomicReference<AbstractC0716Ui> f6082c = new AtomicReference<>();
    private final AtomicReference<AbstractC0664Si> d = new AtomicReference<>();
    private final AtomicReference<AbstractC2586yi> e = new AtomicReference<>();
    private final AtomicReference<AbstractC0742Vi> f = new AtomicReference<>();
    private final AtomicReference<AbstractC1966pi> g = new AtomicReference<>();
    private final AtomicReference<AbstractC2118rpa> h = new AtomicReference<>();
    private C2560yQ i = null;

    public C2560yQ(C1873oS oSVar) {
        this.f6080a = oSVar;
    }

    public static C2560yQ a(C2560yQ yQVar) {
        C2560yQ yQVar2 = new C2560yQ(yQVar.f6080a);
        yQVar2.a((AbstractC2009qQ) yQVar);
        return yQVar2;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0261Cv
    public final void a() {
        C2560yQ yQVar = this;
        while (true) {
            C2560yQ yQVar2 = yQVar.i;
            if (yQVar2 != null) {
                yQVar = yQVar2;
            } else {
                C1251fQ.a(yQVar.f6082c, C2491xQ.f5980a);
                C1251fQ.a(yQVar.e, AQ.f1510a);
                return;
            }
        }
    }

    public final void a(a aVar) {
        this.f6081b.set(aVar);
    }

    public final void a(AbstractC0664Si si) {
        this.d.set(si);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0884_u
    public final void a(Sna sna) {
        C2560yQ yQVar = this;
        while (true) {
            C2560yQ yQVar2 = yQVar.i;
            if (yQVar2 != null) {
                yQVar = yQVar2;
            } else {
                C1251fQ.a(yQVar.d, new HQ(sna));
                C1251fQ.a(yQVar.d, new GQ(sna));
                return;
            }
        }
    }

    public final void a(AbstractC0716Ui ui) {
        this.f6082c.set(ui);
    }

    public final void a(AbstractC0742Vi vi) {
        this.f.set(vi);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0651Rv
    public final void a(C1152doa doa) {
        C2560yQ yQVar = this;
        while (true) {
            C2560yQ yQVar2 = yQVar.i;
            if (yQVar2 != null) {
                yQVar = yQVar2;
            } else {
                C1251fQ.a(yQVar.h, new IQ(doa));
                return;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0520Mu
    public final void a(AbstractC1897oi oiVar, String str, String str2) {
        C2560yQ yQVar = this;
        while (true) {
            C2560yQ yQVar2 = yQVar.i;
            if (yQVar2 != null) {
                yQVar = yQVar2;
            } else {
                C1251fQ.a(yQVar.d, new C2629zQ(oiVar));
                C1251fQ.a(yQVar.f, new CQ(oiVar, str, str2));
                C1251fQ.a(yQVar.e, new BQ(oiVar));
                C1251fQ.a(yQVar.g, new FQ(oiVar, str, str2));
                return;
            }
        }
    }

    @Deprecated
    public final void a(AbstractC1966pi piVar) {
        this.g.set(piVar);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2009qQ
    public final void a(AbstractC2009qQ qQVar) {
        this.i = (C2560yQ) qQVar;
    }

    public final void a(AbstractC2118rpa rpa) {
        this.h.set(rpa);
    }

    @Deprecated
    public final void a(AbstractC2586yi yiVar) {
        this.e.set(yiVar);
    }

    @Override // com.google.android.gms.ads.g.a
    public final void c() {
        C2560yQ yQVar = this.i;
        if (yQVar != null) {
            yQVar.c();
        } else {
            C1251fQ.a(this.f6081b, JQ.f2321a);
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0650Ru
    public final void c(int i2) {
        C2560yQ yQVar = this;
        while (true) {
            C2560yQ yQVar2 = yQVar.i;
            if (yQVar2 != null) {
                yQVar = yQVar2;
            } else {
                C1251fQ.a(yQVar.f6082c, new LQ(i2));
                C1251fQ.a(yQVar.e, new KQ(i2));
                return;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0520Mu
    public final void f() {
        C2560yQ yQVar = this;
        while (true) {
            C2560yQ yQVar2 = yQVar.i;
            if (yQVar2 != null) {
                yQVar = yQVar2;
            } else {
                C1251fQ.a(yQVar.e, QQ.f2935a);
                return;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0520Mu
    public final void g() {
        C2560yQ yQVar = this;
        while (true) {
            C2560yQ yQVar2 = yQVar.i;
            if (yQVar2 != null) {
                yQVar = yQVar2;
            } else {
                C1251fQ.a(yQVar.e, DQ.f1767a);
                return;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0520Mu
    public final void h() {
        C2560yQ yQVar = this;
        while (true) {
            C2560yQ yQVar2 = yQVar.i;
            if (yQVar2 != null) {
                yQVar = yQVar2;
            } else {
                C1251fQ.a(yQVar.d, NQ.f2665a);
                C1251fQ.a(yQVar.e, MQ.f2585a);
                return;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0520Mu
    public final void i() {
        C2560yQ yQVar = this;
        while (true) {
            C2560yQ yQVar2 = yQVar.i;
            if (yQVar2 != null) {
                yQVar = yQVar2;
            } else {
                C1251fQ.a(yQVar.e, RQ.f3011a);
                return;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0520Mu
    public final void j() {
        C2560yQ yQVar = this;
        while (true) {
            C2560yQ yQVar2 = yQVar.i;
            if (yQVar2 != null) {
                yQVar = yQVar2;
            } else {
                yQVar.f6080a.a();
                C1251fQ.a(yQVar.d, PQ.f2829a);
                C1251fQ.a(yQVar.e, OQ.f2743a);
                return;
            }
        }
    }
}
