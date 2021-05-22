package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import b.c.b.a.c.a;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.Ff  reason: case insensitive filesystem */
public final class C0323Ff extends C1687lga implements AbstractC0271Df {
    C0323Ff(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.INativeContentAdMapper");
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0271Df
    public final String D() {
        Parcel a2 = a(7, Jb());
        String readString = a2.readString();
        a2.recycle();
        return readString;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0271Df
    public final boolean L() {
        Parcel a2 = a(11, Jb());
        boolean a3 = C1756mga.a(a2);
        a2.recycle();
        return a3;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0271Df
    public final a M() {
        Parcel a2 = a(20, Jb());
        a a3 = a.AbstractBinderC0013a.a(a2.readStrongBinder());
        a2.recycle();
        return a3;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0271Df
    public final a O() {
        Parcel a2 = a(15, Jb());
        a a3 = a.AbstractBinderC0013a.a(a2.readStrongBinder());
        a2.recycle();
        return a3;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0271Df
    public final boolean T() {
        Parcel a2 = a(12, Jb());
        boolean a3 = C1756mga.a(a2);
        a2.recycle();
        return a3;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0271Df
    public final void a(a aVar) {
        Parcel Jb = Jb();
        C1756mga.a(Jb, aVar);
        b(14, Jb);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0271Df
    public final void a(a aVar, a aVar2, a aVar3) {
        Parcel Jb = Jb();
        C1756mga.a(Jb, aVar);
        C1756mga.a(Jb, aVar2);
        C1756mga.a(Jb, aVar3);
        b(22, Jb);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0271Df
    public final void b(a aVar) {
        Parcel Jb = Jb();
        C1756mga.a(Jb, aVar);
        b(9, Jb);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0271Df
    public final void d(a aVar) {
        Parcel Jb = Jb();
        C1756mga.a(Jb, aVar);
        b(10, Jb);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0271Df
    public final Bundle getExtras() {
        Parcel a2 = a(13, Jb());
        Bundle bundle = (Bundle) C1756mga.a(a2, Bundle.CREATOR);
        a2.recycle();
        return bundle;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0271Df
    public final AbstractC2532xpa getVideoController() {
        Parcel a2 = a(16, Jb());
        AbstractC2532xpa a3 = AbstractBinderC2463wpa.a(a2.readStrongBinder());
        a2.recycle();
        return a3;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0271Df
    public final AbstractC0812Ya ja() {
        Parcel a2 = a(5, Jb());
        AbstractC0812Ya a3 = AbstractBinderC0786Xa.a(a2.readStrongBinder());
        a2.recycle();
        return a3;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0271Df
    public final String l() {
        Parcel a2 = a(2, Jb());
        String readString = a2.readString();
        a2.recycle();
        return readString;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0271Df
    public final a m() {
        Parcel a2 = a(21, Jb());
        a a3 = a.AbstractBinderC0013a.a(a2.readStrongBinder());
        a2.recycle();
        return a3;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0271Df
    public final AbstractC0630Ra n() {
        Parcel a2 = a(19, Jb());
        AbstractC0630Ra a3 = AbstractBinderC0604Qa.a(a2.readStrongBinder());
        a2.recycle();
        return a3;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0271Df
    public final String o() {
        Parcel a2 = a(6, Jb());
        String readString = a2.readString();
        a2.recycle();
        return readString;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0271Df
    public final String s() {
        Parcel a2 = a(4, Jb());
        String readString = a2.readString();
        a2.recycle();
        return readString;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0271Df
    public final List t() {
        Parcel a2 = a(3, Jb());
        ArrayList b2 = C1756mga.b(a2);
        a2.recycle();
        return b2;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0271Df
    public final void u() {
        b(8, Jb());
    }
}
