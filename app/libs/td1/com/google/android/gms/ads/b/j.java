package com.google.android.gms.ads.b;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.a.a;
import com.google.android.gms.common.internal.a.c;
import com.google.android.gms.internal.ads.AbstractBinderC0605Qb;
import com.google.android.gms.internal.ads.AbstractC0631Rb;
import com.google.android.gms.internal.ads.Toa;
import com.google.android.gms.internal.ads.Uoa;

public final class j extends a {
    public static final Parcelable.Creator<j> CREATOR = new n();

    /* renamed from: a  reason: collision with root package name */
    private final boolean f1037a;

    /* renamed from: b  reason: collision with root package name */
    private final Uoa f1038b;

    /* renamed from: c  reason: collision with root package name */
    private final IBinder f1039c;

    j(boolean z, IBinder iBinder, IBinder iBinder2) {
        this.f1037a = z;
        this.f1038b = iBinder != null ? Toa.a(iBinder) : null;
        this.f1039c = iBinder2;
    }

    public final boolean L() {
        return this.f1037a;
    }

    public final Uoa M() {
        return this.f1038b;
    }

    public final AbstractC0631Rb N() {
        return AbstractBinderC0605Qb.a(this.f1039c);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = c.a(parcel);
        c.a(parcel, 1, L());
        Uoa uoa = this.f1038b;
        c.a(parcel, 2, uoa == null ? null : uoa.asBinder(), false);
        c.a(parcel, 3, this.f1039c, false);
        c.a(parcel, a2);
    }
}
