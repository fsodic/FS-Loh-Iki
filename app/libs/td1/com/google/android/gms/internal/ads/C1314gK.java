package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.q;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import org.cocos2dx.lib.BuildConfig;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.gK  reason: case insensitive filesystem */
public final class C1314gK {

    /* renamed from: a  reason: collision with root package name */
    private final Map<String, C1520jK> f4376a = new ConcurrentHashMap();

    /* renamed from: b  reason: collision with root package name */
    private final Map<String, Map<String, List<C1520jK>>> f4377b = new ConcurrentHashMap();

    /* renamed from: c  reason: collision with root package name */
    private final Executor f4378c;
    private JSONObject d;

    public C1314gK(Executor executor) {
        this.f4378c = executor;
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public final synchronized void d() {
        JSONArray optJSONArray;
        JSONObject f = q.g().i().m().f();
        if (f != null) {
            try {
                JSONArray optJSONArray2 = f.optJSONArray("ad_unit_id_settings");
                this.d = f.optJSONObject("ad_unit_patterns");
                if (optJSONArray2 != null) {
                    for (int i = 0; i < optJSONArray2.length(); i++) {
                        JSONObject jSONObject = optJSONArray2.getJSONObject(i);
                        String optString = jSONObject.optString("ad_unit_id", BuildConfig.FLAVOR);
                        String optString2 = jSONObject.optString("format", BuildConfig.FLAVOR);
                        ArrayList arrayList = new ArrayList();
                        JSONObject optJSONObject = jSONObject.optJSONObject("mediation_config");
                        if (!(optJSONObject == null || (optJSONArray = optJSONObject.optJSONArray("ad_networks")) == null)) {
                            for (int i2 = 0; i2 < optJSONArray.length(); i2++) {
                                JSONObject jSONObject2 = optJSONArray.getJSONObject(i2);
                                ArrayList arrayList2 = new ArrayList();
                                if (jSONObject2 != null) {
                                    JSONObject optJSONObject2 = jSONObject2.optJSONObject("data");
                                    Bundle bundle = new Bundle();
                                    if (optJSONObject2 != null) {
                                        Iterator<String> keys = optJSONObject2.keys();
                                        while (keys.hasNext()) {
                                            String next = keys.next();
                                            bundle.putString(next, optJSONObject2.optString(next, BuildConfig.FLAVOR));
                                        }
                                    }
                                    JSONArray optJSONArray3 = jSONObject2.optJSONArray("rtb_adapters");
                                    if (optJSONArray3 != null) {
                                        ArrayList arrayList3 = new ArrayList();
                                        for (int i3 = 0; i3 < optJSONArray3.length(); i3++) {
                                            String optString3 = optJSONArray3.optString(i3, BuildConfig.FLAVOR);
                                            if (!TextUtils.isEmpty(optString3)) {
                                                arrayList3.add(optString3);
                                            }
                                        }
                                        int size = arrayList3.size();
                                        int i4 = 0;
                                        while (i4 < size) {
                                            Object obj = arrayList3.get(i4);
                                            i4++;
                                            String str = (String) obj;
                                            a(str);
                                            if (this.f4376a.get(str) != null) {
                                                arrayList2.add(new C1520jK(str, optString2, bundle));
                                            }
                                        }
                                    }
                                }
                                arrayList.addAll(arrayList2);
                            }
                        }
                        if (!TextUtils.isEmpty(optString2) && !TextUtils.isEmpty(optString)) {
                            Map<String, List<C1520jK>> map = this.f4377b.get(optString2);
                            if (map == null) {
                                map = new ConcurrentHashMap<>();
                            }
                            this.f4377b.put(optString2, map);
                            List<C1520jK> list = map.get(optString);
                            if (list == null) {
                                list = new ArrayList<>();
                            }
                            list.addAll(arrayList);
                            map.put(optString, list);
                        }
                    }
                }
            } catch (JSONException e) {
                C1763mk.e("Malformed config loading JSON.", e);
            }
        }
    }

    public final Map<String, List<Bundle>> a(String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return Collections.emptyMap();
        }
        Map<String, List<C1520jK>> map = this.f4377b.get(str);
        if (map == null) {
            return Collections.emptyMap();
        }
        List<C1520jK> list = map.get(str2);
        if (list == null) {
            list = map.get(C2202tD.a(this.d, str2, str));
        }
        if (list == null) {
            return Collections.emptyMap();
        }
        HashMap hashMap = new HashMap();
        for (C1520jK jKVar : list) {
            String str3 = jKVar.f4660a;
            if (!hashMap.containsKey(str3)) {
                hashMap.put(str3, new ArrayList());
            }
            ((List) hashMap.get(str3)).add(jKVar.f4662c);
        }
        return hashMap;
    }

    public final void a() {
        q.g().i().a(new RunnableC1245fK(this));
        this.f4378c.execute(new RunnableC1452iK(this));
    }

    public final void a(String str) {
        if (!TextUtils.isEmpty(str) && !this.f4376a.containsKey(str)) {
            this.f4376a.put(str, new C1520jK(str, BuildConfig.FLAVOR, new Bundle()));
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void c() {
        this.f4378c.execute(new RunnableC1383hK(this));
    }
}
