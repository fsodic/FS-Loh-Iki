package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.C1511jB;

public final class Yfa extends AbstractCallableC1137dga {
    private final View$OnAttachStateChangeListenerC2650zfa i;
    private long j;

    public Yfa(C1823nfa nfa, String str, String str2, C1511jB.a aVar, int i2, int i3, View$OnAttachStateChangeListenerC2650zfa zfa) {
        super(nfa, str, str2, aVar, i2, 53);
        this.i = zfa;
        if (zfa != null) {
            this.j = zfa.a();
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.AbstractCallableC1137dga
    public final void a() {
        if (this.i != null) {
            this.e.e(((Long) this.f.invoke(null, Long.valueOf(this.j))).longValue());
        }
    }
}
