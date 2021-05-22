package com.google.android.gms.games.internal;

import android.os.Parcel;
import b.c.b.a.d.e.e;
import b.c.b.a.d.e.l;

public abstract class i extends e implements h {
    public i() {
        super("com.google.android.gms.games.internal.IGamesClient");
    }

    /* access modifiers changed from: protected */
    @Override // b.c.b.a.d.e.e
    public final boolean a(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i != 1001) {
            return false;
        }
        l Eb = Eb();
        parcel2.writeNoException();
        l.b(parcel2, Eb);
        return true;
    }
}
