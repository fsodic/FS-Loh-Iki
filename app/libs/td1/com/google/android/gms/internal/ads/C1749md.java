package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.md  reason: case insensitive filesystem */
public final class C1749md extends C1687lga implements AbstractC1611kd {
    C1749md(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.initialization.IInitializationCallback");
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1611kd
    public final void b(List<C1130dd> list) {
        Parcel Jb = Jb();
        Jb.writeTypedList(list);
        b(1, Jb);
    }
}
