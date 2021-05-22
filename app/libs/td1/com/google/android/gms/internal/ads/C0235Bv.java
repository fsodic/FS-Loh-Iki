package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.util.Date;

/* renamed from: com.google.android.gms.internal.ads.Bv  reason: case insensitive filesystem */
public final class C0235Bv extends AbstractC2579yea {
    private int A;
    private Date n;
    private Date o;
    private long p;
    private long q;
    private double r = 1.0d;
    private float s = 1.0f;
    private Iea t = Iea.f2244a;
    private long u;
    private int v;
    private int w;
    private int x;
    private int y;
    private int z;

    public C0235Bv() {
        super("mvhd");
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2510xea
    public final void a(ByteBuffer byteBuffer) {
        long j;
        b(byteBuffer);
        if (b() == 1) {
            this.n = Fea.a(C2674zt.c(byteBuffer));
            this.o = Fea.a(C2674zt.c(byteBuffer));
            this.p = C2674zt.a(byteBuffer);
            j = C2674zt.c(byteBuffer);
        } else {
            this.n = Fea.a(C2674zt.a(byteBuffer));
            this.o = Fea.a(C2674zt.a(byteBuffer));
            this.p = C2674zt.a(byteBuffer);
            j = C2674zt.a(byteBuffer);
        }
        this.q = j;
        this.r = C2674zt.d(byteBuffer);
        byte[] bArr = new byte[2];
        byteBuffer.get(bArr);
        this.s = ((float) ((short) ((bArr[1] & 255) | ((short) (0 | ((bArr[0] << 8) & 65280)))))) / 256.0f;
        C2674zt.b(byteBuffer);
        C2674zt.a(byteBuffer);
        C2674zt.a(byteBuffer);
        this.t = Iea.a(byteBuffer);
        this.v = byteBuffer.getInt();
        this.w = byteBuffer.getInt();
        this.x = byteBuffer.getInt();
        this.y = byteBuffer.getInt();
        this.z = byteBuffer.getInt();
        this.A = byteBuffer.getInt();
        this.u = C2674zt.a(byteBuffer);
    }

    public final long c() {
        return this.q;
    }

    public final long d() {
        return this.p;
    }

    public final String toString() {
        return "MovieHeaderBox[" + "creationTime=" + this.n + ";" + "modificationTime=" + this.o + ";" + "timescale=" + this.p + ";" + "duration=" + this.q + ";" + "rate=" + this.r + ";" + "volume=" + this.s + ";" + "matrix=" + this.t + ";" + "nextTrackId=" + this.u + "]";
    }
}
