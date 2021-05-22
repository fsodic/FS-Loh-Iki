package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import b.c.b.a.c.a;

/* renamed from: com.google.android.gms.internal.ads.td  reason: case insensitive filesystem */
public abstract class AbstractBinderC2231td extends BinderC1618kga implements AbstractC2093rd {
    public AbstractBinderC2231td() {
        super("com.google.android.gms.ads.internal.instream.client.IInstreamAd");
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.BinderC1618kga
    public final boolean a(int i, Parcel parcel, Parcel parcel2, int i2) {
        IInterface iInterface;
        AbstractC2369vd vdVar;
        if (i != 3) {
            if (i == 4) {
                destroy();
            } else if (i == 5) {
                a a2 = a.AbstractBinderC0013a.a(parcel.readStrongBinder());
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder == null) {
                    vdVar = null;
                } else {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.instream.client.IInstreamAdCallback");
                    vdVar = queryLocalInterface instanceof AbstractC2369vd ? (AbstractC2369vd) queryLocalInterface : new C2507xd(readStrongBinder);
                }
                a(a2, vdVar);
            } else if (i == 6) {
                B(a.AbstractBinderC0013a.a(parcel.readStrongBinder()));
            } else if (i != 7) {
                return false;
            } else {
                iInterface = ha();
            }
            parcel2.writeNoException();
            return true;
        }
        iInterface = getVideoController();
        parcel2.writeNoException();
        C1756mga.a(parcel2, iInterface);
        return true;
    }
}
