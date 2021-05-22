package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.gj  reason: case insensitive filesystem */
final class C1348gj implements GW<Void> {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ SW f4413a;

    C1348gj(C1142dj djVar, SW sw) {
        this.f4413a = sw;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // com.google.android.gms.internal.ads.GW
    public final /* synthetic */ void a(Void r2) {
        C1142dj.f4131a.remove(this.f4413a);
    }

    @Override // com.google.android.gms.internal.ads.GW
    public final void a(Throwable th) {
        C1142dj.f4131a.remove(this.f4413a);
    }
}
