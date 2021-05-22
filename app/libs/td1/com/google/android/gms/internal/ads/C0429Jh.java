package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

/* renamed from: com.google.android.gms.internal.ads.Jh  reason: case insensitive filesystem */
public final class C0429Jh extends C1687lga implements AbstractC0351Gh {
    C0429Jh(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.request.IAdRequestService");
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0351Gh
    public final void a(C0715Uh uh, AbstractC0559Oh oh) {
        Parcel Jb = Jb();
        C1756mga.a(Jb, uh);
        C1756mga.a(Jb, oh);
        b(5, Jb);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0351Gh
    public final void a(String str, AbstractC0559Oh oh) {
        Parcel Jb = Jb();
        Jb.writeString(str);
        C1756mga.a(Jb, oh);
        b(7, Jb);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0351Gh
    public final void b(C0715Uh uh, AbstractC0559Oh oh) {
        Parcel Jb = Jb();
        C1756mga.a(Jb, uh);
        C1756mga.a(Jb, oh);
        b(6, Jb);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0351Gh
    public final void c(C0715Uh uh, AbstractC0559Oh oh) {
        Parcel Jb = Jb();
        C1756mga.a(Jb, uh);
        C1756mga.a(Jb, oh);
        b(4, Jb);
    }
}
