package com.google.android.gms.internal.ads;

/* access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.ads.nm  reason: case insensitive filesystem */
public final class C1836nm implements GW<T> {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ C1905om f5070a;

    C1836nm(C1905om omVar) {
        this.f5070a = omVar;
    }

    @Override // com.google.android.gms.internal.ads.GW
    public final void a(T t) {
        this.f5070a.f5164b.set(1);
    }

    @Override // com.google.android.gms.internal.ads.GW
    public final void a(Throwable th) {
        this.f5070a.f5164b.set(-1);
    }
}
