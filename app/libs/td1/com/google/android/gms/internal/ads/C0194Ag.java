package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.ads.mediation.z;
import com.google.android.gms.common.internal.a.a;
import com.google.android.gms.common.internal.a.c;
import java.util.Arrays;

/* renamed from: com.google.android.gms.internal.ads.Ag  reason: case insensitive filesystem */
public final class C0194Ag extends a {
    public static final Parcelable.Creator<C0194Ag> CREATOR = new C2651zg();

    /* renamed from: a  reason: collision with root package name */
    private final int f1529a;

    /* renamed from: b  reason: collision with root package name */
    private final int f1530b;

    /* renamed from: c  reason: collision with root package name */
    private final int f1531c;

    C0194Ag(int i, int i2, int i3) {
        this.f1529a = i;
        this.f1530b = i2;
        this.f1531c = i3;
    }

    public static C0194Ag a(z zVar) {
        zVar.a();
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof C0194Ag)) {
            C0194Ag ag = (C0194Ag) obj;
            return ag.f1531c == this.f1531c && ag.f1530b == this.f1530b && ag.f1529a == this.f1529a;
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new int[]{this.f1529a, this.f1530b, this.f1531c});
    }

    public final String toString() {
        int i = this.f1529a;
        int i2 = this.f1530b;
        int i3 = this.f1531c;
        StringBuilder sb = new StringBuilder(35);
        sb.append(i);
        sb.append(".");
        sb.append(i2);
        sb.append(".");
        sb.append(i3);
        return sb.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = c.a(parcel);
        c.a(parcel, 1, this.f1529a);
        c.a(parcel, 2, this.f1530b);
        c.a(parcel, 3, this.f1531c);
        c.a(parcel, a2);
    }
}
