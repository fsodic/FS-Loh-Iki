package com.google.android.gms.internal.ads;

import android.os.Parcel;

/* renamed from: com.google.android.gms.internal.ads.woa  reason: case insensitive filesystem */
public abstract class AbstractBinderC2461woa extends BinderC1618kga implements AbstractC2530xoa {
    public AbstractBinderC2461woa() {
        super("com.google.android.gms.ads.internal.client.IAdClickListener");
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.BinderC1618kga
    public final boolean a(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i != 1) {
            return false;
        }
        e();
        parcel2.writeNoException();
        return true;
    }
}
