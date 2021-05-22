package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.a.a;
import com.google.android.gms.common.internal.a.c;
import java.util.Collections;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.Eh  reason: case insensitive filesystem */
public final class C0299Eh extends a {
    public static final Parcelable.Creator<C0299Eh> CREATOR = new C0403Ih();

    /* renamed from: a  reason: collision with root package name */
    public final boolean f1883a;

    /* renamed from: b  reason: collision with root package name */
    public final List<String> f1884b;

    public C0299Eh() {
        this(false, Collections.emptyList());
    }

    public C0299Eh(boolean z, List<String> list) {
        this.f1883a = z;
        this.f1884b = list;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = c.a(parcel);
        c.a(parcel, 2, this.f1883a);
        c.b(parcel, 3, this.f1884b, false);
        c.a(parcel, a2);
    }
}
