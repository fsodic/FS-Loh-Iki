package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.q;

/* access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.ads.ak  reason: case insensitive filesystem */
public final class C0937ak extends AbstractC1487ik {
    private final /* synthetic */ C0847Zj d;

    C0937ak(C0847Zj zj) {
        this.d = zj;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1487ik
    public final void a() {
        B b2 = new B(this.d.f, this.d.g.f3587a);
        synchronized (this.d.f3666a) {
            try {
                q.l();
                D.a(this.d.h, b2);
            } catch (IllegalArgumentException e) {
                C0745Vl.c("Cannot config CSI reporter.", e);
            }
        }
    }
}
