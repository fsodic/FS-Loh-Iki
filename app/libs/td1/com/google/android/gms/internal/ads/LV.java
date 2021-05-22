package com.google.android.gms.internal.ads;

/* access modifiers changed from: package-private */
public final class LV<E> extends AV<E> {

    /* renamed from: c  reason: collision with root package name */
    static final AV<Object> f2496c = new LV(new Object[0], 0);
    private final transient Object[] d;
    private final transient int e;

    LV(Object[] objArr, int i) {
        this.d = objArr;
        this.e = i;
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.AV, com.google.android.gms.internal.ads.AbstractC2634zV
    public final int a(Object[] objArr, int i) {
        System.arraycopy(this.d, 0, objArr, i, this.e);
        return i + this.e;
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.AbstractC2634zV
    public final Object[] b() {
        return this.d;
    }

    @Override // java.util.List
    public final E get(int i) {
        C1945pV.a(i, this.e);
        return (E) this.d[i];
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.AbstractC2634zV
    public final int k() {
        return 0;
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.AbstractC2634zV
    public final int l() {
        return this.e;
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.AbstractC2634zV
    public final boolean n() {
        return false;
    }

    public final int size() {
        return this.e;
    }
}
