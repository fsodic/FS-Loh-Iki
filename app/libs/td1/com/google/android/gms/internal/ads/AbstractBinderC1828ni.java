package com.google.android.gms.internal.ads;

import android.os.Parcel;

/* renamed from: com.google.android.gms.internal.ads.ni  reason: case insensitive filesystem */
public abstract class AbstractBinderC1828ni extends BinderC1618kga implements AbstractC1897oi {
    public AbstractBinderC1828ni() {
        super("com.google.android.gms.ads.internal.reward.client.IRewardItem");
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.BinderC1618kga
    public final boolean a(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i == 1) {
            String type = getType();
            parcel2.writeNoException();
            parcel2.writeString(type);
        } else if (i != 2) {
            return false;
        } else {
            int A = A();
            parcel2.writeNoException();
            parcel2.writeInt(A);
        }
        return true;
    }
}
