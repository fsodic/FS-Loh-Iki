package com.google.android.gms.internal.ads;

final class PV<K> extends HV<K> {

    /* renamed from: c  reason: collision with root package name */
    private final transient EV<K, ?> f2832c;
    private final transient AV<K> d;

    PV(EV<K, ?> ev, AV<K> av) {
        this.f2832c = ev;
        this.d = av;
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.AbstractC2634zV
    public final int a(Object[] objArr, int i) {
        return m().a(objArr, i);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2634zV
    /* renamed from: a */
    public final WV<K> iterator() {
        return (WV) m().iterator();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2634zV
    public final boolean contains(Object obj) {
        return this.f2832c.get(obj) != null;
    }

    @Override // com.google.android.gms.internal.ads.HV, com.google.android.gms.internal.ads.AbstractC2634zV
    public final AV<K> m() {
        return this.d;
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.AbstractC2634zV
    public final boolean n() {
        return true;
    }

    public final int size() {
        return this.f2832c.size();
    }
}
