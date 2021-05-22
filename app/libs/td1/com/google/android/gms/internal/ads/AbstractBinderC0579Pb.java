package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: com.google.android.gms.internal.ads.Pb  reason: case insensitive filesystem */
public abstract class AbstractBinderC0579Pb extends BinderC1618kga implements AbstractC0501Mb {
    public AbstractBinderC0579Pb() {
        super("com.google.android.gms.ads.internal.formats.client.IOnUnifiedNativeAdLoadedListener");
    }

    public static AbstractC0501Mb a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IOnUnifiedNativeAdLoadedListener");
        return queryLocalInterface instanceof AbstractC0501Mb ? (AbstractC0501Mb) queryLocalInterface : new C0553Ob(iBinder);
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.BinderC1618kga
    public final boolean a(int i, Parcel parcel, Parcel parcel2, int i2) {
        AbstractC0761Wb wb;
        if (i != 1) {
            return false;
        }
        IBinder readStrongBinder = parcel.readStrongBinder();
        if (readStrongBinder == null) {
            wb = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IUnifiedNativeAd");
            wb = queryLocalInterface instanceof AbstractC0761Wb ? (AbstractC0761Wb) queryLocalInterface : new C0813Yb(readStrongBinder);
        }
        a(wb);
        parcel2.writeNoException();
        return true;
    }
}
