package com.google.android.gms.internal.ads;

public final class Vka implements AbstractC2511xf {

    /* renamed from: a  reason: collision with root package name */
    private int f3364a;

    /* renamed from: b  reason: collision with root package name */
    private int f3365b;

    /* renamed from: c  reason: collision with root package name */
    private final int f3366c;
    private final float d;

    public Vka() {
        this(2500, 1, 1.0f);
    }

    private Vka(int i, int i2, float f) {
        this.f3364a = 2500;
        this.f3366c = 1;
        this.d = 1.0f;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2511xf
    public final void a(C0713Uf uf) {
        boolean z = true;
        this.f3365b++;
        int i = this.f3364a;
        this.f3364a = i + ((int) (((float) i) * this.d));
        if (this.f3365b > this.f3366c) {
            z = false;
        }
        if (!z) {
            throw uf;
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2511xf
    public final int c() {
        return this.f3365b;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2511xf
    public final int d() {
        return this.f3364a;
    }
}
