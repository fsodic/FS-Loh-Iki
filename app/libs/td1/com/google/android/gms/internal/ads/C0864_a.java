package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.IBinder;
import android.os.Parcel;
import b.c.b.a.c.a;

/* renamed from: com.google.android.gms.internal.ads._a  reason: case insensitive filesystem */
public final class C0864_a extends C1687lga implements AbstractC0812Ya {
    C0864_a(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.INativeAdImage");
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0812Ya
    public final a Ja() {
        Parcel a2 = a(1, Jb());
        a a3 = a.AbstractBinderC0013a.a(a2.readStrongBinder());
        a2.recycle();
        return a3;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0812Ya
    public final double Ya() {
        Parcel a2 = a(3, Jb());
        double readDouble = a2.readDouble();
        a2.recycle();
        return readDouble;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0812Ya
    public final int getHeight() {
        Parcel a2 = a(5, Jb());
        int readInt = a2.readInt();
        a2.recycle();
        return readInt;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0812Ya
    public final Uri getUri() {
        Parcel a2 = a(2, Jb());
        Uri uri = (Uri) C1756mga.a(a2, Uri.CREATOR);
        a2.recycle();
        return uri;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0812Ya
    public final int getWidth() {
        Parcel a2 = a(4, Jb());
        int readInt = a2.readInt();
        a2.recycle();
        return readInt;
    }
}
