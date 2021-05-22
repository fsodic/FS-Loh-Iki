package com.google.android.gms.dynamite;

import android.os.IBinder;
import android.os.Parcel;
import b.c.b.a.c.a;
import b.c.b.a.d.c.a;
import b.c.b.a.d.c.c;

public final class j extends a implements i {
    j(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.dynamite.IDynamiteLoader");
    }

    @Override // com.google.android.gms.dynamite.i
    public final int Bb() {
        Parcel a2 = a(6, ub());
        int readInt = a2.readInt();
        a2.recycle();
        return readInt;
    }

    @Override // com.google.android.gms.dynamite.i
    public final int a(b.c.b.a.c.a aVar, String str, boolean z) {
        Parcel ub = ub();
        c.a(ub, aVar);
        ub.writeString(str);
        c.a(ub, z);
        Parcel a2 = a(5, ub);
        int readInt = a2.readInt();
        a2.recycle();
        return readInt;
    }

    @Override // com.google.android.gms.dynamite.i
    public final b.c.b.a.c.a a(b.c.b.a.c.a aVar, String str, int i) {
        Parcel ub = ub();
        c.a(ub, aVar);
        ub.writeString(str);
        ub.writeInt(i);
        Parcel a2 = a(2, ub);
        b.c.b.a.c.a a3 = a.AbstractBinderC0013a.a(a2.readStrongBinder());
        a2.recycle();
        return a3;
    }

    @Override // com.google.android.gms.dynamite.i
    public final int b(b.c.b.a.c.a aVar, String str, boolean z) {
        Parcel ub = ub();
        c.a(ub, aVar);
        ub.writeString(str);
        c.a(ub, z);
        Parcel a2 = a(3, ub);
        int readInt = a2.readInt();
        a2.recycle();
        return readInt;
    }

    @Override // com.google.android.gms.dynamite.i
    public final b.c.b.a.c.a b(b.c.b.a.c.a aVar, String str, int i) {
        Parcel ub = ub();
        c.a(ub, aVar);
        ub.writeString(str);
        ub.writeInt(i);
        Parcel a2 = a(4, ub);
        b.c.b.a.c.a a3 = a.AbstractBinderC0013a.a(a2.readStrongBinder());
        a2.recycle();
        return a3;
    }
}
