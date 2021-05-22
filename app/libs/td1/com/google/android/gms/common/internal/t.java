package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import b.c.b.a.b.b;
import com.google.android.gms.common.internal.AbstractC0186l;
import com.google.android.gms.common.internal.a.a;
import com.google.android.gms.common.internal.a.c;

public class t extends a {
    public static final Parcelable.Creator<t> CREATOR = new A();

    /* renamed from: a  reason: collision with root package name */
    private final int f1385a;

    /* renamed from: b  reason: collision with root package name */
    private IBinder f1386b;

    /* renamed from: c  reason: collision with root package name */
    private b f1387c;
    private boolean d;
    private boolean e;

    t(int i, IBinder iBinder, b bVar, boolean z, boolean z2) {
        this.f1385a = i;
        this.f1386b = iBinder;
        this.f1387c = bVar;
        this.d = z;
        this.e = z2;
    }

    public AbstractC0186l L() {
        return AbstractC0186l.a.a(this.f1386b);
    }

    public b M() {
        return this.f1387c;
    }

    public boolean N() {
        return this.d;
    }

    public boolean O() {
        return this.e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t)) {
            return false;
        }
        t tVar = (t) obj;
        return this.f1387c.equals(tVar.f1387c) && L().equals(tVar.L());
    }

    public void writeToParcel(Parcel parcel, int i) {
        int a2 = c.a(parcel);
        c.a(parcel, 1, this.f1385a);
        c.a(parcel, 2, this.f1386b, false);
        c.a(parcel, 3, (Parcelable) M(), i, false);
        c.a(parcel, 4, N());
        c.a(parcel, 5, O());
        c.a(parcel, a2);
    }
}
