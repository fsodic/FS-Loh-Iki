package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

/* renamed from: com.google.android.gms.internal.ads.Wi  reason: case insensitive filesystem */
public final class C0768Wi extends C1687lga implements AbstractC0716Ui {
    C0768Wi(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.rewarded.client.IRewardedAdLoadCallback");
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0716Ui
    public final void na() {
        b(1, Jb());
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0716Ui
    public final void r(int i) {
        Parcel Jb = Jb();
        Jb.writeInt(i);
        b(2, Jb);
    }
}
