package com.google.android.gms.internal.ads;

import android.content.Context;

/* renamed from: com.google.android.gms.internal.ads.tJ  reason: case insensitive filesystem */
final /* synthetic */ class C2208tJ implements AbstractC0732Uy {

    /* renamed from: a  reason: collision with root package name */
    private final C1931pH f5594a;

    C2208tJ(C1931pH pHVar) {
        this.f5594a = pHVar;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0732Uy
    public final void a(boolean z, Context context) {
        C1931pH pHVar = this.f5594a;
        try {
            pHVar.f5211b.a(z);
            pHVar.f5211b.h();
        } catch (MR e) {
            C0745Vl.c("Cannot show rewarded video.", e);
            throw new C0810Xy(e.getCause());
        }
    }
}
