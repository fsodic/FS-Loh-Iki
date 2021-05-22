package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.iR  reason: case insensitive filesystem */
final class C1459iR implements NK<C2615zC> {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ BinderC1527jR f4565a;

    C1459iR(BinderC1527jR jRVar) {
        this.f4565a = jRVar;
    }

    @Override // com.google.android.gms.internal.ads.NK
    public final void a() {
        synchronized (this.f4565a) {
            this.f4565a.d = null;
        }
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // com.google.android.gms.internal.ads.NK
    public final /* synthetic */ void a(C2615zC zCVar) {
        C2615zC zCVar2 = zCVar;
        synchronized (this.f4565a) {
            this.f4565a.d = zCVar2;
            this.f4565a.d.b();
        }
    }
}
