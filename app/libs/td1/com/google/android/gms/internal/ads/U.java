package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

public final class U extends C1687lga implements S {
    U(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.customrenderedad.client.IOnCustomRenderedAdLoadedListener");
    }

    @Override // com.google.android.gms.internal.ads.S
    public final void a(Q q) {
        Parcel Jb = Jb();
        C1756mga.a(Jb, q);
        b(1, Jb);
    }
}
