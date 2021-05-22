package com.google.android.gms.internal.ads;

import android.content.Context;

/* renamed from: com.google.android.gms.internal.ads.kI  reason: case insensitive filesystem */
final /* synthetic */ class C1587kI implements AbstractC0732Uy {

    /* renamed from: a  reason: collision with root package name */
    private final C1931pH f4753a;

    C1587kI(C1931pH pHVar) {
        this.f4753a = pHVar;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0732Uy
    public final void a(boolean z, Context context) {
        C1931pH pHVar = this.f4753a;
        try {
            pHVar.f5211b.a(z);
            pHVar.f5211b.g();
        } catch (MR e) {
            C0745Vl.c("Cannot show interstitial.");
            throw new C0810Xy(e.getCause());
        }
    }
}
