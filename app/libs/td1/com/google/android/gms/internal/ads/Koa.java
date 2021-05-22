package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;

public abstract class Koa extends BinderC1618kga implements Loa {
    public Koa() {
        super("com.google.android.gms.ads.internal.client.IAdManager");
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.BinderC1618kga
    public final boolean a(int i, Parcel parcel, Parcel parcel2, int i2) {
        IInterface iInterface;
        boolean z;
        Parcelable parcelable;
        String str;
        AbstractC2599yoa yoa = null;
        AbstractC2118rpa rpa = null;
        Ooa ooa = null;
        _oa _oa = null;
        AbstractC2530xoa xoa = null;
        Uoa uoa = null;
        switch (i) {
            case 1:
                iInterface = Ab();
                parcel2.writeNoException();
                C1756mga.a(parcel2, iInterface);
                return true;
            case 2:
                destroy();
                parcel2.writeNoException();
                return true;
            case 3:
                z = p();
                parcel2.writeNoException();
                C1756mga.a(parcel2, z);
                return true;
            case 4:
                z = a((Zna) C1756mga.a(parcel, Zna.CREATOR));
                parcel2.writeNoException();
                C1756mga.a(parcel2, z);
                return true;
            case 5:
                pause();
                parcel2.writeNoException();
                return true;
            case 6:
                resume();
                parcel2.writeNoException();
                return true;
            case 7:
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdListener");
                    yoa = queryLocalInterface instanceof AbstractC2599yoa ? (AbstractC2599yoa) queryLocalInterface : new Aoa(readStrongBinder);
                }
                b(yoa);
                parcel2.writeNoException();
                return true;
            case 8:
                IBinder readStrongBinder2 = parcel.readStrongBinder();
                if (readStrongBinder2 != null) {
                    IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.client.IAppEventListener");
                    uoa = queryLocalInterface2 instanceof Uoa ? (Uoa) queryLocalInterface2 : new Woa(readStrongBinder2);
                }
                a(uoa);
                parcel2.writeNoException();
                return true;
            case 9:
                showInterstitial();
                parcel2.writeNoException();
                return true;
            case 10:
                _a();
                parcel2.writeNoException();
                return true;
            case 11:
                Ib();
                parcel2.writeNoException();
                return true;
            case 12:
                parcelable = ib();
                parcel2.writeNoException();
                C1756mga.b(parcel2, parcelable);
                return true;
            case 13:
                a((C1015boa) C1756mga.a(parcel, C1015boa.CREATOR));
                parcel2.writeNoException();
                return true;
            case 14:
                a(BinderC1275fh.a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case 15:
                a(BinderC1550jh.a(parcel.readStrongBinder()), parcel.readString());
                parcel2.writeNoException();
                return true;
            case 16:
            case 17:
            case 27:
            case 28:
            default:
                return false;
            case 18:
                str = k();
                parcel2.writeNoException();
                parcel2.writeString(str);
                return true;
            case 19:
                a(V.a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case 20:
                IBinder readStrongBinder3 = parcel.readStrongBinder();
                if (readStrongBinder3 != null) {
                    IInterface queryLocalInterface3 = readStrongBinder3.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdClickListener");
                    xoa = queryLocalInterface3 instanceof AbstractC2530xoa ? (AbstractC2530xoa) queryLocalInterface3 : new C2668zoa(readStrongBinder3);
                }
                a(xoa);
                parcel2.writeNoException();
                return true;
            case 21:
                IBinder readStrongBinder4 = parcel.readStrongBinder();
                if (readStrongBinder4 != null) {
                    IInterface queryLocalInterface4 = readStrongBinder4.queryLocalInterface("com.google.android.gms.ads.internal.client.ICorrelationIdProvider");
                    _oa = queryLocalInterface4 instanceof _oa ? (_oa) queryLocalInterface4 : new Zoa(readStrongBinder4);
                }
                a(_oa);
                parcel2.writeNoException();
                return true;
            case 22:
                d(C1756mga.a(parcel));
                parcel2.writeNoException();
                return true;
            case 23:
                z = q();
                parcel2.writeNoException();
                C1756mga.a(parcel2, z);
                return true;
            case 24:
                a(AbstractBinderC2517xi.a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case 25:
                c(parcel.readString());
                parcel2.writeNoException();
                return true;
            case 26:
                iInterface = getVideoController();
                parcel2.writeNoException();
                C1756mga.a(parcel2, iInterface);
                return true;
            case 29:
                a((C1028c) C1756mga.a(parcel, C1028c.CREATOR));
                parcel2.writeNoException();
                return true;
            case 30:
                a((Dpa) C1756mga.a(parcel, Dpa.CREATOR));
                parcel2.writeNoException();
                return true;
            case 31:
                str = zb();
                parcel2.writeNoException();
                parcel2.writeString(str);
                return true;
            case 32:
                iInterface = Fa();
                parcel2.writeNoException();
                C1756mga.a(parcel2, iInterface);
                return true;
            case 33:
                iInterface = Qa();
                parcel2.writeNoException();
                C1756mga.a(parcel2, iInterface);
                return true;
            case 34:
                a(C1756mga.a(parcel));
                parcel2.writeNoException();
                return true;
            case 35:
                str = Z();
                parcel2.writeNoException();
                parcel2.writeString(str);
                return true;
            case 36:
                IBinder readStrongBinder5 = parcel.readStrongBinder();
                if (readStrongBinder5 != null) {
                    IInterface queryLocalInterface5 = readStrongBinder5.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdMetadataListener");
                    ooa = queryLocalInterface5 instanceof Ooa ? (Ooa) queryLocalInterface5 : new Roa(readStrongBinder5);
                }
                a(ooa);
                parcel2.writeNoException();
                return true;
            case 37:
                parcelable = I();
                parcel2.writeNoException();
                C1756mga.b(parcel2, parcelable);
                return true;
            case 38:
                e(parcel.readString());
                parcel2.writeNoException();
                return true;
            case 39:
                a((C1496ioa) C1756mga.a(parcel, C1496ioa.CREATOR));
                parcel2.writeNoException();
                return true;
            case 40:
                a(AbstractBinderC1080cma.a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case 41:
                iInterface = C();
                parcel2.writeNoException();
                C1756mga.a(parcel2, iInterface);
                return true;
            case 42:
                IBinder readStrongBinder6 = parcel.readStrongBinder();
                if (readStrongBinder6 != null) {
                    IInterface queryLocalInterface6 = readStrongBinder6.queryLocalInterface("com.google.android.gms.ads.internal.client.IOnPaidEventListener");
                    rpa = queryLocalInterface6 instanceof AbstractC2118rpa ? (AbstractC2118rpa) queryLocalInterface6 : new C2256tpa(readStrongBinder6);
                }
                a(rpa);
                parcel2.writeNoException();
                return true;
        }
    }
}
