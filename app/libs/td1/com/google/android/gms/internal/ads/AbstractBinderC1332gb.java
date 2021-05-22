package com.google.android.gms.internal.ads;

import android.os.Parcel;
import b.c.b.a.c.a;

/* renamed from: com.google.android.gms.internal.ads.gb  reason: case insensitive filesystem */
public abstract class AbstractBinderC1332gb extends BinderC1618kga implements AbstractC1194eb {
    public AbstractBinderC1332gb() {
        super("com.google.android.gms.ads.internal.formats.client.INativeAdViewHolderDelegate");
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.BinderC1618kga
    public final boolean a(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i == 1) {
            e(a.AbstractBinderC0013a.a(parcel.readStrongBinder()));
        } else if (i == 2) {
            tb();
        } else if (i != 3) {
            return false;
        } else {
            c(a.AbstractBinderC0013a.a(parcel.readStrongBinder()));
        }
        parcel2.writeNoException();
        return true;
    }
}
