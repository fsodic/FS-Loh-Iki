package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.g.a;

/* renamed from: com.google.android.gms.internal.ads.lR  reason: case insensitive filesystem */
final class C1665lR extends a {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ Ooa f4853a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ BinderC1527jR f4854b;

    C1665lR(BinderC1527jR jRVar, Ooa ooa) {
        this.f4854b = jRVar;
        this.f4853a = ooa;
    }

    @Override // com.google.android.gms.ads.g.a
    public final void c() {
        if (this.f4854b.d != null) {
            try {
                this.f4853a.ca();
            } catch (RemoteException e) {
                C0745Vl.d("#007 Could not call remote method.", e);
            }
        }
    }
}
