package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.C1511jB;

public final class Ofa extends AbstractCallableC1137dga {
    private static volatile String i;
    private static final Object j = new Object();

    public Ofa(C1823nfa nfa, String str, String str2, C1511jB.a aVar, int i2, int i3) {
        super(nfa, str, str2, aVar, i2, 1);
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.AbstractCallableC1137dga
    public final void a() {
        this.e.c("E");
        if (i == null) {
            synchronized (j) {
                if (i == null) {
                    i = (String) this.f.invoke(null, new Object[0]);
                }
            }
        }
        synchronized (this.e) {
            this.e.c(i);
        }
    }
}
