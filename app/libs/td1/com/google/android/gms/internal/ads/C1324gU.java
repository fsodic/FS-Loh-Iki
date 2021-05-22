package com.google.android.gms.internal.ads;

import android.content.Context;
import b.c.b.a.h.e;
import b.c.b.a.h.g;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.gms.internal.ads.gU  reason: case insensitive filesystem */
public final class C1324gU {

    /* renamed from: a  reason: collision with root package name */
    private final Context f4393a;

    /* renamed from: b  reason: collision with root package name */
    private final Executor f4394b;

    /* renamed from: c  reason: collision with root package name */
    private final UT f4395c;
    private final VT d;
    private final AbstractC1806nU e;
    private final AbstractC1806nU f;
    private e<C1511jB> g;
    private e<C1511jB> h;

    private C1324gU(Context context, Executor executor, UT ut, VT vt, C1668lU lUVar, C1875oU oUVar) {
        this.f4393a = context;
        this.f4394b = executor;
        this.f4395c = ut;
        this.d = vt;
        this.e = lUVar;
        this.f = oUVar;
    }

    private final e<C1511jB> a(Callable<C1511jB> callable) {
        e<C1511jB> a2 = g.a(this.f4394b, callable);
        a2.a(this.f4394b, new C1737mU(this));
        return a2;
    }

    public static C1324gU a(Context context, Executor executor, UT ut, VT vt) {
        C1324gU gUVar = new C1324gU(context, executor, ut, vt, new C1668lU(), new C1875oU());
        gUVar.g = gUVar.d.b() ? gUVar.a(new CallableC1599kU(gUVar)) : g.a(gUVar.e.a());
        gUVar.h = gUVar.a(new CallableC1530jU(gUVar));
        return gUVar;
    }

    private static C1511jB a(e<C1511jB> eVar, C1511jB jBVar) {
        return !eVar.d() ? jBVar : eVar.b();
    }

    public final C1511jB a() {
        return a(this.g, this.e.a());
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void a(Exception exc) {
        if (exc instanceof InterruptedException) {
            Thread.currentThread().interrupt();
        }
        this.f4395c.a(2025, -1, exc);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ C1511jB b() {
        return this.f.a(this.f4393a);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ C1511jB c() {
        return this.e.a(this.f4393a);
    }

    public final C1511jB d() {
        return a(this.h, this.f.a());
    }
}
