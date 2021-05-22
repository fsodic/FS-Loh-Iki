package com.google.android.gms.internal.ads;

/* access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.ads.ot  reason: case insensitive filesystem */
public final class C1916ot implements GW<C1365gt> {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ GW f5186a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ C1434ht f5187b;

    C1916ot(C1434ht htVar, GW gw) {
        this.f5187b = htVar;
        this.f5186a = gw;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // com.google.android.gms.internal.ads.GW
    public final /* synthetic */ void a(C1365gt gtVar) {
        this.f5187b.a(gtVar.f4439a, this.f5186a);
    }

    @Override // com.google.android.gms.internal.ads.GW
    public final void a(Throwable th) {
        this.f5186a.a(th);
        this.f5187b.c();
    }
}
