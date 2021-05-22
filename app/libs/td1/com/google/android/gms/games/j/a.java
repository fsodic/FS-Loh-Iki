package com.google.android.gms.games.j;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.a.c;
import com.google.android.gms.common.internal.q;
import com.google.android.gms.games.internal.q;

public final class a extends q {
    public static final Parcelable.Creator<a> CREATOR = new c();

    /* renamed from: a  reason: collision with root package name */
    private final boolean f1478a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f1479b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f1480c;
    private final boolean[] d;
    private final boolean[] e;

    public a(boolean z, boolean z2, boolean z3, boolean[] zArr, boolean[] zArr2) {
        this.f1478a = z;
        this.f1479b = z2;
        this.f1480c = z3;
        this.d = zArr;
        this.e = zArr2;
    }

    public final boolean[] L() {
        return this.d;
    }

    public final boolean[] M() {
        return this.e;
    }

    public final boolean N() {
        return this.f1478a;
    }

    public final boolean O() {
        return this.f1479b;
    }

    public final boolean P() {
        return this.f1480c;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof a)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        a aVar = (a) obj;
        return com.google.android.gms.common.internal.q.a(aVar.L(), L()) && com.google.android.gms.common.internal.q.a(aVar.M(), M()) && com.google.android.gms.common.internal.q.a(Boolean.valueOf(aVar.N()), Boolean.valueOf(N())) && com.google.android.gms.common.internal.q.a(Boolean.valueOf(aVar.O()), Boolean.valueOf(O())) && com.google.android.gms.common.internal.q.a(Boolean.valueOf(aVar.P()), Boolean.valueOf(P()));
    }

    public final int hashCode() {
        return com.google.android.gms.common.internal.q.a(L(), M(), Boolean.valueOf(N()), Boolean.valueOf(O()), Boolean.valueOf(P()));
    }

    public final String toString() {
        q.a a2 = com.google.android.gms.common.internal.q.a(this);
        a2.a("SupportedCaptureModes", L());
        a2.a("SupportedQualityLevels", M());
        a2.a("CameraSupported", Boolean.valueOf(N()));
        a2.a("MicSupported", Boolean.valueOf(O()));
        a2.a("StorageWriteSupported", Boolean.valueOf(P()));
        return a2.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = c.a(parcel);
        c.a(parcel, 1, N());
        c.a(parcel, 2, O());
        c.a(parcel, 3, P());
        c.a(parcel, 4, L(), false);
        c.a(parcel, 5, M(), false);
        c.a(parcel, a2);
    }
}
