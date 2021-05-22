package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.mediation.d;
import com.google.android.gms.ads.mediation.y;
import org.cocos2dx.lib.BuildConfig;

/* renamed from: com.google.android.gms.internal.ads.xg  reason: case insensitive filesystem */
final class C2513xg implements d<y, Object> {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ AbstractC1342gg f6002a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ AbstractC2304uf f6003b;

    C2513xg(BinderC2168sg sgVar, AbstractC1342gg ggVar, AbstractC2304uf ufVar) {
        this.f6002a = ggVar;
        this.f6003b = ufVar;
    }

    @Override // com.google.android.gms.ads.mediation.d
    public final void a(String str) {
        try {
            this.f6002a.b(str);
        } catch (RemoteException e) {
            C0745Vl.b(BuildConfig.FLAVOR, e);
        }
    }
}
