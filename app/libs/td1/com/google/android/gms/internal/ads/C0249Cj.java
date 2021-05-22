package com.google.android.gms.internal.ads;

import android.content.Context;
import b.c.b.a.c.b;

/* access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.ads.Cj  reason: case insensitive filesystem */
public final /* synthetic */ class C0249Cj implements AbstractC0457Kj {

    /* renamed from: a  reason: collision with root package name */
    private final Context f1716a;

    /* renamed from: b  reason: collision with root package name */
    private final String f1717b;

    C0249Cj(Context context, String str) {
        this.f1716a = context;
        this.f1717b = str;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0457Kj
    public final void a(AbstractC2393vp vpVar) {
        Context context = this.f1716a;
        vpVar.b(b.a(context), this.f1717b, context.getPackageName());
    }
}
