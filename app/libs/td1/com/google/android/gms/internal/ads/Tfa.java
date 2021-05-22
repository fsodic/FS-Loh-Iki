package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.C1511jB;

public final class Tfa extends AbstractCallableC1137dga {
    private final boolean i;

    public Tfa(C1823nfa nfa, String str, String str2, C1511jB.a aVar, int i2, int i3) {
        super(nfa, str, str2, aVar, i2, 61);
        this.i = nfa.d();
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.AbstractCallableC1137dga
    public final void a() {
        long longValue = ((Long) this.f.invoke(null, this.f4125b.a(), Boolean.valueOf(this.i))).longValue();
        synchronized (this.e) {
            this.e.h(longValue);
        }
    }
}
