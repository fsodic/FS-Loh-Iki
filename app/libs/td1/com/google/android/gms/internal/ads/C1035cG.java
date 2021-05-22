package com.google.android.gms.internal.ads;

import android.content.Context;
import android.text.TextUtils;

/* access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.ads.cG  reason: case insensitive filesystem */
public final class C1035cG implements AbstractC1093cw {

    /* renamed from: a  reason: collision with root package name */
    private final Context f3975a;

    /* renamed from: b  reason: collision with root package name */
    private final C2243tj f3976b;

    C1035cG(Context context, C2243tj tjVar) {
        this.f3975a = context;
        this.f3976b = tjVar;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1093cw
    public final void a(BR br) {
        if (!TextUtils.isEmpty(br.f1611b.f6181b.d)) {
            this.f3976b.a(this.f3975a, br.f1610a.f5888a.d);
            this.f3976b.f(this.f3975a, br.f1611b.f6181b.d);
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1093cw
    public final void a(C0715Uh uh) {
    }
}
