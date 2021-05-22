package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.text.TextUtils;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.google.android.gms.internal.ads.mE  reason: case insensitive filesystem */
public final class C1721mE {

    /* renamed from: a  reason: collision with root package name */
    private ConcurrentHashMap<String, String> f4924a;

    public C1721mE(C2272uE uEVar) {
        this.f4924a = uEVar.b();
    }

    public final Map<String, String> a() {
        return this.f4924a;
    }

    public final void a(Bundle bundle) {
        if (bundle.containsKey("cnt")) {
            this.f4924a.put("network_coarse", Integer.toString(bundle.getInt("cnt")));
        }
        if (bundle.containsKey("gnt")) {
            this.f4924a.put("network_fine", Integer.toString(bundle.getInt("gnt")));
        }
    }

    public final void a(BR br) {
        ConcurrentHashMap<String, String> concurrentHashMap;
        String str;
        if (br.f1611b.f6180a.size() > 0) {
            int i = br.f1611b.f6180a.get(0).f5230b;
            if (i == 1) {
                concurrentHashMap = this.f4924a;
                str = "banner";
            } else if (i == 2) {
                concurrentHashMap = this.f4924a;
                str = "interstitial";
            } else if (i == 3) {
                concurrentHashMap = this.f4924a;
                str = "native_express";
            } else if (i == 4) {
                concurrentHashMap = this.f4924a;
                str = "native_advanced";
            } else if (i != 5) {
                concurrentHashMap = this.f4924a;
                str = "unknown";
            } else {
                concurrentHashMap = this.f4924a;
                str = "rewarded";
            }
            concurrentHashMap.put("ad_format", str);
        }
        if (!TextUtils.isEmpty(br.f1611b.f6181b.f5410b)) {
            this.f4924a.put("gqi", br.f1611b.f6181b.f5410b);
        }
    }
}
