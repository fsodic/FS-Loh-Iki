package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.q;
import org.cocos2dx.lib.BuildConfig;

public final class IM implements AbstractC1180eO<NM> {

    /* renamed from: a  reason: collision with root package name */
    private final Context f2218a;

    /* renamed from: b  reason: collision with root package name */
    private final VW f2219b;

    IM(Context context, VW vw) {
        this.f2218a = context;
        this.f2219b = vw;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1180eO
    public final SW<NM> a() {
        return this.f2219b.a(new LM(this));
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ NM b() {
        q.c();
        String l = C2452wk.l(this.f2218a);
        boolean booleanValue = ((Boolean) C2392voa.e().a(C2474x.ae)).booleanValue();
        String str = BuildConfig.FLAVOR;
        if (booleanValue) {
            str = this.f2218a.getSharedPreferences("mobileads_consent", 0).getString("fc_consent", str);
        }
        q.c();
        return new NM(l, str, C2452wk.m(this.f2218a));
    }
}
