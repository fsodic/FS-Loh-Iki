package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import b.c.b.a.c.a;

/* renamed from: com.google.android.gms.internal.ads.Va  reason: case insensitive filesystem */
public final class C0734Va extends C1687lga implements AbstractC0708Ua {
    C0734Va(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IMediaContent");
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0708Ua
    public final a Pa() {
        Parcel a2 = a(4, Jb());
        a a3 = a.AbstractBinderC0013a.a(a2.readStrongBinder());
        a2.recycle();
        return a3;
    }
}
