package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import org.cocos2dx.lib.BuildConfig;

/* renamed from: com.google.android.gms.internal.ads.gL  reason: case insensitive filesystem */
final class C1315gL implements GW<C2210tL> {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ AbstractC0483Lj f4379a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ XK f4380b;

    C1315gL(XK xk, AbstractC0483Lj lj) {
        this.f4380b = xk;
        this.f4379a = lj;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // com.google.android.gms.internal.ads.GW
    public final /* synthetic */ void a(C2210tL tLVar) {
        C2210tL tLVar2 = tLVar;
        try {
            if (((Boolean) C2392voa.e().a(C2474x.Ke)).booleanValue()) {
                if (this.f4380b.h.f3589c >= ((Integer) C2392voa.e().a(C2474x.Me)).intValue()) {
                    if (tLVar2 == null) {
                        this.f4379a.b(null, null, null);
                        return;
                    } else {
                        this.f4379a.b(tLVar2.f5596a, tLVar2.f5597b, tLVar2.f5598c);
                        return;
                    }
                }
            }
            if (tLVar2 == null) {
                this.f4379a.c(null, null);
            } else {
                this.f4379a.c(tLVar2.f5596a, tLVar2.f5597b);
            }
        } catch (RemoteException e) {
            C0745Vl.b(BuildConfig.FLAVOR, e);
        }
    }

    @Override // com.google.android.gms.internal.ads.GW
    public final void a(Throwable th) {
        try {
            AbstractC0483Lj lj = this.f4379a;
            String valueOf = String.valueOf(th.getMessage());
            lj.d(valueOf.length() != 0 ? "Internal error. ".concat(valueOf) : new String("Internal error. "));
        } catch (RemoteException e) {
            C0745Vl.b(BuildConfig.FLAVOR, e);
        }
    }
}
