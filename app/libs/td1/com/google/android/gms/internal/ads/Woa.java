package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

public final class Woa extends C1687lga implements Uoa {
    Woa(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAppEventListener");
    }

    @Override // com.google.android.gms.internal.ads.Uoa
    public final void a(String str, String str2) {
        Parcel Jb = Jb();
        Jb.writeString(str);
        Jb.writeString(str2);
        b(1, Jb);
    }
}
