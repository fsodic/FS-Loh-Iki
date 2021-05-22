package com.google.android.gms.internal.ads;

import android.util.JsonReader;
import java.util.Collections;
import java.util.List;
import org.cocos2dx.lib.BuildConfig;

/* renamed from: com.google.android.gms.internal.ads.rR  reason: case insensitive filesystem */
public final class C2078rR {

    /* renamed from: a  reason: collision with root package name */
    public final List<String> f5409a;

    /* renamed from: b  reason: collision with root package name */
    public final String f5410b;

    /* renamed from: c  reason: collision with root package name */
    public final int f5411c;
    public final String d;
    public final int e;
    public final long f;

    C2078rR(JsonReader jsonReader) {
        List<String> emptyList = Collections.emptyList();
        jsonReader.beginObject();
        String str = BuildConfig.FLAVOR;
        int i = 0;
        long j = 0;
        int i2 = 0;
        String str2 = str;
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            if ("nofill_urls".equals(nextName)) {
                emptyList = C2041ql.a(jsonReader);
            } else if ("refresh_interval".equals(nextName)) {
                i = jsonReader.nextInt();
            } else if ("gws_query_id".equals(nextName)) {
                str = jsonReader.nextString();
            } else if ("analytics_query_ad_event_id".equals(nextName)) {
                str2 = jsonReader.nextString();
            } else if ("response_code".equals(nextName)) {
                i2 = jsonReader.nextInt();
            } else if ("latency".equals(nextName)) {
                j = jsonReader.nextLong();
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        this.f5409a = emptyList;
        this.f5411c = i;
        this.f5410b = str;
        this.d = str2;
        this.e = i2;
        this.f = j;
    }
}
