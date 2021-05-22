package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.mediation.d;
import org.cocos2dx.lib.BuildConfig;

/* renamed from: com.google.android.gms.internal.ads.vg  reason: case insensitive filesystem */
final class C2375vg implements d<Object, Object> {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ AbstractC0929ag f5821a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ AbstractC2304uf f5822b;

    C2375vg(BinderC2168sg sgVar, AbstractC0929ag agVar, AbstractC2304uf ufVar) {
        this.f5821a = agVar;
        this.f5822b = ufVar;
    }

    @Override // com.google.android.gms.ads.mediation.d
    public final void a(String str) {
        try {
            this.f5821a.b(str);
        } catch (RemoteException e) {
            C0745Vl.b(BuildConfig.FLAVOR, e);
        }
    }
}
