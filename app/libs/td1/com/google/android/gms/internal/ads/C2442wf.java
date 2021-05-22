package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

/* renamed from: com.google.android.gms.internal.ads.wf  reason: case insensitive filesystem */
public final class C2442wf extends C1687lga implements AbstractC2304uf {
    C2442wf(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2304uf
    public final void Na() {
        b(18, Jb());
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2304uf
    public final void X() {
        b(15, Jb());
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2304uf
    public final void Xa() {
        b(13, Jb());
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2304uf
    public final void Y() {
        b(11, Jb());
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2304uf
    public final void a() {
        b(6, Jb());
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2304uf
    public final void a(Bundle bundle) {
        Parcel Jb = Jb();
        C1756mga.a(Jb, bundle);
        b(19, Jb);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2304uf
    public final void a(C0456Ki ki) {
        Parcel Jb = Jb();
        C1756mga.a(Jb, ki);
        b(14, Jb);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2304uf
    public final void a(AbstractC0508Mi mi) {
        Parcel Jb = Jb();
        C1756mga.a(Jb, mi);
        b(16, Jb);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2304uf
    public final void a(AbstractC2158sb sbVar, String str) {
        Parcel Jb = Jb();
        C1756mga.a(Jb, sbVar);
        Jb.writeString(str);
        b(10, Jb);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2304uf
    public final void a(AbstractC2373vf vfVar) {
        Parcel Jb = Jb();
        C1756mga.a(Jb, vfVar);
        b(7, Jb);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2304uf
    public final void a(String str, String str2) {
        Parcel Jb = Jb();
        Jb.writeString(str);
        Jb.writeString(str2);
        b(9, Jb);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2304uf
    public final void b() {
        b(8, Jb());
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2304uf
    public final void b(int i, String str) {
        Parcel Jb = Jb();
        Jb.writeInt(i);
        Jb.writeString(str);
        b(22, Jb);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2304uf
    public final void c(int i) {
        Parcel Jb = Jb();
        Jb.writeInt(i);
        b(3, Jb);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2304uf
    public final void e() {
        b(1, Jb());
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2304uf
    public final void ea() {
        b(20, Jb());
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2304uf
    public final void f(String str) {
        Parcel Jb = Jb();
        Jb.writeString(str);
        b(12, Jb);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2304uf
    public final void h() {
        b(5, Jb());
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2304uf
    public final void h(String str) {
        Parcel Jb = Jb();
        Jb.writeString(str);
        b(21, Jb);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2304uf
    public final void i() {
        b(4, Jb());
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2304uf
    public final void j() {
        b(2, Jb());
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2304uf
    public final void m(int i) {
        Parcel Jb = Jb();
        Jb.writeInt(i);
        b(17, Jb);
    }
}
