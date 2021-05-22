package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.q;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.gms.internal.ads.uE  reason: case insensitive filesystem */
public final class C2272uE {

    /* renamed from: a  reason: collision with root package name */
    private final String f5692a = C1536ja.f4684b.a();

    /* renamed from: b  reason: collision with root package name */
    private final Executor f5693b;

    /* renamed from: c  reason: collision with root package name */
    private final C0849Zl f5694c;
    private final Context d;
    private final String e;
    private final Map<String, String> f = new HashMap();
    private final boolean g;
    private final String h;

    public C2272uE(Executor executor, C0849Zl zl, Context context, C0823Yl yl) {
        this.f5693b = executor;
        this.f5694c = zl;
        this.d = context;
        this.e = context.getPackageName();
        this.g = ((double) C2392voa.h().nextFloat()) <= C1536ja.f4683a.a().doubleValue();
        this.h = yl.f3587a;
        this.f.put("s", "gmob_sdk");
        this.f.put("v", "3");
        this.f.put("os", Build.VERSION.RELEASE);
        this.f.put("api_v", Build.VERSION.SDK);
        Map<String, String> map = this.f;
        q.c();
        map.put("device", C2452wk.b());
        this.f.put("app", this.e);
        Map<String, String> map2 = this.f;
        q.c();
        map2.put("is_lite_sdk", C2452wk.k(this.d) ? "1" : "0");
        this.f.put("e", TextUtils.join(",", C2474x.b()));
        this.f.put("sdkVersion", this.h);
    }

    public final Map<String, String> a() {
        return new HashMap(this.f);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void a(String str) {
        this.f5694c.a(str);
    }

    /* access modifiers changed from: package-private */
    public final void a(Map<String, String> map) {
        Uri.Builder buildUpon = Uri.parse(this.f5692a).buildUpon();
        for (Map.Entry<String, String> entry : map.entrySet()) {
            buildUpon.appendQueryParameter(entry.getKey(), entry.getValue());
        }
        String uri = buildUpon.build().toString();
        if (this.g) {
            this.f5693b.execute(new RunnableC2479xE(this, uri));
        }
        C1763mk.f(uri);
    }

    public final ConcurrentHashMap<String, String> b() {
        return new ConcurrentHashMap<>(this.f);
    }
}
