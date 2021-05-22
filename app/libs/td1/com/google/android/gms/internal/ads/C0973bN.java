package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* renamed from: com.google.android.gms.internal.ads.bN  reason: case insensitive filesystem */
public final class C0973bN implements AbstractC0905aO<Bundle> {

    /* renamed from: a  reason: collision with root package name */
    private final C1803nR f3890a;

    public C0973bN(C1803nR nRVar) {
        this.f3890a = nRVar;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // com.google.android.gms.internal.ads.AbstractC0905aO
    public final /* synthetic */ void a(Bundle bundle) {
        Bundle bundle2 = bundle;
        C1803nR nRVar = this.f3890a;
        if (nRVar != null) {
            bundle2.putBoolean("render_in_browser", nRVar.a());
            bundle2.putBoolean("disable_ml", this.f3890a.b());
        }
    }
}
