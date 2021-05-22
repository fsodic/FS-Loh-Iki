package com.google.android.gms.internal.ads;

/* access modifiers changed from: package-private */
public final class RV<E> extends HV<E> {

    /* renamed from: c  reason: collision with root package name */
    static final RV<Object> f3015c = new RV<>(new Object[0], 0, null, 0, 0);
    private final transient Object[] d;
    private final transient Object[] e;
    private final transient int f;
    private final transient int g;
    private final transient int h;

    RV(Object[] objArr, int i, Object[] objArr2, int i2, int i3) {
        this.d = objArr;
        this.e = objArr2;
        this.f = i2;
        this.g = i;
        this.h = i3;
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.AbstractC2634zV
    public final int a(Object[] objArr, int i) {
        System.arraycopy(this.d, 0, objArr, i, this.h);
        return i + this.h;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2634zV
    /* renamed from: a */
    public final WV<E> iterator() {
        return (WV) m().iterator();
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.AbstractC2634zV
    public final Object[] b() {
        return this.d;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2634zV
    public final boolean contains(Object obj) {
        Object[] objArr = this.e;
        if (obj == null || objArr == null) {
            return false;
        }
        int a2 = C2427wV.a(obj == null ? 0 : obj.hashCode());
        while (true) {
            int i = a2 & this.f;
            Object obj2 = objArr[i];
            if (obj2 == null) {
                return false;
            }
            if (obj2.equals(obj)) {
                return true;
            }
            a2 = i + 1;
        }
    }

    @Override // com.google.android.gms.internal.ads.HV
    public final int hashCode() {
        return this.g;
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.AbstractC2634zV
    public final int k() {
        return 0;
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.AbstractC2634zV
    public final int l() {
        return this.h;
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.AbstractC2634zV
    public final boolean n() {
        return false;
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.HV
    public final boolean o() {
        return true;
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.HV
    public final AV<E> p() {
        return AV.b(this.d, this.h);
    }

    public final int size() {
        return this.h;
    }
}
