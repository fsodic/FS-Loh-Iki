package com.google.android.gms.internal.ads;

import org.cocos2dx.lib.BuildConfig;

/* access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.ads.zj  reason: case insensitive filesystem */
public final /* synthetic */ class C2657zj implements AbstractC0379Hj {

    /* renamed from: a  reason: collision with root package name */
    static final AbstractC0379Hj f6203a = new C2657zj();

    private C2657zj() {
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0379Hj
    public final Object a(AbstractC2393vp vpVar) {
        String Ka = vpVar.Ka();
        if (Ka != null) {
            return Ka;
        }
        String kb = vpVar.kb();
        return kb != null ? kb : BuildConfig.FLAVOR;
    }
}
