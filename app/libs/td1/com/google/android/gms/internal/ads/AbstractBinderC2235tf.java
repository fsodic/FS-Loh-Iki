package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: com.google.android.gms.internal.ads.tf  reason: case insensitive filesystem */
public abstract class AbstractBinderC2235tf extends BinderC1618kga implements AbstractC2304uf {
    public AbstractBinderC2235tf() {
        super("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
    }

    public static AbstractC2304uf a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
        return queryLocalInterface instanceof AbstractC2304uf ? (AbstractC2304uf) queryLocalInterface : new C2442wf(iBinder);
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.BinderC1618kga
    public final boolean a(int i, Parcel parcel, Parcel parcel2, int i2) {
        AbstractC2373vf vfVar;
        switch (i) {
            case 1:
                e();
                break;
            case 2:
                j();
                break;
            case 3:
                c(parcel.readInt());
                break;
            case 4:
                i();
                break;
            case 5:
                h();
                break;
            case 6:
                a();
                break;
            case 7:
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder == null) {
                    vfVar = null;
                } else {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationResponseMetadata");
                    vfVar = queryLocalInterface instanceof AbstractC2373vf ? (AbstractC2373vf) queryLocalInterface : new C2649zf(readStrongBinder);
                }
                a(vfVar);
                break;
            case 8:
                b();
                break;
            case 9:
                a(parcel.readString(), parcel.readString());
                break;
            case 10:
                a(AbstractBinderC2089rb.a(parcel.readStrongBinder()), parcel.readString());
                break;
            case 11:
                Y();
                break;
            case 12:
                f(parcel.readString());
                break;
            case 13:
                Xa();
                break;
            case 14:
                a((C0456Ki) C1756mga.a(parcel, C0456Ki.CREATOR));
                break;
            case 15:
                X();
                break;
            case 16:
                a(AbstractBinderC0586Pi.a(parcel.readStrongBinder()));
                break;
            case 17:
                m(parcel.readInt());
                break;
            case 18:
                Na();
                break;
            case 19:
                a((Bundle) C1756mga.a(parcel, Bundle.CREATOR));
                break;
            case 20:
                ea();
                break;
            case 21:
                h(parcel.readString());
                break;
            case 22:
                b(parcel.readInt(), parcel.readString());
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}
