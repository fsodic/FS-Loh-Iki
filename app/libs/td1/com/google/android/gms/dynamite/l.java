package com.google.android.gms.dynamite;

import android.os.IBinder;
import android.os.Parcel;
import b.c.b.a.c.a;
import b.c.b.a.d.c.a;
import b.c.b.a.d.c.c;

public final class l extends a implements k {
    l(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.dynamite.IDynamiteLoaderV2");
    }

    @Override // com.google.android.gms.dynamite.k
    public final b.c.b.a.c.a a(b.c.b.a.c.a aVar, String str, int i, b.c.b.a.c.a aVar2) {
        Parcel ub = ub();
        c.a(ub, aVar);
        ub.writeString(str);
        ub.writeInt(i);
        c.a(ub, aVar2);
        Parcel a2 = a(2, ub);
        b.c.b.a.c.a a3 = a.AbstractBinderC0013a.a(a2.readStrongBinder());
        a2.recycle();
        return a3;
    }

    @Override // com.google.android.gms.dynamite.k
    public final b.c.b.a.c.a b(b.c.b.a.c.a aVar, String str, int i, b.c.b.a.c.a aVar2) {
        Parcel ub = ub();
        c.a(ub, aVar);
        ub.writeString(str);
        ub.writeInt(i);
        c.a(ub, aVar2);
        Parcel a2 = a(3, ub);
        b.c.b.a.c.a a3 = a.AbstractBinderC0013a.a(a2.readStrongBinder());
        a2.recycle();
        return a3;
    }
}
