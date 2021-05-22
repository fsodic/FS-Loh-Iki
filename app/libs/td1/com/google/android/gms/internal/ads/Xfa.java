package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.C1511jB;

public final class Xfa extends AbstractCallableC1137dga {
    private static volatile Long i;
    private static final Object j = new Object();

    public Xfa(C1823nfa nfa, String str, String str2, C1511jB.a aVar, int i2, int i3) {
        super(nfa, str, str2, aVar, i2, 33);
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.AbstractCallableC1137dga
    public final void a() {
        if (i == null) {
            synchronized (j) {
                if (i == null) {
                    i = (Long) this.f.invoke(null, new Object[0]);
                }
            }
        }
        synchronized (this.e) {
            this.e.z(i.longValue());
        }
    }
}
