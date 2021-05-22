package com.google.android.gms.common.api;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.a.a;
import com.google.android.gms.common.internal.a.c;
import com.google.android.gms.common.internal.r;

public final class Scope extends a implements ReflectedParcelable {
    public static final Parcelable.Creator<Scope> CREATOR = new p();

    /* renamed from: a  reason: collision with root package name */
    private final int f1173a;

    /* renamed from: b  reason: collision with root package name */
    private final String f1174b;

    Scope(int i, String str) {
        r.a(str, (Object) "scopeUri must not be null or empty");
        this.f1173a = i;
        this.f1174b = str;
    }

    public Scope(String str) {
        this(1, str);
    }

    public final String L() {
        return this.f1174b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Scope)) {
            return false;
        }
        return this.f1174b.equals(((Scope) obj).f1174b);
    }

    public final int hashCode() {
        return this.f1174b.hashCode();
    }

    public final String toString() {
        return this.f1174b;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = c.a(parcel);
        c.a(parcel, 1, this.f1173a);
        c.a(parcel, 2, L(), false);
        c.a(parcel, a2);
    }
}
