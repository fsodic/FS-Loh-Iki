package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import b.c.b.a.c.a;

public final class Ioa extends C1687lga implements Joa {
    Ioa(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAdLoaderBuilderCreator");
    }

    @Override // com.google.android.gms.internal.ads.Joa
    public final IBinder a(a aVar, String str, AbstractC1891of ofVar, int i) {
        Parcel Jb = Jb();
        C1756mga.a(Jb, aVar);
        Jb.writeString(str);
        C1756mga.a(Jb, ofVar);
        Jb.writeInt(i);
        Parcel a2 = a(1, Jb);
        IBinder readStrongBinder = a2.readStrongBinder();
        a2.recycle();
        return readStrongBinder;
    }
}
