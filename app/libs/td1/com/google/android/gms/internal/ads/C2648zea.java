package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

/* renamed from: com.google.android.gms.internal.ads.zea  reason: case insensitive filesystem */
public class C2648zea extends Bea implements AbstractC0856Zs {
    private AbstractC0208Au j;
    private String k;
    private boolean l;
    private long m;

    public C2648zea(String str) {
        this.k = str;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0856Zs
    public final void a(AbstractC0208Au au) {
        this.j = au;
    }

    @Override // com.google.android.gms.internal.ads.Bea
    public final void a(Dea dea, long j2, AbstractC2604ys ysVar) {
        this.d = dea;
        this.f = dea.position();
        this.g = this.f - ((long) ((this.l || 8 + j2 >= 4294967296L) ? 16 : 8));
        dea.a(dea.position() + j2);
        this.h = dea.position();
        this.f1630c = ysVar;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0856Zs
    public final void a(Dea dea, ByteBuffer byteBuffer, long j2, AbstractC2604ys ysVar) {
        this.m = dea.position() - ((long) byteBuffer.remaining());
        this.l = byteBuffer.remaining() == 16;
        a(dea, j2, ysVar);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0856Zs
    public final String getType() {
        return this.k;
    }
}
