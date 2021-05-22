package com.google.android.gms.common.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import b.c.b.a.b.d;
import com.google.android.gms.common.internal.a.a;
import com.google.android.gms.common.internal.a.c;

public final class C extends a {
    public static final Parcelable.Creator<C> CREATOR = new D();

    /* renamed from: a  reason: collision with root package name */
    Bundle f1327a;

    /* renamed from: b  reason: collision with root package name */
    d[] f1328b;

    public C() {
    }

    C(Bundle bundle, d[] dVarArr) {
        this.f1327a = bundle;
        this.f1328b = dVarArr;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = c.a(parcel);
        c.a(parcel, 1, this.f1327a, false);
        c.a(parcel, 2, (Parcelable[]) this.f1328b, i, false);
        c.a(parcel, a2);
    }
}
