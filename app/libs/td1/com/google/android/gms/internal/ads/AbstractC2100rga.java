package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.rga  reason: case insensitive filesystem */
public abstract class AbstractC2100rga implements Mga, Pga {

    /* renamed from: a  reason: collision with root package name */
    private final int f5438a;

    /* renamed from: b  reason: collision with root package name */
    private Oga f5439b;

    /* renamed from: c  reason: collision with root package name */
    private int f5440c;
    private int d;
    private Eja e;
    private long f;
    private boolean g = true;
    private boolean h;

    public AbstractC2100rga(int i) {
        this.f5438a = i;
    }

    /* access modifiers changed from: protected */
    public final int a(Jga jga, Eha eha, boolean z) {
        int a2 = this.e.a(jga, eha, z);
        if (a2 == -4) {
            if (eha.c()) {
                this.g = true;
                return this.h ? -4 : -3;
            }
            eha.d += this.f;
        } else if (a2 == -5) {
            Hga hga = jga.f2341a;
            long j = hga.w;
            if (j != Long.MAX_VALUE) {
                jga.f2341a = hga.a(j + this.f);
            }
        }
        return a2;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2514xga
    public void a(int i, Object obj) {
    }

    @Override // com.google.android.gms.internal.ads.Mga
    public final void a(long j) {
        this.h = false;
        this.g = false;
        a(j, false);
    }

    /* access modifiers changed from: protected */
    public abstract void a(long j, boolean z);

    @Override // com.google.android.gms.internal.ads.Mga
    public final void a(Oga oga, Hga[] hgaArr, Eja eja, long j, boolean z, long j2) {
        C2453wka.b(this.d == 0);
        this.f5439b = oga;
        this.d = 1;
        a(z);
        a(hgaArr, eja, j2);
        a(j, z);
    }

    /* access modifiers changed from: protected */
    public abstract void a(boolean z);

    /* access modifiers changed from: protected */
    public void a(Hga[] hgaArr, long j) {
    }

    @Override // com.google.android.gms.internal.ads.Mga
    public final void a(Hga[] hgaArr, Eja eja, long j) {
        C2453wka.b(!this.h);
        this.e = eja;
        this.g = false;
        this.f = j;
        a(hgaArr, j);
    }

    /* access modifiers changed from: protected */
    public final void b(long j) {
        this.e.a(j - this.f);
    }

    /* access modifiers changed from: protected */
    public final int c() {
        return this.f5440c;
    }

    /* access modifiers changed from: protected */
    public abstract void d();

    /* access modifiers changed from: protected */
    public abstract void e();

    /* access modifiers changed from: protected */
    public abstract void f();

    /* access modifiers changed from: protected */
    public final Oga g() {
        return this.f5439b;
    }

    @Override // com.google.android.gms.internal.ads.Mga
    public final int getState() {
        return this.d;
    }

    /* access modifiers changed from: protected */
    public final boolean h() {
        return this.g ? this.h : this.e.p();
    }

    @Override // com.google.android.gms.internal.ads.Mga
    public final void r() {
        this.h = true;
    }

    @Override // com.google.android.gms.internal.ads.Mga
    public final boolean s() {
        return this.h;
    }

    @Override // com.google.android.gms.internal.ads.Mga
    public final void setIndex(int i) {
        this.f5440c = i;
    }

    @Override // com.google.android.gms.internal.ads.Mga
    public final void start() {
        boolean z = true;
        if (this.d != 1) {
            z = false;
        }
        C2453wka.b(z);
        this.d = 2;
        d();
    }

    @Override // com.google.android.gms.internal.ads.Mga
    public final void stop() {
        C2453wka.b(this.d == 2);
        this.d = 1;
        e();
    }

    @Override // com.google.android.gms.internal.ads.Mga
    public final void t() {
        this.e.a();
    }

    @Override // com.google.android.gms.internal.ads.Pga, com.google.android.gms.internal.ads.Mga
    public final int u() {
        return this.f5438a;
    }

    @Override // com.google.android.gms.internal.ads.Mga
    public final Pga v() {
        return this;
    }

    @Override // com.google.android.gms.internal.ads.Mga
    public Aka w() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.Mga
    public final Eja x() {
        return this.e;
    }

    @Override // com.google.android.gms.internal.ads.Mga
    public final boolean y() {
        return this.g;
    }

    @Override // com.google.android.gms.internal.ads.Mga
    public final void z() {
        boolean z = true;
        if (this.d != 1) {
            z = false;
        }
        C2453wka.b(z);
        this.d = 0;
        this.e = null;
        this.h = false;
        f();
    }
}
