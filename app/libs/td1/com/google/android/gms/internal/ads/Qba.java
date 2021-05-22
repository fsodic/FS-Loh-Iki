package com.google.android.gms.internal.ads;

/* access modifiers changed from: package-private */
public final class Qba {

    /* renamed from: a  reason: collision with root package name */
    private final AbstractC0991bca f2945a;

    /* renamed from: b  reason: collision with root package name */
    private final byte[] f2946b;

    private Qba(int i) {
        this.f2946b = new byte[i];
        this.f2945a = AbstractC0991bca.a(this.f2946b);
    }

    /* synthetic */ Qba(int i, Hba hba) {
        this(i);
    }

    public final Iba a() {
        this.f2945a.b();
        return new Tba(this.f2946b);
    }

    public final AbstractC0991bca b() {
        return this.f2945a;
    }
}
