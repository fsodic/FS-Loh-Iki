package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import b.c.b.a.c.a;

/* renamed from: com.google.android.gms.internal.ads.ah  reason: case insensitive filesystem */
public final class C0931ah extends C1687lga implements AbstractC0818Yg {
    C0931ah(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.overlay.client.IAdOverlayCreator");
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0818Yg
    public final IBinder q(a aVar) {
        Parcel Jb = Jb();
        C1756mga.a(Jb, aVar);
        Parcel a2 = a(1, Jb);
        IBinder readStrongBinder = a2.readStrongBinder();
        a2.recycle();
        return readStrongBinder;
    }
}
