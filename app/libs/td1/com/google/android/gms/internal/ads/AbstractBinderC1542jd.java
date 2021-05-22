package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: com.google.android.gms.internal.ads.jd  reason: case insensitive filesystem */
public abstract class AbstractBinderC1542jd extends BinderC1618kga implements AbstractC1611kd {
    public AbstractBinderC1542jd() {
        super("com.google.android.gms.ads.internal.initialization.IInitializationCallback");
    }

    public static AbstractC1611kd a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.initialization.IInitializationCallback");
        return queryLocalInterface instanceof AbstractC1611kd ? (AbstractC1611kd) queryLocalInterface : new C1749md(iBinder);
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.BinderC1618kga
    public final boolean a(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i != 1) {
            return false;
        }
        b(parcel.createTypedArrayList(C1130dd.CREATOR));
        parcel2.writeNoException();
        return true;
    }
}
