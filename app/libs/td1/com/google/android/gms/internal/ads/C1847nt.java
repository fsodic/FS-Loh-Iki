package com.google.android.gms.internal.ads;

/* access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.ads.nt  reason: case insensitive filesystem */
public final class C1847nt implements GW<C0952at> {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ GW f5086a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ C1434ht f5087b;

    C1847nt(C1434ht htVar, GW gw) {
        this.f5087b = htVar;
        this.f5086a = gw;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // com.google.android.gms.internal.ads.GW
    public final /* synthetic */ void a(C0952at atVar) {
        this.f5087b.c();
        this.f5086a.a(atVar);
    }

    @Override // com.google.android.gms.internal.ads.GW
    public final void a(Throwable th) {
        this.f5087b.c();
        this.f5086a.a(th);
    }
}
