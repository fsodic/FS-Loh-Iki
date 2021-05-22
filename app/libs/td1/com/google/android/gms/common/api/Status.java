package com.google.android.gms.common.api;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.a.a;
import com.google.android.gms.common.internal.a.c;
import com.google.android.gms.common.internal.q;

public final class Status extends a implements i, ReflectedParcelable {
    public static final Parcelable.Creator<Status> CREATOR = new q();

    /* renamed from: a  reason: collision with root package name */
    public static final Status f1175a = new Status(0);

    /* renamed from: b  reason: collision with root package name */
    public static final Status f1176b = new Status(14);

    /* renamed from: c  reason: collision with root package name */
    public static final Status f1177c = new Status(8);
    public static final Status d = new Status(15);
    public static final Status e = new Status(16);
    private static final Status f = new Status(17);
    public static final Status g = new Status(18);
    private final int h;
    private final int i;
    private final String j;
    private final PendingIntent k;

    public Status(int i2) {
        this(i2, null);
    }

    Status(int i2, int i3, String str, PendingIntent pendingIntent) {
        this.h = i2;
        this.i = i3;
        this.j = str;
        this.k = pendingIntent;
    }

    public Status(int i2, String str) {
        this(1, i2, str, null);
    }

    public Status(int i2, String str, PendingIntent pendingIntent) {
        this(1, i2, str, pendingIntent);
    }

    @Override // com.google.android.gms.common.api.i
    public final Status E() {
        return this;
    }

    public final int L() {
        return this.i;
    }

    public final String M() {
        return this.j;
    }

    public final boolean N() {
        return this.i <= 0;
    }

    public final String O() {
        String str = this.j;
        return str != null ? str : d.a(this.i);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof Status)) {
            return false;
        }
        Status status = (Status) obj;
        return this.h == status.h && this.i == status.i && q.a(this.j, status.j) && q.a(this.k, status.k);
    }

    public final int hashCode() {
        return q.a(Integer.valueOf(this.h), Integer.valueOf(this.i), this.j, this.k);
    }

    public final String toString() {
        q.a a2 = q.a(this);
        a2.a("statusCode", O());
        a2.a("resolution", this.k);
        return a2.toString();
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int a2 = c.a(parcel);
        c.a(parcel, 1, L());
        c.a(parcel, 2, M(), false);
        c.a(parcel, 3, (Parcelable) this.k, i2, false);
        c.a(parcel, 1000, this.h);
        c.a(parcel, a2);
    }
}
