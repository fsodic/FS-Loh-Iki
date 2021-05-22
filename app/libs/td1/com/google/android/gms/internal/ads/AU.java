package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.a.a;
import com.google.android.gms.common.internal.a.c;

public final class AU extends a {
    public static final Parcelable.Creator<AU> CREATOR = new C2633zU();

    /* renamed from: a  reason: collision with root package name */
    private final int f1516a;

    /* renamed from: b  reason: collision with root package name */
    private final byte[] f1517b;

    AU(int i, byte[] bArr) {
        this.f1516a = i;
        this.f1517b = bArr;
    }

    public AU(byte[] bArr) {
        this(1, bArr);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = c.a(parcel);
        c.a(parcel, 1, this.f1516a);
        c.a(parcel, 2, this.f1517b, false);
        c.a(parcel, a2);
    }
}
