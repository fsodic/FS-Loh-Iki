package com.google.android.gms.games;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.a.c;
import com.google.android.gms.common.internal.r;
import com.google.android.gms.games.internal.q;

public final class i extends q {
    public static final Parcelable.Creator<i> CREATOR = new m();

    /* renamed from: a  reason: collision with root package name */
    private final long f1455a;

    /* renamed from: b  reason: collision with root package name */
    private final long f1456b;

    /* renamed from: c  reason: collision with root package name */
    private final h f1457c;
    private final h d;

    public i(long j, long j2, h hVar, h hVar2) {
        r.b(j != -1);
        r.a(hVar);
        r.a(hVar2);
        this.f1455a = j;
        this.f1456b = j2;
        this.f1457c = hVar;
        this.d = hVar2;
    }

    public final h L() {
        return this.f1457c;
    }

    public final long M() {
        return this.f1455a;
    }

    public final long N() {
        return this.f1456b;
    }

    public final h O() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof i)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        i iVar = (i) obj;
        return com.google.android.gms.common.internal.q.a(Long.valueOf(this.f1455a), Long.valueOf(iVar.f1455a)) && com.google.android.gms.common.internal.q.a(Long.valueOf(this.f1456b), Long.valueOf(iVar.f1456b)) && com.google.android.gms.common.internal.q.a(this.f1457c, iVar.f1457c) && com.google.android.gms.common.internal.q.a(this.d, iVar.d);
    }

    public final int hashCode() {
        return com.google.android.gms.common.internal.q.a(Long.valueOf(this.f1455a), Long.valueOf(this.f1456b), this.f1457c, this.d);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = c.a(parcel);
        c.a(parcel, 1, M());
        c.a(parcel, 2, N());
        c.a(parcel, 3, (Parcelable) L(), i, false);
        c.a(parcel, 4, (Parcelable) O(), i, false);
        c.a(parcel, a2);
    }
}
