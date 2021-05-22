package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.Zn  reason: case insensitive filesystem */
public final class C0851Zn extends AbstractC0565On {
    public C0851Zn(AbstractC0798Xm xm) {
        super(xm);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0565On
    public final boolean a(String str) {
        AbstractC0798Xm xm = this.f2790c.get();
        if (xm != null) {
            xm.a(b(str), this);
        }
        C0745Vl.d("VideoStreamNoopCache is doing nothing.");
        a(str, b(str), "noop", "Noop cache is a noop.");
        return false;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0565On
    public final void b() {
    }
}
