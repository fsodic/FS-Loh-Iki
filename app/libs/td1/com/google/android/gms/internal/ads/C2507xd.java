package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

/* renamed from: com.google.android.gms.internal.ads.xd  reason: case insensitive filesystem */
public final class C2507xd extends C1687lga implements AbstractC2369vd {
    C2507xd(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.instream.client.IInstreamAdCallback");
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2369vd
    public final void q(int i) {
        Parcel Jb = Jb();
        Jb.writeInt(i);
        b(2, Jb);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2369vd
    public final void qa() {
        b(1, Jb());
    }
}
