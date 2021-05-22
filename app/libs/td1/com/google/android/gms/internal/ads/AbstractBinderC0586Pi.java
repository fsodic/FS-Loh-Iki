package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: com.google.android.gms.internal.ads.Pi  reason: case insensitive filesystem */
public abstract class AbstractBinderC0586Pi extends BinderC1618kga implements AbstractC0508Mi {
    public AbstractBinderC0586Pi() {
        super("com.google.android.gms.ads.internal.rewarded.client.IRewardItem");
    }

    public static AbstractC0508Mi a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardItem");
        return queryLocalInterface instanceof AbstractC0508Mi ? (AbstractC0508Mi) queryLocalInterface : new C0560Oi(iBinder);
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.BinderC1618kga
    public final boolean a(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i == 1) {
            String type = getType();
            parcel2.writeNoException();
            parcel2.writeString(type);
        } else if (i != 2) {
            return false;
        } else {
            int A = A();
            parcel2.writeNoException();
            parcel2.writeInt(A);
        }
        return true;
    }
}
