package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;

/* renamed from: com.google.android.gms.internal.ads.Qh  reason: case insensitive filesystem */
public final class C0611Qh extends C1687lga implements AbstractC0559Oh {
    C0611Qh(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.request.INonagonStreamingResponseListener");
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0559Oh
    public final void a(ParcelFileDescriptor parcelFileDescriptor) {
        Parcel Jb = Jb();
        C1756mga.a(Jb, parcelFileDescriptor);
        b(1, Jb);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0559Oh
    public final void a(C0939al alVar) {
        Parcel Jb = Jb();
        C1756mga.a(Jb, alVar);
        b(2, Jb);
    }
}
