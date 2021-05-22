package com.google.android.gms.internal.ads;

/* access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.ads.qm  reason: case insensitive filesystem */
public final class C2043qm implements GW<T> {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ AbstractC1698lm f5354a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ AbstractC1560jm f5355b;

    C2043qm(C1905om omVar, AbstractC1698lm lmVar, AbstractC1560jm jmVar) {
        this.f5354a = lmVar;
        this.f5355b = jmVar;
    }

    @Override // com.google.android.gms.internal.ads.GW
    public final void a(T t) {
        this.f5354a.a(t);
    }

    @Override // com.google.android.gms.internal.ads.GW
    public final void a(Throwable th) {
        this.f5355b.run();
    }
}
