package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

/* renamed from: com.google.android.gms.internal.ads.jg  reason: case insensitive filesystem */
public final class C1548jg extends C1687lga implements AbstractC1411hg {
    C1548jg(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.rtb.IRewardedCallback");
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1411hg
    public final void b(String str) {
        Parcel Jb = Jb();
        Jb.writeString(str);
        b(3, Jb);
    }
}
