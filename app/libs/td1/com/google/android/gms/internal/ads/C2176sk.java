package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Looper;
import android.security.NetworkSecurityPolicy;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.q;
import com.google.android.gms.common.util.o;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import org.cocos2dx.lib.BuildConfig;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.sk  reason: case insensitive filesystem */
public final class C2176sk implements AbstractC1901ok {

    /* renamed from: a  reason: collision with root package name */
    private final Object f5545a = new Object();

    /* renamed from: b  reason: collision with root package name */
    private boolean f5546b;

    /* renamed from: c  reason: collision with root package name */
    private final List<Runnable> f5547c = new ArrayList();
    private SW<?> d;
    private Ela e = null;
    private SharedPreferences f;
    private SharedPreferences.Editor g;
    private boolean h = false;
    private boolean i = true;
    private String j;
    private String k;
    private boolean l = false;
    private String m = BuildConfig.FLAVOR;
    private long n = 0;
    private long o = 0;
    private long p = 0;
    private int q = -1;
    private int r = 0;
    private Set<String> s = Collections.emptySet();
    private JSONObject t = new JSONObject();
    private boolean u = true;
    private boolean v = true;
    private String w = null;
    private int x = -1;

    private final void a(Bundle bundle) {
        C0875_l.f3755a.execute(new RunnableC2314uk(this));
    }

    private final void o() {
        SW<?> sw = this.d;
        if (sw != null && !sw.isDone()) {
            try {
                this.d.get(1, TimeUnit.SECONDS);
            } catch (InterruptedException e2) {
                Thread.currentThread().interrupt();
                C0745Vl.c("Interrupted while waiting for preferences loaded.", e2);
            } catch (CancellationException | ExecutionException | TimeoutException e3) {
                C0745Vl.b("Fail to initialize AdSharedPreferenceManager.", e3);
            }
        }
    }

