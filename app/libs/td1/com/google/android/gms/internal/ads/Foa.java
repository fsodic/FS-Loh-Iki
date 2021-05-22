package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

public final class Foa extends C1687lga implements Doa {
    Foa(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAdLoader");
    }

    @Override // com.google.android.gms.internal.ads.Doa
    public final void b(Zna zna) {
        Parcel Jb = Jb();
        C1756mga.a(Jb, zna);
        b(1, Jb);
    }
}
