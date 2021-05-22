package com.google.android.gms.internal.ads;

import android.content.Context;
import org.json.JSONObject;

public final class DO implements AbstractC1180eO<C2627zO> {

    /* renamed from: a  reason: collision with root package name */
    private final AbstractC0793Xh f1763a;

    /* renamed from: b  reason: collision with root package name */
    private final Context f1764b;

    /* renamed from: c  reason: collision with root package name */
    private final String f1765c;
    private final VW d;

    public DO(AbstractC0793Xh xh, Context context, String str, VW vw) {
        this.f1763a = xh;
        this.f1764b = context;
        this.f1765c = str;
        this.d = vw;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1180eO
    public final SW<C2627zO> a() {
        return this.d.a(new BO(this));
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ C2627zO b() {
        JSONObject jSONObject = new JSONObject();
        AbstractC0793Xh xh = this.f1763a;
        if (xh != null) {
            xh.a(this.f1764b, this.f1765c, jSONObject);
        }
        return new C2627zO(jSONObject);
    }
}
