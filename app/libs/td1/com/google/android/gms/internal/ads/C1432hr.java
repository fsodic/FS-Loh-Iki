package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.gms.internal.ads.hr  reason: case insensitive filesystem */
public final class C1432hr implements AbstractC0520Mu, AbstractC1229ev, AbstractC0261Cv, Ona {

    /* renamed from: a  reason: collision with root package name */
    private final Context f4520a;

    /* renamed from: b  reason: collision with root package name */
    private final Executor f4521b;

    /* renamed from: c  reason: collision with root package name */
    private final ScheduledExecutorService f4522c;
    private final BR d;
    private final C1941pR e;
    private final LT f;
    private final C1955pca g;
    private final Z h;
    private final View i;
    private boolean j;
    private boolean k;

    public C1432hr(Context context, Executor executor, ScheduledExecutorService scheduledExecutorService, BR br, C1941pR pRVar, LT lt, View view, C1955pca pca, Z z) {
        this.f4520a = context;
        this.f4521b = executor;
        this.f4522c = scheduledExecutorService;
        this.d = br;
        this.e = pRVar;
        this.f = lt;
        this.g = pca;
        this.i = view;
        this.h = z;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0261Cv
    public final synchronized void a() {
        if (this.j) {
            ArrayList arrayList = new ArrayList(this.e.d);
            arrayList.addAll(this.e.f);
            this.f.a(this.d, this.e, true, null, null, arrayList);
        } else {
            this.f.a(this.d, this.e, this.e.m);
            this.f.a(this.d, this.e, this.e.f);
        }
        this.j = true;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0520Mu
    public final void a(AbstractC1897oi oiVar, String str, String str2) {
        LT lt = this.f;
        BR br = this.d;
        C1941pR pRVar = this.e;
        lt.a(br, pRVar, pRVar.h, oiVar);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1229ev
    public final synchronized void b() {
        if (!this.k) {
            String a2 = ((Boolean) C2392voa.e().a(C2474x.Sb)).booleanValue() ? this.g.a().a(this.f4520a, this.i, (Activity) null) : null;
            if (!C1812na.f5051a.a().booleanValue()) {
                this.f.a(this.d, this.e, false, a2, null, this.e.d);
                this.k = true;
                return;
            }
            JW.a(AW.c((SW) this.h.a(this.f4520a, null)).a(((Long) C2392voa.e().a(C2474x.za)).longValue(), TimeUnit.MILLISECONDS, this.f4522c), new C1638kr(this, a2), this.f4521b);
            this.k = true;
        }
    }

    @Override // com.google.android.gms.internal.ads.Ona
    public final void e() {
        LT lt = this.f;
        BR br = this.d;
        C1941pR pRVar = this.e;
        lt.a(br, pRVar, pRVar.f5231c);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0520Mu
    public final void f() {
        LT lt = this.f;
        BR br = this.d;
        C1941pR pRVar = this.e;
        lt.a(br, pRVar, pRVar.g);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0520Mu
    public final void g() {
        LT lt = this.f;
        BR br = this.d;
        C1941pR pRVar = this.e;
        lt.a(br, pRVar, pRVar.i);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0520Mu
    public final void h() {
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0520Mu
    public final void i() {
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0520Mu
    public final void j() {
    }
}
