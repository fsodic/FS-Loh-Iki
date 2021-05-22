package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.g.b;

/* renamed from: com.google.android.gms.internal.ads.zi  reason: case insensitive filesystem */
public final class C2655zi implements b {

    /* renamed from: a  reason: collision with root package name */
    private final AbstractC1897oi f6200a;

    public C2655zi(AbstractC1897oi oiVar) {
        this.f6200a = oiVar;
    }

    @Override // com.google.android.gms.ads.g.b
    public final int A() {
        AbstractC1897oi oiVar = this.f6200a;
        if (oiVar == null) {
            return 0;
        }
        try {
            return oiVar.A();
        } catch (RemoteException e) {
            C0745Vl.c("Could not forward getAmount to RewardItem", e);
            return 0;
        }
    }

    @Override // com.google.android.gms.ads.g.b
    public final String getType() {
        AbstractC1897oi oiVar = this.f6200a;
        if (oiVar == null) {
            return null;
        }
        try {
            return oiVar.getType();
        } catch (RemoteException e) {
            C0745Vl.c("Could not forward getType to RewardItem", e);
            return null;
        }
    }
}
