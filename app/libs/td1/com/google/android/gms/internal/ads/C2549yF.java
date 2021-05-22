package com.google.android.gms.internal.ads;

import android.os.Binder;
import com.google.android.gms.ads.internal.q;
import java.io.InputStream;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.gms.internal.ads.yF  reason: case insensitive filesystem */
public final class C2549yF {

    /* renamed from: a  reason: collision with root package name */
    private final ScheduledExecutorService f6057a;

    /* renamed from: b  reason: collision with root package name */
    private final VW f6058b;

    /* renamed from: c  reason: collision with root package name */
    private final UF f6059c;
    private final Lea<BinderC2067rG> d;

    public C2549yF(ScheduledExecutorService scheduledExecutorService, VW vw, UF uf, Lea<BinderC2067rG> lea) {
        this.f6057a = scheduledExecutorService;
        this.f6058b = vw;
        this.f6059c = uf;
        this.d = lea;
    }

    public final SW<InputStream> a(C0715Uh uh) {
        String str = uh.d;
        q.c();
        return AW.c((SW) (C2452wk.e(str) ? JW.a((Throwable) new C1448iG(YR.f3560a)) : this.f6059c.a(uh))).a((long) ((Integer) C2392voa.e().a(C2474x.xd)).intValue(), TimeUnit.SECONDS, this.f6057a).a(Throwable.class, new C2480xF(this, uh, Binder.getCallingUid()), this.f6058b);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ SW a(C0715Uh uh, int i, Throwable th) {
        return this.d.get().c(uh, i);
    }
}
