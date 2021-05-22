package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: com.google.android.gms.internal.ads.kpa  reason: case insensitive filesystem */
public abstract class AbstractBinderC1636kpa extends BinderC1618kga implements AbstractC1498ipa {
    public AbstractBinderC1636kpa() {
        super("com.google.android.gms.ads.internal.client.IMuteThisAdReason");
    }

    public static AbstractC1498ipa a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IMuteThisAdReason");
        return queryLocalInterface instanceof AbstractC1498ipa ? (AbstractC1498ipa) queryLocalInterface : new C1567jpa(iBinder);
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.BinderC1618kga
    public final boolean a(int i, Parcel parcel, Parcel parcel2, int i2) {
        String str;
        if (i == 1) {
            str = getDescription();
        } else if (i != 2) {
            return false;
        } else {
            str = ma();
        }
        parcel2.writeNoException();
        parcel2.writeString(str);
        return true;
    }
}
