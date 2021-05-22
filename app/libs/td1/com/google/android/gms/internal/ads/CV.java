package com.google.android.gms.internal.ads;

final class CV<E> extends AbstractC2358vV<E> {

    /* renamed from: c  reason: collision with root package name */
    private final AV<E> f1698c;

    CV(AV<E> av, int i) {
        super(av.size(), i);
        this.f1698c = av;
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.AbstractC2358vV
    public final E a(int i) {
        return this.f1698c.get(i);
    }
}
