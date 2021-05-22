package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.c;
import com.google.android.gms.common.util.e;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.Ic  reason: case insensitive filesystem */
public final class C0398Ic implements AbstractC0268Dc<AbstractC1564jo> {

    /* renamed from: a  reason: collision with root package name */
    private static final Map<String, Integer> f2239a = e.a(new String[]{"resize", "playVideo", "storePicture", "createCalendarEvent", "setOrientationProperties", "closeResizedAd", "unload"}, new Integer[]{1, 2, 3, 4, 5, 6, 7});

    /* renamed from: b  reason: collision with root package name */
    private final c f2240b;

    /* renamed from: c  reason: collision with root package name */
    private final C0376Hg f2241c;
    private final AbstractC0636Rg d;

    public C0398Ic(c cVar, C0376Hg hg, AbstractC0636Rg rg) {
        this.f2240b = cVar;
        this.f2241c = hg;
        this.d = rg;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.util.Map] */
    @Override // com.google.android.gms.internal.ads.AbstractC0268Dc
    public final /* synthetic */ void a(AbstractC1564jo joVar, Map map) {
        c cVar;
        AbstractC1564jo joVar2 = joVar;
        int intValue = f2239a.get((String) map.get("a")).intValue();
        if (intValue != 5 && intValue != 7 && (cVar = this.f2240b) != null && !cVar.b()) {
            this.f2240b.a(null);
        } else if (intValue == 1) {
            this.f2241c.a(map);
        } else if (intValue == 3) {
            new C0402Ig(joVar2, map).a();
        } else if (intValue == 4) {
            new C0246Cg(joVar2, map).b();
        } else if (intValue == 5) {
            new C0428Jg(joVar2, map).a();
        } else if (intValue == 6) {
            this.f2241c.a(true);
        } else if (intValue != 7) {
            C0745Vl.c("Unknown MRAID command called.");
        } else {
            this.d.a();
        }
    }
}
