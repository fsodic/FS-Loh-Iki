package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Executor;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.xB  reason: case insensitive filesystem */
public final class C2476xB {

    /* renamed from: a  reason: collision with root package name */
    private final Executor f5948a;

    /* renamed from: b  reason: collision with root package name */
    private final C1374hB f5949b;

    public C2476xB(Executor executor, C1374hB hBVar) {
        this.f5948a = executor;
        this.f5949b = hBVar;
    }

    public final SW<List<CB>> a(JSONObject jSONObject, String str) {
        SW sw;
        String optString;
        JSONArray optJSONArray = jSONObject.optJSONArray(str);
        if (optJSONArray == null) {
            return JW.a((Object) Collections.emptyList());
        }
        ArrayList arrayList = new ArrayList();
        int length = optJSONArray.length();
        for (int i = 0; i < length; i++) {
            JSONObject optJSONObject = optJSONArray.optJSONObject(i);
            if (!(optJSONObject == null || (optString = optJSONObject.optString("name")) == null)) {
                String optString2 = optJSONObject.optString("type");
                char c2 = "string".equals(optString2) ? 1 : "image".equals(optString2) ? (char) 2 : 0;
                if (c2 == 1) {
                    sw = JW.a(new CB(optString, optJSONObject.optString("string_value")));
                } else if (c2 == 2) {
                    sw = JW.a(this.f5949b.a(optJSONObject, "image_value"), new C2614zB(optString), this.f5948a);
                }
                arrayList.add(sw);
            }
            sw = JW.a((Object) null);
            arrayList.add(sw);
        }
        return JW.a(JW.a((Iterable) arrayList), AB.f1485a, this.f5948a);
    }
}
