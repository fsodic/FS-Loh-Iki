package com.google.android.gms.internal.ads;

import android.os.Bundle;
import java.util.Set;

/* renamed from: com.google.android.gms.internal.ads.kN  reason: case insensitive filesystem */
public final class C1592kN implements AbstractC0905aO<Bundle> {

    /* renamed from: a  reason: collision with root package name */
    private final String f4761a;

    public C1592kN(String str) {
        this.f4761a = str;
    }

    /* access modifiers changed from: private */
    public static boolean b(Set<String> set) {
        return set.contains("rewarded") || set.contains("interstitial") || set.contains("native") || set.contains("banner");
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // com.google.android.gms.internal.ads.AbstractC0905aO
    public final /* synthetic */ void a(Bundle bundle) {
        LR.a(bundle, "omid_v", this.f4761a);
    }
}
