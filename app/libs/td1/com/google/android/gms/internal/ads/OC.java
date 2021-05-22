package com.google.android.gms.internal.ads;

import android.view.MotionEvent;
import android.view.View;
import com.google.android.gms.ads.internal.c;
import java.util.Map;
import java.util.concurrent.Executor;

public final class OC {

    /* renamed from: a  reason: collision with root package name */
    private final C0494Lu f2720a;

    /* renamed from: b  reason: collision with root package name */
    private final C1780mv f2721b;

    /* renamed from: c  reason: collision with root package name */
    private final C0209Av f2722c;
    private final C0469Kv d;
    private final C0522Mw e;
    private final Executor f;
    private final C0601Px g;
    private final C2120rr h;
    private final c i;
    private final C1367gv j;
    private final AbstractC1761mj k;
    private final C1955pca l;
    private final C0340Fw m;

    public OC(C0494Lu lu, C1780mv mvVar, C0209Av av, C0469Kv kv, C0522Mw mw, Executor executor, C0601Px px, C2120rr rrVar, c cVar, C1367gv gvVar, AbstractC1761mj mjVar, C1955pca pca, C0340Fw fw) {
        this.f2720a = lu;
        this.f2721b = mvVar;
        this.f2722c = av;
        this.d = kv;
        this.e = mw;
        this.f = executor;
        this.g = px;
        this.h = rrVar;
        this.i = cVar;
        this.j = gvVar;
        this.k = mjVar;
        this.l = pca;
        this.m = fw;
    }

    public static SW<?> a(AbstractC1564jo joVar, String str, String str2) {
        C1423hm hmVar = new C1423hm();
        joVar.d().a(new _C(hmVar));
        joVar.a(str, str2, (String) null);
        return hmVar;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void a() {
        this.f2721b.R();
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void a(View view) {
        this.i.a();
        AbstractC1761mj mjVar = this.k;
        if (mjVar != null) {
            mjVar.b();
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void a(AbstractC1564jo joVar, AbstractC1564jo joVar2, Map map) {
        this.h.a(joVar);
    }

    public final void a(AbstractC1564jo joVar, boolean z) {
        AbstractC1740mX a2;
        joVar.d().a(new SC(this), this.f2722c, this.d, new RC(this), new UC(this), z, null, this.i, new ZC(this), this.k);
        joVar.setOnTouchListener(new TC(this));
        joVar.setOnClickListener(new WC(this));
        if (((Boolean) C2392voa.e().a(C2474x.Ab)).booleanValue() && (a2 = this.l.a()) != null) {
            a2.a(joVar.getView());
        }
        this.g.a(joVar, this.f);
        this.g.a(new VC(joVar), this.f);
        this.g.a(joVar.getView());
        joVar.a("/trackActiveViewUnit", new YC(this, joVar));
        this.h.a((Object) joVar);
        if (!((Boolean) C2392voa.e().a(C2474x.pa)).booleanValue()) {
            C1367gv gvVar = this.j;
            joVar.getClass();
            gvVar.a(XC.a(joVar), this.f);
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void a(String str, String str2) {
        this.e.a(str, str2);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ boolean a(View view, MotionEvent motionEvent) {
        this.i.a();
        AbstractC1761mj mjVar = this.k;
        if (mjVar == null) {
            return false;
        }
        mjVar.b();
        return false;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void b() {
        this.f2720a.e();
    }
}
