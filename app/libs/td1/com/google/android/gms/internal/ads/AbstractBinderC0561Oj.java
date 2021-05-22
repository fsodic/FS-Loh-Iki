package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import b.c.b.a.c.a;

/* renamed from: com.google.android.gms.internal.ads.Oj  reason: case insensitive filesystem */
public abstract class AbstractBinderC0561Oj extends BinderC1618kga implements AbstractC0509Mj {
    public AbstractBinderC0561Oj() {
        super("com.google.android.gms.ads.internal.signals.ISignalGenerator");
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.BinderC1618kga
    public final boolean a(int i, Parcel parcel, Parcel parcel2, int i2) {
        AbstractC0483Lj lj;
        a aVar;
        switch (i) {
            case 1:
                a a2 = a.AbstractBinderC0013a.a(parcel.readStrongBinder());
                C0587Pj pj = (C0587Pj) C1756mga.a(parcel, C0587Pj.CREATOR);
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder == null) {
                    lj = null;
                } else {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.signals.ISignalCallback");
                    lj = queryLocalInterface instanceof AbstractC0483Lj ? (AbstractC0483Lj) queryLocalInterface : new C0535Nj(readStrongBinder);
                }
                a(a2, pj, lj);
                parcel2.writeNoException();
                return true;
            case 2:
                r(a.AbstractBinderC0013a.a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case 3:
                aVar = c(a.AbstractBinderC0013a.a(parcel.readStrongBinder()), a.AbstractBinderC0013a.a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                C1756mga.a(parcel2, aVar);
                return true;
            case 4:
                aVar = f(a.AbstractBinderC0013a.a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                C1756mga.a(parcel2, aVar);
                return true;
            case 5:
                a(parcel.createTypedArrayList(Uri.CREATOR), a.AbstractBinderC0013a.a(parcel.readStrongBinder()), AbstractBinderC1964ph.a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case 6:
                b(parcel.createTypedArrayList(Uri.CREATOR), a.AbstractBinderC0013a.a(parcel.readStrongBinder()), AbstractBinderC1964ph.a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case 7:
                a((C2101rh) C1756mga.a(parcel, C2101rh.CREATOR));
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }
}
