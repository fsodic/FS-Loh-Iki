package com.google.android.gms.internal.ads;

import android.os.Parcel;

public abstract class Coa extends BinderC1618kga implements Doa {
    public Coa() {
        super("com.google.android.gms.ads.internal.client.IAdLoader");
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.BinderC1618kga
    public final boolean a(int i, Parcel parcel, Parcel parcel2, int i2) {
        String str;
        if (i != 1) {
            if (i == 2) {
                str = k();
            } else if (i == 3) {
                boolean q = q();
                parcel2.writeNoException();
                C1756mga.a(parcel2, q);
                return true;
            } else if (i == 4) {
                str = Z();
            } else if (i != 5) {
                return false;
            } else {
                a((Zna) C1756mga.a(parcel, Zna.CREATOR), parcel.readInt());
            }
            parcel2.writeNoException();
            parcel2.writeString(str);
            return true;
        }
        b((Zna) C1756mga.a(parcel, Zna.CREATOR));
        parcel2.writeNoException();
        return true;
    }
}
