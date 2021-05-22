package com.google.android.gms.ads.internal.overlay;

import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import b.c.b.a.c.a;
import b.c.b.a.c.b;
import com.google.android.gms.ads.internal.g;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.a.a;
import com.google.android.gms.common.internal.a.c;
import com.google.android.gms.internal.ads.AbstractC1472ic;
import com.google.android.gms.internal.ads.AbstractC1564jo;
import com.google.android.gms.internal.ads.AbstractC1609kc;
import com.google.android.gms.internal.ads.C0823Yl;
import com.google.android.gms.internal.ads.Ona;

public final class AdOverlayInfoParcel extends a implements ReflectedParcelable {
    public static final Parcelable.Creator<AdOverlayInfoParcel> CREATOR = new m();

    /* renamed from: a  reason: collision with root package name */
    public final d f1096a;

    /* renamed from: b  reason: collision with root package name */
    public final Ona f1097b;

    /* renamed from: c  reason: collision with root package name */
    public final o f1098c;
    public final AbstractC1564jo d;
    public final AbstractC1609kc e;
    public final String f;
    public final boolean g;
    public final String h;
    public final t i;
    public final int j;
    public final int k;
    public final String l;
    public final C0823Yl m;
    public final String n;
    public final g o;
    public final AbstractC1472ic p;

    AdOverlayInfoParcel(d dVar, IBinder iBinder, IBinder iBinder2, IBinder iBinder3, IBinder iBinder4, String str, boolean z, String str2, IBinder iBinder5, int i2, int i3, String str3, C0823Yl yl, String str4, g gVar, IBinder iBinder6) {
        this.f1096a = dVar;
        this.f1097b = (Ona) b.Q(a.AbstractBinderC0013a.a(iBinder));
        this.f1098c = (o) b.Q(a.AbstractBinderC0013a.a(iBinder2));
        this.d = (AbstractC1564jo) b.Q(a.AbstractBinderC0013a.a(iBinder3));
        this.p = (AbstractC1472ic) b.Q(a.AbstractBinderC0013a.a(iBinder6));
        this.e = (AbstractC1609kc) b.Q(a.AbstractBinderC0013a.a(iBinder4));
        this.f = str;
        this.g = z;
        this.h = str2;
        this.i = (t) b.Q(a.AbstractBinderC0013a.a(iBinder5));
        this.j = i2;
        this.k = i3;
        this.l = str3;
        this.m = yl;
        this.n = str4;
        this.o = gVar;
    }

    public AdOverlayInfoParcel(d dVar, Ona ona, o oVar, t tVar, C0823Yl yl) {
        this.f1096a = dVar;
        this.f1097b = ona;
        this.f1098c = oVar;
        this.d = null;
        this.p = null;
        this.e = null;
        this.f = null;
        this.g = false;
        this.h = null;
        this.i = tVar;
        this.j = -1;
        this.k = 4;
        this.l = null;
        this.m = yl;
        this.n = null;
        this.o = null;
    }

    public AdOverlayInfoParcel(Ona ona, o oVar, t tVar, AbstractC1564jo joVar, int i2, C0823Yl yl, String str, g gVar, String str2, String str3) {
        this.f1096a = null;
        this.f1097b = null;
        this.f1098c = oVar;
        this.d = joVar;
        this.p = null;
        this.e = null;
        this.f = str2;
        this.g = false;
        this.h = str3;
        this.i = null;
        this.j = i2;
        this.k = 1;
        this.l = null;
        this.m = yl;
        this.n = str;
        this.o = gVar;
    }

    public AdOverlayInfoParcel(Ona ona, o oVar, t tVar, AbstractC1564jo joVar, boolean z, int i2, C0823Yl yl) {
        this.f1096a = null;
        this.f1097b = ona;
        this.f1098c = oVar;
        this.d = joVar;
        this.p = null;
        this.e = null;
        this.f = null;
        this.g = z;
        this.h = null;
        this.i = tVar;
        this.j = i2;
        this.k = 2;
        this.l = null;
        this.m = yl;
        this.n = null;
        this.o = null;
    }

    public AdOverlayInfoParcel(Ona ona, o oVar, AbstractC1472ic icVar, AbstractC1609kc kcVar, t tVar, AbstractC1564jo joVar, boolean z, int i2, String str, C0823Yl yl) {
        this.f1096a = null;
        this.f1097b = ona;
        this.f1098c = oVar;
        this.d = joVar;
        this.p = icVar;
        this.e = kcVar;
        this.f = null;
        this.g = z;
        this.h = null;
        this.i = tVar;
        this.j = i2;
        this.k = 3;
        this.l = str;
        this.m = yl;
        this.n = null;
        this.o = null;
    }

    public AdOverlayInfoParcel(Ona ona, o oVar, AbstractC1472ic icVar, AbstractC1609kc kcVar, t tVar, AbstractC1564jo joVar, boolean z, int i2, String str, String str2, C0823Yl yl) {
        this.f1096a = null;
        this.f1097b = ona;
        this.f1098c = oVar;
        this.d = joVar;
        this.p = icVar;
        this.e = kcVar;
        this.f = str2;
        this.g = z;
        this.h = str;
        this.i = tVar;
        this.j = i2;
        this.k = 3;
        this.l = null;
        this.m = yl;
        this.n = null;
        this.o = null;
    }

    public static AdOverlayInfoParcel a(Intent intent) {
        try {
            Bundle bundleExtra = intent.getBundleExtra("com.google.android.gms.ads.inernal.overlay.AdOverlayInfo");
            bundleExtra.setClassLoader(AdOverlayInfoParcel.class.getClassLoader());
            return (AdOverlayInfoParcel) bundleExtra.getParcelable("com.google.android.gms.ads.inernal.overlay.AdOverlayInfo");
        } catch (Exception unused) {
            return null;
        }
    }

    public static void a(Intent intent, AdOverlayInfoParcel adOverlayInfoParcel) {
        Bundle bundle = new Bundle(1);
        bundle.putParcelable("com.google.android.gms.ads.inernal.overlay.AdOverlayInfo", adOverlayInfoParcel);
        intent.putExtra("com.google.android.gms.ads.inernal.overlay.AdOverlayInfo", bundle);
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int a2 = c.a(parcel);
        c.a(parcel, 2, (Parcelable) this.f1096a, i2, false);
        c.a(parcel, 3, b.a(this.f1097b).asBinder(), false);
        c.a(parcel, 4, b.a(this.f1098c).asBinder(), false);
        c.a(parcel, 5, b.a(this.d).asBinder(), false);
        c.a(parcel, 6, b.a(this.e).asBinder(), false);
        c.a(parcel, 7, this.f, false);
        c.a(parcel, 8, this.g);
        c.a(parcel, 9, this.h, false);
        c.a(parcel, 10, b.a(this.i).asBinder(), false);
        c.a(parcel, 11, this.j);
        c.a(parcel, 12, this.k);
        c.a(parcel, 13, this.l, false);
        c.a(parcel, 14, (Parcelable) this.m, i2, false);
        c.a(parcel, 16, this.n, false);
        c.a(parcel, 17, (Parcelable) this.o, i2, false);
        c.a(parcel, 18, b.a(this.p).asBinder(), false);
        c.a(parcel, a2);
    }
}
