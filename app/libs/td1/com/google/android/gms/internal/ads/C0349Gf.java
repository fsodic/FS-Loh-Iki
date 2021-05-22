package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import b.c.b.a.c.a;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.Gf  reason: case insensitive filesystem */
public final class C0349Gf extends C1687lga implements AbstractC0297Ef {
    C0349Gf(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.IUnifiedNativeAdMapper");
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0297Ef
    public final double B() {
        Parcel a2 = a(8, Jb());
        double readDouble = a2.readDouble();
        a2.recycle();
        return readDouble;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0297Ef
    public final float Ba() {
        Parcel a2 = a(25, Jb());
        float readFloat = a2.readFloat();
        a2.recycle();
        return readFloat;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0297Ef
    public final String D() {
        Parcel a2 = a(7, Jb());
        String readString = a2.readString();
        a2.recycle();
        return readString;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0297Ef
    public final String E() {
        Parcel a2 = a(9, Jb());
        String readString = a2.readString();
        a2.recycle();
        return readString;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0297Ef
    public final float Ea() {
        Parcel a2 = a(24, Jb());
        float readFloat = a2.readFloat();
        a2.recycle();
        return readFloat;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0297Ef
    public final boolean L() {
        Parcel a2 = a(17, Jb());
        boolean a3 = C1756mga.a(a2);
        a2.recycle();
        return a3;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0297Ef
    public final a M() {
        Parcel a2 = a(14, Jb());
        a a3 = a.AbstractBinderC0013a.a(a2.readStrongBinder());
        a2.recycle();
        return a3;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0297Ef
    public final a O() {
        Parcel a2 = a(13, Jb());
        a a3 = a.AbstractBinderC0013a.a(a2.readStrongBinder());
        a2.recycle();
        return a3;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0297Ef
    public final boolean T() {
        Parcel a2 = a(18, Jb());
        boolean a3 = C1756mga.a(a2);
        a2.recycle();
        return a3;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0297Ef
    public final void a(a aVar) {
        Parcel Jb = Jb();
        C1756mga.a(Jb, aVar);
        b(22, Jb);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0297Ef
    public final void a(a aVar, a aVar2, a aVar3) {
        Parcel Jb = Jb();
        C1756mga.a(Jb, aVar);
        C1756mga.a(Jb, aVar2);
        C1756mga.a(Jb, aVar3);
        b(21, Jb);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0297Ef
    public final void b(a aVar) {
        Parcel Jb = Jb();
        C1756mga.a(Jb, aVar);
        b(20, Jb);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0297Ef
    public final Bundle getExtras() {
        Parcel a2 = a(16, Jb());
        Bundle bundle = (Bundle) C1756mga.a(a2, Bundle.CREATOR);
        a2.recycle();
        return bundle;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0297Ef
    public final AbstractC2532xpa getVideoController() {
        Parcel a2 = a(11, Jb());
        AbstractC2532xpa a3 = AbstractBinderC2463wpa.a(a2.readStrongBinder());
        a2.recycle();
        return a3;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0297Ef
    public final String l() {
        Parcel a2 = a(2, Jb());
        String readString = a2.readString();
        a2.recycle();
        return readString;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0297Ef
    public final a m() {
        Parcel a2 = a(15, Jb());
        a a3 = a.AbstractBinderC0013a.a(a2.readStrongBinder());
        a2.recycle();
        return a3;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0297Ef
    public final AbstractC0630Ra n() {
        Parcel a2 = a(12, Jb());
        AbstractC0630Ra a3 = AbstractBinderC0604Qa.a(a2.readStrongBinder());
        a2.recycle();
        return a3;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0297Ef
    public final String o() {
        Parcel a2 = a(6, Jb());
        String readString = a2.readString();
        a2.recycle();
        return readString;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0297Ef
    public final float pa() {
        Parcel a2 = a(23, Jb());
        float readFloat = a2.readFloat();
        a2.recycle();
        return readFloat;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0297Ef
    public final String s() {
        Parcel a2 = a(4, Jb());
        String readString = a2.readString();
        a2.recycle();
        return readString;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0297Ef
    public final List t() {
        Parcel a2 = a(3, Jb());
        ArrayList b2 = C1756mga.b(a2);
        a2.recycle();
        return b2;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0297Ef
    public final void u() {
        b(19, Jb());
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0297Ef
    public final AbstractC0812Ya w() {
        Parcel a2 = a(5, Jb());
        AbstractC0812Ya a3 = AbstractBinderC0786Xa.a(a2.readStrongBinder());
        a2.recycle();
        return a3;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0297Ef
    public final String y() {
        Parcel a2 = a(10, Jb());
        String readString = a2.readString();
        a2.recycle();
        return readString;
    }
}
