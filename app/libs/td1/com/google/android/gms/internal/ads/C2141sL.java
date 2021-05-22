package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* renamed from: com.google.android.gms.internal.ads.sL  reason: case insensitive filesystem */
public final class C2141sL implements AbstractC2221tW<C0715Uh, C2210tL> {

    /* renamed from: a  reason: collision with root package name */
    private Executor f5503a;

    /* renamed from: b  reason: collision with root package name */
    private C2549yF f5504b;

    public C2141sL(Executor executor, C2549yF yFVar) {
        this.f5503a = executor;
        this.f5504b = yFVar;
    }

    /* Return type fixed from 'com.google.android.gms.internal.ads.SW' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // com.google.android.gms.internal.ads.AbstractC2221tW
    public final /* synthetic */ SW<C2210tL> b(C0715Uh uh) {
        C0715Uh uh2 = uh;
        return JW.a(this.f5504b.a(uh2), new C2072rL(uh2), this.f5503a);
    }
}
