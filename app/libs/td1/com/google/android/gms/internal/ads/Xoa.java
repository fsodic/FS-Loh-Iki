package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import b.c.b.a.c.a;

public final class Xoa extends C1687lga implements Voa {
    Xoa(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IClientApi");
    }

    @Override // com.google.android.gms.internal.ads.Voa
    public final Loa a(a aVar, C1015boa boa, String str, int i) {
        Loa loa;
        Parcel Jb = Jb();
        C1756mga.a(Jb, aVar);
        C1756mga.a(Jb, boa);
        Jb.writeString(str);
        Jb.writeInt(i);
        Parcel a2 = a(10, Jb);
        IBinder readStrongBinder = a2.readStrongBinder();
        if (readStrongBinder == null) {
            loa = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
            loa = queryLocalInterface instanceof Loa ? (Loa) queryLocalInterface : new Noa(readStrongBinder);
        }
        a2.recycle();
        return loa;
    }

    @Override // com.google.android.gms.internal.ads.Voa
    public final Eoa b(a aVar, String str, AbstractC1891of ofVar, int i) {
        Eoa eoa;
        Parcel Jb = Jb();
        C1756mga.a(Jb, aVar);
        Jb.writeString(str);
        C1756mga.a(Jb, ofVar);
        Jb.writeInt(i);
        Parcel a2 = a(3, Jb);
        IBinder readStrongBinder = a2.readStrongBinder();
        if (readStrongBinder == null) {
            eoa = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
            eoa = queryLocalInterface instanceof Eoa ? (Eoa) queryLocalInterface : new Goa(readStrongBinder);
        }
        a2.recycle();
        return eoa;
    }

    @Override // com.google.android.gms.internal.ads.Voa
    public final Loa b(a aVar, C1015boa boa, String str, AbstractC1891of ofVar, int i) {
        Loa loa;
        Parcel Jb = Jb();
        C1756mga.a(Jb, aVar);
        C1756mga.a(Jb, boa);
        Jb.writeString(str);
        C1756mga.a(Jb, ofVar);
        Jb.writeInt(i);
        Parcel a2 = a(2, Jb);
        IBinder readStrongBinder = a2.readStrongBinder();
        if (readStrongBinder == null) {
            loa = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
            loa = queryLocalInterface instanceof Loa ? (Loa) queryLocalInterface : new Noa(readStrongBinder);
        }
        a2.recycle();
        return loa;
    }

    @Override // com.google.android.gms.internal.ads.Voa
    public final Loa c(a aVar, C1015boa boa, String str, AbstractC1891of ofVar, int i) {
        Loa loa;
        Parcel Jb = Jb();
        C1756mga.a(Jb, aVar);
        C1756mga.a(Jb, boa);
        Jb.writeString(str);
        C1756mga.a(Jb, ofVar);
        Jb.writeInt(i);
        Parcel a2 = a(1, Jb);
        IBinder readStrongBinder = a2.readStrongBinder();
        if (readStrongBinder == null) {
            loa = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
            loa = queryLocalInterface instanceof Loa ? (Loa) queryLocalInterface : new Noa(readStrongBinder);
        }
        a2.recycle();
        return loa;
    }

    @Override // com.google.android.gms.internal.ads.Voa
    public final AbstractC2103ri c(a aVar, AbstractC1891of ofVar, int i) {
        Parcel Jb = Jb();
        C1756mga.a(Jb, aVar);
        C1756mga.a(Jb, ofVar);
        Jb.writeInt(i);
        Parcel a2 = a(6, Jb);
        AbstractC2103ri a3 = AbstractBinderC2310ui.a(a2.readStrongBinder());
        a2.recycle();
        return a3;
    }

    @Override // com.google.android.gms.internal.ads.Voa
    public final AbstractC1017bpa d(a aVar, int i) {
        AbstractC1017bpa bpa;
        Parcel Jb = Jb();
        C1756mga.a(Jb, aVar);
        Jb.writeInt(i);
        Parcel a2 = a(9, Jb);
        IBinder readStrongBinder = a2.readStrongBinder();
        if (readStrongBinder == null) {
            bpa = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IMobileAdsSettingManager");
            bpa = queryLocalInterface instanceof AbstractC1017bpa ? (AbstractC1017bpa) queryLocalInterface : new C1154dpa(readStrongBinder);
        }
        a2.recycle();
        return bpa;
    }

    @Override // com.google.android.gms.internal.ads.Voa
    public final AbstractC0792Xg w(a aVar) {
        Parcel Jb = Jb();
        C1756mga.a(Jb, aVar);
        Parcel a2 = a(8, Jb);
        AbstractC0792Xg a3 = AbstractBinderC0766Wg.a(a2.readStrongBinder());
        a2.recycle();
        return a3;
    }
}
