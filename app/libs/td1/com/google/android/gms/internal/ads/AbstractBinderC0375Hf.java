package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import b.c.b.a.c.a;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.Hf  reason: case insensitive filesystem */
public abstract class AbstractBinderC0375Hf extends BinderC1618kga implements AbstractC0297Ef {
    public AbstractBinderC0375Hf() {
        super("com.google.android.gms.ads.internal.mediation.client.IUnifiedNativeAdMapper");
    }

    public static AbstractC0297Ef a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IUnifiedNativeAdMapper");
        return queryLocalInterface instanceof AbstractC0297Ef ? (AbstractC0297Ef) queryLocalInterface : new C0349Gf(iBinder);
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.BinderC1618kga
    public final boolean a(int i, Parcel parcel, Parcel parcel2, int i2) {
        String str;
        IInterface iInterface;
        boolean z;
        float f;
        switch (i) {
            case 2:
                str = l();
                parcel2.writeNoException();
                parcel2.writeString(str);
                return true;
            case 3:
                List t = t();
                parcel2.writeNoException();
                parcel2.writeList(t);
                return true;
            case 4:
                str = s();
                parcel2.writeNoException();
                parcel2.writeString(str);
                return true;
            case 5:
                iInterface = w();
                parcel2.writeNoException();
                C1756mga.a(parcel2, iInterface);
                return true;
            case 6:
                str = o();
                parcel2.writeNoException();
                parcel2.writeString(str);
                return true;
            case 7:
                str = D();
                parcel2.writeNoException();
                parcel2.writeString(str);
                return true;
            case 8:
                double B = B();
                parcel2.writeNoException();
                parcel2.writeDouble(B);
                return true;
            case 9:
                str = E();
                parcel2.writeNoException();
                parcel2.writeString(str);
                return true;
            case 10:
                str = y();
                parcel2.writeNoException();
                parcel2.writeString(str);
                return true;
            case 11:
                iInterface = getVideoController();
                parcel2.writeNoException();
                C1756mga.a(parcel2, iInterface);
                return true;
            case 12:
                iInterface = n();
                parcel2.writeNoException();
                C1756mga.a(parcel2, iInterface);
                return true;
            case 13:
                iInterface = O();
                parcel2.writeNoException();
                C1756mga.a(parcel2, iInterface);
                return true;
            case 14:
                iInterface = M();
                parcel2.writeNoException();
                C1756mga.a(parcel2, iInterface);
                return true;
            case 15:
                iInterface = m();
                parcel2.writeNoException();
                C1756mga.a(parcel2, iInterface);
                return true;
            case 16:
                Bundle extras = getExtras();
                parcel2.writeNoException();
                C1756mga.b(parcel2, extras);
                return true;
            case 17:
                z = L();
                parcel2.writeNoException();
                C1756mga.a(parcel2, z);
                return true;
            case 18:
                z = T();
                parcel2.writeNoException();
                C1756mga.a(parcel2, z);
                return true;
            case 19:
                u();
                parcel2.writeNoException();
                return true;
            case 20:
                b(a.AbstractBinderC0013a.a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case 21:
                a(a.AbstractBinderC0013a.a(parcel.readStrongBinder()), a.AbstractBinderC0013a.a(parcel.readStrongBinder()), a.AbstractBinderC0013a.a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case 22:
                a(a.AbstractBinderC0013a.a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case 23:
                f = pa();
                parcel2.writeNoException();
                parcel2.writeFloat(f);
                return true;
            case 24:
                f = Ea();
                parcel2.writeNoException();
                parcel2.writeFloat(f);
                return true;
            case 25:
                f = Ba();
                parcel2.writeNoException();
                parcel2.writeFloat(f);
                return true;
            default:
                return false;
        }
    }
}
