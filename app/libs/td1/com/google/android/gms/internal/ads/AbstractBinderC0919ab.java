package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import b.c.b.a.c.a;

/* renamed from: com.google.android.gms.internal.ads.ab  reason: case insensitive filesystem */
public abstract class AbstractBinderC0919ab extends BinderC1618kga implements AbstractC0988bb {
    public AbstractBinderC0919ab() {
        super("com.google.android.gms.ads.internal.formats.client.INativeAdViewDelegate");
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.BinderC1618kga
    public final boolean a(int i, Parcel parcel, Parcel parcel2, int i2) {
        AbstractC0708Ua ua;
        switch (i) {
            case 1:
                a(parcel.readString(), a.AbstractBinderC0013a.a(parcel.readStrongBinder()));
                break;
            case 2:
                a l = l(parcel.readString());
                parcel2.writeNoException();
                C1756mga.a(parcel2, l);
                return true;
            case 3:
                e(a.AbstractBinderC0013a.a(parcel.readStrongBinder()));
                break;
            case 4:
                destroy();
                break;
            case 5:
                a(a.AbstractBinderC0013a.a(parcel.readStrongBinder()), parcel.readInt());
                break;
            case 6:
                c(a.AbstractBinderC0013a.a(parcel.readStrongBinder()));
                break;
            case 7:
                g(a.AbstractBinderC0013a.a(parcel.readStrongBinder()));
                break;
            case 8:
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder == null) {
                    ua = null;
                } else {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IMediaContent");
                    ua = queryLocalInterface instanceof AbstractC0708Ua ? (AbstractC0708Ua) queryLocalInterface : new C0734Va(readStrongBinder);
                }
                a(ua);
                break;
            case 9:
                t(a.AbstractBinderC0013a.a(parcel.readStrongBinder()));
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}
