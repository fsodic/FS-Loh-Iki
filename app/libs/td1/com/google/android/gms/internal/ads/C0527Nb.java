package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import b.c.b.a.c.a;

/* renamed from: com.google.android.gms.internal.ads.Nb  reason: case insensitive filesystem */
public final class C0527Nb extends C1687lga implements AbstractC0475Lb {
    C0527Nb(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IOnPublisherAdViewLoadedListener");
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0475Lb
    public final void a(Loa loa, a aVar) {
        Parcel Jb = Jb();
        C1756mga.a(Jb, loa);
        C1756mga.a(Jb, aVar);
        b(1, Jb);
    }
}
