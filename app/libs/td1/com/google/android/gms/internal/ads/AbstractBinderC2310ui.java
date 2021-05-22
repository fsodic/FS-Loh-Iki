package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import b.c.b.a.c.a;

/* renamed from: com.google.android.gms.internal.ads.ui  reason: case insensitive filesystem */
public abstract class AbstractBinderC2310ui extends BinderC1618kga implements AbstractC2103ri {
    public AbstractBinderC2310ui() {
        super("com.google.android.gms.ads.internal.reward.client.IRewardedVideoAd");
    }

    public static AbstractC2103ri a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.reward.client.IRewardedVideoAd");
        return queryLocalInterface instanceof AbstractC2103ri ? (AbstractC2103ri) queryLocalInterface : new C2241ti(iBinder);
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.BinderC1618kga
    public final boolean a(int i, Parcel parcel, Parcel parcel2, int i2) {
        boolean z;
        if (i == 1) {
            a((C0300Ei) C1756mga.a(parcel, C0300Ei.CREATOR));
        } else if (i != 2) {
            AbstractC2586yi yiVar = null;
            AbstractC1966pi piVar = null;
            if (i == 3) {
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.reward.client.IRewardedVideoAdListener");
                    yiVar = queryLocalInterface instanceof AbstractC2586yi ? (AbstractC2586yi) queryLocalInterface : new C0196Ai(readStrongBinder);
                }
                a(yiVar);
            } else if (i != 34) {
                switch (i) {
                    case 5:
                        z = aa();
                        parcel2.writeNoException();
                        C1756mga.a(parcel2, z);
                        break;
                    case 6:
                        pause();
                        break;
                    case 7:
                        resume();
                        break;
                    case 8:
                        destroy();
                        break;
                    case 9:
                        E(a.AbstractBinderC0013a.a(parcel.readStrongBinder()));
                        break;
                    case 10:
                        z(a.AbstractBinderC0013a.a(parcel.readStrongBinder()));
                        break;
                    case 11:
                        O(a.AbstractBinderC0013a.a(parcel.readStrongBinder()));
                        break;
                    case 12:
                        String k = k();
                        parcel2.writeNoException();
                        parcel2.writeString(k);
                        break;
                    case 13:
                        c(parcel.readString());
                        break;
                    case 14:
                        a(Soa.a(parcel.readStrongBinder()));
                        break;
                    case 15:
                        Bundle I = I();
                        parcel2.writeNoException();
                        C1756mga.b(parcel2, I);
                        break;
                    case 16:
                        IBinder readStrongBinder2 = parcel.readStrongBinder();
                        if (readStrongBinder2 != null) {
                            IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.reward.client.IRewardedAdSkuListener");
                            piVar = queryLocalInterface2 instanceof AbstractC1966pi ? (AbstractC1966pi) queryLocalInterface2 : new C2172si(readStrongBinder2);
                        }
                        a(piVar);
                        break;
                    case 17:
                        u(parcel.readString());
                        break;
                    case 18:
                        C(a.AbstractBinderC0013a.a(parcel.readStrongBinder()));
                        break;
                    case 19:
                        B(parcel.readString());
                        break;
                    case 20:
                        z = Aa();
                        parcel2.writeNoException();
                        C1756mga.a(parcel2, z);
                        break;
                    case 21:
                        AbstractC2187spa C = C();
                        parcel2.writeNoException();
                        C1756mga.a(parcel2, C);
                        break;
                    default:
                        return false;
                }
                return true;
            } else {
                a(C1756mga.a(parcel));
            }
        } else {
            Za();
        }
        parcel2.writeNoException();
        return true;
    }
}
