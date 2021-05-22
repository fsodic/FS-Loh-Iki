package com.google.android.gms.internal.ads;

/* access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.ads.fR  reason: case insensitive filesystem */
public final class C1252fR implements NK<C2615zC> {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ BinderC1046cR f4293a;

    C1252fR(BinderC1046cR cRVar) {
        this.f4293a = cRVar;
    }

    @Override // com.google.android.gms.internal.ads.NK
    public final void a() {
        synchronized (this.f4293a) {
            this.f4293a.f = null;
        }
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // com.google.android.gms.internal.ads.NK
    public final /* synthetic */ void a(C2615zC zCVar) {
        C2615zC zCVar2 = zCVar;
        synchronized (this.f4293a) {
            this.f4293a.f = zCVar2;
            this.f4293a.f.b();
        }
    }
}
