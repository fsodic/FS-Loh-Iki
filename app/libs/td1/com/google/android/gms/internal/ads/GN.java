package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import b.c.b.a.c.b;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public final class GN implements AbstractC1180eO<DN> {

    /* renamed from: a  reason: collision with root package name */
    private final VW f2030a;

    /* renamed from: b  reason: collision with root package name */
    private final ScheduledExecutorService f2031b;

    /* renamed from: c  reason: collision with root package name */
    private final C1314gK f2032c;
    private final Context d;
    private final GR e;
    private final C1176eK f;
    private String g;

    public GN(VW vw, ScheduledExecutorService scheduledExecutorService, String str, C1314gK gKVar, Context context, GR gr, C1176eK eKVar) {
        this.f2030a = vw;
        this.f2031b = scheduledExecutorService;
        this.g = str;
        this.f2032c = gKVar;
        this.d = context;
        this.e = gr;
        this.f = eKVar;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1180eO
    public final SW<DN> a() {
        return ((Boolean) C2392voa.e().a(C2474x.ib)).booleanValue() ? JW.a(new FN(this), this.f2030a) : JW.a((Object) null);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ SW a(String str, List list, Bundle bundle) {
        C1423hm hmVar = new C1423hm();
        this.f.a(str);
        AbstractC1755mg b2 = this.f.b(str);
        if (b2 != null) {
            b2.a(b.a(this.d), this.g, bundle, (Bundle) list.get(0), this.e.e, new BinderC1727mK(str, b2, hmVar));
            return hmVar;
        }
        throw new NullPointerException();
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ SW b() {
        Map<String, List<Bundle>> a2 = this.f2032c.a(this.g, this.e.f);
        ArrayList arrayList = new ArrayList();
        for (Map.Entry<String, List<Bundle>> entry : a2.entrySet()) {
            String key = entry.getKey();
            List<Bundle> value = entry.getValue();
            Bundle bundle = this.e.d.m;
            arrayList.add(AW.c(JW.a(new IN(this, key, value, bundle != null ? bundle.getBundle(key) : null), this.f2030a)).a(((Long) C2392voa.e().a(C2474x.hb)).longValue(), TimeUnit.MILLISECONDS, this.f2031b).a(Throwable.class, new HN(key), this.f2030a));
        }
        return JW.c(arrayList).a(new KN(arrayList), this.f2030a);
    }
}
