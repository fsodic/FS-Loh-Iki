package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.Parcel;
import b.c.b.a.c.a;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.up  reason: case insensitive filesystem */
public abstract class AbstractBinderC2324up extends BinderC1618kga implements AbstractC2393vp {
    public AbstractBinderC2324up() {
        super("com.google.android.gms.ads.measurement.IAppMeasurementProxy");
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.BinderC1618kga
    public final boolean a(int i, Parcel parcel, Parcel parcel2, int i2) {
        String str;
        switch (i) {
            case 1:
                e((Bundle) C1756mga.a(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                return true;
            case 2:
                Bundle f = f((Bundle) C1756mga.a(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                C1756mga.b(parcel2, f);
                return true;
            case 3:
                c(parcel.readString(), parcel.readString(), (Bundle) C1756mga.a(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                return true;
            case 4:
                a(parcel.readString(), parcel.readString(), a.AbstractBinderC0013a.a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case 5:
                Map a2 = a(parcel.readString(), parcel.readString(), C1756mga.a(parcel));
                parcel2.writeNoException();
                parcel2.writeMap(a2);
                return true;
            case 6:
                int m = m(parcel.readString());
                parcel2.writeNoException();
                parcel2.writeInt(m);
                return true;
            case 7:
                h((Bundle) C1756mga.a(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                return true;
            case 8:
                a(parcel.readString(), parcel.readString(), (Bundle) C1756mga.a(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                return true;
            case 9:
                List b2 = b(parcel.readString(), parcel.readString());
                parcel2.writeNoException();
                parcel2.writeList(b2);
                return true;
            case 10:
                str = Da();
                parcel2.writeNoException();
                parcel2.writeString(str);
                return true;
            case 11:
                str = cb();
                parcel2.writeNoException();
                parcel2.writeString(str);
                return true;
            case 12:
                long Ia = Ia();
                parcel2.writeNoException();
                parcel2.writeLong(Ia);
                return true;
            case 13:
                A(parcel.readString());
                parcel2.writeNoException();
                return true;
            case 14:
                D(parcel.readString());
                parcel2.writeNoException();
                return true;
            case 15:
                b(a.AbstractBinderC0013a.a(parcel.readStrongBinder()), parcel.readString(), parcel.readString());
                parcel2.writeNoException();
                return true;
            case 16:
                str = Ka();
                parcel2.writeNoException();
                parcel2.writeString(str);
                return true;
            case 17:
                str = kb();
                parcel2.writeNoException();
                parcel2.writeString(str);
                return true;
            case 18:
                str = ab();
                parcel2.writeNoException();
                parcel2.writeString(str);
                return true;
            default:
                return false;
        }
    }
}
