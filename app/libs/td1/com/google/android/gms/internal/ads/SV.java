package com.google.android.gms.internal.ads;

final class SV extends AV<Object> {

    /* renamed from: c  reason: collision with root package name */
    private final transient Object[] f3091c;
    private final transient int d;
    private final transient int e;

    SV(Object[] objArr, int i, int i2) {
        this.f3091c = objArr;
        this.d = i;
        this.e = i2;
    }

    @Override // java.util.List
    public final Object get(int i) {
        C1945pV.a(i, this.e);
        return this.f3091c[(i * 2) + this.d];
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.AbstractC2634zV
    public final boolean n() {
        return true;
    }

    public final int size() {
        return this.e;
    }
}
