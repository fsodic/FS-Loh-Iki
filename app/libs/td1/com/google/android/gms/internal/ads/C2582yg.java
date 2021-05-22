package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.mediation.d;
import com.google.android.gms.ads.mediation.p;
import org.cocos2dx.lib.BuildConfig;

/* renamed from: com.google.android.gms.internal.ads.yg  reason: case insensitive filesystem */
final class C2582yg implements d<p, Object> {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ AbstractC1411hg f6111a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ AbstractC2304uf f6112b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ BinderC2168sg f6113c;

    C2582yg(BinderC2168sg sgVar, AbstractC1411hg hgVar, AbstractC2304uf ufVar) {
        this.f6113c = sgVar;
        this.f6111a = hgVar;
        this.f6112b = ufVar;
    }

    @Override // com.google.android.gms.ads.mediation.d
    public final void a(String str) {
        try {
            this.f6111a.b(str);
        } catch (RemoteException e) {
            C0745Vl.b(BuildConfig.FLAVOR, e);
        }
    }
}
