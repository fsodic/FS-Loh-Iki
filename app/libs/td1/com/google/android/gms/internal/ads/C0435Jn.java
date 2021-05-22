package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.q;

/* renamed from: com.google.android.gms.internal.ads.Jn  reason: case insensitive filesystem */
public final class C0435Jn extends AbstractC1487ik {
    final AbstractC0798Xm d;
    final AbstractC0565On e;
    private final String f;
    private final String[] g;

    C0435Jn(AbstractC0798Xm xm, AbstractC0565On on, String str, String[] strArr) {
        this.d = xm;
        this.e = on;
        this.f = str;
        this.g = strArr;
        q.y().a(this);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1487ik
    public final void a() {
        try {
            this.e.a(this.f, this.g);
        } finally {
            C2452wk.f5921a.post(new RunnableC0513Mn(this));
        }
    }
}
