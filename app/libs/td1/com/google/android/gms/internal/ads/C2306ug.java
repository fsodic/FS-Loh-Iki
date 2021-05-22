package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.mediation.d;
import com.google.android.gms.ads.mediation.k;
import org.cocos2dx.lib.BuildConfig;

/* renamed from: com.google.android.gms.internal.ads.ug  reason: case insensitive filesystem */
final class C2306ug implements d<k, Object> {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ AbstractC0998bg f5742a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ AbstractC2304uf f5743b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ BinderC2168sg f5744c;

    C2306ug(BinderC2168sg sgVar, AbstractC0998bg bgVar, AbstractC2304uf ufVar) {
        this.f5744c = sgVar;
        this.f5742a = bgVar;
        this.f5743b = ufVar;
    }

    @Override // com.google.android.gms.ads.mediation.d
    public final void a(String str) {
        try {
            this.f5742a.b(str);
        } catch (RemoteException e) {
            C0745Vl.b(BuildConfig.FLAVOR, e);
        }
    }
}
