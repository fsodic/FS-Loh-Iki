package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.List;

public final class Yia implements Parcelable {
    public static final Parcelable.Creator<Yia> CREATOR = new Xia();

    /* renamed from: a  reason: collision with root package name */
    private final a[] f3580a;

    public interface a extends Parcelable {
    }

    Yia(Parcel parcel) {
        this.f3580a = new a[parcel.readInt()];
        int i = 0;
        while (true) {
            a[] aVarArr = this.f3580a;
            if (i < aVarArr.length) {
                aVarArr[i] = (a) parcel.readParcelable(a.class.getClassLoader());
                i++;
            } else {
                return;
            }
        }
    }

    public Yia(List<? extends a> list) {
        this.f3580a = new a[list.size()];
        list.toArray(this.f3580a);
    }

    public final int J() {
        return this.f3580a.length;
    }

    public final a a(int i) {
        return this.f3580a[i];
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || Yia.class != obj.getClass()) {
            return false;
        }
        return Arrays.equals(this.f3580a, ((Yia) obj).f3580a);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f3580a);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f3580a.length);
        for (a aVar : this.f3580a) {
            parcel.writeParcelable(aVar, 0);
        }
    }
}
