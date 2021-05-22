package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

/* renamed from: com.google.android.gms.internal.ads.Ai  reason: case insensitive filesystem */
public final class C0196Ai extends C1687lga implements AbstractC2586yi {
    C0196Ai(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.reward.client.IRewardedVideoAdListener");
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2586yi
    public final void K() {
        b(6, Jb());
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2586yi
    public final void R() {
        b(4, Jb());
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2586yi
    public final void S() {
        b(2, Jb());
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2586yi
    public final void U() {
        b(1, Jb());
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2586yi
    public final void a(AbstractC1897oi oiVar) {
        Parcel Jb = Jb();
        C1756mga.a(Jb, oiVar);
        b(5, Jb);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2586yi
    public final void d(int i) {
        Parcel Jb = Jb();
        Jb.writeInt(i);
        b(7, Jb);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2586yi
    public final void f() {
        b(3, Jb());
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2586yi
    public final void g() {
        b(8, Jb());
    }
}
