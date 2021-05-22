package com.google.android.gms.internal.ads;

import android.os.Binder;
import com.google.android.gms.ads.internal.q;
import java.io.InputStream;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.gms.internal.ads.dF  reason: case insensitive filesystem */
public final class C1103dF {

    /* renamed from: a  reason: collision with root package name */
    private final VW f4056a;

    /* renamed from: b  reason: collision with root package name */
    private final VW f4057b;

    /* renamed from: c  reason: collision with root package name */
    private final PF f4058c;
    private final Lea<BinderC2067rG> d;

    public C1103dF(VW vw, VW vw2, PF pf, Lea<BinderC2067rG> lea) {
        this.f4056a = vw;
        this.f4057b = vw2;
        this.f4058c = pf;
        this.d = lea;
    }

    public final SW<InputStream> a(C0715Uh uh) {
        String str = uh.d;
        q.c();
        return JW.a(C2452wk.e(str) ? JW.a((Throwable) new C1448iG(YR.f3560a)) : JW.a(this.f4056a.a(new CallableC1034cF(this, uh)), ExecutionException.class, C1240fF.f4277a, this.f4057b), C1448iG.class, new C1171eF(this, uh, Binder.getCallingUid()), this.f4057b);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ SW a(C0715Uh uh, int i, C1448iG iGVar) {
        return this.d.get().a(uh, i);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ InputStream b(C0715Uh uh) {
        return this.f4058c.a(uh).get((long) ((Integer) C2392voa.e().a(C2474x.xd)).intValue(), TimeUnit.SECONDS);
    }
}
