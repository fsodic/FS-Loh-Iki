package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import b.c.b.a.c.a;

/* renamed from: com.google.android.gms.internal.ads.sf  reason: case insensitive filesystem */
public abstract class AbstractBinderC2166sf extends BinderC1618kga implements AbstractC1960pf {
    public AbstractBinderC2166sf() {
        super("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.BinderC1618kga
    public final boolean a(int i, Parcel parcel, Parcel parcel2, int i2) {
        IInterface iInterface;
        boolean z;
        Parcelable parcelable;
        AbstractC2304uf ufVar = null;
        switch (i) {
            case 1:
                a a2 = a.AbstractBinderC0013a.a(parcel.readStrongBinder());
                C1015boa boa = (C1015boa) C1756mga.a(parcel, C1015boa.CREATOR);
                Zna zna = (Zna) C1756mga.a(parcel, Zna.CREATOR);
                String readString = parcel.readString();
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    ufVar = queryLocalInterface instanceof AbstractC2304uf ? (AbstractC2304uf) queryLocalInterface : new C2442wf(readStrongBinder);
                }
                a(a2, boa, zna, readString, ufVar);
                parcel2.writeNoException();
                return true;
            case 2:
                iInterface = xb();
                parcel2.writeNoException();
                C1756mga.a(parcel2, iInterface);
                return true;
            case 3:
                a a3 = a.AbstractBinderC0013a.a(parcel.readStrongBinder());
                Zna zna2 = (Zna) C1756mga.a(parcel, Zna.CREATOR);
                String readString2 = parcel.readString();
                IBinder readStrongBinder2 = parcel.readStrongBinder();
                if (readStrongBinder2 != null) {
                    IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    ufVar = queryLocalInterface2 instanceof AbstractC2304uf ? (AbstractC2304uf) queryLocalInterface2 : new C2442wf(readStrongBinder2);
                }
                a(a3, zna2, readString2, ufVar);
                parcel2.writeNoException();
                return true;
            case 4:
                showInterstitial();
                parcel2.writeNoException();
                return true;
            case 5:
                destroy();
                parcel2.writeNoException();
                return true;
            case 6:
                a a4 = a.AbstractBinderC0013a.a(parcel.readStrongBinder());
                C1015boa boa2 = (C1015boa) C1756mga.a(parcel, C1015boa.CREATOR);
                Zna zna3 = (Zna) C1756mga.a(parcel, Zna.CREATOR);
                String readString3 = parcel.readString();
                String readString4 = parcel.readString();
                IBinder readStrongBinder3 = parcel.readStrongBinder();
                if (readStrongBinder3 != null) {
                    IInterface queryLocalInterface3 = readStrongBinder3.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    ufVar = queryLocalInterface3 instanceof AbstractC2304uf ? (AbstractC2304uf) queryLocalInterface3 : new C2442wf(readStrongBinder3);
                }
                a(a4, boa2, zna3, readString3, readString4, ufVar);
                parcel2.writeNoException();
                return true;
            case 7:
                a a5 = a.AbstractBinderC0013a.a(parcel.readStrongBinder());
                Zna zna4 = (Zna) C1756mga.a(parcel, Zna.CREATOR);
                String readString5 = parcel.readString();
                String readString6 = parcel.readString();
                IBinder readStrongBinder4 = parcel.readStrongBinder();
                if (readStrongBinder4 != null) {
                    IInterface queryLocalInterface4 = readStrongBinder4.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    ufVar = queryLocalInterface4 instanceof AbstractC2304uf ? (AbstractC2304uf) queryLocalInterface4 : new C2442wf(readStrongBinder4);
                }
                a(a5, zna4, readString5, readString6, ufVar);
                parcel2.writeNoException();
                return true;
            case 8:
                pause();
                parcel2.writeNoException();
                return true;
            case 9:
                resume();
                parcel2.writeNoException();
                return true;
            case 10:
                a(a.AbstractBinderC0013a.a(parcel.readStrongBinder()), (Zna) C1756mga.a(parcel, Zna.CREATOR), parcel.readString(), AbstractBinderC0430Ji.a(parcel.readStrongBinder()), parcel.readString());
                parcel2.writeNoException();
                return true;
            case 11:
                a((Zna) C1756mga.a(parcel, Zna.CREATOR), parcel.readString());
                parcel2.writeNoException();
                return true;
            case 12:
                showVideo();
                parcel2.writeNoException();
                return true;
            case 13:
                z = isInitialized();
                parcel2.writeNoException();
                C1756mga.a(parcel2, z);
                return true;
            case 14:
                a a6 = a.AbstractBinderC0013a.a(parcel.readStrongBinder());
                Zna zna5 = (Zna) C1756mga.a(parcel, Zna.CREATOR);
                String readString7 = parcel.readString();
                String readString8 = parcel.readString();
                IBinder readStrongBinder5 = parcel.readStrongBinder();
                if (readStrongBinder5 != null) {
                    IInterface queryLocalInterface5 = readStrongBinder5.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    ufVar = queryLocalInterface5 instanceof AbstractC2304uf ? (AbstractC2304uf) queryLocalInterface5 : new C2442wf(readStrongBinder5);
                }
                a(a6, zna5, readString7, readString8, ufVar, (C0578Pa) C1756mga.a(parcel, C0578Pa.CREATOR), parcel.createStringArrayList());
                parcel2.writeNoException();
                return true;
            case 15:
                iInterface = nb();
                parcel2.writeNoException();
                C1756mga.a(parcel2, iInterface);
                return true;
            case 16:
                iInterface = bb();
                parcel2.writeNoException();
                C1756mga.a(parcel2, iInterface);
                return true;
            case 17:
                parcelable = zztm();
                parcel2.writeNoException();
                C1756mga.b(parcel2, parcelable);
                return true;
            case 18:
                parcelable = getInterstitialAdapterInfo();
                parcel2.writeNoException();
                C1756mga.b(parcel2, parcelable);
                return true;
            case 19:
                parcelable = Ha();
                parcel2.writeNoException();
                C1756mga.b(parcel2, parcelable);
                return true;
            case 20:
                a((Zna) C1756mga.a(parcel, Zna.CREATOR), parcel.readString(), parcel.readString());
                parcel2.writeNoException();
                return true;
            case 21:
                x(a.AbstractBinderC0013a.a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case 22:
                z = sa();
                parcel2.writeNoException();
                C1756mga.a(parcel2, z);
                return true;
            case 23:
                a(a.AbstractBinderC0013a.a(parcel.readStrongBinder()), AbstractBinderC0430Ji.a(parcel.readStrongBinder()), parcel.createStringArrayList());
                parcel2.writeNoException();
                return true;
            case 24:
                iInterface = ka();
                parcel2.writeNoException();
                C1756mga.a(parcel2, iInterface);
                return true;
            case 25:
                a(C1756mga.a(parcel));
                parcel2.writeNoException();
                return true;
            case 26:
                iInterface = getVideoController();
                parcel2.writeNoException();
                C1756mga.a(parcel2, iInterface);
                return true;
            case 27:
                iInterface = Cb();
                parcel2.writeNoException();
                C1756mga.a(parcel2, iInterface);
                return true;
            case 28:
                a a7 = a.AbstractBinderC0013a.a(parcel.readStrongBinder());
                Zna zna6 = (Zna) C1756mga.a(parcel, Zna.CREATOR);
                String readString9 = parcel.readString();
                IBinder readStrongBinder6 = parcel.readStrongBinder();
                if (readStrongBinder6 != null) {
                    IInterface queryLocalInterface6 = readStrongBinder6.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    ufVar = queryLocalInterface6 instanceof AbstractC2304uf ? (AbstractC2304uf) queryLocalInterface6 : new C2442wf(readStrongBinder6);
                }
                b(a7, zna6, readString9, ufVar);
                parcel2.writeNoException();
                return true;
            case 29:
            default:
                return false;
            case 30:
                K(a.AbstractBinderC0013a.a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case 31:
                a(a.AbstractBinderC0013a.a(parcel.readStrongBinder()), AbstractBinderC1474id.a(parcel.readStrongBinder()), parcel.createTypedArrayList(C1818nd.CREATOR));
                parcel2.writeNoException();
                return true;
            case 32:
                a a8 = a.AbstractBinderC0013a.a(parcel.readStrongBinder());
                Zna zna7 = (Zna) C1756mga.a(parcel, Zna.CREATOR);
                String readString10 = parcel.readString();
                IBinder readStrongBinder7 = parcel.readStrongBinder();
                if (readStrongBinder7 != null) {
                    IInterface queryLocalInterface7 = readStrongBinder7.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    ufVar = queryLocalInterface7 instanceof AbstractC2304uf ? (AbstractC2304uf) queryLocalInterface7 : new C2442wf(readStrongBinder7);
                }
                c(a8, zna7, readString10, ufVar);
                parcel2.writeNoException();
                return true;
            case 33:
                parcelable = fa();
                parcel2.writeNoException();
                C1756mga.b(parcel2, parcelable);
                return true;
            case 34:
                parcelable = da();
                parcel2.writeNoException();
                C1756mga.b(parcel2, parcelable);
                return true;
        }
    }
}
