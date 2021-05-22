package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import b.c.b.a.c.a;

public final class Qoa extends C1687lga implements Moa {
    Qoa(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAdManagerCreator");
    }

    @Override // com.google.android.gms.internal.ads.Moa
    public final IBinder a(a aVar, C1015boa boa, String str, AbstractC1891of ofVar, int i, int i2) {
        Parcel Jb = Jb();
        C1756mga.a(Jb, aVar);
        C1756mga.a(Jb, boa);
        Jb.writeString(str);
        C1756mga.a(Jb, ofVar);
        Jb.writeInt(i);
        Jb.writeInt(i2);
        Parcel a2 = a(2, Jb);
        IBinder readStrongBinder = a2.readStrongBinder();
        a2.recycle();
        return readStrongBinder;
    }
}
