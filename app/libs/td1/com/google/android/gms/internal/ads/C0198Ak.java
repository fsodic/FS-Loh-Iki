package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.q;

/* access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.ads.Ak  reason: case insensitive filesystem */
public final class C0198Ak implements AbstractC0485Ll {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ Context f1545a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ String f1546b;

    C0198Ak(C2452wk wkVar, Context context, String str) {
        this.f1545a = context;
        this.f1546b = str;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0485Ll
    public final void a(String str) {
        q.c();
        C2452wk.a(this.f1545a, this.f1546b, str);
    }
}
