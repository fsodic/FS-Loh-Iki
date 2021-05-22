package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.annotation.KeepName;

@KeepName
public final class BinderWrapper implements Parcelable {
    public static final Parcelable.Creator<BinderWrapper> CREATOR = new B();

    /* renamed from: a  reason: collision with root package name */
    private IBinder f1326a;

    public BinderWrapper(IBinder iBinder) {
        this.f1326a = null;
        this.f1326a = iBinder;
    }

    private BinderWrapper(Parcel parcel) {
        this.f1326a = null;
        this.f1326a = parcel.readStrongBinder();
    }

    /* synthetic */ BinderWrapper(Parcel parcel, B b2) {
        this(parcel);
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeStrongBinder(this.f1326a);
    }
}
