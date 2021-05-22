package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.ads.b.j;

public abstract class Hoa extends BinderC1618kga implements Eoa {
    public Hoa() {
        super("com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.BinderC1618kga
    public final boolean a(int i, Parcel parcel, Parcel parcel2, int i2) {
        AbstractC2599yoa yoa = null;
        _oa _oa = null;
        switch (i) {
            case 1:
                Doa sb = sb();
                parcel2.writeNoException();
                C1756mga.a(parcel2, sb);
                return true;
            case 2:
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdListener");
                    yoa = queryLocalInterface instanceof AbstractC2599yoa ? (AbstractC2599yoa) queryLocalInterface : new Aoa(readStrongBinder);
                }
                a(yoa);
                break;
            case 3:
                a(AbstractBinderC2365vb.a(parcel.readStrongBinder()));
                break;
            case 4:
                a(AbstractBinderC0189Ab.a(parcel.readStrongBinder()));
                break;
            case 5:
                a(parcel.readString(), AbstractBinderC0371Hb.a(parcel.readStrongBinder()), AbstractBinderC0215Bb.a(parcel.readStrongBinder()));
                break;
            case 6:
                a((C0578Pa) C1756mga.a(parcel, C0578Pa.CREATOR));
                break;
            case 7:
                IBinder readStrongBinder2 = parcel.readStrongBinder();
                if (readStrongBinder2 != null) {
                    IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.client.ICorrelationIdProvider");
                    _oa = queryLocalInterface2 instanceof _oa ? (_oa) queryLocalInterface2 : new Zoa(readStrongBinder2);
                }
                b(_oa);
                break;
            case 8:
                a(AbstractBinderC0449Kb.a(parcel.readStrongBinder()), (C1015boa) C1756mga.a(parcel, C1015boa.CREATOR));
                break;
            case 9:
                a((j) C1756mga.a(parcel, j.CREATOR));
                break;
            case 10:
                a(AbstractBinderC0579Pb.a(parcel.readStrongBinder()));
                break;
            case 11:
            case 12:
            default:
                return false;
            case 13:
                a((C1956pd) C1756mga.a(parcel, C1956pd.CREATOR));
                break;
            case 14:
                a(AbstractBinderC2645zd.a(parcel.readStrongBinder()));
                break;
        }
        parcel2.writeNoException();
        return true;
    }
}
