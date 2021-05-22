package com.google.android.gms.internal.ads;

/* access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.ads.wB  reason: case insensitive filesystem */
public final /* synthetic */ class C2407wB implements AbstractC2221tW {

    /* renamed from: a  reason: collision with root package name */
    private final SW f5864a;

    C2407wB(SW sw) {
        this.f5864a = sw;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2221tW
    public final SW b(Object obj) {
        return obj != null ? this.f5864a : JW.a((Throwable) new SI(YR.f3560a, "Retrieve required value in native ad response failed."));
    }
}
