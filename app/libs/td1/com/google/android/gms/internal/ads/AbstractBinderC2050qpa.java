package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: com.google.android.gms.internal.ads.qpa  reason: case insensitive filesystem */
public abstract class AbstractBinderC2050qpa extends BinderC1618kga implements AbstractC2118rpa {
    public AbstractBinderC2050qpa() {
        super("com.google.android.gms.ads.internal.client.IOnPaidEventListener");
    }

    public static AbstractC2118rpa a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IOnPaidEventListener");
        return queryLocalInterface instanceof AbstractC2118rpa ? (AbstractC2118rpa) queryLocalInterface : new C2256tpa(iBinder);
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.BinderC1618kga
    public final boolean a(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i != 1) {
            return false;
        }
        a((C1152doa) C1756mga.a(parcel, C1152doa.CREATOR));
        parcel2.writeNoException();
        return true;
    }
}
