package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.View;
import b.c.b.a.b.d.c;
import b.c.b.a.b.f;
import com.google.android.gms.ads.internal.q;
import com.google.android.gms.common.internal.r;
import com.google.android.gms.common.util.o;
import com.google.android.gms.internal.ads.C1683lea;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import org.cocos2dx.lib.BuildConfig;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.dj  reason: case insensitive filesystem */
public final class C1142dj implements AbstractC1761mj {

    /* renamed from: a  reason: collision with root package name */
    private static List<Future<Void>> f4131a = Collections.synchronizedList(new ArrayList());

    /* renamed from: b  reason: collision with root package name */
    private final C1683lea.a f4132b;

    /* renamed from: c  reason: collision with root package name */
    private final LinkedHashMap<String, C1683lea.h.b> f4133c;
    private final List<String> d = new ArrayList();
    private final List<String> e = new ArrayList();
    private final Context f;
    private final AbstractC1899oj g;
    private boolean h;
    private final C1692lj i;
    private final C2105rj j;
    private final Object k = new Object();
    private HashSet<String> l = new HashSet<>();
    private boolean m = false;
    private boolean n = false;
    private boolean o = false;

    public C1142dj(Context context, C0823Yl yl, C1692lj ljVar, String str, AbstractC1899oj ojVar) {
        r.a(ljVar, "SafeBrowsing config is not present.");
        this.f = context.getApplicationContext() != null ? context.getApplicationContext() : context;
        this.f4133c = new LinkedHashMap<>();
        this.g = ojVar;
        this.i = ljVar;
        for (String str2 : this.i.e) {
            this.l.add(str2.toLowerCase(Locale.ENGLISH));
        }
        this.l.remove("cookie".toLowerCase(Locale.ENGLISH));
        C1683lea.a q = C1683lea.q();
        q.a(C1683lea.g.OCTAGON_AD);
        q.a(str);
        q.b(str);
        C1683lea.b.a n2 = C1683lea.b.n();
        String str3 = this.i.f4893a;
        if (str3 != null) {
            n2.a(str3);
        }
        q.a((C1683lea.b) n2.j());
        C1683lea.i.a n3 = C1683lea.i.n();
        n3.a(c.a(this.f).a());
        String str4 = yl.f3587a;
        if (str4 != null) {
            n3.a(str4);
        }
        long b2 = (long) f.a().b(this.f);
        if (b2 > 0) {
            n3.a(b2);
        }
        q.a((C1683lea.i) n3.j());
        this.f4132b = q;
        this.j = new C2105rj(this.f, this.i.h, this);
    }

    static final /* synthetic */ Void d(String str) {
        return null;
    }

    private final C1683lea.h.b e(String str) {
        C1683lea.h.b bVar;
        synchronized (this.k) {
            bVar = this.f4133c.get(str);
        }
        return bVar;
    }

