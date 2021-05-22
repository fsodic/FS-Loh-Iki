package com.google.android.gms.common.internal.a;

import android.os.Parcel;

public final class e {
    public static <T extends d> byte[] a(T t) {
        Parcel obtain = Parcel.obtain();
        t.writeToParcel(obtain, 0);
        byte[] marshall = obtain.marshall();
        obtain.recycle();
        return marshall;
    }
}
