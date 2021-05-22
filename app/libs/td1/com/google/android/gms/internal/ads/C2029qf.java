package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: com.google.android.gms.internal.ads.qf  reason: case insensitive filesystem */
public final class C2029qf extends C1687lga implements AbstractC1891of {
    C2029qf(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.IAdapterCreator");
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1891of
    public final AbstractC1960pf C(String str) {
        AbstractC1960pf pfVar;
        Parcel Jb = Jb();
        Jb.writeString(str);
        Parcel a2 = a(1, Jb);
        IBinder readStrongBinder = a2.readStrongBinder();
        if (readStrongBinder == null) {
            pfVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
            pfVar = queryLocalInterface instanceof AbstractC1960pf ? (AbstractC1960pf) queryLocalInterface : new C2097rf(readStrongBinder);
        }
        a2.recycle();
        return pfVar;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1891of
    public final AbstractC1755mg k(String str) {
        Parcel Jb = Jb();
        Jb.writeString(str);
        Parcel a2 = a(3, Jb);
        AbstractC1755mg a3 = AbstractBinderC1686lg.a(a2.readStrongBinder());
        a2.recycle();
        return a3;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1891of
    public final boolean q(String str) {
        Parcel Jb = Jb();
        Jb.writeString(str);
        Parcel a2 = a(2, Jb);
        boolean a3 = C1756mga.a(a2);
        a2.recycle();
        return a3;
    }
}
