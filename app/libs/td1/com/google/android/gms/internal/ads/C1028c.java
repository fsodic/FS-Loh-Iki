package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.ads.t;
import com.google.android.gms.common.internal.a.a;
import com.google.android.gms.common.internal.a.c;

/* renamed from: com.google.android.gms.internal.ads.c  reason: case insensitive filesystem */
public final class C1028c extends a {
    public static final Parcelable.Creator<C1028c> CREATOR = new C1234f();

    /* renamed from: a  reason: collision with root package name */
    public final boolean f3959a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f3960b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f3961c;

    public C1028c(t tVar) {
        this(tVar.c(), tVar.b(), tVar.a());
    }

    public C1028c(boolean z, boolean z2, boolean z3) {
        this.f3959a = z;
        this.f3960b = z2;
        this.f3961c = z3;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = c.a(parcel);
        c.a(parcel, 2, this.f3959a);
        c.a(parcel, 3, this.f3960b);
        c.a(parcel, 4, this.f3961c);
        c.a(parcel, a2);
    }
}
