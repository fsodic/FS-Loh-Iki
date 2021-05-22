package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

/* renamed from: com.google.android.gms.internal.ads.Fb  reason: case insensitive filesystem */
public final class C0319Fb extends C1687lga implements AbstractC0241Cb {
    C0319Fb(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IOnCustomClickListener");
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0241Cb
    public final void a(AbstractC2158sb sbVar, String str) {
        Parcel Jb = Jb();
        C1756mga.a(Jb, sbVar);
        Jb.writeString(str);
        b(1, Jb);
    }
}
