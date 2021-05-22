package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

public final class Oka implements Parcelable {
    public static final Parcelable.Creator<Oka> CREATOR = new Nka();

    /* renamed from: a  reason: collision with root package name */
    public final int f2779a;

    /* renamed from: b  reason: collision with root package name */
    public final int f2780b;

    /* renamed from: c  reason: collision with root package name */
    public final int f2781c;
    public final byte[] d;
    private int e;

    public Oka(int i, int i2, int i3, byte[] bArr) {
        this.f2779a = i;
        this.f2780b = i2;
        this.f2781c = i3;
        this.d = bArr;
    }

    Oka(Parcel parcel) {
        this.f2779a = parcel.readInt();
        this.f2780b = parcel.readInt();
        this.f2781c = parcel.readInt();
        this.d = parcel.readInt() != 0 ? parcel.createByteArray() : null;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && Oka.class == obj.getClass()) {
            Oka oka = (Oka) obj;
            return this.f2779a == oka.f2779a && this.f2780b == oka.f2780b && this.f2781c == oka.f2781c && Arrays.equals(this.d, oka.d);
        }
    }

    public final int hashCode() {
        if (this.e == 0) {
            this.e = ((((((this.f2779a + 527) * 31) + this.f2780b) * 31) + this.f2781c) * 31) + Arrays.hashCode(this.d);
        }
        return this.e;
    }

    public final String toString() {
        int i = this.f2779a;
        int i2 = this.f2780b;
        int i3 = this.f2781c;
        boolean z = this.d != null;
        StringBuilder sb = new StringBuilder(55);
        sb.append("ColorInfo(");
        sb.append(i);
        sb.append(", ");
        sb.append(i2);
        sb.append(", ");
        sb.append(i3);
        sb.append(", ");
        sb.append(z);
        sb.append(")");
        return sb.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f2779a);
        parcel.writeInt(this.f2780b);
        parcel.writeInt(this.f2781c);
        parcel.writeInt(this.d != null ? 1 : 0);
        byte[] bArr = this.d;
        if (bArr != null) {
            parcel.writeByteArray(bArr);
        }
    }
}
