package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

/* renamed from: com.google.android.gms.internal.ads.yb  reason: case insensitive filesystem */
public final class C2572yb extends C1687lga implements AbstractC2434wb {
    C2572yb(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IOnAppInstallAdLoadedListener");
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2434wb
    public final void a(AbstractC1607kb kbVar) {
        Parcel Jb = Jb();
        C1756mga.a(Jb, kbVar);
        b(1, Jb);
    }
}
