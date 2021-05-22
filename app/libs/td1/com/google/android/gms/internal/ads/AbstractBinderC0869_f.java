package com.google.android.gms.internal.ads;

import android.os.Parcel;
import b.c.b.a.c.a;

/* renamed from: com.google.android.gms.internal.ads._f  reason: case insensitive filesystem */
public abstract class AbstractBinderC0869_f extends BinderC1618kga implements AbstractC0929ag {
    public AbstractBinderC0869_f() {
        super("com.google.android.gms.ads.internal.mediation.client.rtb.IBannerCallback");
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.BinderC1618kga
    public final boolean a(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i == 1) {
            s(a.AbstractBinderC0013a.a(parcel.readStrongBinder()));
        } else if (i != 2) {
            return false;
        } else {
            b(parcel.readString());
        }
        parcel2.writeNoException();
        return true;
    }
}
