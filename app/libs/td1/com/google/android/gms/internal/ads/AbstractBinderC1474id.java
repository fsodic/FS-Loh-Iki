package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: com.google.android.gms.internal.ads.id  reason: case insensitive filesystem */
public abstract class AbstractBinderC1474id extends BinderC1618kga implements AbstractC1267fd {
    public AbstractBinderC1474id() {
        super("com.google.android.gms.ads.internal.initialization.IAdapterInitializationCallback");
    }

    public static AbstractC1267fd a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.initialization.IAdapterInitializationCallback");
        return queryLocalInterface instanceof AbstractC1267fd ? (AbstractC1267fd) queryLocalInterface : new C1405hd(iBinder);
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.BinderC1618kga
    public final boolean a(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i == 2) {
            Q();
        } else if (i != 3) {
            return false;
        } else {
            i(parcel.readString());
        }
        parcel2.writeNoException();
        return true;
    }
}
