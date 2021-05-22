package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

/* renamed from: com.google.android.gms.internal.ads.cg  reason: case insensitive filesystem */
public final class C1067cg extends C1687lga implements AbstractC0929ag {
    C1067cg(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.rtb.IBannerCallback");
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0929ag
    public final void b(String str) {
        Parcel Jb = Jb();
        Jb.writeString(str);
        b(2, Jb);
    }
}
