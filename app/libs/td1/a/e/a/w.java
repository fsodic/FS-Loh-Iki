package a.e.a;

import android.os.Parcel;
import android.os.Parcelable;

class w implements Parcelable.Creator<x> {
    w() {
    }

    @Override // android.os.Parcelable.Creator
    public x createFromParcel(Parcel parcel) {
        return new x(parcel);
    }

    @Override // android.os.Parcelable.Creator
    public x[] newArray(int i) {
        return new x[i];
    }
}
