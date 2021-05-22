package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import b.c.b.a.c.a;

/* renamed from: com.google.android.gms.internal.ads.ub  reason: case insensitive filesystem */
public final class C2296ub extends C1687lga implements AbstractC2158sb {
    C2296ub(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.INativeCustomTemplateAd");
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2158sb
    public final String J() {
        Parcel a2 = a(4, Jb());
        String readString = a2.readString();
        a2.recycle();
        return readString;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2158sb
    public final boolean v(a aVar) {
        Parcel Jb = Jb();
        C1756mga.a(Jb, aVar);
        Parcel a2 = a(10, Jb);
        boolean a3 = C1756mga.a(a2);
        a2.recycle();
        return a3;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2158sb
    public final a yb() {
        Parcel a2 = a(9, Jb());
        a a3 = a.AbstractBinderC0013a.a(a2.readStrongBinder());
        a2.recycle();
        return a3;
    }
}
