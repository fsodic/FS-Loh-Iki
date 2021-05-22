package com.google.android.gms.internal.ads;

import android.os.Parcel;
import b.c.b.a.c.a;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.apa  reason: case insensitive filesystem */
public abstract class AbstractBinderC0948apa extends BinderC1618kga implements AbstractC1017bpa {
    public AbstractBinderC0948apa() {
        super("com.google.android.gms.ads.internal.client.IMobileAdsSettingManager");
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.BinderC1618kga
    public final boolean a(int i, Parcel parcel, Parcel parcel2, int i2) {
        switch (i) {
            case 1:
                H();
                break;
            case 2:
                a(parcel.readFloat());
                break;
            case 3:
                x(parcel.readString());
                break;
            case 4:
                e(C1756mga.a(parcel));
                break;
            case 5:
                a(a.AbstractBinderC0013a.a(parcel.readStrongBinder()), parcel.readString());
                break;
            case 6:
                b(parcel.readString(), a.AbstractBinderC0013a.a(parcel.readStrongBinder()));
                break;
            case 7:
                float gb = gb();
                parcel2.writeNoException();
                parcel2.writeFloat(gb);
                return true;
            case 8:
                boolean Ua = Ua();
                parcel2.writeNoException();
                C1756mga.a(parcel2, Ua);
                return true;
            case 9:
                String Va = Va();
                parcel2.writeNoException();
                parcel2.writeString(Va);
                return true;
            case 10:
                j(parcel.readString());
                break;
            case 11:
                a(AbstractBinderC1822nf.a(parcel.readStrongBinder()));
                break;
            case 12:
                a(AbstractBinderC1542jd.a(parcel.readStrongBinder()));
                break;
            case 13:
                List<C1130dd> Ma = Ma();
                parcel2.writeNoException();
                parcel2.writeTypedList(Ma);
                return true;
            case 14:
                a((cqa) C1756mga.a(parcel, cqa.CREATOR));
                break;
            case 15:
                Ca();
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}
