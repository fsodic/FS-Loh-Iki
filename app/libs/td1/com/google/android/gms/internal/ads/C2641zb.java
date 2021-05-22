package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

/* renamed from: com.google.android.gms.internal.ads.zb  reason: case insensitive filesystem */
public final class C2641zb extends C1687lga implements AbstractC2503xb {
    C2641zb(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IOnContentAdLoadedListener");
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2503xb
    public final void a(AbstractC1883ob obVar) {
        Parcel Jb = Jb();
        C1756mga.a(Jb, obVar);
        b(1, Jb);
    }
}
