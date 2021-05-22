package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;

public final class CN implements AbstractC1180eO<AbstractC0905aO<Bundle>> {

    /* renamed from: a  reason: collision with root package name */
    private final Context f1686a;

    /* renamed from: b  reason: collision with root package name */
    private final String f1687b;

    CN(Context context, String str) {
        this.f1686a = context;
        this.f1687b = str;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1180eO
    public final SW<AbstractC0905aO<Bundle>> a() {
        return JW.a(this.f1687b == null ? null : new AN(this));
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void a(Bundle bundle) {
        bundle.putString("rewarded_sku_package", this.f1686a.getPackageName());
    }
}
