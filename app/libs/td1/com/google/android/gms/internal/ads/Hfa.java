package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.C1511jB;

public final class Hfa extends AbstractCallableC1137dga {
    public Hfa(C1823nfa nfa, String str, String str2, C1511jB.a aVar, int i, int i2) {
        super(nfa, str, str2, aVar, i, 5);
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.AbstractCallableC1137dga
    public final void a() {
        this.e.m(-1);
        this.e.n(-1);
        int[] iArr = (int[]) this.f.invoke(null, this.f4125b.a());
        synchronized (this.e) {
            this.e.m((long) iArr[0]);
            this.e.n((long) iArr[1]);
            if (iArr[2] != Integer.MIN_VALUE) {
                this.e.f((long) iArr[2]);
            }
        }
    }
}
