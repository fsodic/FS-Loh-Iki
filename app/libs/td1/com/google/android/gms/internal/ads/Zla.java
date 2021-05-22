package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

public abstract class Zla extends BinderC1618kga implements _la {
    public Zla() {
        super("com.google.android.gms.ads.internal.appopen.client.IAppOpenAd");
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.BinderC1618kga
    public final boolean a(int i, Parcel parcel, Parcel parcel2, int i2) {
        AbstractC1149dma dma;
        if (i == 2) {
            Loa mb = mb();
            parcel2.writeNoException();
            C1756mga.a(parcel2, mb);
            return true;
        } else if (i != 3) {
            return false;
        } else {
            IBinder readStrongBinder = parcel.readStrongBinder();
            if (readStrongBinder == null) {
                dma = null;
            } else {
                IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.appopen.client.IAppOpenAdPresentationCallback");
                dma = queryLocalInterface instanceof AbstractC1149dma ? (AbstractC1149dma) queryLocalInterface : new C1217ema(readStrongBinder);
            }
            a(dma);
            parcel2.writeNoException();
            return true;
        }
    }
}
