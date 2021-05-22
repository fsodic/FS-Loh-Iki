package com.google.android.gms.internal.ads;

import android.content.Context;
import b.c.b.a.c.a;
import com.google.android.gms.ads.internal.overlay.o;
import com.google.android.gms.ads.internal.q;
import com.google.android.gms.internal.ads.Oma;
import java.util.HashMap;
import org.cocos2dx.lib.BuildConfig;

/* renamed from: com.google.android.gms.internal.ads.Wy  reason: case insensitive filesystem */
public final class C0784Wy implements o, AbstractC0261Cv {

    /* renamed from: a  reason: collision with root package name */
    private final Context f3470a;

    /* renamed from: b  reason: collision with root package name */
    private final AbstractC1564jo f3471b;

    /* renamed from: c  reason: collision with root package name */
    private final C1941pR f3472c;
    private final C0823Yl d;
    private final Oma.a e;
    private a f;

    public C0784Wy(Context context, AbstractC1564jo joVar, C1941pR pRVar, C0823Yl yl, Oma.a aVar) {
        this.f3470a = context;
        this.f3471b = joVar;
        this.f3472c = pRVar;
        this.d = yl;
        this.e = aVar;
    }

    @Override // com.google.android.gms.ads.internal.overlay.o
    public final void I() {
        AbstractC1564jo joVar;
        if (this.f != null && (joVar = this.f3471b) != null) {
            joVar.a("onSdkImpression", new HashMap());
        }
    }

    @Override // com.google.android.gms.ads.internal.overlay.o
    public final void J() {
        this.f = null;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0261Cv
    public final void a() {
        Oma.a aVar = this.e;
        if ((aVar == Oma.a.REWARD_BASED_VIDEO_AD || aVar == Oma.a.INTERSTITIAL) && this.f3472c.K && this.f3471b != null && q.r().b(this.f3470a)) {
            C0823Yl yl = this.d;
            int i = yl.f3588b;
            int i2 = yl.f3589c;
            StringBuilder sb = new StringBuilder(23);
            sb.append(i);
            sb.append(".");
            sb.append(i2);
            this.f = q.r().a(sb.toString(), this.f3471b.getWebView(), BuildConfig.FLAVOR, "javascript", this.f3472c.M.optInt("media_type", -1) == 0 ? null : "javascript");
            if (this.f != null && this.f3471b.getView() != null) {
                q.r().a(this.f, this.f3471b.getView());
                this.f3471b.a(this.f);
                q.r().a(this.f);
            }
        }
    }

    @Override // com.google.android.gms.ads.internal.overlay.o
    public final void onPause() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.o
    public final void onResume() {
    }
}
