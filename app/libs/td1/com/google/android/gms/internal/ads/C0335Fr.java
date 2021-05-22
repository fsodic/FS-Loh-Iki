package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.d;
import java.util.concurrent.Executor;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.Fr  reason: case insensitive filesystem */
public final class C0335Fr implements AbstractC1835nla {

    /* renamed from: a  reason: collision with root package name */
    private AbstractC1564jo f1996a;

    /* renamed from: b  reason: collision with root package name */
    private final Executor f1997b;

    /* renamed from: c  reason: collision with root package name */
    private final C1983pr f1998c;
    private final d d;
    private boolean e = false;
    private boolean f = false;
    private C2258tr g = new C2258tr();

    public C0335Fr(Executor executor, C1983pr prVar, d dVar) {
        this.f1997b = executor;
        this.f1998c = prVar;
        this.d = dVar;
    }

    private final void e() {
        try {
            JSONObject a2 = this.f1998c.a(this.g);
            if (this.f1996a != null) {
                this.f1997b.execute(new RunnableC0309Er(this, a2));
            }
        } catch (JSONException e2) {
            C1763mk.e("Failed to call video active view js", e2);
        }
    }

    public final void a() {
        this.e = false;
    }

    public final void a(AbstractC1564jo joVar) {
        this.f1996a = joVar;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1835nla
    public final void a(C1904ola ola) {
        this.g.f5666a = this.f ? false : ola.m;
        this.g.d = this.d.b();
        this.g.f = ola;
        if (this.e) {
            e();
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void a(JSONObject jSONObject) {
        this.f1996a.b("AFMA_updateActiveView", jSONObject);
    }

    public final void b() {
        this.e = true;
        e();
    }

    public final void f(boolean z) {
        this.f = z;
    }
}
