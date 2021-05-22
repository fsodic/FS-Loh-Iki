package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Environment;
import android.text.TextUtils;
import java.io.File;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.atomic.AtomicBoolean;
import org.cocos2dx.lib.BuildConfig;

public final class A {

    /* renamed from: a  reason: collision with root package name */
    private BlockingQueue<L> f1481a = new ArrayBlockingQueue(100);

    /* renamed from: b  reason: collision with root package name */
    private LinkedHashMap<String, String> f1482b = new LinkedHashMap<>();

    /* renamed from: c  reason: collision with root package name */
    private Map<String, F> f1483c = new HashMap();
    private String d;
    private Context e;
    private String f;
    private final HashSet<String> g = new HashSet<>(Arrays.asList("noop", "activeViewPingSent", "viewabilityChanged", "visibilityChanged"));
    private AtomicBoolean h;
    private File i;

    /* JADX WARNING: Removed duplicated region for block: B:32:0x0087 A[SYNTHETIC, Splitter:B:32:0x0087] */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0092 A[SYNTHETIC, Splitter:B:37:0x0092] */
    /* JADX WARNING: Removed duplicated region for block: B:48:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void a(java.util.Map<java.lang.String, java.lang.String> r5, java.lang.String r6) {
        /*
        // Method dump skipped, instructions count: 172
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.A.a(java.util.Map, java.lang.String):void");
    }

    public final F a(String str) {
        F f2 = this.f1483c.get(str);
        return f2 != null ? f2 : F.f1926a;
    }

    /* access modifiers changed from: package-private */
    public final Map<String, String> a(Map<String, String> map, Map<String, String> map2) {
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        if (map2 == null) {
            return linkedHashMap;
        }
        for (Map.Entry<String, String> entry : map2.entrySet()) {
            String key = entry.getKey();
            String str = (String) linkedHashMap.get(key);
            linkedHashMap.put(key, a(key).a(str, entry.getValue()));
        }
        return linkedHashMap;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void a() {
        while (true) {
            try {
                L take = this.f1481a.take();
                String a2 = take.a();
                if (!TextUtils.isEmpty(a2)) {
                    a(a(this.f1482b, take.b()), a2);
                }
            } catch (InterruptedException e2) {
                C0745Vl.c("CsiReporter:reporter interrupted", e2);
                return;
            }
        }
    }

    public final void a(Context context, String str, String str2, Map<String, String> map) {
        File externalStorageDirectory;
        this.e = context;
        this.f = str;
        this.d = str2;
        this.h = new AtomicBoolean(false);
        this.h.set(C1743ma.f4959c.a().booleanValue());
        if (this.h.get() && (externalStorageDirectory = Environment.getExternalStorageDirectory()) != null) {
            this.i = new File(externalStorageDirectory, "sdk_csi_data.txt");
        }
        for (Map.Entry<String, String> entry : map.entrySet()) {
            this.f1482b.put(entry.getKey(), entry.getValue());
        }
        C0875_l.f3755a.execute(new E(this));
        this.f1483c.put("action", F.f1927b);
        this.f1483c.put("ad_format", F.f1927b);
        this.f1483c.put("e", F.f1928c);
    }

    public final boolean a(L l) {
        return this.f1481a.offer(l);
    }

    public final void b(String str) {
        if (!this.g.contains(str)) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("sdkVersion", this.f);
            linkedHashMap.put("ue", str);
            a(a(this.f1482b, linkedHashMap), BuildConfig.FLAVOR);
        }
    }
}
