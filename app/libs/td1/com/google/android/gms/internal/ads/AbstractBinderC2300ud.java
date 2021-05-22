package com.google.android.gms.internal.ads;

import android.os.Parcel;

/* renamed from: com.google.android.gms.internal.ads.ud  reason: case insensitive filesystem */
public abstract class AbstractBinderC2300ud extends BinderC1618kga implements AbstractC2369vd {
    public AbstractBinderC2300ud() {
        super("com.google.android.gms.ads.internal.instream.client.IInstreamAdCallback");
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.BinderC1618kga
    public final boolean a(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i == 1) {
            qa();
        } else if (i != 2) {
            return false;
        } else {
            q(parcel.readInt());
        }
        parcel2.writeNoException();
        return true;
    }
}
