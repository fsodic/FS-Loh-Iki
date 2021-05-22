package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.q;
import java.io.StringReader;
import java.util.concurrent.Executor;
import org.cocos2dx.lib.BuildConfig;
import org.json.JSONObject;

public final class LF {

    /* renamed from: a  reason: collision with root package name */
    private final Context f2463a;

    /* renamed from: b  reason: collision with root package name */
    private final C0823Yl f2464b;

    /* renamed from: c  reason: collision with root package name */
    private final GR f2465c;
    private final Executor d;

    public LF(Context context, C0823Yl yl, GR gr, Executor executor) {
        this.f2463a = context;
        this.f2464b = yl;
        this.f2465c = gr;
        this.d = executor;
    }

    public final SW<BR> a() {
        C0556Oe b2 = q.p().b(this.f2463a, this.f2464b);
        AbstractC0452Ke<JSONObject> ke = C0426Je.f2334b;
        AbstractC0348Ge a2 = b2.a("google.afma.response.normalize", ke, ke);
        return JW.a(JW.a(JW.a(JW.a(BuildConfig.FLAVOR), new OF(this, this.f2465c.d.s), this.d), new NF(a2), this.d), new QF(this), this.d);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ SW a(JSONObject jSONObject) {
        return JW.a(new BR(new C2423wR(this.f2465c), C2630zR.a(new StringReader(jSONObject.toString()))));
    }
}
