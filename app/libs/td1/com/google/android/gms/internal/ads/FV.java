package com.google.android.gms.internal.ads;

final class FV extends AV<E> {

    /* renamed from: c  reason: collision with root package name */
    private final transient int f1964c;
    private final transient int d;
    private final /* synthetic */ AV e;

    FV(AV av, int i, int i2) {
        this.e = av;
        this.f1964c = i;
        this.d = i2;
    }

    @Override // com.google.android.gms.internal.ads.AV
    /* renamed from: a */
    public final AV<E> subList(int i, int i2) {
        C1945pV.a(i, i2, this.d);
        AV av = this.e;
        int i3 = this.f1964c;
        return (AV) av.subList(i + i3, i2 + i3);
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.AbstractC2634zV
    public final Object[] b() {
        return this.e.b();
    }

    @Override // java.util.List
    public final E get(int i) {
        C1945pV.a(i, this.d);
        return (E) this.e.get(i + this.f1964c);
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.AbstractC2634zV
    public final int k() {
        return this.e.k() + this.f1964c;
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.AbstractC2634zV
    public final int l() {
        return this.e.k() + this.f1964c + this.d;
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.AbstractC2634zV
    public final boolean n() {
        return true;
    }

    public final int size() {
        return this.d;
    }
}
