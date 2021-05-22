package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* renamed from: com.google.android.gms.internal.ads.tM  reason: case insensitive filesystem */
public final class C2211tM implements AbstractC1180eO<AbstractC0905aO<Bundle>> {

    /* renamed from: a  reason: collision with root package name */
    private final ZP f5599a;

    C2211tM(ZP zp) {
        this.f5599a = zp;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1180eO
    public final SW<AbstractC0905aO<Bundle>> a() {
        ZP zp = this.f5599a;
        return JW.a((zp == null || zp.a() == null || this.f5599a.a().isEmpty()) ? null : new C2418wM(this));
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void a(Bundle bundle) {
        bundle.putString("key_schema", this.f5599a.a());
    }
}
