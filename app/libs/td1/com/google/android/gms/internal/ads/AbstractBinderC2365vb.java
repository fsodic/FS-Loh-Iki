package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: com.google.android.gms.internal.ads.vb  reason: case insensitive filesystem */
public abstract class AbstractBinderC2365vb extends BinderC1618kga implements AbstractC2434wb {
    public AbstractBinderC2365vb() {
        super("com.google.android.gms.ads.internal.formats.client.IOnAppInstallAdLoadedListener");
    }

    public static AbstractC2434wb a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IOnAppInstallAdLoadedListener");
        return queryLocalInterface instanceof AbstractC2434wb ? (AbstractC2434wb) queryLocalInterface : new C2572yb(iBinder);
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.BinderC1618kga
    public final boolean a(int i, Parcel parcel, Parcel parcel2, int i2) {
        AbstractC1607kb kbVar;
        if (i != 1) {
            return false;
        }
        IBinder readStrongBinder = parcel.readStrongBinder();
        if (readStrongBinder == null) {
            kbVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAppInstallAd");
            kbVar = queryLocalInterface instanceof AbstractC1607kb ? (AbstractC1607kb) queryLocalInterface : new C1745mb(readStrongBinder);
        }
        a(kbVar);
        parcel2.writeNoException();
        return true;
    }
}
