package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

/* renamed from: com.google.android.gms.internal.ads.tpa  reason: case insensitive filesystem */
public final class C2256tpa extends C1687lga implements AbstractC2118rpa {
    C2256tpa(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IOnPaidEventListener");
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2118rpa
    public final void a(C1152doa doa) {
        Parcel Jb = Jb();
        C1756mga.a(Jb, doa);
        b(1, Jb);
    }
}
