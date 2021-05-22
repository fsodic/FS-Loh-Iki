package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.a.a;
import com.google.android.gms.common.internal.a.c;

public final class Qna extends a {
    public static final Parcelable.Creator<Qna> CREATOR = new Pna();

    /* renamed from: a  reason: collision with root package name */
    public final String f2969a;

    /* renamed from: b  reason: collision with root package name */
    public final String f2970b;

    public Qna(String str, String str2) {
        this.f2969a = str;
        this.f2970b = str2;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = c.a(parcel);
        c.a(parcel, 1, this.f2969a, false);
        c.a(parcel, 2, this.f2970b, false);
        c.a(parcel, a2);
    }
}
