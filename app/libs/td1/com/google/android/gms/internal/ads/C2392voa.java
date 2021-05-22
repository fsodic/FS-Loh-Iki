package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.f.b;
import java.util.Random;
import java.util.WeakHashMap;

/* renamed from: com.google.android.gms.internal.ads.voa  reason: case insensitive filesystem */
public final class C2392voa {

    /* renamed from: a  reason: collision with root package name */
    private static C2392voa f5840a = new C2392voa();

    /* renamed from: b  reason: collision with root package name */
    private final C0459Kl f5841b;

    /* renamed from: c  reason: collision with root package name */
    private final C1565joa f5842c;
    private final String d;
    private final C1854o e;
    private final C1992q f;
    private final SharedPreferences$OnSharedPreferenceChangeListenerC2198t g;
    private final C0823Yl h;
    private final Random i;
    private final WeakHashMap<b, String> j;

    protected C2392voa() {
        this(new C0459Kl(), new C1565joa(new Xna(), new Tna(), new Tpa(), new C0865_b(), new C0248Ci(), new C0820Yi(), new C0740Vg(), new C0839Zb()), new C1854o(), new C1992q(), new SharedPreferences$OnSharedPreferenceChangeListenerC2198t(), C0459Kl.c(), new C0823Yl(0, 201604000, true), new Random(), new WeakHashMap());
    }

    private C2392voa(C0459Kl kl, C1565joa joa, C1854o oVar, C1992q qVar, SharedPreferences$OnSharedPreferenceChangeListenerC2198t tVar, String str, C0823Yl yl, Random random, WeakHashMap<b, String> weakHashMap) {
        this.f5841b = kl;
        this.f5842c = joa;
        this.e = oVar;
        this.f = qVar;
        this.g = tVar;
        this.d = str;
        this.h = yl;
        this.i = random;
        this.j = weakHashMap;
    }

    public static C0459Kl a() {
        return f5840a.f5841b;
    }

    public static C1565joa b() {
        return f5840a.f5842c;
    }

    public static C1992q c() {
        return f5840a.f;
    }

    public static C1854o d() {
        return f5840a.e;
    }

    public static SharedPreferences$OnSharedPreferenceChangeListenerC2198t e() {
        return f5840a.g;
    }

    public static String f() {
        return f5840a.d;
    }

    public static C0823Yl g() {
        return f5840a.h;
    }

    public static Random h() {
        return f5840a.i;
    }

    public static WeakHashMap<b, String> i() {
        return f5840a.j;
    }
}
