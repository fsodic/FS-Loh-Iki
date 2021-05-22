package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;
import com.google.android.gms.ads.internal.q;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.Pg  reason: case insensitive filesystem */
public final class C0584Pg extends C0662Sg implements AbstractC0268Dc<AbstractC1564jo> {

    /* renamed from: c  reason: collision with root package name */
    private final AbstractC1564jo f2863c;
    private final Context d;
    private final WindowManager e;
    private final C1165e f;
    private DisplayMetrics g;
    private float h;
    private int i = -1;
    private int j = -1;
    private int k;
    private int l = -1;
    private int m = -1;
    private int n = -1;
    private int o = -1;

    public C0584Pg(AbstractC1564jo joVar, Context context, C1165e eVar) {
        super(joVar);
        this.f2863c = joVar;
        this.d = context;
        this.f = eVar;
        this.e = (WindowManager) context.getSystemService("window");
    }

    public final void a(int i2, int i3) {
        int i4 = 0;
        if (this.d instanceof Activity) {
            i4 = q.c().c((Activity) this.d)[0];
        }
        if (this.f2863c.H() == null || !this.f2863c.H().e()) {
            int width = this.f2863c.getWidth();
            int height = this.f2863c.getHeight();
            if (((Boolean) C2392voa.e().a(C2474x.K)).booleanValue()) {
                if (width == 0 && this.f2863c.H() != null) {
                    width = this.f2863c.H().f4151c;
                }
                if (height == 0 && this.f2863c.H() != null) {
                    height = this.f2863c.H().f4150b;
                }
            }
            this.n = C2392voa.a().a(this.d, width);
            this.o = C2392voa.a().a(this.d, height);
        }
        b(i2, i3 - i4, this.n, this.o);
        this.f2863c.d().a(i2, i3);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.util.Map] */
    @Override // com.google.android.gms.internal.ads.AbstractC0268Dc
    public final /* synthetic */ void a(AbstractC1564jo joVar, Map map) {
        int i2;
        this.g = new DisplayMetrics();
        Display defaultDisplay = this.e.getDefaultDisplay();
        defaultDisplay.getMetrics(this.g);
        this.h = this.g.density;
        this.k = defaultDisplay.getRotation();
        C2392voa.a();
        DisplayMetrics displayMetrics = this.g;
        this.i = C0459Kl.b(displayMetrics, displayMetrics.widthPixels);
        C2392voa.a();
        DisplayMetrics displayMetrics2 = this.g;
        this.j = C0459Kl.b(displayMetrics2, displayMetrics2.heightPixels);
        Activity v = this.f2863c.v();
        if (v == null || v.getWindow() == null) {
            this.l = this.i;
            i2 = this.j;
        } else {
            q.c();
            int[] a2 = C2452wk.a(v);
            C2392voa.a();
            this.l = C0459Kl.b(this.g, a2[0]);
            C2392voa.a();
            i2 = C0459Kl.b(this.g, a2[1]);
        }
        this.m = i2;
        if (this.f2863c.H().e()) {
            this.n = this.i;
            this.o = this.j;
        } else {
            this.f2863c.measure(0, 0);
        }
        a(this.i, this.j, this.l, this.m, this.h, this.k);
        C0610Qg qg = new C0610Qg();
        qg.b(this.f.a());
        qg.a(this.f.b());
        qg.c(this.f.d());
        qg.d(this.f.c());
        qg.e(true);
        this.f2863c.a("onDeviceFeaturesReceived", new C0532Ng(qg).a());
        int[] iArr = new int[2];
        this.f2863c.getLocationOnScreen(iArr);
        a(C2392voa.a().a(this.d, iArr[0]), C2392voa.a().a(this.d, iArr[1]));
        if (C0745Vl.a(2)) {
            C0745Vl.c("Dispatching Ready Event.");
        }
        b(this.f2863c.q().f3587a);
    }
}
