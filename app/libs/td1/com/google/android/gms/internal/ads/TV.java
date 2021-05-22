package com.google.android.gms.internal.ads;

/* access modifiers changed from: package-private */
public final class TV<E> extends HV<E> {

    /* renamed from: c  reason: collision with root package name */
    private final transient E f3184c;
    private transient int d;

    TV(E e) {
        C1945pV.a(e);
        this.f3184c = e;
    }

    TV(E e, int i) {
        this.f3184c = e;
        this.d = i;
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.AbstractC2634zV
    public final int a(Object[] objArr, int i) {
        objArr[i] = this.f3184c;
        return i + 1;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2634zV
    /* renamed from: a */
    public final WV<E> iterator() {
        return new KV(this.f3184c);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2634zV
    public final boolean contains(Object obj) {
        return this.f3184c.equals(obj);
    }

    @Override // com.google.android.gms.internal.ads.HV
    public final int hashCode() {
        int i = this.d;
        if (i != 0) {
            return i;
        }
        int hashCode = this.f3184c.hashCode();
        this.d = hashCode;
        return hashCode;
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.AbstractC2634zV
    public final boolean n() {
        return false;
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.HV
    public final boolean o() {
        return this.d != 0;
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.HV
    public final AV<E> p() {
        return AV.a((Object) this.f3184c);
    }

    public final int size() {
        return 1;
    }

    public final String toString() {
        String obj = this.f3184c.toString();
        StringBuilder sb = new StringBuilder(String.valueOf(obj).length() + 2);
        sb.append('[');
        sb.append(obj);
        sb.append(']');
        return sb.toString();
    }
}
