package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

public abstract class Soa extends BinderC1618kga implements Ooa {
    public Soa() {
        super("com.google.android.gms.ads.internal.client.IAdMetadataListener");
    }

    public static Ooa a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdMetadataListener");
        return queryLocalInterface instanceof Ooa ? (Ooa) queryLocalInterface : new Roa(iBinder);
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.BinderC1618kga
    public final boolean a(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i != 1) {
            return false;
        }
        ca();
        parcel2.writeNoException();
        return true;
    }
}