    private final Bundle p() {
        Bundle bundle = new Bundle();
        bundle.putBoolean("listener_registration_bundle", true);
        synchronized (this.f5545a) {
            bundle.putBoolean("use_https", this.i);
            bundle.putBoolean("content_url_opted_out", this.u);
            bundle.putBoolean("content_vertical_opted_out", this.v);
            bundle.putBoolean("auto_collect_location", this.l);
            bundle.putInt("version_code", this.r);
            bundle.putStringArray("never_pool_slots", (String[]) this.s.toArray(new String[0]));
            bundle.putString("app_settings_json", this.m);
            bundle.putLong("app_settings_last_update_ms", this.n);
            bundle.putLong("app_last_background_time_ms", this.o);
            bundle.putInt("request_in_session_count", this.q);
            bundle.putLong("first_ad_req_time_ms", this.p);
            bundle.putString("native_advanced_settings", this.t.toString());
            bundle.putString("display_cutout", this.w);
            bundle.putInt("app_measurement_npa", this.x);
            if (this.j != null) {
                bundle.putString("content_url_hashes", this.j);
            }
            if (this.k != null) {
                bundle.putString("content_vertical_hashes", this.k);
            }
        }
        return bundle;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1901ok
    public final int a() {
        int i2;
        o();
        synchronized (this.f5545a) {
            i2 = this.r;
        }
        return i2;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1901ok
    public final void a(int i2) {
        o();
        synchronized (this.f5545a) {
            if (this.q != i2) {
                this.q = i2;
                if (this.g != null) {
                    this.g.putInt("request_in_session_count", i2);
                    this.g.apply();
                }
                Bundle bundle = new Bundle();
                bundle.putInt("request_in_session_count", i2);
                a(bundle);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1901ok
    public final void a(long j2) {
        o();
        synchronized (this.f5545a) {
            if (this.o != j2) {
                this.o = j2;
                if (this.g != null) {
                    this.g.putLong("app_last_background_time_ms", j2);
                    this.g.apply();
                }
                Bundle bundle = new Bundle();
                bundle.putLong("app_last_background_time_ms", j2);
                a(bundle);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void a(Context context, String str) {
        boolean z = false;
        SharedPreferences sharedPreferences = context.getSharedPreferences(str, 0);
        SharedPreferences.Editor edit = sharedPreferences.edit();
        synchronized (this.f5545a) {
            this.f = sharedPreferences;
            this.g = edit;
            if (o.i() && !NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted()) {
                z = true;
            }
            this.h = z;
            this.i = this.f.getBoolean("use_https", this.i);
            this.u = this.f.getBoolean("content_url_opted_out", this.u);
            this.j = this.f.getString("content_url_hashes", this.j);
            this.l = this.f.getBoolean("auto_collect_location", this.l);
            this.v = this.f.getBoolean("content_vertical_opted_out", this.v);
            this.k = this.f.getString("content_vertical_hashes", this.k);
            this.r = this.f.getInt("version_code", this.r);
            this.m = this.f.getString("app_settings_json", this.m);
            this.n = this.f.getLong("app_settings_last_update_ms", this.n);
            this.o = this.f.getLong("app_last_background_time_ms", this.o);
            this.q = this.f.getInt("request_in_session_count", this.q);
            this.p = this.f.getLong("first_ad_req_time_ms", this.p);
            this.s = this.f.getStringSet("never_pool_slots", this.s);
            this.w = this.f.getString("display_cutout", this.w);
            this.x = this.f.getInt("app_measurement_npa", this.x);
            try {
                this.t = new JSONObject(this.f.getString("native_advanced_settings", "{}"));
            } catch (JSONException e2) {
                C0745Vl.c("Could not convert native advanced settings to json object", e2);
            }
            a(p());
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x000f, code lost:
        r4 = java.lang.String.valueOf(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0019, code lost:
        if (r4.length() == 0) goto L_0x0020;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x001b, code lost:
        r4 = "admob__".concat(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0020, code lost:
        r4 = new java.lang.String("admob__");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0025, code lost:
        r2.d = com.google.android.gms.internal.ads.C0875_l.f3755a.a(new com.google.android.gms.internal.ads.RunnableC2039qk(r2, r3, r4));
        r2.f5546b = r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0034, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x000a, code lost:
        if (r4 != null) goto L_0x000f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x000c, code lost:
        r4 = "admob";
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(android.content.Context r3, java.lang.String r4, boolean r5) {
        /*
            r2 = this;
            java.lang.Object r0 = r2.f5545a
            monitor-enter(r0)
            android.content.SharedPreferences r1 = r2.f     // Catch:{ all -> 0x0035 }
            if (r1 == 0) goto L_0x0009
            monitor-exit(r0)     // Catch:{ all -> 0x0035 }
            return
        L_0x0009:
            monitor-exit(r0)     // Catch:{ all -> 0x0035 }
            if (r4 != 0) goto L_0x000f
            java.lang.String r4 = "admob"
            goto L_0x0025
        L_0x000f:
            java.lang.String r0 = "admob__"
            java.lang.String r4 = java.lang.String.valueOf(r4)
            int r1 = r4.length()
            if (r1 == 0) goto L_0x0020
            java.lang.String r4 = r0.concat(r4)
            goto L_0x0025
        L_0x0020:
            java.lang.String r4 = new java.lang.String
            r4.<init>(r0)
        L_0x0025:
            com.google.android.gms.internal.ads.VW r0 = com.google.android.gms.internal.ads.C0875_l.f3755a
            com.google.android.gms.internal.ads.qk r1 = new com.google.android.gms.internal.ads.qk
            r1.<init>(r2, r3, r4)
            com.google.android.gms.internal.ads.SW r3 = r0.a(r1)
            r2.d = r3
            r2.f5546b = r5
            return
        L_0x0035:
            r3 = move-exception
            monitor-exit(r0)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C2176sk.a(android.content.Context, java.lang.String, boolean):void");
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1901ok
    public final void a(Runnable runnable) {
        this.f5547c.add(runnable);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1901ok
    public final void a(String str) {
        o();
        synchronized (this.f5545a) {
            if (str != null) {
                if (!str.equals(this.j)) {
                    this.j = str;
                    if (this.g != null) {
                        this.g.putString("content_url_hashes", str);
                        this.g.apply();
                    }
                    Bundle bundle = new Bundle();
                    bundle.putString("content_url_hashes", str);
                    a(bundle);
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1901ok
    public final void a(String str, String str2, boolean z) {
        o();
        synchronized (this.f5545a) {
            JSONArray optJSONArray = this.t.optJSONArray(str);
            if (optJSONArray == null) {
                optJSONArray = new JSONArray();
            }
            int length = optJSONArray.length();
            int i2 = 0;
            while (true) {
                if (i2 < optJSONArray.length()) {
                    JSONObject optJSONObject = optJSONArray.optJSONObject(i2);
                    if (optJSONObject != null) {
                        if (!str2.equals(optJSONObject.optString("template_id"))) {
                            i2++;
                        } else if (!z || !optJSONObject.optBoolean("uses_media_view", false)) {
                            length = i2;
                        } else {
                            return;
                        }
                    } else {
                        return;
                    }
                }
            }
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("template_id", str2);
                jSONObject.put("uses_media_view", z);
                jSONObject.put("timestamp_ms", q.j().a());
                optJSONArray.put(length, jSONObject);
                this.t.put(str, optJSONArray);
            } catch (JSONException e2) {
                C0745Vl.c("Could not update native advanced settings", e2);
            }
            if (this.g != null) {
                this.g.putString("native_advanced_settings", this.t.toString());
                this.g.apply();
            }
            Bundle bundle = new Bundle();
            bundle.putString("native_advanced_settings", this.t.toString());
            a(bundle);
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1901ok
    public final void a(boolean z) {
        o();
        synchronized (this.f5545a) {
            if (this.v != z) {
                this.v = z;
                if (this.g != null) {
                    this.g.putBoolean("content_vertical_opted_out", z);
                    this.g.apply();
                }
                Bundle bundle = new Bundle();
                bundle.putBoolean("content_url_opted_out", this.u);
                bundle.putBoolean("content_vertical_opted_out", this.v);
                a(bundle);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1901ok
    public final long b() {
        long j2;
        o();
        synchronized (this.f5545a) {
            j2 = this.p;
        }
        return j2;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1901ok
    public final void b(int i2) {
        o();
        synchronized (this.f5545a) {
            if (this.r != i2) {
                this.r = i2;
                if (this.g != null) {
                    this.g.putInt("version_code", i2);
                    this.g.apply();
                }
                Bundle bundle = new Bundle();
                bundle.putInt("version_code", i2);
                a(bundle);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1901ok
    public final void b(long j2) {
        o();
        synchronized (this.f5545a) {
            if (this.p != j2) {
                this.p = j2;
                if (this.g != null) {
                    this.g.putLong("first_ad_req_time_ms", j2);
                    this.g.apply();
                }
                Bundle bundle = new Bundle();
                bundle.putLong("first_ad_req_time_ms", j2);
                a(bundle);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1901ok
    public final void b(String str) {
        o();
        synchronized (this.f5545a) {
            if (!TextUtils.equals(this.w, str)) {
                this.w = str;
                if (this.g != null) {
                    this.g.putString("display_cutout", str);
                    this.g.apply();
                }
                Bundle bundle = new Bundle();
                bundle.putString("display_cutout", str);
                a(bundle);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1901ok
    public final void b(boolean z) {
        o();
        synchronized (this.f5545a) {
            if (this.l != z) {
                this.l = z;
                if (this.g != null) {
                    this.g.putBoolean("auto_collect_location", z);
                    this.g.apply();
                }
                Bundle bundle = new Bundle();
                bundle.putBoolean("auto_collect_location", z);
                a(bundle);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1901ok
    public final void c(String str) {
        o();
        synchronized (this.f5545a) {
            if (str != null) {
                if (!str.equals(this.k)) {
                    this.k = str;
                    if (this.g != null) {
                        this.g.putString("content_vertical_hashes", str);
                        this.g.apply();
                    }
                    Bundle bundle = new Bundle();
                    bundle.putString("content_vertical_hashes", str);
                    a(bundle);
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1901ok
    public final void c(boolean z) {
        o();
        synchronized (this.f5545a) {
            if (this.u != z) {
                this.u = z;
                if (this.g != null) {
                    this.g.putBoolean("content_url_opted_out", z);
                    this.g.apply();
                }
                Bundle bundle = new Bundle();
                bundle.putBoolean("content_url_opted_out", this.u);
                bundle.putBoolean("content_vertical_opted_out", this.v);
                a(bundle);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1901ok
    public final boolean c() {
        boolean z;
        o();
        synchronized (this.f5545a) {
            z = this.l;
        }
        return z;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1901ok
    public final int d() {
        int i2;
        o();
        synchronized (this.f5545a) {
            i2 = this.q;
        }
        return i2;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1901ok
    public final void d(String str) {
        o();
        synchronized (this.f5545a) {
            long a2 = q.j().a();
            this.n = a2;
            if (str != null) {
                if (!str.equals(this.m)) {
                    this.m = str;
                    if (this.g != null) {
                        this.g.putString("app_settings_json", str);
                        this.g.putLong("app_settings_last_update_ms", a2);
                        this.g.apply();
                    }
                    Bundle bundle = new Bundle();
                    bundle.putString("app_settings_json", str);
                    bundle.putLong("app_settings_last_update_ms", a2);
                    a(bundle);
                    for (Runnable runnable : this.f5547c) {
                        runnable.run();
                    }
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1901ok
    public final String e() {
        String str;
        o();
        synchronized (this.f5545a) {
            str = this.k;
        }
        return str;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1901ok
    public final long f() {
        long j2;
        o();
        synchronized (this.f5545a) {
            j2 = this.o;
        }
        return j2;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1901ok
    public final boolean g() {
        boolean z;
        o();
        synchronized (this.f5545a) {
            z = this.v;
        }
        return z;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1901ok
    public final String h() {
        String str;
        o();
        synchronized (this.f5545a) {
            str = this.j;
        }
        return str;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1901ok
    public final String i() {
        String str;
        o();
        synchronized (this.f5545a) {
            str = this.w;
        }
        return str;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1901ok
    public final boolean j() {
        boolean z;
        o();
        synchronized (this.f5545a) {
            z = this.u;
        }
        return z;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1901ok
    public final void k() {
        o();
        synchronized (this.f5545a) {
            this.t = new JSONObject();
            if (this.g != null) {
                this.g.remove("native_advanced_settings");
                this.g.apply();
            }
            Bundle bundle = new Bundle();
            bundle.putString("native_advanced_settings", "{}");
            a(bundle);
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1901ok
    public final Ela l() {
        if (!this.f5546b) {
            return null;
        }
        if ((j() && g()) || !C1605ka.f4781b.a().booleanValue()) {
            return null;
        }
        synchronized (this.f5545a) {
            if (Looper.getMainLooper() == null) {
                return null;
            }
            if (this.e == null) {
                this.e = new Ela();
            }
            this.e.b();
            C0745Vl.c("start fetching content...");
            return this.e;
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1901ok
    public final C0873_j m() {
        C0873_j _jVar;
        o();
        synchronized (this.f5545a) {
            _jVar = new C0873_j(this.m, this.n);
        }
        return _jVar;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1901ok
    public final JSONObject n() {
        JSONObject jSONObject;
        o();
        synchronized (this.f5545a) {
            jSONObject = this.t;
        }
        return jSONObject;
    }
}
