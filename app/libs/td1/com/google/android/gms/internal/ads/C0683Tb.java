package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import b.c.b.a.c.a;

/* renamed from: com.google.android.gms.internal.ads.Tb  reason: case insensitive filesystem */
public final class C0683Tb extends C1687lga implements AbstractC0631Rb {
    C0683Tb(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IShouldDelayBannerRenderingListener");
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0631Rb
    public final boolean I(a aVar) {
        Parcel Jb = Jb();
        C1756mga.a(Jb, aVar);
        Parcel a2 = a(2, Jb);
        boolean a3 = C1756mga.a(a2);
        a2.recycle();
        return a3;
    }
}
