package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.fJ  reason: case insensitive filesystem */
public class BinderC1244fJ extends IJ {
    private C0783Wx j;

    public BinderC1244fJ(C0494Lu lu, C1160dv dvVar, C1780mv mvVar, C2469wv wvVar, C0702Tu tu, C0522Mw mw, C1232ey eyVar, C0469Kv kv, C0783Wx wx, C0444Jw jw) {
        super(lu, dvVar, mvVar, wvVar, mw, kv, eyVar, jw, tu);
        this.j = wx;
    }

    @Override // com.google.android.gms.internal.ads.IJ, com.google.android.gms.internal.ads.AbstractC2304uf
    public final void Na() {
        this.j.M();
    }

    @Override // com.google.android.gms.internal.ads.IJ, com.google.android.gms.internal.ads.AbstractC2304uf
    public final void Xa() {
        this.j.N();
    }

    @Override // com.google.android.gms.internal.ads.IJ, com.google.android.gms.internal.ads.AbstractC2304uf
    public final void Y() {
        this.j.M();
    }

    @Override // com.google.android.gms.internal.ads.IJ, com.google.android.gms.internal.ads.AbstractC2304uf
    public final void a(C0456Ki ki) {
        super.a(ki);
        this.j.a(ki);
    }

    @Override // com.google.android.gms.internal.ads.IJ, com.google.android.gms.internal.ads.AbstractC2304uf
    public final void a(AbstractC0508Mi mi) {
        super.a(mi);
        this.j.a(new C0456Ki(mi.getType(), mi.A()));
    }
}
