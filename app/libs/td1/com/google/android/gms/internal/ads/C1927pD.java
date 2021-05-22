package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.q;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.pD  reason: case insensitive filesystem */
public final class C1927pD {

    /* renamed from: a  reason: collision with root package name */
    private final Map<String, Map<String, JSONObject>> f5203a = new ConcurrentHashMap();

    /* renamed from: b  reason: collision with root package name */
    private final Executor f5204b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f5205c;
    private JSONObject d;

    public C1927pD(Executor executor) {
        this.f5204b = executor;
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public final synchronized void d() {
        Map<String, JSONObject> map;
        this.f5205c = true;
        C0873_j m = q.g().i().m();
        if (m != null) {
            JSONObject f = m.f();
            if (f != null) {
                this.d = f.optJSONObject("ad_unit_patterns");
                JSONArray optJSONArray = f.optJSONArray("ad_unit_id_settings");
                if (optJSONArray != null) {
                    for (int i = 0; i < optJSONArray.length(); i++) {
                        JSONObject optJSONObject = optJSONArray.optJSONObject(i);
                        if (optJSONObject != null) {
                            String optString = optJSONObject.optString("ad_unit_id");
                            String optString2 = optJSONObject.optString("format");
                            JSONObject optJSONObject2 = optJSONObject.optJSONObject("request_signals");
                            if (!(optString == null || optJSONObject2 == null || optString2 == null)) {
                                if (this.f5203a.containsKey(optString2)) {
                                    map = this.f5203a.get(optString2);
                                } else {
                                    ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
                                    this.f5203a.put(optString2, concurrentHashMap);
                                    map = concurrentHashMap;
                                }
                                map.put(optString, optJSONObject2);
                            }
                        }
                    }
                }
            }
        }
    }

    public final void a() {
        q.g().i().a(new RunnableC1858oD(this));
        this.f5204b.execute(new RunnableC2133sD(this));
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void c() {
        this.f5204b.execute(new RunnableC2064rD(this));
    }
}
