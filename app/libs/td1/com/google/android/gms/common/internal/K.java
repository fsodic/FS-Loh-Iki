package com.google.android.gms.common.internal;

import android.os.Parcel;
import b.c.b.a.c.a;
import b.c.b.a.d.c.b;
import b.c.b.a.d.c.c;

public abstract class K extends b implements J {
    public K() {
        super("com.google.android.gms.common.internal.ICertData");
    }

    /* access modifiers changed from: protected */
    @Override // b.c.b.a.d.c.b
    public final boolean a(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i == 1) {
            a d = d();
            parcel2.writeNoException();
            c.a(parcel2, d);
        } else if (i != 2) {
            return false;
        } else {
            int c2 = c();
            parcel2.writeNoException();
            parcel2.writeInt(c2);
        }
        return true;
    }
}
