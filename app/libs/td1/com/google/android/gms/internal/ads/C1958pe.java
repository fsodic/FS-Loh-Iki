package com.google.android.gms.internal.ads;

/* access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.ads.pe  reason: case insensitive filesystem */
public final class C1958pe implements AbstractC1560jm {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ C2302ue f5254a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ C1132de f5255b;

    C1958pe(C1132de deVar, C2302ue ueVar) {
        this.f5255b = deVar;
        this.f5254a = ueVar;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1560jm
    public final void run() {
        synchronized (this.f5255b.f4119a) {
            this.f5255b.h = 1;
            C1763mk.f("Failed loading new engine. Marking new engine destroyable.");
            this.f5254a.e();
        }
    }
}
