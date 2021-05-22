package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.a.a;
import com.google.android.gms.common.internal.a.c;
import java.util.ArrayList;
import java.util.List;
import org.cocos2dx.lib.BuildConfig;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.lj  reason: case insensitive filesystem */
public final class C1692lj extends a {
    public static final Parcelable.Creator<C1692lj> CREATOR = new C1623kj();

    /* renamed from: a  reason: collision with root package name */
    public final String f4893a;

    /* renamed from: b  reason: collision with root package name */
    public final String f4894b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f4895c;
    public final boolean d;
    public final List<String> e;
    public final boolean f;
    public final boolean g;
    public final List<String> h;

    public C1692lj(String str, String str2, boolean z, boolean z2, List<String> list, boolean z3, boolean z4, List<String> list2) {
        this.f4893a = str;
        this.f4894b = str2;
        this.f4895c = z;
        this.d = z2;
        this.e = list;
        this.f = z3;
        this.g = z4;
        this.h = list2 == null ? new ArrayList<>() : list2;
    }

    public static C1692lj a(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        return new C1692lj(jSONObject.optString("click_string", BuildConfig.FLAVOR), jSONObject.optString("report_url", BuildConfig.FLAVOR), jSONObject.optBoolean("rendered_ad_enabled", false), jSONObject.optBoolean("non_malicious_reporting_enabled", false), C2041ql.a(jSONObject.optJSONArray("allowed_headers"), (List<String>) null), jSONObject.optBoolean("protection_enabled", false), jSONObject.optBoolean("malicious_reporting_enabled", false), C2041ql.a(jSONObject.optJSONArray("webview_permissions"), (List<String>) null));
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = c.a(parcel);
        c.a(parcel, 2, this.f4893a, false);
        c.a(parcel, 3, this.f4894b, false);
        c.a(parcel, 4, this.f4895c);
        c.a(parcel, 5, this.d);
        c.b(parcel, 6, this.e, false);
        c.a(parcel, 7, this.f);
        c.a(parcel, 8, this.g);
        c.b(parcel, 9, this.h, false);
        c.a(parcel, a2);
    }
}
