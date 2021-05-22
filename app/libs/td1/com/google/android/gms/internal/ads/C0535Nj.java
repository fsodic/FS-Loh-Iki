package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

/* renamed from: com.google.android.gms.internal.ads.Nj  reason: case insensitive filesystem */
public final class C0535Nj extends C1687lga implements AbstractC0483Lj {
    C0535Nj(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.signals.ISignalCallback");
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0483Lj
    public final void b(String str, String str2, Bundle bundle) {
        Parcel Jb = Jb();
        Jb.writeString(str);
        Jb.writeString(str2);
        C1756mga.a(Jb, bundle);
        b(3, Jb);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0483Lj
    public final void c(String str, String str2) {
        Parcel Jb = Jb();
        Jb.writeString(str);
        Jb.writeString(str2);
        b(1, Jb);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0483Lj
    public final void d(String str) {
        Parcel Jb = Jb();
        Jb.writeString(str);
        b(2, Jb);
    }
}
