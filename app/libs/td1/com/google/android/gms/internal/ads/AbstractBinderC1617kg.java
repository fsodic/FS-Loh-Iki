package com.google.android.gms.internal.ads;

import android.os.Parcel;

/* renamed from: com.google.android.gms.internal.ads.kg  reason: case insensitive filesystem */
public abstract class AbstractBinderC1617kg extends BinderC1618kga implements AbstractC1411hg {
    public AbstractBinderC1617kg() {
        super("com.google.android.gms.ads.internal.mediation.client.rtb.IRewardedCallback");
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.BinderC1618kga
    public final boolean a(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i == 2) {
            ga();
        } else if (i != 3) {
            return false;
        } else {
            b(parcel.readString());
        }
        parcel2.writeNoException();
        return true;
    }
}
