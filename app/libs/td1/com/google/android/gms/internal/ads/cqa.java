package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.ads.q;
import com.google.android.gms.common.internal.a.a;
import com.google.android.gms.common.internal.a.c;

public final class cqa extends a {
    public static final Parcelable.Creator<cqa> CREATOR = new fqa();

    /* renamed from: a  reason: collision with root package name */
    private final int f4036a;

    /* renamed from: b  reason: collision with root package name */
    private final int f4037b;

    public cqa(int i, int i2) {
        this.f4036a = i;
        this.f4037b = i2;
    }

    public cqa(q qVar) {
        this.f4036a = qVar.b();
        this.f4037b = qVar.c();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = c.a(parcel);
        c.a(parcel, 1, this.f4036a);
        c.a(parcel, 2, this.f4037b);
        c.a(parcel, a2);
    }
}
