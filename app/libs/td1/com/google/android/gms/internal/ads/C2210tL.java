package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.util.JsonReader;
import com.google.android.gms.ads.internal.q;
import java.util.HashMap;
import java.util.Map;
import org.cocos2dx.lib.BuildConfig;
import org.json.JSONException;

/* renamed from: com.google.android.gms.internal.ads.tL  reason: case insensitive filesystem */
public final class C2210tL {

    /* renamed from: a  reason: collision with root package name */
    public final String f5596a;

    /* renamed from: b  reason: collision with root package name */
    public String f5597b;

    /* renamed from: c  reason: collision with root package name */
    public Bundle f5598c = new Bundle();

    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:30:0x0016 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:34:0x0016 */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX DEBUG: Type inference failed for r2v1. Raw type applied. Possible types: java.util.Map, java.util.Map<java.lang.String, java.lang.String> */
    public C2210tL(JsonReader jsonReader) {
        Map hashMap = new HashMap();
        jsonReader.beginObject();
        Map map = hashMap;
        String str = BuildConfig.FLAVOR;
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName = nextName == null ? BuildConfig.FLAVOR : nextName;
            char c2 = 65535;
            int hashCode = nextName.hashCode();
            if (hashCode != -995427962) {
                if (hashCode == -271442291 && nextName.equals("signal_dictionary")) {
                    c2 = 1;
                }
            } else if (nextName.equals("params")) {
                c2 = 0;
            }
            if (c2 == 0) {
                str = jsonReader.nextString();
            } else if (c2 != 1) {
                jsonReader.skipValue();
            } else {
                map = C2041ql.b(jsonReader);
            }
        }
        this.f5596a = str;
        jsonReader.endObject();
        for (Map.Entry entry : map.entrySet()) {
            if (!(entry.getKey() == null || entry.getValue() == null)) {
                this.f5598c.putString((String) entry.getKey(), (String) entry.getValue());
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final C2210tL a(Bundle bundle) {
        try {
            this.f5597b = q.c().a(bundle).toString();
        } catch (JSONException unused) {
            this.f5597b = "{}";
        }
        return this;
    }
}
