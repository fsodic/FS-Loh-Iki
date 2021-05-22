package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.ads.g.b;
import com.google.android.gms.common.internal.a.a;
import com.google.android.gms.common.internal.a.c;
import com.google.android.gms.common.internal.q;
import org.json.JSONArray;

/* renamed from: com.google.android.gms.internal.ads.Ki  reason: case insensitive filesystem */
public final class C0456Ki extends a {
    public static final Parcelable.Creator<C0456Ki> CREATOR = new C0534Ni();

    /* renamed from: a  reason: collision with root package name */
    public final String f2422a;

    /* renamed from: b  reason: collision with root package name */
    public final int f2423b;

    public C0456Ki(b bVar) {
        this(bVar.getType(), bVar.A());
    }

    public C0456Ki(String str, int i) {
        this.f2422a = str;
        this.f2423b = i;
    }

    public static C0456Ki a(JSONArray jSONArray) {
        if (jSONArray == null || jSONArray.length() == 0) {
            return null;
        }
        return new C0456Ki(jSONArray.getJSONObject(0).optString("rb_type"), jSONArray.getJSONObject(0).optInt("rb_amount"));
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof C0456Ki)) {
            C0456Ki ki = (C0456Ki) obj;
            return q.a(this.f2422a, ki.f2422a) && q.a(Integer.valueOf(this.f2423b), Integer.valueOf(ki.f2423b));
        }
    }

    public final int hashCode() {
        return q.a(this.f2422a, Integer.valueOf(this.f2423b));
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = c.a(parcel);
        c.a(parcel, 2, this.f2422a, false);
        c.a(parcel, 3, this.f2423b);
        c.a(parcel, a2);
    }
}
