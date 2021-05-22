package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

public final class JU extends C1687lga implements FU {
    JU(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.gass.internal.IGassService");
    }

    @Override // com.google.android.gms.internal.ads.FU
    public final DU a(BU bu) {
        Parcel Jb = Jb();
        C1756mga.a(Jb, bu);
        Parcel a2 = a(1, Jb);
        DU du = (DU) C1756mga.a(a2, DU.CREATOR);
        a2.recycle();
        return du;
    }

    @Override // com.google.android.gms.internal.ads.FU
    public final OU a(MU mu) {
        Parcel Jb = Jb();
        C1756mga.a(Jb, mu);
        Parcel a2 = a(3, Jb);
        OU ou = (OU) C1756mga.a(a2, OU.CREATOR);
        a2.recycle();
        return ou;
    }

    @Override // com.google.android.gms.internal.ads.FU
    public final void a(AU au) {
        Parcel Jb = Jb();
        C1756mga.a(Jb, au);
        b(2, Jb);
    }
}
