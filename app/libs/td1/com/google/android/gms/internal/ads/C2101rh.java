package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import b.c.b.a.c.a;
import b.c.b.a.c.b;
import com.google.android.gms.common.internal.a.a;
import com.google.android.gms.common.internal.a.c;
import java.lang.ref.WeakReference;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.rh  reason: case insensitive filesystem */
public final class C2101rh extends a {
    public static final Parcelable.Creator<C2101rh> CREATOR = new C2033qh();

    /* renamed from: a  reason: collision with root package name */
    public final View f5441a;

    /* renamed from: b  reason: collision with root package name */
    public final Map<String, WeakReference<View>> f5442b;

    public C2101rh(IBinder iBinder, IBinder iBinder2) {
        this.f5441a = (View) b.Q(a.AbstractBinderC0013a.a(iBinder));
        this.f5442b = (Map) b.Q(a.AbstractBinderC0013a.a(iBinder2));
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = c.a(parcel);
        c.a(parcel, 1, b.a(this.f5441a).asBinder(), false);
        c.a(parcel, 2, b.a(this.f5442b).asBinder(), false);
        c.a(parcel, a2);
    }
}
