package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: com.google.android.gms.internal.ads.nf  reason: case insensitive filesystem */
public abstract class AbstractBinderC1822nf extends BinderC1618kga implements AbstractC1891of {
    public AbstractBinderC1822nf() {
        super("com.google.android.gms.ads.internal.mediation.client.IAdapterCreator");
    }

    public static AbstractC1891of a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IAdapterCreator");
        return queryLocalInterface instanceof AbstractC1891of ? (AbstractC1891of) queryLocalInterface : new C2029qf(iBinder);
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.BinderC1618kga
    public final boolean a(int i, Parcel parcel, Parcel parcel2, int i2) {
        IInterface iInterface;
        if (i == 1) {
            iInterface = C(parcel.readString());
        } else if (i == 2) {
            boolean q = q(parcel.readString());
            parcel2.writeNoException();
            C1756mga.a(parcel2, q);
            return true;
        } else if (i != 3) {
            return false;
        } else {
            iInterface = k(parcel.readString());
        }
        parcel2.writeNoException();
        C1756mga.a(parcel2, iInterface);
        return true;
    }
}
