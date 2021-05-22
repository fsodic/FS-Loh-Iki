package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import b.c.b.a.c.a;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.rf  reason: case insensitive filesystem */
public final class C2097rf extends C1687lga implements AbstractC1960pf {
    C2097rf(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1960pf
    public final AbstractC0297Ef Cb() {
        AbstractC0297Ef ef;
        Parcel a2 = a(27, Jb());
        IBinder readStrongBinder = a2.readStrongBinder();
        if (readStrongBinder == null) {
            ef = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IUnifiedNativeAdMapper");
            ef = queryLocalInterface instanceof AbstractC0297Ef ? (AbstractC0297Ef) queryLocalInterface : new C0349Gf(readStrongBinder);
        }
        a2.recycle();
        return ef;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1960pf
    public final void K(a aVar) {
        Parcel Jb = Jb();
        C1756mga.a(Jb, aVar);
        b(30, Jb);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1960pf
    public final void a(a aVar, AbstractC0326Fi fi, List<String> list) {
        Parcel Jb = Jb();
        C1756mga.a(Jb, aVar);
        C1756mga.a(Jb, fi);
        Jb.writeStringList(list);
        b(23, Jb);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1960pf
    public final void a(a aVar, Zna zna, String str, AbstractC0326Fi fi, String str2) {
        Parcel Jb = Jb();
        C1756mga.a(Jb, aVar);
        C1756mga.a(Jb, zna);
        Jb.writeString(str);
        C1756mga.a(Jb, fi);
        Jb.writeString(str2);
        b(10, Jb);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1960pf
    public final void a(a aVar, Zna zna, String str, AbstractC2304uf ufVar) {
        Parcel Jb = Jb();
        C1756mga.a(Jb, aVar);
        C1756mga.a(Jb, zna);
        Jb.writeString(str);
        C1756mga.a(Jb, ufVar);
        b(3, Jb);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1960pf
    public final void a(a aVar, Zna zna, String str, String str2, AbstractC2304uf ufVar) {
        Parcel Jb = Jb();
        C1756mga.a(Jb, aVar);
        C1756mga.a(Jb, zna);
        Jb.writeString(str);
        Jb.writeString(str2);
        C1756mga.a(Jb, ufVar);
        b(7, Jb);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1960pf
    public final void a(a aVar, Zna zna, String str, String str2, AbstractC2304uf ufVar, C0578Pa pa, List<String> list) {
        Parcel Jb = Jb();
        C1756mga.a(Jb, aVar);
        C1756mga.a(Jb, zna);
        Jb.writeString(str);
        Jb.writeString(str2);
        C1756mga.a(Jb, ufVar);
        C1756mga.a(Jb, pa);
        Jb.writeStringList(list);
        b(14, Jb);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1960pf
    public final void a(a aVar, C1015boa boa, Zna zna, String str, AbstractC2304uf ufVar) {
        Parcel Jb = Jb();
        C1756mga.a(Jb, aVar);
        C1756mga.a(Jb, boa);
        C1756mga.a(Jb, zna);
        Jb.writeString(str);
        C1756mga.a(Jb, ufVar);
        b(1, Jb);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1960pf
    public final void a(a aVar, C1015boa boa, Zna zna, String str, String str2, AbstractC2304uf ufVar) {
        Parcel Jb = Jb();
        C1756mga.a(Jb, aVar);
        C1756mga.a(Jb, boa);
        C1756mga.a(Jb, zna);
        Jb.writeString(str);
        Jb.writeString(str2);
        C1756mga.a(Jb, ufVar);
        b(6, Jb);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1960pf
    public final void a(a aVar, AbstractC1267fd fdVar, List<C1818nd> list) {
        Parcel Jb = Jb();
        C1756mga.a(Jb, aVar);
        C1756mga.a(Jb, fdVar);
        Jb.writeTypedList(list);
        b(31, Jb);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1960pf
    public final void a(Zna zna, String str) {
        Parcel Jb = Jb();
        C1756mga.a(Jb, zna);
        Jb.writeString(str);
        b(11, Jb);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1960pf
    public final void a(boolean z) {
        Parcel Jb = Jb();
        C1756mga.a(Jb, z);
        b(25, Jb);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1960pf
    public final void b(a aVar, Zna zna, String str, AbstractC2304uf ufVar) {
        Parcel Jb = Jb();
        C1756mga.a(Jb, aVar);
        C1756mga.a(Jb, zna);
        Jb.writeString(str);
        C1756mga.a(Jb, ufVar);
        b(28, Jb);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1960pf
    public final AbstractC0271Df bb() {
        AbstractC0271Df df;
        Parcel a2 = a(16, Jb());
        IBinder readStrongBinder = a2.readStrongBinder();
        if (readStrongBinder == null) {
            df = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.INativeContentAdMapper");
            df = queryLocalInterface instanceof AbstractC0271Df ? (AbstractC0271Df) queryLocalInterface : new C0323Ff(readStrongBinder);
        }
        a2.recycle();
        return df;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1960pf
    public final void c(a aVar, Zna zna, String str, AbstractC2304uf ufVar) {
        Parcel Jb = Jb();
        C1756mga.a(Jb, aVar);
        C1756mga.a(Jb, zna);
        Jb.writeString(str);
        C1756mga.a(Jb, ufVar);
        b(32, Jb);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1960pf
    public final C0194Ag da() {
        Parcel a2 = a(34, Jb());
        C0194Ag ag = (C0194Ag) C1756mga.a(a2, C0194Ag.CREATOR);
        a2.recycle();
        return ag;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1960pf
    public final void destroy() {
        b(5, Jb());
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1960pf
    public final C0194Ag fa() {
        Parcel a2 = a(33, Jb());
        C0194Ag ag = (C0194Ag) C1756mga.a(a2, C0194Ag.CREATOR);
        a2.recycle();
        return ag;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1960pf
    public final AbstractC2532xpa getVideoController() {
        Parcel a2 = a(26, Jb());
        AbstractC2532xpa a3 = AbstractBinderC2463wpa.a(a2.readStrongBinder());
        a2.recycle();
        return a3;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1960pf
    public final boolean isInitialized() {
        Parcel a2 = a(13, Jb());
        boolean a3 = C1756mga.a(a2);
        a2.recycle();
        return a3;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1960pf
    public final AbstractC2580yf nb() {
        AbstractC2580yf yfVar;
        Parcel a2 = a(15, Jb());
        IBinder readStrongBinder = a2.readStrongBinder();
        if (readStrongBinder == null) {
            yfVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.INativeAppInstallAdMapper");
            yfVar = queryLocalInterface instanceof AbstractC2580yf ? (AbstractC2580yf) queryLocalInterface : new C0193Af(readStrongBinder);
        }
        a2.recycle();
        return yfVar;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1960pf
    public final void pause() {
        b(8, Jb());
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1960pf
    public final void resume() {
        b(9, Jb());
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1960pf
    public final boolean sa() {
        Parcel a2 = a(22, Jb());
        boolean a3 = C1756mga.a(a2);
        a2.recycle();
        return a3;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1960pf
    public final void showInterstitial() {
        b(4, Jb());
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1960pf
    public final void showVideo() {
        b(12, Jb());
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1960pf
    public final void x(a aVar) {
        Parcel Jb = Jb();
        C1756mga.a(Jb, aVar);
        b(21, Jb);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1960pf
    public final a xb() {
        Parcel a2 = a(2, Jb());
        a a3 = a.AbstractBinderC0013a.a(a2.readStrongBinder());
        a2.recycle();
        return a3;
    }
}
