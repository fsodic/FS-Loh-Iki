package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import b.c.b.a.c.a;

public final class Noa extends C1687lga implements Loa {
    Noa(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAdManager");
    }

    @Override // com.google.android.gms.internal.ads.Loa
    public final a Ab() {
        Parcel a2 = a(1, Jb());
        a a3 = a.AbstractBinderC0013a.a(a2.readStrongBinder());
        a2.recycle();
        return a3;
    }

    @Override // com.google.android.gms.internal.ads.Loa
    public final AbstractC2187spa C() {
        AbstractC2187spa spa;
        Parcel a2 = a(41, Jb());
        IBinder readStrongBinder = a2.readStrongBinder();
        if (readStrongBinder == null) {
            spa = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IResponseInfo");
            spa = queryLocalInterface instanceof AbstractC2187spa ? (AbstractC2187spa) queryLocalInterface : new C2325upa(readStrongBinder);
        }
        a2.recycle();
        return spa;
    }

    @Override // com.google.android.gms.internal.ads.Loa
    public final Bundle I() {
        Parcel a2 = a(37, Jb());
        Bundle bundle = (Bundle) C1756mga.a(a2, Bundle.CREATOR);
        a2.recycle();
        return bundle;
    }

    @Override // com.google.android.gms.internal.ads.Loa
    public final String Z() {
        Parcel a2 = a(35, Jb());
        String readString = a2.readString();
        a2.recycle();
        return readString;
    }

    @Override // com.google.android.gms.internal.ads.Loa
    public final void a(Ooa ooa) {
        Parcel Jb = Jb();
        C1756mga.a(Jb, ooa);
        b(36, Jb);
    }

    @Override // com.google.android.gms.internal.ads.Loa
    public final void a(S s) {
        Parcel Jb = Jb();
        C1756mga.a(Jb, s);
        b(19, Jb);
    }

    @Override // com.google.android.gms.internal.ads.Loa
    public final void a(Uoa uoa) {
        Parcel Jb = Jb();
        C1756mga.a(Jb, uoa);
        b(8, Jb);
    }

    @Override // com.google.android.gms.internal.ads.Loa
    public final void a(C1015boa boa) {
        Parcel Jb = Jb();
        C1756mga.a(Jb, boa);
        b(13, Jb);
    }

    @Override // com.google.android.gms.internal.ads.Loa
    public final void a(C1028c cVar) {
        Parcel Jb = Jb();
        C1756mga.a(Jb, cVar);
        b(29, Jb);
    }

    @Override // com.google.android.gms.internal.ads.Loa
    public final void a(AbstractC2118rpa rpa) {
        Parcel Jb = Jb();
        C1756mga.a(Jb, rpa);
        b(42, Jb);
    }

    @Override // com.google.android.gms.internal.ads.Loa
    public final void a(AbstractC2530xoa xoa) {
        Parcel Jb = Jb();
        C1756mga.a(Jb, xoa);
        b(20, Jb);
    }

    @Override // com.google.android.gms.internal.ads.Loa
    public final void a(AbstractC2586yi yiVar) {
        Parcel Jb = Jb();
        C1756mga.a(Jb, yiVar);
        b(24, Jb);
    }

    @Override // com.google.android.gms.internal.ads.Loa
    public final void a(boolean z) {
        Parcel Jb = Jb();
        C1756mga.a(Jb, z);
        b(34, Jb);
    }

    @Override // com.google.android.gms.internal.ads.Loa
    public final boolean a(Zna zna) {
        Parcel Jb = Jb();
        C1756mga.a(Jb, zna);
        Parcel a2 = a(4, Jb);
        boolean a3 = C1756mga.a(a2);
        a2.recycle();
        return a3;
    }

    @Override // com.google.android.gms.internal.ads.Loa
    public final void b(AbstractC2599yoa yoa) {
        Parcel Jb = Jb();
        C1756mga.a(Jb, yoa);
        b(7, Jb);
    }

    @Override // com.google.android.gms.internal.ads.Loa
    public final void d(boolean z) {
        Parcel Jb = Jb();
        C1756mga.a(Jb, z);
        b(22, Jb);
    }

    @Override // com.google.android.gms.internal.ads.Loa
    public final void destroy() {
        b(2, Jb());
    }

    @Override // com.google.android.gms.internal.ads.Loa
    public final AbstractC2532xpa getVideoController() {
        AbstractC2532xpa xpa;
        Parcel a2 = a(26, Jb());
        IBinder readStrongBinder = a2.readStrongBinder();
        if (readStrongBinder == null) {
            xpa = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IVideoController");
            xpa = queryLocalInterface instanceof AbstractC2532xpa ? (AbstractC2532xpa) queryLocalInterface : new C2670zpa(readStrongBinder);
        }
        a2.recycle();
        return xpa;
    }

    @Override // com.google.android.gms.internal.ads.Loa
    public final C1015boa ib() {
        Parcel a2 = a(12, Jb());
        C1015boa boa = (C1015boa) C1756mga.a(a2, C1015boa.CREATOR);
        a2.recycle();
        return boa;
    }

    @Override // com.google.android.gms.internal.ads.Loa
    public final boolean p() {
        Parcel a2 = a(3, Jb());
        boolean a3 = C1756mga.a(a2);
        a2.recycle();
        return a3;
    }

    @Override // com.google.android.gms.internal.ads.Loa
    public final void pause() {
        b(5, Jb());
    }

    @Override // com.google.android.gms.internal.ads.Loa
    public final void resume() {
        b(6, Jb());
    }

    @Override // com.google.android.gms.internal.ads.Loa
    public final void showInterstitial() {
        b(9, Jb());
    }

    @Override // com.google.android.gms.internal.ads.Loa
    public final String zb() {
        Parcel a2 = a(31, Jb());
        String readString = a2.readString();
        a2.recycle();
        return readString;
    }
}
