package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

/* renamed from: com.google.android.gms.internal.ads.Gb  reason: case insensitive filesystem */
public final class C0345Gb extends C1687lga implements AbstractC0293Eb {
    C0345Gb(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IOnCustomTemplateAdLoadedListener");
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0293Eb
    public final void a(AbstractC2158sb sbVar) {
        Parcel Jb = Jb();
        C1756mga.a(Jb, sbVar);
        b(1, Jb);
    }
}
