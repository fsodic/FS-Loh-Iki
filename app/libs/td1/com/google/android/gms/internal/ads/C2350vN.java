package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* renamed from: com.google.android.gms.internal.ads.vN  reason: case insensitive filesystem */
public final class C2350vN implements AbstractC1180eO<C2143sN> {

    /* renamed from: a  reason: collision with root package name */
    private final VW f5802a;

    /* renamed from: b  reason: collision with root package name */
    private final Bundle f5803b;

    public C2350vN(VW vw, Bundle bundle) {
        this.f5802a = vw;
        this.f5803b = bundle;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1180eO
    public final SW<C2143sN> a() {
        return this.f5802a.a(new CallableC2281uN(this));
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ C2143sN b() {
        return new C2143sN(this.f5803b);
    }
}
