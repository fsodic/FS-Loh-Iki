package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

/* renamed from: com.google.android.gms.internal.ads.Ob  reason: case insensitive filesystem */
public final class C0553Ob extends C1687lga implements AbstractC0501Mb {
    C0553Ob(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IOnUnifiedNativeAdLoadedListener");
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0501Mb
    public final void a(AbstractC0761Wb wb) {
        Parcel Jb = Jb();
        C1756mga.a(Jb, wb);
        b(1, Jb);
    }
}
