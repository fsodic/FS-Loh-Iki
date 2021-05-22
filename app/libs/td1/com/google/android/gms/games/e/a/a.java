package com.google.android.gms.games.e.a;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.r;

public final class a implements Parcelable {
    public static final Parcelable.Creator<a> CREATOR = new c();

    /* renamed from: a  reason: collision with root package name */
    private final String f1448a;

    /* renamed from: b  reason: collision with root package name */
    private final byte[] f1449b;

    /* renamed from: c  reason: collision with root package name */
    private final int f1450c;

    private a(Parcel parcel) {
        this(parcel.readString(), parcel.createByteArray(), parcel.readInt());
    }

    /* synthetic */ a(Parcel parcel, c cVar) {
        this(parcel);
    }

    private a(String str, byte[] bArr, int i) {
        r.a((Object) str);
        this.f1448a = str;
        r.a(bArr);
        this.f1449b = (byte[]) bArr.clone();
        this.f1450c = i;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f1448a);
        parcel.writeByteArray(this.f1449b);
        parcel.writeInt(this.f1450c);
    }
}
