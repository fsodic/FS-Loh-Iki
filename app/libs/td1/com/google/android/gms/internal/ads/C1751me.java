package com.google.android.gms.internal.ads;

/* access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.ads.me  reason: case insensitive filesystem */
public final class C1751me implements AbstractC1698lm<AbstractC0607Qd> {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ C2302ue f4969a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ C1132de f4970b;

    C1751me(C1132de deVar, C2302ue ueVar) {
        this.f4970b = deVar;
        this.f4969a = ueVar;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // com.google.android.gms.internal.ads.AbstractC1698lm
    public final /* synthetic */ void a(AbstractC0607Qd qd) {
        synchronized (this.f4970b.f4119a) {
            this.f4970b.h = 0;
            if (!(this.f4970b.g == null || this.f4969a == this.f4970b.g)) {
                C1763mk.f("New JS engine is loaded, marking previous one as destroyable.");
                this.f4970b.g.e();
            }
            this.f4970b.g = this.f4969a;
        }
    }
}
