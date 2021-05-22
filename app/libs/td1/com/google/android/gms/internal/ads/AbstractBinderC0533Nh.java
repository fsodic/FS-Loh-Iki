package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;

/* renamed from: com.google.android.gms.internal.ads.Nh  reason: case insensitive filesystem */
public abstract class AbstractBinderC0533Nh extends BinderC1618kga implements AbstractC0559Oh {
    public AbstractBinderC0533Nh() {
        super("com.google.android.gms.ads.internal.request.INonagonStreamingResponseListener");
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.BinderC1618kga
    public final boolean a(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i == 1) {
            a((ParcelFileDescriptor) C1756mga.a(parcel, ParcelFileDescriptor.CREATOR));
        } else if (i != 2) {
            return false;
        } else {
            a((C0939al) C1756mga.a(parcel, C0939al.CREATOR));
        }
        parcel2.writeNoException();
        return true;
    }
}
