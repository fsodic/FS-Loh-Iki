package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import b.c.b.a.c.a;

/* renamed from: com.google.android.gms.internal.ads.dpa  reason: case insensitive filesystem */
public final class C1154dpa extends C1687lga implements AbstractC1017bpa {
    C1154dpa(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IMobileAdsSettingManager");
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1017bpa
    public final void H() {
        b(1, Jb());
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1017bpa
    public final String Va() {
        Parcel a2 = a(9, Jb());
        String readString = a2.readString();
        a2.recycle();
        return readString;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1017bpa
    public final void a(cqa cqa) {
        Parcel Jb = Jb();
        C1756mga.a(Jb, cqa);
        b(14, Jb);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1017bpa
    public final void a(AbstractC1611kd kdVar) {
        Parcel Jb = Jb();
        C1756mga.a(Jb, kdVar);
        b(12, Jb);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1017bpa
    public final void a(AbstractC1891of ofVar) {
        Parcel Jb = Jb();
        C1756mga.a(Jb, ofVar);
        b(11, Jb);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1017bpa
    public final void b(String str, a aVar) {
        Parcel Jb = Jb();
        Jb.writeString(str);
        C1756mga.a(Jb, aVar);
        b(6, Jb);
    }
}
