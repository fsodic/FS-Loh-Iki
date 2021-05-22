package com.google.android.gms.games;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.a.c;
import com.google.android.gms.common.internal.q;
import com.google.android.gms.common.internal.r;
import com.google.android.gms.games.internal.q;

public final class h extends q {
    public static final Parcelable.Creator<h> CREATOR = new l();

    /* renamed from: a  reason: collision with root package name */
    private final int f1452a;

    /* renamed from: b  reason: collision with root package name */
    private final long f1453b;

    /* renamed from: c  reason: collision with root package name */
    private final long f1454c;

    public h(int i, long j, long j2) {
        boolean z = true;
        r.b(j >= 0, "Min XP must be positive!");
        r.b(j2 <= j ? false : z, "Max XP must be more than min XP!");
        this.f1452a = i;
        this.f1453b = j;
        this.f1454c = j2;
    }

    public final int L() {
        return this.f1452a;
    }

    public final long M() {
        return this.f1454c;
    }

    public final long N() {
        return this.f1453b;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof h)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        h hVar = (h) obj;
        return com.google.android.gms.common.internal.q.a(Integer.valueOf(hVar.L()), Integer.valueOf(L())) && com.google.android.gms.common.internal.q.a(Long.valueOf(hVar.N()), Long.valueOf(N())) && com.google.android.gms.common.internal.q.a(Long.valueOf(hVar.M()), Long.valueOf(M()));
    }

    public final int hashCode() {
        return com.google.android.gms.common.internal.q.a(Integer.valueOf(this.f1452a), Long.valueOf(this.f1453b), Long.valueOf(this.f1454c));
    }

    public final String toString() {
        q.a a2 = com.google.android.gms.common.internal.q.a(this);
        a2.a("LevelNumber", Integer.valueOf(L()));
        a2.a("MinXp", Long.valueOf(N()));
        a2.a("MaxXp", Long.valueOf(M()));
        return a2.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = c.a(parcel);
        c.a(parcel, 1, L());
        c.a(parcel, 2, N());
        c.a(parcel, 3, M());
        c.a(parcel, a2);
    }
}
