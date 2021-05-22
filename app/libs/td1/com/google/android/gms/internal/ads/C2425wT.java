package com.google.android.gms.internal.ads;

/* access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.ads.wT  reason: case insensitive filesystem */
public final class C2425wT implements GW<O> {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ C1598kT f5892a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ C2218tT f5893b;

    C2425wT(C2218tT tTVar, C1598kT kTVar) {
        this.f5893b = tTVar;
        this.f5892a = kTVar;
    }

    @Override // com.google.android.gms.internal.ads.GW
    public final void a(O o) {
        this.f5893b.f.d.b(this.f5892a);
    }

    @Override // com.google.android.gms.internal.ads.GW
    public final void a(Throwable th) {
        this.f5893b.f.d.a(this.f5892a, th);
    }
}
