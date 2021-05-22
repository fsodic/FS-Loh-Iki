package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

/* renamed from: com.google.android.gms.internal.ads.Xi  reason: case insensitive filesystem */
public final class C0794Xi extends C1687lga implements AbstractC0742Vi {
    C0794Xi(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.rewarded.client.IRewardedAdSkuListener");
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0742Vi
    public final void a(AbstractC0508Mi mi, String str, String str2) {
        Parcel Jb = Jb();
        C1756mga.a(Jb, mi);
        Jb.writeString(str);
        Jb.writeString(str2);
        b(2, Jb);
    }
}
