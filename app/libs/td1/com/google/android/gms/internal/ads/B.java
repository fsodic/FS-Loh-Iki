package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Build;
import com.google.android.gms.ads.internal.q;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.Future;

public final class B {

    /* renamed from: a  reason: collision with root package name */
    private String f1581a;

    /* renamed from: b  reason: collision with root package name */
    private Map<String, String> f1582b;

    /* renamed from: c  reason: collision with root package name */
    private Context f1583c = null;
    private String d = null;

    public B(Context context, String str) {
        this.f1583c = context;
        this.d = str;
        this.f1581a = C1536ja.f4684b.a();
        this.f1582b = new LinkedHashMap();
        this.f1582b.put("s", "gmob_sdk");
        this.f1582b.put("v", "3");
        this.f1582b.put("os", Build.VERSION.RELEASE);
        this.f1582b.put("api_v", Build.VERSION.SDK);
        Map<String, String> map = this.f1582b;
        q.c();
        map.put("device", C2452wk.b());
        this.f1582b.put("app", context.getApplicationContext() != null ? context.getApplicationContext().getPackageName() : context.getPackageName());
        Map<String, String> map2 = this.f1582b;
        q.c();
        map2.put("is_lite_sdk", C2452wk.k(context) ? "1" : "0");
        Future<C0845Zh> a2 = q.n().a(this.f1583c);
        try {
            this.f1582b.put("network_coarse", Integer.toString(a2.get().o));
            this.f1582b.put("network_fine", Integer.toString(a2.get().p));
        } catch (Exception e) {
            q.g().a(e, "CsiConfiguration.CsiConfiguration");
        }
    }

    /* access modifiers changed from: package-private */
    public final Context a() {
        return this.f1583c;
    }

    /* access modifiers changed from: package-private */
    public final String b() {
        return this.d;
    }

    /* access modifiers changed from: package-private */
    public final String c() {
        return this.f1581a;
    }

    /* access modifiers changed from: package-private */
    public final Map<String, String> d() {
        return this.f1582b;
    }
}
