package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.a.a;
import com.google.android.gms.common.internal.a.c;
import java.util.Arrays;

public final class OU extends a {
    public static final Parcelable.Creator<OU> CREATOR = new RU();

    /* renamed from: a  reason: collision with root package name */
    private final int f2747a;

    /* renamed from: b  reason: collision with root package name */
    public final byte[] f2748b;

    /* renamed from: c  reason: collision with root package name */
    public final int f2749c;

    OU(int i, byte[] bArr, int i2) {
        this.f2747a = i;
        this.f2748b = bArr == null ? null : Arrays.copyOf(bArr, bArr.length);
        this.f2749c = i2;
    }

    public OU(byte[] bArr, int i) {
        this(1, null, 1);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = c.a(parcel);
        c.a(parcel, 1, this.f2747a);
        c.a(parcel, 2, this.f2748b, false);
        c.a(parcel, 3, this.f2749c);
        c.a(parcel, a2);
    }
}
