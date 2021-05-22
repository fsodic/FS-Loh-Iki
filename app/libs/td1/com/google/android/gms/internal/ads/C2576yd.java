package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

/* renamed from: com.google.android.gms.internal.ads.yd  reason: case insensitive filesystem */
public final class C2576yd extends C1687lga implements AbstractC2438wd {
    C2576yd(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.instream.client.IInstreamAdLoadCallback");
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2438wd
    public final void a(AbstractC2093rd rdVar) {
        Parcel Jb = Jb();
        C1756mga.a(Jb, rdVar);
        b(1, Jb);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2438wd
    public final void t(int i) {
        Parcel Jb = Jb();
        Jb.writeInt(i);
        b(2, Jb);
    }
}
