package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.ads.b.d;
import com.google.android.gms.common.internal.a.a;
import com.google.android.gms.common.internal.a.c;

/* renamed from: com.google.android.gms.internal.ads.Pa  reason: case insensitive filesystem */
public final class C0578Pa extends a {
    public static final Parcelable.Creator<C0578Pa> CREATOR = new C0552Oa();

    /* renamed from: a  reason: collision with root package name */
    public final int f2841a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f2842b;

    /* renamed from: c  reason: collision with root package name */
    public final int f2843c;
    public final boolean d;
    public final int e;
    public final C1028c f;
    public final boolean g;
    public final int h;

    public C0578Pa(int i, boolean z, int i2, boolean z2, int i3, C1028c cVar, boolean z3, int i4) {
        this.f2841a = i;
        this.f2842b = z;
        this.f2843c = i2;
        this.d = z2;
        this.e = i3;
        this.f = cVar;
        this.g = z3;
        this.h = i4;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C0578Pa(d dVar) {
        this(4, dVar.f(), dVar.b(), dVar.e(), dVar.a(), dVar.d() != null ? new C1028c(dVar.d()) : null, dVar.g(), dVar.c());
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = c.a(parcel);
        c.a(parcel, 1, this.f2841a);
        c.a(parcel, 2, this.f2842b);
        c.a(parcel, 3, this.f2843c);
        c.a(parcel, 4, this.d);
        c.a(parcel, 5, this.e);
        c.a(parcel, 6, (Parcelable) this.f, i, false);
        c.a(parcel, 7, this.g);
        c.a(parcel, 8, this.h);
        c.a(parcel, a2);
    }
}
