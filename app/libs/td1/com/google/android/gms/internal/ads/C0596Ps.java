package com.google.android.gms.internal.ads;

import a.c.b;
import android.content.Context;
import android.view.View;
import b.c.b.a.c.a;
import com.google.android.gms.ads.internal.q;
import org.cocos2dx.lib.BuildConfig;

/* renamed from: com.google.android.gms.internal.ads.Ps  reason: case insensitive filesystem */
public final class C0596Ps implements AbstractC1229ev, AbstractC0261Cv {

    /* renamed from: a  reason: collision with root package name */
    private final Context f2889a;

    /* renamed from: b  reason: collision with root package name */
    private final AbstractC1564jo f2890b;

    /* renamed from: c  reason: collision with root package name */
    private final C1941pR f2891c;
    private final C0823Yl d;
    private a e;
    private boolean f;

    public C0596Ps(Context context, AbstractC1564jo joVar, C1941pR pRVar, C0823Yl yl) {
        this.f2889a = context;
        this.f2890b = joVar;
        this.f2891c = pRVar;
        this.d = yl;
    }

    private final synchronized void c() {
        if (this.f2891c.K) {
            if (this.f2890b != null) {
                if (q.r().b(this.f2889a)) {
                    int i = this.d.f3588b;
                    int i2 = this.d.f3589c;
                    StringBuilder sb = new StringBuilder(23);
                    sb.append(i);
                    sb.append(".");
                    sb.append(i2);
                    this.e = q.r().a(sb.toString(), this.f2890b.getWebView(), BuildConfig.FLAVOR, "javascript", this.f2891c.M.optInt("media_type", -1) == 0 ? null : "javascript");
                    View view = this.f2890b.getView();
                    if (!(this.e == null || view == null)) {
                        q.r().a(this.e, view);
                        this.f2890b.a(this.e);
                        q.r().a(this.e);
                        this.f = true;
                    }
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0261Cv
    public final synchronized void a() {
        if (!this.f) {
            c();
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1229ev
    public final synchronized void b() {
        if (!this.f) {
            c();
        }
        if (!(!this.f2891c.K || this.e == null || this.f2890b == null)) {
            this.f2890b.a("onSdkImpression", new b());
        }
    }
}
