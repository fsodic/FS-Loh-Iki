package com.google.android.gms.internal.ads;

import android.os.Parcel;

/* renamed from: com.google.android.gms.internal.ads.fg  reason: case insensitive filesystem */
public abstract class AbstractBinderC1273fg extends BinderC1618kga implements AbstractC1342gg {
    public AbstractBinderC1273fg() {
        super("com.google.android.gms.ads.internal.mediation.client.rtb.INativeCallback");
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.BinderC1618kga
    public final boolean a(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i == 1) {
            a(AbstractBinderC0375Hf.a(parcel.readStrongBinder()));
        } else if (i != 2) {
            return false;
        } else {
            b(parcel.readString());
        }
        parcel2.writeNoException();
        return true;
    }
}
