package com.google.android.gms.internal.ads;

import java.io.InputStream;

/* access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.ads.mG  reason: case insensitive filesystem */
public final /* synthetic */ class C1723mG implements AbstractC2221tW {

    /* renamed from: a  reason: collision with root package name */
    private final C0715Uh f4927a;

    C1723mG(C0715Uh uh) {
        this.f4927a = uh;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2221tW
    public final SW b(Object obj) {
        C0715Uh uh = this.f4927a;
        uh.k = new String(YV.a((InputStream) obj), C1050cV.f3999c);
        return JW.a(uh);
    }
}
