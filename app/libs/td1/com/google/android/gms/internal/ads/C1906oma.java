package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.ads.internal.q;
import com.google.android.gms.common.internal.a.a;
import com.google.android.gms.common.internal.a.c;
import java.util.List;
import org.cocos2dx.lib.BuildConfig;

/* renamed from: com.google.android.gms.internal.ads.oma  reason: case insensitive filesystem */
public final class C1906oma extends a {
    public static final Parcelable.Creator<C1906oma> CREATOR = new C2181sma();

    /* renamed from: a  reason: collision with root package name */
    public final String f5165a;

    /* renamed from: b  reason: collision with root package name */
    private final long f5166b;

    /* renamed from: c  reason: collision with root package name */
    private final String f5167c;
    private final String d;
    private final String e;
    private final Bundle f;
    public final boolean g;
    public long h;

    C1906oma(String str, long j, String str2, String str3, String str4, Bundle bundle, boolean z, long j2) {
        this.f5165a = str;
        this.f5166b = j;
        String str5 = BuildConfig.FLAVOR;
        this.f5167c = str2 == null ? str5 : str2;
        this.d = str3 == null ? str5 : str3;
        this.e = str4 != null ? str4 : str5;
        this.f = bundle == null ? new Bundle() : bundle;
        this.g = z;
        this.h = j2;
    }

    public static C1906oma a(Uri uri) {
        try {
            if (!"gcache".equals(uri.getScheme())) {
                return null;
            }
            List<String> pathSegments = uri.getPathSegments();
            if (pathSegments.size() != 2) {
                int size = pathSegments.size();
                StringBuilder sb = new StringBuilder(62);
                sb.append("Expected 2 path parts for namespace and id, found :");
                sb.append(size);
                C0745Vl.d(sb.toString());
                return null;
            }
            String str = pathSegments.get(0);
            String str2 = pathSegments.get(1);
            String host = uri.getHost();
            String queryParameter = uri.getQueryParameter("url");
            boolean equals = "1".equals(uri.getQueryParameter("read_only"));
            String queryParameter2 = uri.getQueryParameter("expiration");
            long parseLong = queryParameter2 == null ? 0 : Long.parseLong(queryParameter2);
            Bundle bundle = new Bundle();
            q.e();
            for (String str3 : uri.getQueryParameterNames()) {
                if (str3.startsWith("tag.")) {
                    bundle.putString(str3.substring(4), uri.getQueryParameter(str3));
                }
            }
            return new C1906oma(queryParameter, parseLong, host, str, str2, bundle, equals, 0);
        } catch (NullPointerException | NumberFormatException e2) {
            C0745Vl.c("Unable to parse Uri into cache offering.", e2);
            return null;
        }
    }

    public static C1906oma a(String str) {
        return a(Uri.parse(str));
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = c.a(parcel);
        c.a(parcel, 2, this.f5165a, false);
        c.a(parcel, 3, this.f5166b);
        c.a(parcel, 4, this.f5167c, false);
        c.a(parcel, 5, this.d, false);
        c.a(parcel, 6, this.e, false);
        c.a(parcel, 7, this.f, false);
        c.a(parcel, 8, this.g);
        c.a(parcel, 9, this.h);
        c.a(parcel, a2);
    }
}
