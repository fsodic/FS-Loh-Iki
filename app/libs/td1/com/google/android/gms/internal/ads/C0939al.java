package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.a.a;
import com.google.android.gms.common.internal.a.c;
import org.cocos2dx.lib.BuildConfig;

/* renamed from: com.google.android.gms.internal.ads.al  reason: case insensitive filesystem */
public final class C0939al extends a {
    public static final Parcelable.Creator<C0939al> CREATOR = new C1077cl();

    /* renamed from: a  reason: collision with root package name */
    public final String f3837a;

    /* renamed from: b  reason: collision with root package name */
    public final int f3838b;

    C0939al(String str, int i) {
        this.f3837a = str == null ? BuildConfig.FLAVOR : str;
        this.f3838b = i;
    }

    public static C0939al a(Throwable th) {
        Sna a2 = C0896aF.a(th);
        return new C0939al(C2014qV.b(th.getMessage()) ? a2.f3129b : th.getMessage(), a2.f3128a);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = c.a(parcel);
        c.a(parcel, 1, this.f3837a, false);
        c.a(parcel, 2, this.f3838b);
        c.a(parcel, a2);
    }
}
