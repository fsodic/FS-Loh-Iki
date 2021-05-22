package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.q;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.Cd  reason: case insensitive filesystem */
public final class C0243Cd extends C0581Pd<AbstractC0244Ce> implements AbstractC0477Ld, AbstractC0607Qd {

    /* renamed from: c  reason: collision with root package name */
    private final C2117rp f1701c;
    private AbstractC0685Td d;

    public C0243Cd(Context context, C0823Yl yl) {
        try {
            this.f1701c = new C2117rp(context, new C0399Id(this));
            this.f1701c.setWillNotDraw(true);
            this.f1701c.addJavascriptInterface(new C0425Jd(this), "GoogleJsInterface");
            q.c().a(context, yl.f3587a, this.f1701c.getSettings());
            super.a((Object) this);
        } catch (Throwable th) {
            throw new C2391vo("Init failed.", th);
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0607Qd
    public final AbstractC0218Be a() {
        return new C0296Ee(this);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0607Qd
    public final void a(AbstractC0685Td td) {
        this.d = td;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0477Ld, com.google.android.gms.internal.ads.AbstractC0925ae
    public final void a(String str) {
        C0875_l.e.execute(new RunnableC0373Hd(this, str));
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0477Ld
    public final void a(String str, String str2) {
        C0451Kd.a(this, str, str2);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0269Dd
    public final void a(String str, Map map) {
        C0451Kd.a(this, str, map);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0477Ld, com.google.android.gms.internal.ads.AbstractC0269Dd
    public final void a(String str, JSONObject jSONObject) {
        C0451Kd.b(this, str, jSONObject);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0925ae
    public final void b(String str, JSONObject jSONObject) {
        C0451Kd.a(this, str, jSONObject);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0607Qd
    public final void c(String str) {
        d(String.format("<!DOCTYPE html><html><head><script src=\"%s\"></script></head></html>", str));
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0607Qd
    public final void d(String str) {
        C0875_l.e.execute(new RunnableC0321Fd(this, str));
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0607Qd
    public final void destroy() {
        this.f1701c.destroy();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0607Qd
    public final void e(String str) {
        C0875_l.e.execute(new RunnableC0295Ed(this, str));
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void f(String str) {
        this.f1701c.a(str);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void g(String str) {
        this.f1701c.loadUrl(str);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void h(String str) {
        this.f1701c.loadData(str, "text/html", "UTF-8");
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0607Qd
    public final boolean isDestroyed() {
        return this.f1701c.isDestroyed();
    }
}
