package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.q;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import org.cocos2dx.lib.BuildConfig;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class PE {

    /* renamed from: a  reason: collision with root package name */
    private boolean f2806a = false;

    /* renamed from: b  reason: collision with root package name */
    private boolean f2807b = false;

    /* renamed from: c  reason: collision with root package name */
    private final long f2808c;
    private final C1423hm<Boolean> d = new C1423hm<>();
    private final Context e;
    private final WeakReference<Context> f;
    private final C1789nD g;
    private final Executor h;
    private final Executor i;
    private final ScheduledExecutorService j;
    private final C2617zE k;
    private final C0823Yl l;
    private Map<String, C1130dd> m = new ConcurrentHashMap();
    private boolean n = true;

    public PE(Executor executor, Context context, WeakReference<Context> weakReference, Executor executor2, C1789nD nDVar, ScheduledExecutorService scheduledExecutorService, C2617zE zEVar, C0823Yl yl) {
        this.g = nDVar;
        this.e = context;
        this.f = weakReference;
        this.h = executor2;
        this.j = scheduledExecutorService;
        this.i = executor;
        this.k = zEVar;
        this.l = yl;
        this.f2808c = q.j().b();
        a("com.google.android.gms.ads.MobileAds", false, BuildConfig.FLAVOR, 0);
    }

    /* access modifiers changed from: private */
    public final void a(String str) {
        try {
            ArrayList arrayList = new ArrayList();
            JSONObject jSONObject = new JSONObject(str).getJSONObject("initializer_settings").getJSONObject("config");
            for (Iterator<String> keys = jSONObject.keys(); keys.hasNext(); keys = keys) {
                String next = keys.next();
                Object obj = new Object();
                C1423hm hmVar = new C1423hm();
                SW a2 = JW.a(hmVar, ((Long) C2392voa.e().a(C2474x.ob)).longValue(), TimeUnit.SECONDS, this.j);
                this.k.a(next);
                long b2 = q.j().b();
                a2.a(new TE(this, obj, hmVar, next, b2), this.h);
                arrayList.add(a2);
                ZE ze = new ZE(this, obj, next, b2, hmVar);
                JSONObject optJSONObject = jSONObject.optJSONObject(next);
                ArrayList arrayList2 = new ArrayList();
                if (optJSONObject != null) {
                    try {
                        JSONArray jSONArray = optJSONObject.getJSONArray("data");
                        for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                            JSONObject jSONObject2 = jSONArray.getJSONObject(i2);
                            String optString = jSONObject2.optString("format", BuildConfig.FLAVOR);
                            JSONObject optJSONObject2 = jSONObject2.optJSONObject("data");
                            Bundle bundle = new Bundle();
                            if (optJSONObject2 != null) {
                                Iterator<String> keys2 = optJSONObject2.keys();
                                while (keys2.hasNext()) {
                                    String next2 = keys2.next();
                                    bundle.putString(next2, optJSONObject2.optString(next2, BuildConfig.FLAVOR));
                                }
                            }
                            arrayList2.add(new C1818nd(optString, bundle));
                        }
                    } catch (JSONException unused) {
                    }
                }
                a(next, false, BuildConfig.FLAVOR, 0);
                try {
                    this.i.execute(new VE(this, this.g.a(next, new JSONObject()), ze, arrayList2, next));
                } catch (MR unused2) {
                    try {
                        ze.i("Failed to create Adapter.");
                    } catch (RemoteException e2) {
                        C0745Vl.b(BuildConfig.FLAVOR, e2);
                    }
                }
            }
            JW.b(arrayList).a(new WE(this), this.h);
        } catch (JSONException e3) {
            C1763mk.e("Malformed CLD response", e3);
        }
    }

    /* access modifiers changed from: private */
    public final void a(String str, boolean z, String str2, int i2) {
        this.m.put(str, new C1130dd(str, z, i2, str2));
    }

    private final synchronized SW<String> g() {
        String c2 = q.g().i().m().c();
        if (!TextUtils.isEmpty(c2)) {
            return JW.a(c2);
        }
        C1423hm hmVar = new C1423hm();
        q.g().i().a(new QE(this, hmVar));
        return hmVar;
    }

    public final void a() {
        this.n = false;
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0035, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0036, code lost:
        com.google.android.gms.internal.ads.C0745Vl.b(org.cocos2dx.lib.BuildConfig.FLAVOR, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x003b, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:?, code lost:
        r4 = new java.lang.StringBuilder(java.lang.String.valueOf(r5).length() + 74);
        r4.append("Failed to initialize adapter. ");
        r4.append(r5);
        r4.append(" does not implement the initialize() method.");
        r3.i(r4.toString());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0034, code lost:
        return;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0011 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* synthetic */ void a(com.google.android.gms.internal.ads.SR r2, com.google.android.gms.internal.ads.AbstractC1267fd r3, java.util.List r4, java.lang.String r5) {
        /*
            r1 = this;
            java.lang.ref.WeakReference<android.content.Context> r0 = r1.f     // Catch:{ MR -> 0x0011 }
            java.lang.Object r0 = r0.get()     // Catch:{ MR -> 0x0011 }
            android.content.Context r0 = (android.content.Context) r0     // Catch:{ MR -> 0x0011 }
            if (r0 == 0) goto L_0x000b
            goto L_0x000d
        L_0x000b:
            android.content.Context r0 = r1.e     // Catch:{ MR -> 0x0011 }
        L_0x000d:
            r2.a(r0, r3, r4)     // Catch:{ MR -> 0x0011 }
            return
        L_0x0011:
            java.lang.String r2 = java.lang.String.valueOf(r5)     // Catch:{ RemoteException -> 0x0035 }
            int r2 = r2.length()     // Catch:{ RemoteException -> 0x0035 }
            int r2 = r2 + 74
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ RemoteException -> 0x0035 }
            r4.<init>(r2)     // Catch:{ RemoteException -> 0x0035 }
            java.lang.String r2 = "Failed to initialize adapter. "
            r4.append(r2)     // Catch:{ RemoteException -> 0x0035 }
            r4.append(r5)     // Catch:{ RemoteException -> 0x0035 }
            java.lang.String r2 = " does not implement the initialize() method."
            r4.append(r2)     // Catch:{ RemoteException -> 0x0035 }
            java.lang.String r2 = r4.toString()     // Catch:{ RemoteException -> 0x0035 }
            r3.i(r2)     // Catch:{ RemoteException -> 0x0035 }
            return
        L_0x0035:
            r2 = move-exception
            java.lang.String r3 = ""
            com.google.android.gms.internal.ads.C0745Vl.b(r3, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.PE.a(com.google.android.gms.internal.ads.SR, com.google.android.gms.internal.ads.fd, java.util.List, java.lang.String):void");
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void a(C1423hm hmVar) {
        this.h.execute(new YE(this, hmVar));
    }

    public final void a(AbstractC1611kd kdVar) {
        this.d.a(new OE(this, kdVar), this.i);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void a(Object obj, C1423hm hmVar, String str, long j2) {
        synchronized (obj) {
            if (!hmVar.isDone()) {
                a(str, false, "Timeout.", (int) (q.j().b() - j2));
                this.k.a(str, "timeout");
                hmVar.b(false);
            }
        }
    }

    public final void b() {
        if (((Boolean) C2392voa.e().a(C2474x.mb)).booleanValue() && !C2087ra.f5419a.a().booleanValue()) {
            if (this.l.f3589c >= ((Integer) C2392voa.e().a(C2474x.nb)).intValue() && this.n) {
                if (!this.f2806a) {
                    synchronized (this) {
                        if (!this.f2806a) {
                            this.k.a();
                            this.d.a(new RE(this), this.h);
                            this.f2806a = true;
                            SW<String> g2 = g();
                            this.j.schedule(new UE(this), ((Long) C2392voa.e().a(C2474x.pb)).longValue(), TimeUnit.SECONDS);
                            JW.a(g2, new XE(this), this.h);
                            return;
                        }
                        return;
                    }
                }
                return;
            }
        }
        if (!this.f2806a) {
            a("com.google.android.gms.ads.MobileAds", true, BuildConfig.FLAVOR, 0);
            this.d.b(false);
            this.f2806a = true;
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void b(AbstractC1611kd kdVar) {
        try {
            kdVar.b(c());
        } catch (RemoteException e2) {
            C0745Vl.b(BuildConfig.FLAVOR, e2);
        }
    }

    public final List<C1130dd> c() {
        ArrayList arrayList = new ArrayList();
        for (String str : this.m.keySet()) {
            C1130dd ddVar = this.m.get(str);
            arrayList.add(new C1130dd(str, ddVar.f4117b, ddVar.f4118c, ddVar.d));
        }
        return arrayList;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ Object d() {
        this.d.b(true);
        return null;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void e() {
        synchronized (this) {
            if (!this.f2807b) {
                a("com.google.android.gms.ads.MobileAds", false, "Timeout.", (int) (q.j().b() - this.f2808c));
                this.d.a(new Exception());
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void f() {
        this.k.b();
    }
}
