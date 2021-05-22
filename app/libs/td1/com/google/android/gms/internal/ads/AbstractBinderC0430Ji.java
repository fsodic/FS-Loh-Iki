package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import b.c.b.a.c.a;

/* renamed from: com.google.android.gms.internal.ads.Ji  reason: case insensitive filesystem */
public abstract class AbstractBinderC0430Ji extends BinderC1618kga implements AbstractC0326Fi {
    public AbstractBinderC0430Ji() {
        super("com.google.android.gms.ads.internal.reward.mediation.client.IMediationRewardedVideoAdListener");
    }

    public static AbstractC0326Fi a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.reward.mediation.client.IMediationRewardedVideoAdListener");
        return queryLocalInterface instanceof AbstractC0326Fi ? (AbstractC0326Fi) queryLocalInterface : new C0378Hi(iBinder);
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.BinderC1618kga
    public final boolean a(int i, Parcel parcel, Parcel parcel2, int i2) {
        switch (i) {
            case 1:
                u(a.AbstractBinderC0013a.a(parcel.readStrongBinder()));
                break;
            case 2:
                b(a.AbstractBinderC0013a.a(parcel.readStrongBinder()), parcel.readInt());
                break;
            case 3:
                h(a.AbstractBinderC0013a.a(parcel.readStrongBinder()));
                break;
            case 4:
                j(a.AbstractBinderC0013a.a(parcel.readStrongBinder()));
                break;
            case 5:
                J(a.AbstractBinderC0013a.a(parcel.readStrongBinder()));
                break;
            case 6:
                N(a.AbstractBinderC0013a.a(parcel.readStrongBinder()));
                break;
            case 7:
                a(a.AbstractBinderC0013a.a(parcel.readStrongBinder()), (C0456Ki) C1756mga.a(parcel, C0456Ki.CREATOR));
                break;
            case 8:
                y(a.AbstractBinderC0013a.a(parcel.readStrongBinder()));
                break;
            case 9:
                c(a.AbstractBinderC0013a.a(parcel.readStrongBinder()), parcel.readInt());
                break;
            case 10:
                D(a.AbstractBinderC0013a.a(parcel.readStrongBinder()));
                break;
            case 11:
                n(a.AbstractBinderC0013a.a(parcel.readStrongBinder()));
                break;
            case 12:
                a((Bundle) C1756mga.a(parcel, Bundle.CREATOR));
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}
