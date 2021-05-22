package com.google.android.gms.internal.ads;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import com.google.android.gms.ads.internal.q;

/* renamed from: com.google.android.gms.internal.ads.fk  reason: case insensitive filesystem */
public final class C1281fk {

    /* renamed from: a  reason: collision with root package name */
    private long f4328a = -1;

    /* renamed from: b  reason: collision with root package name */
    private long f4329b = -1;

    /* renamed from: c  reason: collision with root package name */
    private int f4330c = -1;
    int d = -1;
    private long e = 0;
    private final Object f = new Object();
    private final String g;
    private final AbstractC1901ok h;
    private int i = 0;
    private int j = 0;

    public C1281fk(String str, AbstractC1901ok okVar) {
        this.g = str;
        this.h = okVar;
    }

    private static boolean a(Context context) {
        Context b2 = C1690li.b(context);
        int identifier = b2.getResources().getIdentifier("Theme.Translucent", "style", "android");
        if (identifier == 0) {
            C0745Vl.c("Please set theme of AdActivity to @android:style/Theme.Translucent to enable transparent background interstitial ad.");
            return false;
        }
        try {
            if (identifier == b2.getPackageManager().getActivityInfo(new ComponentName(b2.getPackageName(), "com.google.android.gms.ads.AdActivity"), 0).theme) {
                return true;
            }
            C0745Vl.c("Please set theme of AdActivity to @android:style/Theme.Translucent to enable transparent background interstitial ad.");
            return false;
        } catch (PackageManager.NameNotFoundException unused) {
            C0745Vl.d("Fail to fetch AdActivity theme");
            C0745Vl.c("Please set theme of AdActivity to @android:style/Theme.Translucent to enable transparent background interstitial ad.");
            return false;
        }
    }

    public final Bundle a(Context context, String str) {
        Bundle bundle;
        synchronized (this.f) {
            bundle = new Bundle();
            bundle.putString("session_id", this.g);
            bundle.putLong("basets", this.f4329b);
            bundle.putLong("currts", this.f4328a);
            bundle.putString("seq_num", str);
            bundle.putInt("preqs", this.f4330c);
            bundle.putInt("preqs_in_session", this.d);
            bundle.putLong("time_in_session", this.e);
            bundle.putInt("pclick", this.i);
            bundle.putInt("pimp", this.j);
            bundle.putBoolean("support_transparent_background", a(context));
        }
        return bundle;
    }

    public final void a() {
        synchronized (this.f) {
            this.j++;
        }
    }

    public final void a(Zna zna, long j2) {
        synchronized (this.f) {
            long f2 = this.h.f();
            long a2 = q.j().a();
            if (this.f4329b == -1) {
                if (a2 - f2 > ((Long) C2392voa.e().a(C2474x.xa)).longValue()) {
                    this.d = -1;
                } else {
                    this.d = this.h.d();
                }
                this.f4329b = j2;
                j2 = this.f4329b;
            }
            this.f4328a = j2;
            if (zna == null || zna.f3679c == null || zna.f3679c.getInt("gw", 2) != 1) {
                this.f4330c++;
                this.d++;
                if (this.d == 0) {
                    this.e = 0;
                    this.h.b(a2);
                } else {
                    this.e = a2 - this.h.b();
                }
            }
        }
    }

    public final void b() {
        synchronized (this.f) {
            this.i++;
        }
    }
}
