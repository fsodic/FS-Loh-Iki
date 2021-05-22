package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.q;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.Pe  reason: case insensitive filesystem */
public final class C0582Pe<I, O> implements AbstractC0348Ge<I, O> {

    /* renamed from: a  reason: collision with root package name */
    private final AbstractC0400Ie<O> f2857a;

    /* renamed from: b  reason: collision with root package name */
    private final AbstractC0374He<I> f2858b;

    /* renamed from: c  reason: collision with root package name */
    private final C1132de f2859c;
    private final String d;

    C0582Pe(C1132de deVar, String str, AbstractC0374He<I> he, AbstractC0400Ie<O> ie) {
        this.f2859c = deVar;
        this.d = str;
        this.f2858b = he;
        this.f2857a = ie;
    }

    /* access modifiers changed from: private */
    public final void a(C2027qe qeVar, AbstractC0244Ce ce, I i, C1423hm<O> hmVar) {
        try {
            q.c();
            String a2 = C2452wk.a();
            C1747mc.p.a(a2, new C0712Ue(this, qeVar, hmVar));
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("id", a2);
            jSONObject.put("args", this.f2858b.a(i));
            ce.b(this.d, jSONObject);
        } catch (Exception e) {
            hmVar.a(e);
            C0745Vl.b("Unable to invokeJavascript", e);
            qeVar.c();
        } catch (Throwable th) {
            qeVar.c();
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0348Ge
    public final SW<O> a(I i) {
        C1423hm hmVar = new C1423hm();
        C2027qe b2 = this.f2859c.b((C1955pca) null);
        b2.a(new C0660Se(this, b2, i, hmVar), new C0634Re(this, hmVar, b2));
        return hmVar;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2221tW
    public final SW<O> b(I i) {
        return a((Object) i);
    }
}
