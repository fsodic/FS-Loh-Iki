package com.google.android.gms.internal.ads;

import org.json.JSONException;
import org.json.JSONObject;

/* access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.ads.Ue  reason: case insensitive filesystem */
public final class C0712Ue implements AbstractC0476Lc {

    /* renamed from: a  reason: collision with root package name */
    private final C2027qe f3257a;

    /* renamed from: b  reason: collision with root package name */
    private final C1423hm<O> f3258b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ C0582Pe f3259c;

    public C0712Ue(C0582Pe pe, C2027qe qeVar, C1423hm<O> hmVar) {
        this.f3259c = pe;
        this.f3257a = qeVar;
        this.f3258b = hmVar;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0476Lc
    public final void a(String str) {
        if (str == null) {
            try {
                this.f3258b.a(new C0270De());
            } catch (IllegalStateException unused) {
            } catch (Throwable th) {
                this.f3257a.c();
                throw th;
            }
        } else {
            this.f3258b.a(new C0270De(str));
        }
        this.f3257a.c();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0476Lc
    public final void a(JSONObject jSONObject) {
        try {
            this.f3258b.b((O) this.f3259c.f2857a.a(jSONObject));
        } catch (IllegalStateException unused) {
        } catch (JSONException e) {
            this.f3258b.a(e);
        } catch (Throwable th) {
            this.f3257a.c();
            throw th;
        }
        this.f3257a.c();
    }
}
