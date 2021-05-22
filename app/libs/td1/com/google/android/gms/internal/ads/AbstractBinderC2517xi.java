package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: com.google.android.gms.internal.ads.xi  reason: case insensitive filesystem */
public abstract class AbstractBinderC2517xi extends BinderC1618kga implements AbstractC2586yi {
    public AbstractBinderC2517xi() {
        super("com.google.android.gms.ads.internal.reward.client.IRewardedVideoAdListener");
    }

    public static AbstractC2586yi a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.reward.client.IRewardedVideoAdListener");
        return queryLocalInterface instanceof AbstractC2586yi ? (AbstractC2586yi) queryLocalInterface : new C0196Ai(iBinder);
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.BinderC1618kga
    public final boolean a(int i, Parcel parcel, Parcel parcel2, int i2) {
        AbstractC1897oi oiVar;
        switch (i) {
            case 1:
                U();
                break;
            case 2:
                S();
                break;
            case 3:
                f();
                break;
            case 4:
                R();
                break;
            case 5:
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder == null) {
                    oiVar = null;
                } else {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.reward.client.IRewardItem");
                    oiVar = queryLocalInterface instanceof AbstractC1897oi ? (AbstractC1897oi) queryLocalInterface : new C2035qi(readStrongBinder);
                }
                a(oiVar);
                break;
            case 6:
                K();
                break;
            case 7:
                d(parcel.readInt());
                break;
            case 8:
                g();
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}
