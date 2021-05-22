package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import b.c.b.a.c.a;

public final class RT extends C1687lga implements QT {
    RT(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.omid.IOmid");
    }

    @Override // com.google.android.gms.internal.ads.QT
    public final void A(a aVar) {
        Parcel Jb = Jb();
        C1756mga.a(Jb, aVar);
        b(7, Jb);
    }

    @Override // com.google.android.gms.internal.ads.QT
    public final boolean F(a aVar) {
        Parcel Jb = Jb();
        C1756mga.a(Jb, aVar);
        Parcel a2 = a(2, Jb);
        boolean a3 = C1756mga.a(a2);
        a2.recycle();
        return a3;
    }

    @Override // com.google.android.gms.internal.ads.QT
    public final void P(a aVar) {
        Parcel Jb = Jb();
        C1756mga.a(Jb, aVar);
        b(4, Jb);
    }

    @Override // com.google.android.gms.internal.ads.QT
    public final a a(String str, a aVar, String str2, String str3, String str4, String str5) {
        Parcel Jb = Jb();
        Jb.writeString(str);
        C1756mga.a(Jb, aVar);
        Jb.writeString(str2);
        Jb.writeString(str3);
        Jb.writeString(str4);
        Jb.writeString(str5);
        Parcel a2 = a(9, Jb);
        a a3 = a.AbstractBinderC0013a.a(a2.readStrongBinder());
        a2.recycle();
        return a3;
    }

    @Override // com.google.android.gms.internal.ads.QT
    public final void a(a aVar, a aVar2) {
        Parcel Jb = Jb();
        C1756mga.a(Jb, aVar);
        C1756mga.a(Jb, aVar2);
        b(8, Jb);
    }

    @Override // com.google.android.gms.internal.ads.QT
    public final void b(a aVar, a aVar2) {
        Parcel Jb = Jb();
        C1756mga.a(Jb, aVar);
        C1756mga.a(Jb, aVar2);
        b(5, Jb);
    }

    @Override // com.google.android.gms.internal.ads.QT
    public final String getVersion() {
        Parcel a2 = a(6, Jb());
        String readString = a2.readString();
        a2.recycle();
        return readString;
    }
}