    private final SW<Void> g() {
        SW<Void> a2;
        if (!((this.h && this.i.g) || (this.o && this.i.f) || (!this.h && this.i.d))) {
            return JW.a((Object) null);
        }
        synchronized (this.k) {
            for (C1683lea.h.b bVar : this.f4133c.values()) {
                this.f4132b.a((C1683lea.h) ((AbstractC2092rca) bVar.j()));
            }
            this.f4132b.a(this.d);
            this.f4132b.b(this.e);
            if (C1830nj.a()) {
                String k2 = this.f4132b.k();
                String m2 = this.f4132b.m();
                StringBuilder sb = new StringBuilder(String.valueOf(k2).length() + 53 + String.valueOf(m2).length());
                sb.append("Sending SB report\n  url: ");
                sb.append(k2);
                sb.append("\n  clickUrl: ");
                sb.append(m2);
                sb.append("\n  resources: \n");
                StringBuilder sb2 = new StringBuilder(sb.toString());
                for (C1683lea.h hVar : this.f4132b.l()) {
                    sb2.append("    [");
                    sb2.append(hVar.o());
                    sb2.append("] ");
                    sb2.append(hVar.n());
                }
                C1830nj.a(sb2.toString());
            }
            SW<String> a3 = new C1489il(this.f).a(1, this.i.f4894b, null, ((C1683lea) ((AbstractC2092rca) this.f4132b.j())).f());
            if (C1830nj.a()) {
                a3.a(RunnableC1210ej.f4229a, C0875_l.f3755a);
            }
            a2 = JW.a(a3, C1417hj.f4503a, C0875_l.f);
        }
        return a2;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ SW a(Map map) {
        if (map != null) {
            try {
                for (String str : map.keySet()) {
                    JSONArray optJSONArray = new JSONObject((String) map.get(str)).optJSONArray("matches");
                    if (optJSONArray != null) {
                        synchronized (this.k) {
                            int length = optJSONArray.length();
                            C1683lea.h.b e2 = e(str);
                            if (e2 == null) {
                                String valueOf = String.valueOf(str);
                                C1830nj.a(valueOf.length() != 0 ? "Cannot find the corresponding resource object for ".concat(valueOf) : new String("Cannot find the corresponding resource object for "));
                            } else {
                                boolean z = false;
                                for (int i2 = 0; i2 < length; i2++) {
                                    e2.b(optJSONArray.getJSONObject(i2).getString("threat_type"));
                                }
                                boolean z2 = this.h;
                                if (length > 0) {
                                    z = true;
                                }
                                this.h = z | z2;
                            }
                        }
                    }
                }
            } catch (JSONException e3) {
                if (C2432wa.f5901b.a().booleanValue()) {
                    C0745Vl.a("Failed to get SafeBrowsing metadata", e3);
                }
                return JW.a((Throwable) new Exception("Safebrowsing report transmission failed."));
            }
        }
        if (this.h) {
            synchronized (this.k) {
                this.f4132b.a(C1683lea.g.OCTAGON_AD_SB_MATCH);
            }
        }
        return g();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1761mj
    public final void a() {
        synchronized (this.k) {
            SW a2 = JW.a(this.g.a(this.f, this.f4133c.keySet()), new C1279fj(this), C0875_l.f);
            SW a3 = JW.a(a2, 10, TimeUnit.SECONDS, C0875_l.d);
            JW.a(a2, new C1348gj(this, a3), C0875_l.f);
            f4131a.add(a3);
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void a(Bitmap bitmap) {
        Sba n2 = Iba.n();
        bitmap.compress(Bitmap.CompressFormat.PNG, 0, n2);
        synchronized (this.k) {
            C1683lea.a aVar = this.f4132b;
            C1683lea.f.a n3 = C1683lea.f.n();
            n3.a(n2.a());
            n3.a("image/png");
            n3.a(C1683lea.f.b.TYPE_CREATIVE);
            aVar.a((C1683lea.f) ((AbstractC2092rca) n3.j()));
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1761mj
    public final void a(View view) {
        if (this.i.f4895c && !this.n) {
            q.c();
            Bitmap b2 = C2452wk.b(view);
            if (b2 == null) {
                C1830nj.a("Failed to capture the webview bitmap.");
                return;
            }
            this.n = true;
            C2452wk.a(new RunnableC1073cj(this, b2));
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1761mj
    public final void a(String str) {
        synchronized (this.k) {
            if (str == null) {
                this.f4132b.n();
            } else {
                this.f4132b.c(str);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1761mj
    public final void a(String str, Map<String, String> map, int i2) {
        synchronized (this.k) {
            if (i2 == 3) {
                this.o = true;
            }
            if (this.f4133c.containsKey(str)) {
                if (i2 == 3) {
                    this.f4133c.get(str).a(C1683lea.h.a.a(i2));
                }
                return;
            }
            C1683lea.h.b p = C1683lea.h.p();
            C1683lea.h.a a2 = C1683lea.h.a.a(i2);
            if (a2 != null) {
                p.a(a2);
            }
            p.a(this.f4133c.size());
            p.a(str);
            C1683lea.d.a n2 = C1683lea.d.n();
            if (this.l.size() > 0 && map != null) {
                for (Map.Entry<String, String> entry : map.entrySet()) {
                    String key = entry.getKey() != null ? entry.getKey() : BuildConfig.FLAVOR;
                    String value = entry.getValue() != null ? entry.getValue() : BuildConfig.FLAVOR;
                    if (this.l.contains(key.toLowerCase(Locale.ENGLISH))) {
                        C1683lea.c.a n3 = C1683lea.c.n();
                        n3.a(Iba.a(key));
                        n3.b(Iba.a(value));
                        n2.a((C1683lea.c) ((AbstractC2092rca) n3.j()));
                    }
                }
            }
            p.a((C1683lea.d) ((AbstractC2092rca) n2.j()));
            this.f4133c.put(str, p);
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1761mj
    public final String[] a(String[] strArr) {
        return (String[]) this.j.a(strArr).toArray(new String[0]);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1761mj
    public final void b() {
        this.m = true;
    }

    /* access modifiers changed from: package-private */
    public final void b(String str) {
        synchronized (this.k) {
            this.d.add(str);
        }
    }

    /* access modifiers changed from: package-private */
    public final void c(String str) {
        synchronized (this.k) {
            this.e.add(str);
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1761mj
    public final boolean c() {
        return o.f() && this.i.f4895c && !this.n;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1761mj
    public final C1692lj d() {
        return this.i;
    }
}
