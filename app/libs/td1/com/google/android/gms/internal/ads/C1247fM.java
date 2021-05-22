package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* renamed from: com.google.android.gms.internal.ads.fM  reason: case insensitive filesystem */
public final class C1247fM implements AbstractC0905aO<Bundle> {

    /* renamed from: a  reason: collision with root package name */
    private final boolean f4285a = false;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f4286b = false;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f4287c;

    public C1247fM(boolean z, boolean z2, boolean z3) {
        this.f4287c = z3;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // com.google.android.gms.internal.ads.AbstractC0905aO
    public final /* synthetic */ void a(Bundle bundle) {
        Bundle bundle2 = bundle;
        bundle2.putBoolean("c_pcbg", this.f4285a);
        bundle2.putBoolean("c_phbg", this.f4286b);
        bundle2.putBoolean("ar_lr", this.f4287c);
    }
}
