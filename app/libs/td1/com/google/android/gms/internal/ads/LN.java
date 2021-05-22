package com.google.android.gms.internal.ads;

import android.content.Context;
import org.cocos2dx.lib.BuildConfig;

public final class LN implements AbstractC1180eO<MN> {

    /* renamed from: a  reason: collision with root package name */
    private final C2243tj f2479a;

    /* renamed from: b  reason: collision with root package name */
    private final VW f2480b;

    /* renamed from: c  reason: collision with root package name */
    private final Context f2481c;

    public LN(C2243tj tjVar, VW vw, Context context) {
        this.f2479a = tjVar;
        this.f2480b = vw;
        this.f2481c = context;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1180eO
    public final SW<MN> a() {
        return this.f2480b.a(new ON(this));
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ MN b() {
        if (!this.f2479a.a(this.f2481c)) {
            return new MN(null, null, null, null, null);
        }
        String c2 = this.f2479a.c(this.f2481c);
        String str = c2 == null ? BuildConfig.FLAVOR : c2;
        String d = this.f2479a.d(this.f2481c);
        String str2 = d == null ? BuildConfig.FLAVOR : d;
        String e = this.f2479a.e(this.f2481c);
        String str3 = e == null ? BuildConfig.FLAVOR : e;
        String f = this.f2479a.f(this.f2481c);
        return new MN(str, str2, str3, f == null ? BuildConfig.FLAVOR : f, "TIME_OUT".equals(str2) ? (Long) C2392voa.e().a(C2474x.Y) : null);
    }
}
