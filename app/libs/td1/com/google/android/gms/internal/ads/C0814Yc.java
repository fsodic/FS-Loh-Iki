package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

/* renamed from: com.google.android.gms.internal.ads.Yc  reason: case insensitive filesystem */
public final class C0814Yc extends C1687lga implements AbstractC0736Vc {
    C0814Yc(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.httpcache.IHttpAssetsCacheService");
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0736Vc
    public final void a(C0580Pc pc, AbstractC0684Tc tc) {
        Parcel Jb = Jb();
        C1756mga.a(Jb, pc);
        C1756mga.a(Jb, tc);
        c(2, Jb);
    }
}
