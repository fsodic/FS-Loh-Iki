package com.google.android.gms.internal.ads;

import android.os.IInterface;
import android.os.Parcel;
import b.c.b.a.c.a;

public abstract class Yoa extends BinderC1618kga implements Voa {
    public Yoa() {
        super("com.google.android.gms.ads.internal.client.IClientApi");
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.BinderC1618kga
    public final boolean a(int i, Parcel parcel, Parcel parcel2, int i2) {
        IInterface iInterface;
        switch (i) {
            case 1:
                iInterface = c(a.AbstractBinderC0013a.a(parcel.readStrongBinder()), (C1015boa) C1756mga.a(parcel, C1015boa.CREATOR), parcel.readString(), AbstractBinderC1822nf.a(parcel.readStrongBinder()), parcel.readInt());
                break;
            case 2:
                iInterface = b(a.AbstractBinderC0013a.a(parcel.readStrongBinder()), (C1015boa) C1756mga.a(parcel, C1015boa.CREATOR), parcel.readString(), AbstractBinderC1822nf.a(parcel.readStrongBinder()), parcel.readInt());
                break;
            case 3:
                iInterface = b(a.AbstractBinderC0013a.a(parcel.readStrongBinder()), parcel.readString(), AbstractBinderC1822nf.a(parcel.readStrongBinder()), parcel.readInt());
                break;
            case 4:
                iInterface = M(a.AbstractBinderC0013a.a(parcel.readStrongBinder()));
                break;
            case 5:
                iInterface = d(a.AbstractBinderC0013a.a(parcel.readStrongBinder()), a.AbstractBinderC0013a.a(parcel.readStrongBinder()));
                break;
            case 6:
                iInterface = c(a.AbstractBinderC0013a.a(parcel.readStrongBinder()), AbstractBinderC1822nf.a(parcel.readStrongBinder()), parcel.readInt());
                break;
            case 7:
                iInterface = H(a.AbstractBinderC0013a.a(parcel.readStrongBinder()));
                break;
            case 8:
                iInterface = w(a.AbstractBinderC0013a.a(parcel.readStrongBinder()));
                break;
            case 9:
                iInterface = d(a.AbstractBinderC0013a.a(parcel.readStrongBinder()), parcel.readInt());
                break;
            case 10:
                iInterface = a(a.AbstractBinderC0013a.a(parcel.readStrongBinder()), (C1015boa) C1756mga.a(parcel, C1015boa.CREATOR), parcel.readString(), parcel.readInt());
                break;
            case 11:
                iInterface = b(a.AbstractBinderC0013a.a(parcel.readStrongBinder()), a.AbstractBinderC0013a.a(parcel.readStrongBinder()), a.AbstractBinderC0013a.a(parcel.readStrongBinder()));
                break;
            case 12:
                iInterface = c(a.AbstractBinderC0013a.a(parcel.readStrongBinder()), parcel.readString(), AbstractBinderC1822nf.a(parcel.readStrongBinder()), parcel.readInt());
                break;
            case 13:
                iInterface = a(a.AbstractBinderC0013a.a(parcel.readStrongBinder()), (C1015boa) C1756mga.a(parcel, C1015boa.CREATOR), parcel.readString(), AbstractBinderC1822nf.a(parcel.readStrongBinder()), parcel.readInt());
                break;
            case 14:
                iInterface = a(a.AbstractBinderC0013a.a(parcel.readStrongBinder()), AbstractBinderC1822nf.a(parcel.readStrongBinder()), parcel.readInt());
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        C1756mga.a(parcel2, iInterface);
        return true;
    }
}
