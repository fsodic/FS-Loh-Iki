package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.a.a;
import com.google.android.gms.common.internal.a.c;

/* renamed from: com.google.android.gms.internal.ads.nd  reason: case insensitive filesystem */
public final class C1818nd extends a {
    public static final Parcelable.Creator<C1818nd> CREATOR = new C2025qd();

    /* renamed from: a  reason: collision with root package name */
    public final String f5057a;

    /* renamed from: b  reason: collision with root package name */
    public final Bundle f5058b;

    public C1818nd(String str, Bundle bundle) {
        this.f5057a = str;
        this.f5058b = bundle;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = c.a(parcel);
        c.a(parcel, 1, this.f5057a, false);
        c.a(parcel, 2, this.f5058b, false);
        c.a(parcel, a2);
    }
}
