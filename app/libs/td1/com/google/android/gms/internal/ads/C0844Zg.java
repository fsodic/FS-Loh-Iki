package com.google.android.gms.internal.ads;

import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import b.c.b.a.c.a;

/* renamed from: com.google.android.gms.internal.ads.Zg  reason: case insensitive filesystem */
public final class C0844Zg extends C1687lga implements AbstractC0792Xg {
    C0844Zg(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.overlay.client.IAdOverlay");
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0792Xg
    public final boolean Fb() {
        Parcel a2 = a(11, Jb());
        boolean a3 = C1756mga.a(a2);
        a2.recycle();
        return a3;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0792Xg
    public final void G(a aVar) {
        Parcel Jb = Jb();
        C1756mga.a(Jb, aVar);
        b(13, Jb);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0792Xg
    public final void Oa() {
        b(9, Jb());
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0792Xg
    public final void g(Bundle bundle) {
        Parcel Jb = Jb();
        C1756mga.a(Jb, bundle);
        Parcel a2 = a(6, Jb);
        if (a2.readInt() != 0) {
            bundle.readFromParcel(a2);
        }
        a2.recycle();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0792Xg
    public final void ia() {
        b(3, Jb());
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0792Xg
    public final void j(Bundle bundle) {
        Parcel Jb = Jb();
        C1756mga.a(Jb, bundle);
        b(1, Jb);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0792Xg
    public final void jb() {
        b(7, Jb());
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0792Xg
    public final void onActivityResult(int i, int i2, Intent intent) {
        Parcel Jb = Jb();
        Jb.writeInt(i);
        Jb.writeInt(i2);
        C1756mga.a(Jb, intent);
        b(12, Jb);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0792Xg
    public final void onDestroy() {
        b(8, Jb());
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0792Xg
    public final void onPause() {
        b(5, Jb());
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0792Xg
    public final void onResume() {
        b(4, Jb());
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0792Xg
    public final void rb() {
        b(2, Jb());
    }
}
