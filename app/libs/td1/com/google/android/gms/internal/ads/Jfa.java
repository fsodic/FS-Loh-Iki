package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.C1511jB;

public final class Jfa extends AbstractCallableC1137dga {
    private long i;

    public Jfa(C1823nfa nfa, String str, String str2, C1511jB.a aVar, long j, int i2, int i3) {
        super(nfa, str, str2, aVar, i2, 25);
        this.i = j;
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.AbstractCallableC1137dga
    public final void a() {
        long longValue = ((Long) this.f.invoke(null, new Object[0])).longValue();
        synchronized (this.e) {
            this.e.k(longValue);
            if (this.i != 0) {
                this.e.t(longValue - this.i);
                this.e.w(this.i);
            }
        }
    }
}
