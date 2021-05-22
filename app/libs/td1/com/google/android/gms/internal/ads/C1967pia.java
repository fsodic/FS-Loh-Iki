package com.google.android.gms.internal.ads;

/* access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.ads.pia  reason: case insensitive filesystem */
public final class C1967pia {

    /* renamed from: a  reason: collision with root package name */
    public final int f5258a;

    /* renamed from: b  reason: collision with root package name */
    public int f5259b;

    /* renamed from: c  reason: collision with root package name */
    public int f5260c;
    public long d;
    private final boolean e;
    private final Dka f;
    private final Dka g;
    private int h;
    private int i;

    public C1967pia(Dka dka, Dka dka2, boolean z) {
        this.g = dka;
        this.f = dka2;
        this.e = z;
        dka2.c(12);
        this.f5258a = dka2.o();
        dka.c(12);
        this.i = dka.o();
        C2453wka.b(dka.d() != 1 ? false : true, "first_chunk must be 1");
        this.f5259b = -1;
    }

    public final boolean a() {
        int i2 = this.f5259b + 1;
        this.f5259b = i2;
        if (i2 == this.f5258a) {
            return false;
        }
        this.d = this.e ? this.f.p() : this.f.l();
        if (this.f5259b == this.h) {
            this.f5260c = this.g.o();
            this.g.d(4);
            int i3 = this.i - 1;
            this.i = i3;
            this.h = i3 > 0 ? this.g.o() - 1 : -1;
        }
        return true;
    }
}
