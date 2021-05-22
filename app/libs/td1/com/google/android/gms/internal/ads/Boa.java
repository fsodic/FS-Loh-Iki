package com.google.android.gms.internal.ads;

import android.os.Parcel;

public abstract class Boa extends BinderC1618kga implements AbstractC2599yoa {
    public Boa() {
        super("com.google.android.gms.ads.internal.client.IAdListener");
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.BinderC1618kga
    public final boolean a(int i, Parcel parcel, Parcel parcel2, int i2) {
        switch (i) {
            case 1:
                j();
                break;
            case 2:
                c(parcel.readInt());
                break;
            case 3:
                i();
                break;
            case 4:
                a();
                break;
            case 5:
                h();
                break;
            case 6:
                e();
                break;
            case 7:
                b();
                break;
            case 8:
                a((Sna) C1756mga.a(parcel, Sna.CREATOR));
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}
