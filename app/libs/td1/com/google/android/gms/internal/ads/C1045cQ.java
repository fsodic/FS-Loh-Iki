package com.google.android.gms.internal.ads;

/* access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.ads.cQ  reason: case insensitive filesystem */
public final class C1045cQ implements GW<Void> {
    C1045cQ(C0976bQ bQVar) {
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // com.google.android.gms.internal.ads.GW
    public final /* synthetic */ void a(Void r1) {
        C1763mk.f("Notification of cache hit successful.");
    }

    @Override // com.google.android.gms.internal.ads.GW
    public final void a(Throwable th) {
        C1763mk.f("Notification of cache hit failed.");
    }
}
