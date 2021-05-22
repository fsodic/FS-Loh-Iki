package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

/* renamed from: com.google.android.gms.internal.ads.tma  reason: case insensitive filesystem */
public final class C2250tma extends C1687lga implements AbstractC2319uma {
    C2250tma(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.cache.ICacheService");
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2319uma
    public final C1837nma a(C1906oma oma) {
        Parcel Jb = Jb();
        C1756mga.a(Jb, oma);
        Parcel a2 = a(1, Jb);
        C1837nma nma = (C1837nma) C1756mga.a(a2, C1837nma.CREATOR);
        a2.recycle();
        return nma;
    }
}
