package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.a.a;
import com.google.android.gms.common.internal.a.c;

/* renamed from: com.google.android.gms.internal.ads.ioa  reason: case insensitive filesystem */
public final class C1496ioa extends a {
    public static final Parcelable.Creator<C1496ioa> CREATOR = new C1428hoa();

    /* renamed from: a  reason: collision with root package name */
    public final int f4608a;

    public C1496ioa(int i) {
        this.f4608a = i;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = c.a(parcel);
        c.a(parcel, 2, this.f4608a);
        c.a(parcel, a2);
    }
}
