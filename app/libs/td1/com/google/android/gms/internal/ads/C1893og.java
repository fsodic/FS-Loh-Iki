package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import b.c.b.a.c.a;

/* renamed from: com.google.android.gms.internal.ads.og  reason: case insensitive filesystem */
public final class C1893og extends C1687lga implements AbstractC1755mg {
    C1893og(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.rtb.IRtbAdapter");
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1755mg
    public final boolean L(a aVar) {
        Parcel Jb = Jb();
        C1756mga.a(Jb, aVar);
        Parcel a2 = a(17, Jb);
        boolean a3 = C1756mga.a(a2);
        a2.recycle();
        return a3;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1755mg
    public final void a(a aVar, String str, Bundle bundle, Bundle bundle2, C1015boa boa, AbstractC1824ng ngVar) {
        Parcel Jb = Jb();
        C1756mga.a(Jb, aVar);
        Jb.writeString(str);
        C1756mga.a(Jb, bundle);
        C1756mga.a(Jb, bundle2);
        C1756mga.a(Jb, boa);
        C1756mga.a(Jb, ngVar);
        b(1, Jb);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1755mg
    public final void a(String str, String str2, Zna zna, a aVar, AbstractC0929ag agVar, AbstractC2304uf ufVar, C1015boa boa) {
        Parcel Jb = Jb();
        Jb.writeString(str);
        Jb.writeString(str2);
        C1756mga.a(Jb, zna);
        C1756mga.a(Jb, aVar);
        C1756mga.a(Jb, agVar);
        C1756mga.a(Jb, ufVar);
        C1756mga.a(Jb, boa);
        b(13, Jb);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1755mg
    public final void a(String str, String str2, Zna zna, a aVar, AbstractC0998bg bgVar, AbstractC2304uf ufVar) {
        Parcel Jb = Jb();
        Jb.writeString(str);
        Jb.writeString(str2);
        C1756mga.a(Jb, zna);
        C1756mga.a(Jb, aVar);
        C1756mga.a(Jb, bgVar);
        C1756mga.a(Jb, ufVar);
        b(14, Jb);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1755mg
    public final void a(String str, String str2, Zna zna, a aVar, AbstractC1342gg ggVar, AbstractC2304uf ufVar) {
        Parcel Jb = Jb();
        Jb.writeString(str);
        Jb.writeString(str2);
        C1756mga.a(Jb, zna);
        C1756mga.a(Jb, aVar);
        C1756mga.a(Jb, ggVar);
        C1756mga.a(Jb, ufVar);
        b(18, Jb);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1755mg
    public final void a(String str, String str2, Zna zna, a aVar, AbstractC1411hg hgVar, AbstractC2304uf ufVar) {
        Parcel Jb = Jb();
        Jb.writeString(str);
        Jb.writeString(str2);
        C1756mga.a(Jb, zna);
        C1756mga.a(Jb, aVar);
        C1756mga.a(Jb, hgVar);
        C1756mga.a(Jb, ufVar);
        b(16, Jb);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1755mg
    public final void b(String str, String str2, Zna zna, a aVar, AbstractC1411hg hgVar, AbstractC2304uf ufVar) {
        Parcel Jb = Jb();
        Jb.writeString(str);
        Jb.writeString(str2);
        C1756mga.a(Jb, zna);
        C1756mga.a(Jb, aVar);
        C1756mga.a(Jb, hgVar);
        C1756mga.a(Jb, ufVar);
        b(20, Jb);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1755mg
    public final C0194Ag da() {
        Parcel a2 = a(3, Jb());
        C0194Ag ag = (C0194Ag) C1756mga.a(a2, C0194Ag.CREATOR);
        a2.recycle();
        return ag;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1755mg
    public final C0194Ag fa() {
        Parcel a2 = a(2, Jb());
        C0194Ag ag = (C0194Ag) C1756mga.a(a2, C0194Ag.CREATOR);
        a2.recycle();
        return ag;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1755mg
    public final AbstractC2532xpa getVideoController() {
        Parcel a2 = a(5, Jb());
        AbstractC2532xpa a3 = AbstractBinderC2463wpa.a(a2.readStrongBinder());
        a2.recycle();
        return a3;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1755mg
    public final void n(String str) {
        Parcel Jb = Jb();
        Jb.writeString(str);
        b(19, Jb);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1755mg
    public final boolean o(a aVar) {
        Parcel Jb = Jb();
        C1756mga.a(Jb, aVar);
        Parcel a2 = a(15, Jb);
        boolean a3 = C1756mga.a(a2);
        a2.recycle();
        return a3;
    }
}
