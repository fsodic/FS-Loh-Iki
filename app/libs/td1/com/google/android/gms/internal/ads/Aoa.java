package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

public final class Aoa extends C1687lga implements AbstractC2599yoa {
    Aoa(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAdListener");
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2599yoa
    public final void a() {
        b(4, Jb());
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2599yoa
    public final void b() {
        b(7, Jb());
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2599yoa
    public final void c(int i) {
        Parcel Jb = Jb();
        Jb.writeInt(i);
        b(2, Jb);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2599yoa
    public final void e() {
        b(6, Jb());
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2599yoa
    public final void h() {
        b(5, Jb());
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2599yoa
    public final void i() {
        b(3, Jb());
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2599yoa
    public final void j() {
        b(1, Jb());
    }
}
