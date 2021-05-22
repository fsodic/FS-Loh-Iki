package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

/* renamed from: com.google.android.gms.internal.ads.joa  reason: case insensitive filesystem */
public class C1565joa {

    /* renamed from: a  reason: collision with root package name */
    private final Xna f4724a;

    /* renamed from: b  reason: collision with root package name */
    private final Tna f4725b;

    /* renamed from: c  reason: collision with root package name */
    private final Tpa f4726c;
    private final C0865_b d;
    private final C0248Ci e;
    private final C0820Yi f;
    private final C0740Vg g;
    private final C0839Zb h;

    public C1565joa(Xna xna, Tna tna, Tpa tpa, C0865_b _bVar, C0248Ci ci, C0820Yi yi, C0740Vg vg, C0839Zb zb) {
        this.f4724a = xna;
        this.f4725b = tna;
        this.f4726c = tpa;
        this.d = _bVar;
        this.e = ci;
        this.f = yi;
        this.g = vg;
        this.h = zb;
    }

    /* access modifiers changed from: private */
    public static void b(Context context, String str) {
        Bundle bundle = new Bundle();
        bundle.putString("action", "no_ads_fallback");
        bundle.putString("flow", str);
        C2392voa.a().a(context, C2392voa.g().f3587a, "gmob-apps", bundle, true);
    }

    public final Eoa a(Context context, String str, AbstractC1891of ofVar) {
        return (Eoa) new C2116roa(this, context, str, ofVar).a(context, false);
    }

    public final AbstractC0792Xg a(Activity activity) {
        C1772moa moa = new C1772moa(this, activity);
        Intent intent = activity.getIntent();
        boolean z = false;
        if (!intent.hasExtra("com.google.android.gms.ads.internal.overlay.useClientJar")) {
            C0745Vl.b("useClientJar flag not found in activity intent extras.");
        } else {
            z = intent.getBooleanExtra("com.google.android.gms.ads.internal.overlay.useClientJar", false);
        }
        return (AbstractC0792Xg) moa.a(activity, z);
    }
}
