package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

public abstract class Toa extends BinderC1618kga implements Uoa {
    public Toa() {
        super("com.google.android.gms.ads.internal.client.IAppEventListener");
    }

    public static Uoa a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAppEventListener");
        return queryLocalInterface instanceof Uoa ? (Uoa) queryLocalInterface : new Woa(iBinder);
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.BinderC1618kga
    public final boolean a(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i != 1) {
            return false;
        }
        a(parcel.readString(), parcel.readString());
        parcel2.writeNoException();
        return true;
    }
}
