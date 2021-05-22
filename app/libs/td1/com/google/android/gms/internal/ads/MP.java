package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicReference;

public final class MP implements AbstractC0650Ru, AbstractC0391Hv, AbstractC2009qQ {

    /* renamed from: a  reason: collision with root package name */
    private final C1873oS f2582a;

    /* renamed from: b  reason: collision with root package name */
    private final AtomicReference<AbstractC0942ama> f2583b = new AtomicReference<>();

    /* renamed from: c  reason: collision with root package name */
    private final AtomicReference<AbstractC1149dma> f2584c = new AtomicReference<>();
    private final AtomicReference<AbstractC0391Hv> d = new AtomicReference<>();
    private MP e = null;

    public MP(C1873oS oSVar) {
        this.f2582a = oSVar;
    }

    public static MP a(MP mp) {
        MP mp2 = new MP(mp.f2582a);
        mp2.a((AbstractC2009qQ) mp);
        return mp2;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0391Hv
    public final void Rb() {
        MP mp = this;
        while (true) {
            MP mp2 = mp.e;
            if (mp2 != null) {
                mp = mp2;
            } else {
                C1251fQ.a(mp.d, QP.f2934a);
                return;
            }
        }
    }

    public final void a() {
        MP mp = this;
        while (true) {
            MP mp2 = mp.e;
            if (mp2 != null) {
                mp = mp2;
            } else {
                mp.f2582a.a();
                C1251fQ.a(mp.f2584c, NP.f2664a);
                return;
            }
        }
    }

    public final void a(AbstractC0391Hv hv) {
        this.d.set(hv);
    }

    public final void a(_la _la) {
        MP mp = this;
        while (true) {
            MP mp2 = mp.e;
            if (mp2 != null) {
                mp = mp2;
            } else {
                C1251fQ.a(mp.f2583b, new LP(_la));
                return;
            }
        }
    }

    public final void a(AbstractC0942ama ama) {
        this.f2583b.set(ama);
    }

    public final void a(AbstractC1149dma dma) {
        this.f2584c.set(dma);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2009qQ
    public final void a(AbstractC2009qQ qQVar) {
        this.e = (MP) qQVar;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0650Ru
    public final void c(int i) {
        MP mp = this;
        while (true) {
            MP mp2 = mp.e;
            if (mp2 != null) {
                mp = mp2;
            } else {
                C1251fQ.a(mp.f2583b, new OP(i));
                return;
            }
        }
    }
}
