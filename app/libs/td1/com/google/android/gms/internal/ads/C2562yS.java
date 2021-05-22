package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.a.a;
import com.google.android.gms.common.internal.a.c;

/* renamed from: com.google.android.gms.internal.ads.yS  reason: case insensitive filesystem */
public final class C2562yS extends a {
    public static final Parcelable.Creator<C2562yS> CREATOR = new C2631zS();

    /* renamed from: a  reason: collision with root package name */
    private final EnumC2493xS[] f6085a;

    /* renamed from: b  reason: collision with root package name */
    private final int[] f6086b;

    /* renamed from: c  reason: collision with root package name */
    private final int[] f6087c;
    public final Context d;
    private final int e;
    public final EnumC2493xS f;
    public final int g;
    public final int h;
    public final int i;
    public final String j;
    private final int k;
    public final int l;
    private final int m;
    private final int n;

    public C2562yS(int i2, int i3, int i4, int i5, String str, int i6, int i7) {
        this.f6085a = EnumC2493xS.values();
        this.f6086b = AS.a();
        this.f6087c = AS.b();
        this.d = null;
        this.e = i2;
        this.f = this.f6085a[i2];
        this.g = i3;
        this.h = i4;
        this.i = i5;
        this.j = str;
        this.k = i6;
        this.l = this.f6086b[i6];
        this.m = i7;
        this.n = this.f6087c[i7];
    }

    private C2562yS(Context context, EnumC2493xS xSVar, int i2, int i3, int i4, String str, String str2, String str3) {
        this.f6085a = EnumC2493xS.values();
        this.f6086b = AS.a();
        this.f6087c = AS.b();
        this.d = context;
        this.e = xSVar.ordinal();
        this.f = xSVar;
        this.g = i2;
        this.h = i3;
        this.i = i4;
        this.j = str;
        this.l = "oldest".equals(str2) ? AS.f1513a : ("lru".equals(str2) || !"lfu".equals(str2)) ? AS.f1514b : AS.f1515c;
        this.k = this.l - 1;
        "onAdClosed".equals(str3);
        this.n = AS.e;
        this.m = this.n - 1;
    }

    public static boolean L() {
        return ((Boolean) C2392voa.e().a(C2474x.le)).booleanValue();
    }

    public static C2562yS a(EnumC2493xS xSVar, Context context) {
        if (xSVar == EnumC2493xS.Rewarded) {
            return new C2562yS(context, xSVar, ((Integer) C2392voa.e().a(C2474x.me)).intValue(), ((Integer) C2392voa.e().a(C2474x.se)).intValue(), ((Integer) C2392voa.e().a(C2474x.ue)).intValue(), (String) C2392voa.e().a(C2474x.we), (String) C2392voa.e().a(C2474x.oe), (String) C2392voa.e().a(C2474x.qe));
        } else if (xSVar == EnumC2493xS.Interstitial) {
            return new C2562yS(context, xSVar, ((Integer) C2392voa.e().a(C2474x.ne)).intValue(), ((Integer) C2392voa.e().a(C2474x.te)).intValue(), ((Integer) C2392voa.e().a(C2474x.ve)).intValue(), (String) C2392voa.e().a(C2474x.xe), (String) C2392voa.e().a(C2474x.pe), (String) C2392voa.e().a(C2474x.re));
        } else if (xSVar != EnumC2493xS.AppOpen) {
            return null;
        } else {
            return new C2562yS(context, xSVar, ((Integer) C2392voa.e().a(C2474x.Ae)).intValue(), ((Integer) C2392voa.e().a(C2474x.Ce)).intValue(), ((Integer) C2392voa.e().a(C2474x.De)).intValue(), (String) C2392voa.e().a(C2474x.ye), (String) C2392voa.e().a(C2474x.ze), (String) C2392voa.e().a(C2474x.Be));
        }
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int a2 = c.a(parcel);
        c.a(parcel, 1, this.e);
        c.a(parcel, 2, this.g);
        c.a(parcel, 3, this.h);
        c.a(parcel, 4, this.i);
        c.a(parcel, 5, this.j, false);
        c.a(parcel, 6, this.k);
        c.a(parcel, 7, this.m);
        c.a(parcel, a2);
    }
}
