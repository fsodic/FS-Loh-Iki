package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.a.a;
import com.google.android.gms.common.internal.a.c;

public final class Dpa extends a {
    public static final Parcelable.Creator<Dpa> CREATOR = new Cpa();

    /* renamed from: a  reason: collision with root package name */
    private final int f1824a;

    public Dpa(int i) {
        this.f1824a = i;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = c.a(parcel);
        c.a(parcel, 2, this.f1824a);
        c.a(parcel, a2);
    }
}
