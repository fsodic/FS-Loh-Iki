package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.a;
import com.google.android.gms.ads.internal.c;
import java.lang.ref.WeakReference;
import java.util.Map;
import java.util.concurrent.Executor;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.gC  reason: case insensitive filesystem */
public final class C1306gC {

    /* renamed from: a  reason: collision with root package name */
    private final C1650lC f4362a = new C1650lC(null);

    /* renamed from: b  reason: collision with root package name */
    private final a f4363b;

    /* renamed from: c  reason: collision with root package name */
    private final C2115ro f4364c;
    private final Context d;
    private final Executor e;
    private final C1955pca f;
    private final C0823Yl g;
    private final C0424Jc h;
    private SW<AbstractC1564jo> i;

    C1306gC(CallableC2063rC rCVar) {
        this.d = CallableC2063rC.a(rCVar);
        this.e = CallableC2063rC.b(rCVar);
        this.f = CallableC2063rC.c(rCVar);
        this.g = CallableC2063rC.d(rCVar);
        this.f4363b = CallableC2063rC.e(rCVar);
        this.f4364c = CallableC2063rC.f(rCVar);
        this.h = new C0424Jc();
    }

    public final synchronized SW<JSONObject> a(String str, JSONObject jSONObject) {
        if (this.i == null) {
            return JW.a((Object) null);
        }
        return JW.a(this.i, new C1444iC(this, str, jSONObject), this.e);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ SW a(String str, JSONObject jSONObject, AbstractC1564jo joVar) {
        return this.h.a(joVar, str, jSONObject);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ AbstractC1564jo a(AbstractC1564jo joVar) {
        joVar.a("/result", this.h);
        AbstractC0774Wo d2 = joVar.d();
        C1650lC lCVar = this.f4362a;
        d2.a(null, lCVar, lCVar, lCVar, lCVar, false, null, new c(this.d, null, null), null, null);
        return joVar;
    }

    public final synchronized void a() {
        if (this.i != null) {
            JW.a(this.i, new C1375hC(this), this.e);
            this.i = null;
        }
    }

    public final synchronized void a(String str, AbstractC0268Dc<Object> dc) {
        if (this.i != null) {
            JW.a(this.i, new C1581kC(this, str, dc), this.e);
        }
    }

    public final synchronized void a(String str, Map<String, ?> map) {
        if (this.i != null) {
            JW.a(this.i, new C1719mC(this, str, map), this.e);
        }
    }

    public final <T> void a(WeakReference<T> weakReference, String str, AbstractC0268Dc<T> dc) {
        a(str, new C1995qC(this, weakReference, str, dc, null));
    }

    public final synchronized void b() {
        this.i = JW.a(C2115ro.a(this.d, this.g, (String) C2392voa.e().a(C2474x.Xb), this.f, this.f4363b), new C1237fC(this), this.e);
        C1148dm.a(this.i, "NativeJavascriptExecutor.initializeEngine");
    }

    public final synchronized void b(String str, AbstractC0268Dc<Object> dc) {
        if (this.i != null) {
            JW.a(this.i, new C1512jC(this, str, dc), this.e);
        }
    }
}
