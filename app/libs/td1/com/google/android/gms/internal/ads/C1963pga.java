package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import b.c.b.a.c.a;

/* renamed from: com.google.android.gms.internal.ads.pga  reason: case insensitive filesystem */
public final class C1963pga extends C1687lga implements AbstractC1894oga {
    C1963pga(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.clearcut.IClearcut");
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1894oga
    public final void Ta() {
        b(3, Jb());
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1894oga
    public final void a(int i) {
        Parcel Jb = Jb();
        Jb.writeInt(i);
        b(6, Jb);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1894oga
    public final void a(a aVar, String str, String str2) {
        Parcel Jb = Jb();
        C1756mga.a(Jb, aVar);
        Jb.writeString(str);
        Jb.writeString(null);
        b(8, Jb);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1894oga
    public final void a(byte[] bArr) {
        Parcel Jb = Jb();
        Jb.writeByteArray(bArr);
        b(5, Jb);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1894oga
    public final void a(int[] iArr) {
        Parcel Jb = Jb();
        Jb.writeIntArray(null);
        b(4, Jb);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1894oga
    public final void b(a aVar, String str) {
        Parcel Jb = Jb();
        C1756mga.a(Jb, aVar);
        Jb.writeString(str);
        b(2, Jb);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1894oga
    public final void e(int i) {
        Parcel Jb = Jb();
        Jb.writeInt(i);
        b(7, Jb);
    }
}
