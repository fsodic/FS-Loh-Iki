package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IInterface;
import android.os.Parcel;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.nb  reason: case insensitive filesystem */
public abstract class AbstractBinderC1814nb extends BinderC1618kga implements AbstractC1883ob {
    public AbstractBinderC1814nb() {
        super("com.google.android.gms.ads.internal.formats.client.INativeContentAd");
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.BinderC1618kga
    public final boolean a(int i, Parcel parcel, Parcel parcel2, int i2) {
        IInterface iInterface;
        String str;
        switch (i) {
            case 2:
                iInterface = z();
                parcel2.writeNoException();
                C1756mga.a(parcel2, iInterface);
                return true;
            case 3:
                str = l();
                parcel2.writeNoException();
                parcel2.writeString(str);
                return true;
            case 4:
                List t = t();
                parcel2.writeNoException();
                parcel2.writeList(t);
                return true;
            case 5:
                str = s();
                parcel2.writeNoException();
                parcel2.writeString(str);
                return true;
            case 6:
                iInterface = ja();
                parcel2.writeNoException();
                C1756mga.a(parcel2, iInterface);
                return true;
            case 7:
                str = o();
                parcel2.writeNoException();
                parcel2.writeString(str);
                return true;
            case 8:
                str = D();
                parcel2.writeNoException();
                parcel2.writeString(str);
                return true;
            case 9:
                Bundle extras = getExtras();
                parcel2.writeNoException();
                C1756mga.b(parcel2, extras);
                return true;
            case 10:
                destroy();
                parcel2.writeNoException();
                return true;
            case 11:
                iInterface = getVideoController();
                parcel2.writeNoException();
                C1756mga.a(parcel2, iInterface);
                return true;
            case 12:
                b((Bundle) C1756mga.a(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                return true;
            case 13:
                boolean c2 = c((Bundle) C1756mga.a(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                C1756mga.a(parcel2, c2);
                return true;
            case 14:
                d((Bundle) C1756mga.a(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                return true;
            case 15:
                iInterface = n();
                parcel2.writeNoException();
                C1756mga.a(parcel2, iInterface);
                return true;
            case 16:
                iInterface = m();
                parcel2.writeNoException();
                C1756mga.a(parcel2, iInterface);
                return true;
            case 17:
                str = k();
                parcel2.writeNoException();
                parcel2.writeString(str);
                return true;
            default:
                return false;
        }
    }
}
