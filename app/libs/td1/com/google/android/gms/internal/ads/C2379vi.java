package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import b.c.b.a.c.a;

/* renamed from: com.google.android.gms.internal.ads.vi  reason: case insensitive filesystem */
public final class C2379vi extends C1687lga implements AbstractC2448wi {
    C2379vi(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.reward.client.IRewardedVideoAdCreator");
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2448wi
    public final IBinder b(a aVar, AbstractC1891of ofVar, int i) {
        Parcel Jb = Jb();
        C1756mga.a(Jb, aVar);
        C1756mga.a(Jb, ofVar);
        Jb.writeInt(i);
        Parcel a2 = a(1, Jb);
        IBinder readStrongBinder = a2.readStrongBinder();
        a2.recycle();
        return readStrongBinder;
    }
}
