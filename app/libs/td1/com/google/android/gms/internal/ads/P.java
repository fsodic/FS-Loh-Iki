package com.google.android.gms.internal.ads;

import android.os.Parcel;
import b.c.b.a.c.a;

public abstract class P extends BinderC1618kga implements Q {
    public P() {
        super("com.google.android.gms.ads.internal.customrenderedad.client.ICustomRenderedAd");
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.BinderC1618kga
    public final boolean a(int i, Parcel parcel, Parcel parcel2, int i2) {
        String str;
        if (i == 1) {
            str = ra();
        } else if (i != 2) {
            if (i == 3) {
                k(a.AbstractBinderC0013a.a(parcel.readStrongBinder()));
            } else if (i == 4) {
                ya();
            } else if (i != 5) {
                return false;
            } else {
                u();
            }
            parcel2.writeNoException();
            return true;
        } else {
            str = getContent();
        }
        parcel2.writeNoException();
        parcel2.writeString(str);
        return true;
    }
}
