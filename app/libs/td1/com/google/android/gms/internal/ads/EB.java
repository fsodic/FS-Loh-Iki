package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;
import org.json.JSONObject;

public final class EB {

    /* renamed from: a  reason: collision with root package name */
    private final GR f1839a;

    /* renamed from: b  reason: collision with root package name */
    private final Executor f1840b;

    /* renamed from: c  reason: collision with root package name */
    private final MC f1841c;

    public EB(GR gr, Executor executor, MC mc) {
        this.f1839a = gr;
        this.f1840b = executor;
        this.f1841c = mc;
    }

    private final void a(AbstractC1564jo joVar) {
        joVar.a("/video", C1747mc.m);
        joVar.a("/videoMeta", C1747mc.n);
        joVar.a("/precache", new C0695Tn());
        joVar.a("/delayPageLoaded", C1747mc.q);
        joVar.a("/instrument", C1747mc.o);
        joVar.a("/log", C1747mc.h);
        joVar.a("/videoClicked", C1747mc.i);
        joVar.d().a(true);
        joVar.a("/click", C1747mc.d);
        if (this.f1839a.f2038c != null) {
            joVar.d().b(true);
            joVar.a("/open", new C0372Hc(null, null));
            return;
        }
        joVar.d().b(false);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ SW a(Object obj) {
        AbstractC1564jo a2 = this.f1841c.a(C1015boa.L(), false);
        C1491im c2 = C1491im.c(a2);
        a(a2);
        a2.d().a(new IB(c2));
        a2.loadUrl((String) C2392voa.e().a(C2474x.Zb));
        return c2;
    }

    public final SW<AbstractC1564jo> a(String str, String str2) {
        return JW.a(JW.a((Object) null), new GB(this, str, str2), this.f1840b);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ SW a(String str, String str2, Object obj) {
        AbstractC1564jo a2 = this.f1841c.a(C1015boa.L(), false);
        C1491im c2 = C1491im.c(a2);
        a(a2);
        a2.a(this.f1839a.f2038c != null ? C1153dp.d() : C1153dp.c());
        a2.d().a(new HB(this, a2, c2));
        a2.a(str, str2, (String) null);
        return c2;
    }

    public final SW<AbstractC1564jo> a(JSONObject jSONObject) {
        return JW.a(JW.a(JW.a((Object) null), new FB(this), this.f1840b), new DB(this, jSONObject), this.f1840b);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ SW a(JSONObject jSONObject, AbstractC1564jo joVar) {
        C1491im c2 = C1491im.c(joVar);
        joVar.a(this.f1839a.f2038c != null ? C1153dp.d() : C1153dp.c());
        joVar.d().a(new KB(this, joVar, c2));
        joVar.b("google.afma.nativeAds.renderVideo", jSONObject);
        return c2;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void a(AbstractC1564jo joVar, C1491im imVar, boolean z) {
        if (z) {
            if (!(this.f1839a.f2037b == null || joVar.E() == null)) {
                joVar.E().b(this.f1839a.f2037b);
            }
            imVar.a();
            return;
        }
        imVar.a(new SI(YR.f3560a, "Instream video Web View failed to load."));
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void b(AbstractC1564jo joVar, C1491im imVar, boolean z) {
        if (!(this.f1839a.f2037b == null || joVar.E() == null)) {
            joVar.E().b(this.f1839a.f2037b);
        }
        imVar.a();
    }
}
