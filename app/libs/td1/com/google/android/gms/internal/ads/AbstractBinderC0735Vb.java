package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.Vb  reason: case insensitive filesystem */
public abstract class AbstractBinderC0735Vb extends BinderC1618kga implements AbstractC0761Wb {
    public AbstractBinderC0735Vb() {
        super("com.google.android.gms.ads.internal.formats.client.IUnifiedNativeAd");
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.BinderC1618kga
    public final boolean a(int i, Parcel parcel, Parcel parcel2, int i2) {
        String str;
        List list;
        IInterface iInterface;
        boolean z;
        AbstractC0657Sb sb;
        switch (i) {
            case 2:
                str = l();
                parcel2.writeNoException();
                parcel2.writeString(str);
                return true;
            case 3:
                list = t();
                parcel2.writeNoException();
                parcel2.writeList(list);
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
                str = k();
                parcel2.writeNoException();
                parcel2.writeString(str);
                return true;
            case 13:
                destroy();
                parcel2.writeNoException();
                return true;
            case 14:
                iInterface = n();
                parcel2.writeNoException();
                C1756mga.a(parcel2, iInterface);
                return true;
            case 15:
                b((Bundle) C1756mga.a(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                return true;
            case 16:
                z = c((Bundle) C1756mga.a(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                C1756mga.a(parcel2, z);
                return true;
            case 17:
                d((Bundle) C1756mga.a(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                return true;
            case 18:
                iInterface = z();
                parcel2.writeNoException();
                C1756mga.a(parcel2, iInterface);
                return true;
            case 19:
                iInterface = m();
                parcel2.writeNoException();
                C1756mga.a(parcel2, iInterface);
                return true;
            case 20:
                Bundle extras = getExtras();
                parcel2.writeNoException();
                C1756mga.b(parcel2, extras);
                return true;
            case 21:
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder == null) {
                    sb = null;
                } else {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IUnconfirmedClickListener");
                    sb = queryLocalInterface instanceof AbstractC0657Sb ? (AbstractC0657Sb) queryLocalInterface : new C0709Ub(readStrongBinder);
                }
                a(sb);
                parcel2.writeNoException();
                return true;
            case 22:
                x();
                parcel2.writeNoException();
                return true;
            case 23:
                list = fb();
                parcel2.writeNoException();
                parcel2.writeList(list);
                return true;
            case 24:
                z = Ga();
                parcel2.writeNoException();
                C1756mga.a(parcel2, z);
                return true;
            case 25:
                a(AbstractBinderC1636kpa.a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case 26:
                a(AbstractBinderC1430hpa.a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case 27:
                v();
                parcel2.writeNoException();
                return true;
            case 28:
                Db();
                parcel2.writeNoException();
                return true;
            case 29:
                iInterface = ha();
                parcel2.writeNoException();
                C1756mga.a(parcel2, iInterface);
                return true;
            case 30:
                z = G();
                parcel2.writeNoException();
                C1756mga.a(parcel2, z);
                return true;
            case 31:
                iInterface = C();
                parcel2.writeNoException();
                C1756mga.a(parcel2, iInterface);
                return true;
            case 32:
                a(AbstractBinderC2050qpa.a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }
}
