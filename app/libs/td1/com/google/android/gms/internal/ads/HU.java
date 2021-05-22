package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.util.Base64;
import android.view.MotionEvent;
import android.view.View;
import com.google.android.gms.internal.ads.C1856oB;
import java.util.HashMap;
import java.util.Map;

/* access modifiers changed from: package-private */
public final class HU implements XT {

    /* renamed from: a  reason: collision with root package name */
    private final Object f2136a;

    /* renamed from: b  reason: collision with root package name */
    private final LU f2137b;

    /* renamed from: c  reason: collision with root package name */
    private final UU f2138c;
    private final UT d;

    HU(Object obj, LU lu, UU uu, UT ut) {
        this.f2136a = obj;
        this.f2137b = lu;
        this.f2138c = uu;
        this.d = ut;
    }

    private static String a(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        C1856oB.a n = C1856oB.n();
        n.a(SE.DG);
        n.a(Iba.a(bArr));
        return Base64.encodeToString(((C1856oB) n.j()).f(), 11);
    }

    private final synchronized byte[] a(Map<String, String> map, Map<String, Object> map2) {
        long currentTimeMillis = System.currentTimeMillis();
        try {
        } catch (Exception e) {
            this.d.a(2007, System.currentTimeMillis() - currentTimeMillis, e);
            return null;
        }
        return (byte[]) this.f2136a.getClass().getDeclaredMethod("xss", Map.class, Map.class).invoke(this.f2136a, null, map2);
    }

    @Override // com.google.android.gms.internal.ads.XT
    public final synchronized String a(Context context, String str) {
        Map<String, Object> a2;
        a2 = this.f2138c.a();
        a2.put("f", "q");
        a2.put("ctx", context);
        a2.put("aid", null);
        return a(a((Map<String, String>) null, a2));
    }

    @Override // com.google.android.gms.internal.ads.XT
    public final synchronized String a(Context context, String str, View view, Activity activity) {
        Map<String, Object> b2;
        b2 = this.f2138c.b();
        b2.put("f", "v");
        b2.put("ctx", context);
        b2.put("aid", null);
        b2.put("view", view);
        b2.put("act", activity);
        return a(a((Map<String, String>) null, b2));
    }

    @Override // com.google.android.gms.internal.ads.XT
    public final synchronized String a(Context context, String str, String str2, View view, Activity activity) {
        Map<String, Object> c2;
        c2 = this.f2138c.c();
        c2.put("f", "c");
        c2.put("ctx", context);
        c2.put("cs", str2);
        c2.put("aid", null);
        c2.put("view", view);
        c2.put("act", activity);
        return a(a((Map<String, String>) null, c2));
    }

    public final synchronized void a() {
        try {
            long currentTimeMillis = System.currentTimeMillis();
            this.f2136a.getClass().getDeclaredMethod("close", new Class[0]).invoke(this.f2136a, new Object[0]);
            this.d.a(3001, System.currentTimeMillis() - currentTimeMillis);
        } catch (Exception e) {
            throw new SU(2003, e);
        }
    }

    @Override // com.google.android.gms.internal.ads.XT
    public final synchronized void a(String str, MotionEvent motionEvent) {
        try {
            long currentTimeMillis = System.currentTimeMillis();
            HashMap hashMap = new HashMap();
            hashMap.put("aid", null);
            hashMap.put("evt", motionEvent);
            this.f2136a.getClass().getDeclaredMethod("he", Map.class).invoke(this.f2136a, hashMap);
            this.d.a(3003, System.currentTimeMillis() - currentTimeMillis);
        } catch (Exception e) {
            throw new SU(2005, e);
        }
    }

    /* access modifiers changed from: package-private */
    public final LU b() {
        return this.f2137b;
    }

    /* access modifiers changed from: package-private */
    public final synchronized boolean c() {
        try {
        } catch (Exception e) {
            throw new SU(2001, e);
        }
        return ((Boolean) this.f2136a.getClass().getDeclaredMethod("init", new Class[0]).invoke(this.f2136a, new Object[0])).booleanValue();
    }

    public final synchronized int d() {
        try {
        } catch (Exception e) {
            throw new SU(2006, e);
        }
        return ((Integer) this.f2136a.getClass().getDeclaredMethod("lcs", new Class[0]).invoke(this.f2136a, new Object[0])).intValue();
    }
}
