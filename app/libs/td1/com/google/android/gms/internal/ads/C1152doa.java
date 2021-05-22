package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.a.a;
import com.google.android.gms.common.internal.a.c;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.doa  reason: case insensitive filesystem */
public final class C1152doa extends a {
    public static final Parcelable.Creator<C1152doa> CREATOR = new C1359goa();

    /* renamed from: a  reason: collision with root package name */
    public final int f4146a;

    /* renamed from: b  reason: collision with root package name */
    public final int f4147b;

    /* renamed from: c  reason: collision with root package name */
    public final String f4148c;
    public final long d;

    public C1152doa(int i, int i2, String str, long j) {
        this.f4146a = i;
        this.f4147b = i2;
        this.f4148c = str;
        this.d = j;
    }

    public static C1152doa a(JSONObject jSONObject) {
        return new C1152doa(jSONObject.getInt("type_num"), jSONObject.getInt("precision_num"), jSONObject.getString("currency"), jSONObject.getLong("value"));
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = c.a(parcel);
        c.a(parcel, 1, this.f4146a);
        c.a(parcel, 2, this.f4147b);
        c.a(parcel, 3, this.f4148c, false);
        c.a(parcel, 4, this.d);
        c.a(parcel, a2);
    }
}
