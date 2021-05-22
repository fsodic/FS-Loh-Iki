package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

public final class Apa extends C1687lga implements AbstractC2601ypa {
    Apa(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IVideoLifecycleCallbacks");
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2601ypa
    public final void X() {
        b(3, Jb());
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2601ypa
    public final void Y() {
        b(4, Jb());
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2601ypa
    public final void c(boolean z) {
        Parcel Jb = Jb();
        C1756mga.a(Jb, z);
        b(5, Jb);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2601ypa
    public final void ea() {
        b(2, Jb());
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2601ypa
    public final void hb() {
        b(1, Jb());
    }
}
