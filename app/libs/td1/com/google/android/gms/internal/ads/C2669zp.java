package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import b.c.b.a.c.a;

/* renamed from: com.google.android.gms.internal.ads.zp  reason: case insensitive filesystem */
public final class C2669zp extends C1687lga implements AbstractC2600yp {
    C2669zp(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.measurement.IMeasurementManager");
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2600yp
    public final void a(a aVar, AbstractC2393vp vpVar) {
        Parcel Jb = Jb();
        C1756mga.a(Jb, aVar);
        C1756mga.a(Jb, vpVar);
        b(2, Jb);
    }
}
