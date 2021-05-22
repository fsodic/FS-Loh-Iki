package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.C1511jB;

public final class Sfa extends AbstractCallableC1137dga {
    public Sfa(C1823nfa nfa, String str, String str2, C1511jB.a aVar, int i, int i2) {
        super(nfa, str, str2, aVar, i, 3);
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.AbstractCallableC1137dga
    public final void a() {
        boolean booleanValue = ((Boolean) C2392voa.e().a(C2474x.Cb)).booleanValue();
        C2028qea qea = new C2028qea((String) this.f.invoke(null, this.f4125b.a(), Boolean.valueOf(booleanValue)));
        synchronized (this.e) {
            this.e.l(qea.f5333b);
            this.e.g(qea.f5334c);
        }
    }
}
