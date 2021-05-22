package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import b.c.b.a.c.a;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.mb  reason: case insensitive filesystem */
public final class C1745mb extends C1687lga implements AbstractC1607kb {
    C1745mb(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.INativeAppInstallAd");
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1607kb
    public final double B() {
        Parcel a2 = a(8, Jb());
        double readDouble = a2.readDouble();
        a2.recycle();
        return readDouble;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1607kb
    public final String E() {
        Parcel a2 = a(9, Jb());
        String readString = a2.readString();
        a2.recycle();
        return readString;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1607kb
    public final AbstractC2532xpa getVideoController() {
        Parcel a2 = a(13, Jb());
        AbstractC2532xpa a3 = AbstractBinderC2463wpa.a(a2.readStrongBinder());
        a2.recycle();
        return a3;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1607kb
    public final String l() {
        Parcel a2 = a(3, Jb());
        String readString = a2.readString();
        a2.recycle();
        return readString;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1607kb
    public final AbstractC0630Ra n() {
        AbstractC0630Ra ra;
        Parcel a2 = a(17, Jb());
        IBinder readStrongBinder = a2.readStrongBinder();
        if (readStrongBinder == null) {
            ra = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IAttributionInfo");
            ra = queryLocalInterface instanceof AbstractC0630Ra ? (AbstractC0630Ra) queryLocalInterface : new C0682Ta(readStrongBinder);
        }
        a2.recycle();
        return ra;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1607kb
    public final String o() {
        Parcel a2 = a(7, Jb());
        String readString = a2.readString();
        a2.recycle();
        return readString;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1607kb
    public final String s() {
        Parcel a2 = a(5, Jb());
        String readString = a2.readString();
        a2.recycle();
        return readString;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1607kb
    public final List t() {
        Parcel a2 = a(4, Jb());
        ArrayList b2 = C1756mga.b(a2);
        a2.recycle();
        return b2;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1607kb
    public final AbstractC0812Ya w() {
        AbstractC0812Ya ya;
        Parcel a2 = a(6, Jb());
        IBinder readStrongBinder = a2.readStrongBinder();
        if (readStrongBinder == null) {
            ya = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdImage");
            ya = queryLocalInterface instanceof AbstractC0812Ya ? (AbstractC0812Ya) queryLocalInterface : new C0864_a(readStrongBinder);
        }
        a2.recycle();
        return ya;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1607kb
    public final String y() {
        Parcel a2 = a(10, Jb());
        String readString = a2.readString();
        a2.recycle();
        return readString;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1607kb
    public final a z() {
        Parcel a2 = a(2, Jb());
        a a3 = a.AbstractBinderC0013a.a(a2.readStrongBinder());
        a2.recycle();
        return a3;
    }
}
