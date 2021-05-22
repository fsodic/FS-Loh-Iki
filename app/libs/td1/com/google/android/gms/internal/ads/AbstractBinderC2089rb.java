package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import b.c.b.a.c.a;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.rb  reason: case insensitive filesystem */
public abstract class AbstractBinderC2089rb extends BinderC1618kga implements AbstractC2158sb {
    public AbstractBinderC2089rb() {
        super("com.google.android.gms.ads.internal.formats.client.INativeCustomTemplateAd");
    }

    public static AbstractC2158sb a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeCustomTemplateAd");
        return queryLocalInterface instanceof AbstractC2158sb ? (AbstractC2158sb) queryLocalInterface : new C2296ub(iBinder);
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.BinderC1618kga
    public final boolean a(int i, Parcel parcel, Parcel parcel2, int i2) {
        String str;
        IInterface iInterface;
        boolean z;
        switch (i) {
            case 1:
                str = p(parcel.readString());
                parcel2.writeNoException();
                parcel2.writeString(str);
                return true;
            case 2:
                iInterface = v(parcel.readString());
                parcel2.writeNoException();
                C1756mga.a(parcel2, iInterface);
                return true;
            case 3:
                List<String> Wa = Wa();
                parcel2.writeNoException();
                parcel2.writeStringList(Wa);
                return true;
            case 4:
                str = J();
                parcel2.writeNoException();
                parcel2.writeString(str);
                return true;
            case 5:
                r(parcel.readString());
                parcel2.writeNoException();
                return true;
            case 6:
                u();
                parcel2.writeNoException();
                return true;
            case 7:
                iInterface = getVideoController();
                parcel2.writeNoException();
                C1756mga.a(parcel2, iInterface);
                return true;
            case 8:
                destroy();
                parcel2.writeNoException();
                return true;
            case 9:
                iInterface = yb();
                parcel2.writeNoException();
                C1756mga.a(parcel2, iInterface);
                return true;
            case 10:
                z = v(a.AbstractBinderC0013a.a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                C1756mga.a(parcel2, z);
                return true;
            case 11:
                iInterface = z();
                parcel2.writeNoException();
                C1756mga.a(parcel2, iInterface);
                return true;
            case 12:
                z = ob();
                parcel2.writeNoException();
                C1756mga.a(parcel2, z);
                return true;
            case 13:
                z = db();
                parcel2.writeNoException();
                C1756mga.a(parcel2, z);
                return true;
            case 14:
                p(a.AbstractBinderC0013a.a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case 15:
                Sa();
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }
}
