package com.google.android.gms.games.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.a.c;

public final class l extends q {
    public static final Parcelable.Creator<l> CREATOR = new m();

    /* renamed from: a  reason: collision with root package name */
    private final Bundle f1464a;

    /* renamed from: b  reason: collision with root package name */
    private final IBinder f1465b;

    l(Bundle bundle, IBinder iBinder) {
        this.f1464a = bundle;
        this.f1465b = iBinder;
    }

    public l(p pVar) {
        this.f1464a = pVar.a();
        this.f1465b = pVar.f1469a;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = c.a(parcel);
        c.a(parcel, 1, this.f1464a, false);
        c.a(parcel, 2, this.f1465b, false);
        c.a(parcel, a2);
    }
}
