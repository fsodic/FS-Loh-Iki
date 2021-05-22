package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import b.c.b.a.c.a;

/* renamed from: com.google.android.gms.internal.ads.Hi  reason: case insensitive filesystem */
public final class C0378Hi extends C1687lga implements AbstractC0326Fi {
    C0378Hi(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.reward.mediation.client.IMediationRewardedVideoAdListener");
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0326Fi
    public final void D(a aVar) {
        Parcel Jb = Jb();
        C1756mga.a(Jb, aVar);
        b(10, Jb);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0326Fi
    public final void J(a aVar) {
        Parcel Jb = Jb();
        C1756mga.a(Jb, aVar);
        b(5, Jb);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0326Fi
    public final void N(a aVar) {
        Parcel Jb = Jb();
        C1756mga.a(Jb, aVar);
        b(6, Jb);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0326Fi
    public final void a(Bundle bundle) {
        Parcel Jb = Jb();
        C1756mga.a(Jb, bundle);
        b(12, Jb);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0326Fi
    public final void a(a aVar, C0456Ki ki) {
        Parcel Jb = Jb();
        C1756mga.a(Jb, aVar);
        C1756mga.a(Jb, ki);
        b(7, Jb);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0326Fi
    public final void b(a aVar, int i) {
        Parcel Jb = Jb();
        C1756mga.a(Jb, aVar);
        Jb.writeInt(i);
        b(2, Jb);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0326Fi
    public final void c(a aVar, int i) {
        Parcel Jb = Jb();
        C1756mga.a(Jb, aVar);
        Jb.writeInt(i);
        b(9, Jb);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0326Fi
    public final void h(a aVar) {
        Parcel Jb = Jb();
        C1756mga.a(Jb, aVar);
        b(3, Jb);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0326Fi
    public final void j(a aVar) {
        Parcel Jb = Jb();
        C1756mga.a(Jb, aVar);
        b(4, Jb);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0326Fi
    public final void n(a aVar) {
        Parcel Jb = Jb();
        C1756mga.a(Jb, aVar);
        b(11, Jb);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0326Fi
    public final void u(a aVar) {
        Parcel Jb = Jb();
        C1756mga.a(Jb, aVar);
        b(1, Jb);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0326Fi
    public final void y(a aVar) {
        Parcel Jb = Jb();
        C1756mga.a(Jb, aVar);
        b(8, Jb);
    }
}
