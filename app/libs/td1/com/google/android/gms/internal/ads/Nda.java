package com.google.android.gms.internal.ads;

/* access modifiers changed from: package-private */
public final class Nda implements Mda {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ Iba f2675a;

    Nda(Iba iba) {
        this.f2675a = iba;
    }

    @Override // com.google.android.gms.internal.ads.Mda
    public final byte a(int i) {
        return this.f2675a.h(i);
    }

    @Override // com.google.android.gms.internal.ads.Mda
    public final int size() {
        return this.f2675a.size();
    }
}
