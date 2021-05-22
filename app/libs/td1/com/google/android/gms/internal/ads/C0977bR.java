package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.g.a;

/* renamed from: com.google.android.gms.internal.ads.bR  reason: case insensitive filesystem */
final class C0977bR extends a {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ AbstractC1705lpa f3895a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ BinderC1046cR f3896b;

    C0977bR(BinderC1046cR cRVar, AbstractC1705lpa lpa) {
        this.f3896b = cRVar;
        this.f3895a = lpa;
    }

    @Override // com.google.android.gms.ads.g.a
    public final void c() {
        if (this.f3896b.f != null) {
            try {
                this.f3895a.ca();
            } catch (RemoteException e) {
                C0745Vl.d("#007 Could not call remote method.", e);
            }
        }
    }
}
