package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: com.google.android.gms.internal.ads.dja  reason: case insensitive filesystem */
public final class C1143dja extends AbstractC1211eja {
    public static final Parcelable.Creator<C1143dja> CREATOR = new C1349gja();

    /* renamed from: a  reason: collision with root package name */
    private final String f4134a;

    /* renamed from: b  reason: collision with root package name */
    private final String f4135b;

    C1143dja(Parcel parcel) {
        super(parcel.readString());
        this.f4134a = parcel.readString();
        this.f4135b = parcel.readString();
    }

    public C1143dja(String str, String str2, String str3) {
        super(str);
        this.f4134a = null;
        this.f4135b = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C1143dja.class == obj.getClass()) {
            C1143dja dja = (C1143dja) obj;
            return super.f4230a.equals(((AbstractC1211eja) dja).f4230a) && Jka.a(this.f4134a, dja.f4134a) && Jka.a(this.f4135b, dja.f4135b);
        }
    }

    public final int hashCode() {
        int hashCode = (super.f4230a.hashCode() + 527) * 31;
        String str = this.f4134a;
        int i = 0;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f4135b;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode2 + i;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(super.f4230a);
        parcel.writeString(this.f4134a);
        parcel.writeString(this.f4135b);
    }
}
