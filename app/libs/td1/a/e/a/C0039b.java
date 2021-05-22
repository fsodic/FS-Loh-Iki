package a.e.a;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: a.e.a.b  reason: case insensitive filesystem */
class C0039b implements Parcelable.Creator<C0040c> {
    C0039b() {
    }

    @Override // android.os.Parcelable.Creator
    public C0040c createFromParcel(Parcel parcel) {
        return new C0040c(parcel);
    }

    @Override // android.os.Parcelable.Creator
    public C0040c[] newArray(int i) {
        return new C0040c[i];
    }
}
