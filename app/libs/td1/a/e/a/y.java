package a.e.a;

import android.os.Parcel;
import android.os.Parcelable;

class y implements Parcelable.Creator<z> {
    y() {
    }

    @Override // android.os.Parcelable.Creator
    public z createFromParcel(Parcel parcel) {
        return new z(parcel);
    }

    @Override // android.os.Parcelable.Creator
    public z[] newArray(int i) {
        return new z[i];
    }
}
