package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

/* renamed from: com.google.android.gms.internal.ads.Ti  reason: case insensitive filesystem */
public final class C0690Ti extends C1687lga implements AbstractC0664Si {
    C0690Ti(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.rewarded.client.IRewardedAdCallback");
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0664Si
    public final void a(AbstractC0508Mi mi) {
        Parcel Jb = Jb();
        C1756mga.a(Jb, mi);
        b(3, Jb);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0664Si
    public final void b(Sna sna) {
        Parcel Jb = Jb();
        C1756mga.a(Jb, sna);
        b(5, Jb);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0664Si
    public final void oa() {
        b(2, Jb());
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0664Si
    public final void v(int i) {
        Parcel Jb = Jb();
        Jb.writeInt(i);
        b(4, Jb);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0664Si
    public final void wa() {
        b(1, Jb());
    }
}
