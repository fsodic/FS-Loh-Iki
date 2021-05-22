package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

/* renamed from: com.google.android.gms.internal.ads.Ub  reason: case insensitive filesystem */
public final class C0709Ub extends C1687lga implements AbstractC0657Sb {
    C0709Ub(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IUnconfirmedClickListener");
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0657Sb
    public final void Gb() {
        b(2, Jb());
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0657Sb
    public final void t(String str) {
        Parcel Jb = Jb();
        Jb.writeString(str);
        b(1, Jb);
    }
}
