package com.google.android.gms.internal.ads;

import android.os.Parcel;

/* renamed from: com.google.android.gms.internal.ads.eg  reason: case insensitive filesystem */
public abstract class AbstractBinderC1204eg extends BinderC1618kga implements AbstractC0998bg {
    public AbstractBinderC1204eg() {
        super("com.google.android.gms.ads.internal.mediation.client.rtb.IInterstitialCallback");
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
