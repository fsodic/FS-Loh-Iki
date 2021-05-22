package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.qn  reason: case insensitive filesystem */
public final class C2045qn implements Lga {

    /* renamed from: a  reason: collision with root package name */
    private final C1488ika f5357a;

    /* renamed from: b  reason: collision with root package name */
    private long f5358b;

    /* renamed from: c  reason: collision with root package name */
    private long f5359c;
    private long d;
    private long e;
    private int f;
    private boolean g;

    C2045qn() {
        this(15000, 30000, 2500, 5000);
    }

    private C2045qn(int i, int i2, long j, long j2) {
        this.f5357a = new C1488ika(true, 65536);
        this.f5358b = 15000000;
        this.f5359c = 30000000;
        this.d = 2500000;
        this.e = 5000000;
    }

    private final void a(boolean z) {
        this.f = 0;
        this.g = false;
        if (z) {
            this.f5357a.c();
        }
    }

    @Override // com.google.android.gms.internal.ads.Lga
    public final void a() {
        a(false);
    }

    public final synchronized void a(int i) {
        this.d = ((long) i) * 1000;
    }

    @Override // com.google.android.gms.internal.ads.Lga
    public final void a(Mga[] mgaArr, Lja lja, _ja _ja) {
        this.f = 0;
        for (int i = 0; i < mgaArr.length; i++) {
            if (_ja.a(i) != null) {
                this.f += Jka.b(mgaArr[i].u());
            }
        }
        this.f5357a.a(this.f);
    }

    @Override // com.google.android.gms.internal.ads.Lga
    public final synchronized boolean a(long j) {
        boolean z = false;
        char c2 = j > this.f5359c ? 0 : j < this.f5358b ? (char) 2 : 1;
        boolean z2 = this.f5357a.d() >= this.f;
        if (c2 == 2 || (c2 == 1 && this.g && !z2)) {
            z = true;
        }
        this.g = z;
        return this.g;
    }

    @Override // com.google.android.gms.internal.ads.Lga
    public final synchronized boolean a(long j, boolean z) {
        long j2;
        j2 = z ? this.e : this.d;
        return j2 <= 0 || j >= j2;
    }

    @Override // com.google.android.gms.internal.ads.Lga
    public final void b() {
        a(true);
    }

    public final synchronized void b(int i) {
        this.e = ((long) i) * 1000;
    }

    @Override // com.google.android.gms.internal.ads.Lga
    public final AbstractC1076cka c() {
        return this.f5357a;
    }

    public final synchronized void c(int i) {
        this.f5358b = ((long) i) * 1000;
    }

    @Override // com.google.android.gms.internal.ads.Lga
    public final void d() {
        a(true);
    }

    public final synchronized void d(int i) {
        this.f5359c = ((long) i) * 1000;
    }
}
