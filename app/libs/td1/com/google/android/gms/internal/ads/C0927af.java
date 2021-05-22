package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.q;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.af  reason: case insensitive filesystem */
public final class C0927af<I, O> implements AbstractC2221tW<I, O> {

    /* renamed from: a  reason: collision with root package name */
    private final AbstractC0400Ie<O> f3821a;

    /* renamed from: b  reason: collision with root package name */
    private final AbstractC0374He<I> f3822b;

    /* renamed from: c  reason: collision with root package name */
    private final String f3823c;
    private final SW<AbstractC0244Ce> d;

    C0927af(SW<AbstractC0244Ce> sw, String str, AbstractC0374He<I> he, AbstractC0400Ie<O> ie) {
        this.d = sw;
        this.f3823c = str;
        this.f3822b = he;
        this.f3821a = ie;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ SW a(Object obj, AbstractC0244Ce ce) {
        C1423hm hmVar = new C1423hm();
        q.c();
        String a2 = C2452wk.a();
        C1747mc.p.a(a2, new C1065cf(this, hmVar));
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("id", a2);
        jSONObject.put("args", this.f3822b.a(obj));
        ce.b(this.f3823c, jSONObject);
        return hmVar;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2221tW
    public final SW<O> b(I i) {
        return JW.a(this.d, new C0868_e(this, i), C0875_l.f);
    }
}
