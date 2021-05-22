package a.e.a;

import android.os.Parcel;
import android.os.Parcelable;

/* access modifiers changed from: package-private */
public final class x implements Parcelable {
    public static final Parcelable.Creator<x> CREATOR = new w();

    /* renamed from: a  reason: collision with root package name */
    z[] f161a;

    /* renamed from: b  reason: collision with root package name */
    int[] f162b;

    /* renamed from: c  reason: collision with root package name */
    C0040c[] f163c;
    int d = -1;
    int e;

    public x() {
    }

    public x(Parcel parcel) {
        this.f161a = (z[]) parcel.createTypedArray(z.CREATOR);
        this.f162b = parcel.createIntArray();
        this.f163c = (C0040c[]) parcel.createTypedArray(C0040c.CREATOR);
        this.d = parcel.readInt();
        this.e = parcel.readInt();
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeTypedArray(this.f161a, i);
        parcel.writeIntArray(this.f162b);
        parcel.writeTypedArray(this.f163c, i);
        parcel.writeInt(this.d);
        parcel.writeInt(this.e);
    }
}
