package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.a.a;
import com.google.android.gms.common.internal.a.c;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.Pc  reason: case insensitive filesystem */
public final class C0580Pc extends a {
    public static final Parcelable.Creator<C0580Pc> CREATOR = new C0658Sc();

    /* renamed from: a  reason: collision with root package name */
    private final String f2847a;

    /* renamed from: b  reason: collision with root package name */
    private final String[] f2848b;

    /* renamed from: c  reason: collision with root package name */
    private final String[] f2849c;

    C0580Pc(String str, String[] strArr, String[] strArr2) {
        this.f2847a = str;
        this.f2848b = strArr;
        this.f2849c = strArr2;
    }

    public static C0580Pc a(AbstractC0959b<?> bVar) {
        Map<String, String> a2 = bVar.a();
        int size = a2.size();
        String[] strArr = new String[size];
        String[] strArr2 = new String[size];
        int i = 0;
        for (Map.Entry<String, String> entry : a2.entrySet()) {
            strArr[i] = entry.getKey();
            strArr2[i] = entry.getValue();
            i++;
        }
        return new C0580Pc(bVar.c(), strArr, strArr2);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = c.a(parcel);
        c.a(parcel, 1, this.f2847a, false);
        c.a(parcel, 2, this.f2848b, false);
        c.a(parcel, 3, this.f2849c, false);
        c.a(parcel, a2);
    }
}
