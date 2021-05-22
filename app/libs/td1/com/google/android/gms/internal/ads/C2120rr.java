package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.overlay.o;
import com.google.android.gms.common.util.d;
import java.lang.ref.WeakReference;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.rr  reason: case insensitive filesystem */
public final class C2120rr implements o, AbstractC1229ev, AbstractC1436hv, AbstractC1835nla {

    /* renamed from: a  reason: collision with root package name */
    private final C1776mr f5464a;

    /* renamed from: b  reason: collision with root package name */
    private final C1983pr f5465b;

    /* renamed from: c  reason: collision with root package name */
    private final Set<AbstractC1564jo> f5466c = new HashSet();
    private final C0927af<JSONObject, JSONObject> d;
    private final Executor e;
    private final d f;
    private final AtomicBoolean g = new AtomicBoolean(false);
    private final C2258tr h = new C2258tr();
    private boolean i = false;
    private WeakReference<?> j = new WeakReference<>(this);

    public C2120rr(C0686Te te, C1983pr prVar, Executor executor, C1776mr mrVar, d dVar) {
        this.f5464a = mrVar;
        AbstractC0452Ke<JSONObject> ke = C0426Je.f2334b;
        this.d = te.a("google.afma.activeView.handleUpdate", ke, ke);
        this.f5465b = prVar;
        this.e = executor;
        this.f = dVar;
    }

    private final void K() {
        for (AbstractC1564jo joVar : this.f5466c) {
            this.f5464a.b(joVar);
        }
        this.f5464a.a();
    }

    @Override // com.google.android.gms.ads.internal.overlay.o
    public final void I() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.o
    public final void J() {
    }

    public final synchronized void a() {
        if (!(this.j.get() != null)) {
            e();
            return;
        }
        if (!this.i && this.g.get()) {
            try {
                this.h.d = this.f.b();
                JSONObject a2 = this.f5465b.a(this.h);
                for (AbstractC1564jo joVar : this.f5466c) {
                    this.e.execute(new RunnableC2327ur(joVar, a2));
                }
                C1148dm.b(this.d.b(a2), "ActiveViewListener.callActiveViewJs");
            } catch (Exception e2) {
                C1763mk.e("Failed to call ActiveViewJS", e2);
            }
        }
    }

    public final synchronized void a(AbstractC1564jo joVar) {
        this.f5466c.add(joVar);
        this.f5464a.a(joVar);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1835nla
    public final synchronized void a(C1904ola ola) {
        this.h.f5666a = ola.m;
        this.h.f = ola;
        a();
    }

    public final void a(Object obj) {
        this.j = new WeakReference<>(obj);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1229ev
    public final synchronized void b() {
        if (this.g.compareAndSet(false, true)) {
            this.f5464a.a(this);
            a();
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1436hv
    public final synchronized void b(Context context) {
        this.h.e = "u";
        a();
        K();
        this.i = true;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1436hv
    public final synchronized void c(Context context) {
        this.h.f5667b = false;
        a();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1436hv
    public final synchronized void d(Context context) {
        this.h.f5667b = true;
        a();
    }

    public final synchronized void e() {
        K();
        this.i = true;
    }

    @Override // com.google.android.gms.ads.internal.overlay.o
    public final synchronized void onPause() {
        this.h.f5667b = true;
        a();
    }

    @Override // com.google.android.gms.ads.internal.overlay.o
    public final synchronized void onResume() {
        this.h.f5667b = false;
        a();
    }
}
