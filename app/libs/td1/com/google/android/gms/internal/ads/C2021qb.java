package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import b.c.b.a.c.a;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.qb  reason: case insensitive filesystem */
public final class C2021qb extends C1687lga implements AbstractC1883ob {
    C2021qb(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.INativeContentAd");
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1883ob
    public final String D() {
        Parcel a2 = a(8, Jb());
        String readString = a2.readString();
        a2.recycle();
        return readString;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1883ob
    public final AbstractC2532xpa getVideoController() {
        Parcel a2 = a(11, Jb());
        AbstractC2532xpa a3 = AbstractBinderC2463wpa.a(a2.readStrongBinder());
        a2.recycle();
        return a3;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1883ob
    public final AbstractC0812Ya ja() {
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

    @Override // com.google.android.gms.internal.ads.AbstractC1883ob
    public final String l() {
        Parcel a2 = a(3, Jb());
        String readString = a2.readString();
        a2.recycle();
        return readString;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1883ob
    public final AbstractC0630Ra n() {
        AbstractC0630Ra ra;
        Parcel a2 = a(15, Jb());
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

    @Override // com.google.android.gms.internal.ads.AbstractC1883ob
    public final String o() {
        Parcel a2 = a(7, Jb());
        String readString = a2.readString();
        a2.recycle();
        return readString;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1883ob
    public final String s() {
        Parcel a2 = a(5, Jb());
        String readString = a2.readString();
        a2.recycle();
        return readString;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1883ob
    public final List t() {
        Parcel a2 = a(4, Jb());
        ArrayList b2 = C1756mga.b(a2);
        a2.recycle();
        return b2;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1883ob
    public final a z() {
        Parcel a2 = a(2, Jb());
        a a3 = a.AbstractBinderC0013a.a(a2.readStrongBinder());
        a2.recycle();
        return a3;
    }
}
