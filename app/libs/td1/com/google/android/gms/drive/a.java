package com.google.android.gms.drive;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import com.google.android.gms.common.internal.a.c;

public class a extends com.google.android.gms.common.internal.a.a {
    public static final Parcelable.Creator<a> CREATOR = new b();

    /* renamed from: a  reason: collision with root package name */
    private final ParcelFileDescriptor f1415a;

    /* renamed from: b  reason: collision with root package name */
    final int f1416b;

    /* renamed from: c  reason: collision with root package name */
    private final int f1417c;
    private final DriveId d;
    private final boolean e;
    private final String f;

    public a(ParcelFileDescriptor parcelFileDescriptor, int i, int i2, DriveId driveId, boolean z, String str) {
        this.f1415a = parcelFileDescriptor;
        this.f1416b = i;
        this.f1417c = i2;
        this.d = driveId;
        this.e = z;
        this.f = str;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int a2 = c.a(parcel);
        c.a(parcel, 2, (Parcelable) this.f1415a, i, false);
        c.a(parcel, 3, this.f1416b);
        c.a(parcel, 4, this.f1417c);
        c.a(parcel, 5, (Parcelable) this.d, i, false);
        c.a(parcel, 7, this.e);
        c.a(parcel, 8, this.f, false);
        c.a(parcel, a2);
    }
}
