package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.ViewGroup;
import com.google.android.gms.common.internal.r;

/* renamed from: com.google.android.gms.internal.ads.Pm  reason: case insensitive filesystem */
public final class C0590Pm {

    /* renamed from: a  reason: collision with root package name */
    private final Context f2881a;

    /* renamed from: b  reason: collision with root package name */
    private final AbstractC0798Xm f2882b;

    /* renamed from: c  reason: collision with root package name */
    private final ViewGroup f2883c;
    private C0434Jm d;

    private C0590Pm(Context context, ViewGroup viewGroup, AbstractC0798Xm xm, C0434Jm jm) {
        this.f2881a = context.getApplicationContext() != null ? context.getApplicationContext() : context;
        this.f2883c = viewGroup;
        this.f2882b = xm;
        this.d = null;
    }

    public C0590Pm(Context context, ViewGroup viewGroup, AbstractC1564jo joVar) {
        this(context, viewGroup, joVar, null);
    }

    public final void a() {
        r.a("onDestroy must be called from the UI thread.");
        C0434Jm jm = this.d;
        if (jm != null) {
            jm.h();
            this.f2883c.removeView(this.d);
            this.d = null;
        }
    }

    public final void a(int i, int i2, int i3, int i4) {
        r.a("The underlay may only be modified from the UI thread.");
        C0434Jm jm = this.d;
        if (jm != null) {
            jm.a(i, i2, i3, i4);
        }
    }

    public final void a(int i, int i2, int i3, int i4, int i5, boolean z, C0824Ym ym) {
        if (this.d == null) {
            G.a(this.f2882b.m().a(), this.f2882b.N(), "vpr2");
            Context context = this.f2881a;
            AbstractC0798Xm xm = this.f2882b;
            this.d = new C0434Jm(context, xm, i5, z, xm.m().a(), ym);
            this.f2883c.addView(this.d, 0, new ViewGroup.LayoutParams(-1, -1));
            this.d.a(i, i2, i3, i4);
            this.f2882b.f(false);
        }
    }

    public final void b() {
        r.a("onPause must be called from the UI thread.");
        C0434Jm jm = this.d;
        if (jm != null) {
            jm.i();
        }
    }

    public final C0434Jm c() {
        r.a("getAdVideoUnderlay must be called from the UI thread.");
        return this.d;
    }
}
