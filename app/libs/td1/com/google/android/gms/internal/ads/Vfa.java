package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.C1511jB;

public final class Vfa extends AbstractCallableC1137dga {
    public Vfa(C1823nfa nfa, String str, String str2, C1511jB.a aVar, int i, int i2) {
        super(nfa, str, str2, aVar, i, 51);
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.AbstractCallableC1137dga
    public final void a() {
        synchronized (this.e) {
            C1892ofa ofa = new C1892ofa((String) this.f.invoke(null, new Object[0]));
            this.e.c(ofa.f5152b.longValue());
            this.e.d(ofa.f5153c.longValue());
        }
    }
}
