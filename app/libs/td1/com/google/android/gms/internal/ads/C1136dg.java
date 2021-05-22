package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

/* renamed from: com.google.android.gms.internal.ads.dg  reason: case insensitive filesystem */
public final class C1136dg extends C1687lga implements AbstractC0998bg {
    C1136dg(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.rtb.IInterstitialCallback");
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0998bg
    public final void b(String str) {
        Parcel Jb = Jb();
        Jb.writeString(str);
        b(3, Jb);
    }
}
