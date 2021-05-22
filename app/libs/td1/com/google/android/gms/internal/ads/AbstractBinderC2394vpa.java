package com.google.android.gms.internal.ads;

import android.os.Parcel;

/* renamed from: com.google.android.gms.internal.ads.vpa  reason: case insensitive filesystem */
public abstract class AbstractBinderC2394vpa extends BinderC1618kga implements AbstractC2187spa {
    public AbstractBinderC2394vpa() {
        super("com.google.android.gms.ads.internal.client.IResponseInfo");
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.BinderC1618kga
    public final boolean a(int i, Parcel parcel, Parcel parcel2, int i2) {
        String str;
        if (i == 1) {
            str = k();
        } else if (i != 2) {
            return false;
        } else {
            str = lb();
        }
        parcel2.writeNoException();
        parcel2.writeString(str);
        return true;
    }
}
