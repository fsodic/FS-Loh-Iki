package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IInterface;
import android.os.Parcel;
import b.c.b.a.c.a;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.Cf  reason: case insensitive filesystem */
public abstract class AbstractBinderC0245Cf extends BinderC1618kga implements AbstractC0271Df {
    public AbstractBinderC0245Cf() {
        super("com.google.android.gms.ads.internal.mediation.client.INativeContentAdMapper");
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.BinderC1618kga
    public final boolean a(int i, Parcel parcel, Parcel parcel2, int i2) {
        String str;
        IInterface iInterface;
        boolean z;
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
                iInterface = ja();
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
                u();
                parcel2.writeNoException();
                return true;
            case 9:
                b(a.AbstractBinderC0013a.a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case 10:
                d(a.AbstractBinderC0013a.a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case 11:
                z = L();
                parcel2.writeNoException();
                C1756mga.a(parcel2, z);
                return true;
            case 12:
                z = T();
                parcel2.writeNoException();
                C1756mga.a(parcel2, z);
                return true;
            case 13:
                Bundle extras = getExtras();
                parcel2.writeNoException();
                C1756mga.b(parcel2, extras);
                return true;
            case 14:
                a(a.AbstractBinderC0013a.a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case 15:
                iInterface = O();
                parcel2.writeNoException();
                C1756mga.a(parcel2, iInterface);
                return true;
            case 16:
                iInterface = getVideoController();
                parcel2.writeNoException();
                C1756mga.a(parcel2, iInterface);
                return true;
            case 17:
            case 18:
            default:
                return false;
            case 19:
                iInterface = n();
                parcel2.writeNoException();
                C1756mga.a(parcel2, iInterface);
                return true;
            case 20:
                iInterface = M();
                parcel2.writeNoException();
                C1756mga.a(parcel2, iInterface);
                return true;
            case 21:
                iInterface = m();
                parcel2.writeNoException();
                C1756mga.a(parcel2, iInterface);
                return true;
            case 22:
                a(a.AbstractBinderC0013a.a(parcel.readStrongBinder()), a.AbstractBinderC0013a.a(parcel.readStrongBinder()), a.AbstractBinderC0013a.a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
        }
    }
}
