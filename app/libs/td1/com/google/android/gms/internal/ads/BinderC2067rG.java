package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Binder;
import com.google.android.gms.ads.internal.q;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.HashMap;
import java.util.concurrent.Executor;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.rG  reason: case insensitive filesystem */
public final class BinderC2067rG extends AbstractBinderC0455Kh {

    /* renamed from: a  reason: collision with root package name */
    private final Context f5395a;

    /* renamed from: b  reason: collision with root package name */
    private final Executor f5396b;

    /* renamed from: c  reason: collision with root package name */
    private final AbstractC1346gi f5397c;
    private final AbstractC1483ii d;
    private final AbstractC0854Zq e;
    private final HashMap<String, HG> f;

    public BinderC2067rG(Context context, Executor executor, AbstractC1346gi giVar, AbstractC0854Zq zq, AbstractC1483ii iiVar, HashMap<String, HG> hashMap) {
        C2474x.a(context);
        this.f5395a = context;
        this.f5396b = executor;
        this.f5397c = giVar;
        this.d = iiVar;
        this.e = zq;
        this.f = hashMap;
    }

    private static SW<C0871_h> a(SW<JSONObject> sw, BT bt, C0556Oe oe) {
        return bt.a(EnumC2563yT.BUILD_URL, sw).a((AbstractC2221tW) oe.a("AFMA_getAdDictionary", C0426Je.f2334b, C2550yG.f6060a)).a();
    }

    private static SW<JSONObject> a(C0715Uh uh, BT bt, AbstractC2420wO wOVar) {
        C2412wG wGVar = new C2412wG(wOVar);
        return bt.a(EnumC2563yT.GMS_SIGNALS, JW.a(uh.f3269a)).a((AbstractC2221tW) wGVar).a(C2619zG.f6165a).a();
    }

    private final void a(SW<InputStream> sw, AbstractC0559Oh oh) {
        JW.a(JW.a(sw, new CG(this), C0875_l.f3755a), new EG(this, oh), C0875_l.f);
    }

    public final SW<InputStream> F(String str) {
        if (!C2294ua.f5731a.a().booleanValue()) {
            return JW.a((Throwable) new Exception("Split request is disabled."));
        }
        FG fg = new FG(this);
        if (this.f.remove(str) != null) {
            return JW.a(fg);
        }
        String valueOf = String.valueOf(str);
        return JW.a((Throwable) new Exception(valueOf.length() != 0 ? "URL to be removed not found for cache key: ".concat(valueOf) : new String("URL to be removed not found for cache key: ")));
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void Wb() {
        C1148dm.a(this.d.a(), "persistFlags");
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0351Gh
    public final C0247Ch a(C0195Ah ah) {
        return null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0072  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x00b8  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.internal.ads.SW<java.io.InputStream> a(com.google.android.gms.internal.ads.C0715Uh r10, int r11) {
        /*
        // Method dump skipped, instructions count: 237
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.BinderC2067rG.a(com.google.android.gms.internal.ads.Uh, int):com.google.android.gms.internal.ads.SW");
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ InputStream a(SW sw, SW sw2) {
        String h = ((C0871_h) sw.get()).h();
        this.f.put(h, new HG((C0871_h) sw.get(), (JSONObject) sw2.get()));
        return new ByteArrayInputStream(h.getBytes(C1050cV.f3999c));
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0351Gh
    public final void a(C0195Ah ah, AbstractC0507Mh mh) {
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0351Gh
    public final void a(C0715Uh uh, AbstractC0559Oh oh) {
        a(c(uh, Binder.getCallingUid()), oh);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0351Gh
    public final void a(String str, AbstractC0559Oh oh) {
        a(F(str), oh);
    }

    public final SW<InputStream> b(C0715Uh uh, int i) {
        if (!C2294ua.f5731a.a().booleanValue()) {
            return JW.a((Throwable) new Exception("Split request is disabled."));
        }
        C2562yS ySVar = uh.j;
        if (ySVar == null) {
            return JW.a((Throwable) new Exception("Pool configuration missing from request."));
        }
        if (ySVar.g == 0 || ySVar.h == 0) {
            return JW.a((Throwable) new Exception("Caching is disabled."));
        }
        C0556Oe a2 = q.p().a(this.f5395a, C0823Yl.L());
        AbstractC2420wO a3 = this.e.a(uh, i);
        BT c2 = a3.c();
        SW<JSONObject> a4 = a(uh, c2, a3);
        SW<C0871_h> a5 = a(a4, c2, a2);
        return c2.a(EnumC2563yT.GET_URL_AND_CACHE_KEY, a4, a5).a(new AG(this, a5, a4)).a();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0351Gh
    public final void b(C0715Uh uh, AbstractC0559Oh oh) {
        a(b(uh, Binder.getCallingUid()), oh);
    }

    public final SW<InputStream> c(C0715Uh uh, int i) {
        C0556Oe a2 = q.p().a(this.f5395a, C0823Yl.L());
        if (!C0188Aa.f1520a.a().booleanValue()) {
            return JW.a((Throwable) new Exception("Signal collection disabled."));
        }
        AbstractC2420wO a3 = this.e.a(uh, i);
        C1112dO<JSONObject> b2 = a3.b();
        return a3.c().a(EnumC2563yT.GET_SIGNALS, JW.a(uh.f3269a)).a((AbstractC2221tW) new DG(b2)).a(EnumC2563yT.JS_SIGNALS).a((AbstractC2221tW) a2.a("google.afma.request.getSignals", C0426Je.f2334b, C0426Je.f2335c)).a();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0351Gh
    public final void c(C0715Uh uh, AbstractC0559Oh oh) {
        SW<InputStream> a2 = a(uh, Binder.getCallingUid());
        a(a2, oh);
        a2.a(new BG(this), this.f5396b);
    }
}
