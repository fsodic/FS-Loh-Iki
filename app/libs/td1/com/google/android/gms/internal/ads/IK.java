package com.google.android.gms.internal.ads;

import android.os.RemoteException;

final /* synthetic */ class IK implements AbstractC0650Ru {

    /* renamed from: a  reason: collision with root package name */
    private final C2623zK f2213a;

    /* renamed from: b  reason: collision with root package name */
    private final AbstractC2438wd f2214b;

    IK(C2623zK zKVar, AbstractC2438wd wdVar) {
        this.f2213a = zKVar;
        this.f2214b = wdVar;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0650Ru
    public final void c(int i) {
        C2623zK zKVar = this.f2213a;
        AbstractC2438wd wdVar = this.f2214b;
        zKVar.c(i);
        if (wdVar != null) {
            try {
                wdVar.t(i);
            } catch (RemoteException e) {
                C0745Vl.d("#007 Could not call remote method.", e);
            }
        }
    }
}
