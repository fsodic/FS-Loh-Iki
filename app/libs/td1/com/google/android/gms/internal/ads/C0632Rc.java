package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.a.a;
import com.google.android.gms.common.internal.a.c;

/* renamed from: com.google.android.gms.internal.ads.Rc  reason: case insensitive filesystem */
public final class C0632Rc extends a {
    public static final Parcelable.Creator<C0632Rc> CREATOR = new C0710Uc();

    /* renamed from: a  reason: collision with root package name */
    public final boolean f3023a;

    /* renamed from: b  reason: collision with root package name */
    public final String f3024b;

    /* renamed from: c  reason: collision with root package name */
    public final int f3025c;
    public final byte[] d;
    public final String[] e;
    public final String[] f;
    public final boolean g;
    public final long h;

    C0632Rc(boolean z, String str, int i, byte[] bArr, String[] strArr, String[] strArr2, boolean z2, long j) {
        this.f3023a = z;
        this.f3024b = str;
        this.f3025c = i;
        this.d = bArr;
        this.e = strArr;
        this.f = strArr2;
        this.g = z2;
        this.h = j;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = c.a(parcel);
        c.a(parcel, 1, this.f3023a);
        c.a(parcel, 2, this.f3024b, false);
        c.a(parcel, 3, this.f3025c);
        c.a(parcel, 4, this.d, false);
        c.a(parcel, 5, this.e, false);
        c.a(parcel, 6, this.f, false);
        c.a(parcel, 7, this.g);
        c.a(parcel, 8, this.h);
        c.a(parcel, a2);
    }
}
