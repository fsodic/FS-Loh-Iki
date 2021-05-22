package com.google.android.gms.internal.ads;

import android.util.JsonReader;
import java.io.InputStream;
import java.io.InputStreamReader;

/* renamed from: com.google.android.gms.internal.ads.rL  reason: case insensitive filesystem */
final /* synthetic */ class C2072rL implements AbstractC2221tW {

    /* renamed from: a  reason: collision with root package name */
    private final C0715Uh f5405a;

    C2072rL(C0715Uh uh) {
        this.f5405a = uh;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2221tW
    public final SW b(Object obj) {
        C0715Uh uh = this.f5405a;
        C2210tL tLVar = new C2210tL(new JsonReader(new InputStreamReader((InputStream) obj)));
        tLVar.a(uh.f3269a);
        return JW.a(tLVar);
    }
}
