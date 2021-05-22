package com.google.android.gms.internal.ads;

import android.content.Context;

final /* synthetic */ class _I implements AbstractC0732Uy {

    /* renamed from: a  reason: collision with root package name */
    private final C1931pH f3709a;

    _I(C1931pH pHVar) {
        this.f3709a = pHVar;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0732Uy
    public final void a(boolean z, Context context) {
        C1931pH pHVar = this.f3709a;
        try {
            pHVar.f5211b.a(z);
            pHVar.f5211b.b(context);
        } catch (MR e) {
            throw new C0810Xy(e.getCause());
        }
    }
}
