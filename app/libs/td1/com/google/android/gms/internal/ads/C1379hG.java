package com.google.android.gms.internal.ads;

import android.os.Binder;
import com.google.android.gms.ads.internal.q;
import java.io.InputStream;
import java.util.concurrent.ExecutionException;

/* renamed from: com.google.android.gms.internal.ads.hG  reason: case insensitive filesystem */
public final class C1379hG {

    /* renamed from: a  reason: collision with root package name */
    private final VW f4456a;

    /* renamed from: b  reason: collision with root package name */
    private final ZF f4457b;

    /* renamed from: c  reason: collision with root package name */
    private final Lea<BinderC2067rG> f4458c;

    public C1379hG(VW vw, ZF zf, Lea<BinderC2067rG> lea) {
        this.f4456a = vw;
        this.f4457b = zf;
        this.f4458c = lea;
    }

    private final <RetT> SW<RetT> a(C0715Uh uh, AbstractC2136sG<InputStream> sGVar, AbstractC2136sG<InputStream> sGVar2, AbstractC2221tW<InputStream, RetT> tWVar) {
        String str = uh.d;
        q.c();
        return AW.c(C2452wk.e(str) ? JW.a((Throwable) new C1448iG(YR.f3560a)) : JW.a(sGVar.a(uh), ExecutionException.class, C1585kG.f4751a, this.f4456a)).a(tWVar, this.f4456a).a(C1448iG.class, new C1516jG(this, sGVar2, uh, tWVar), this.f4456a);
    }

    public final SW<C0715Uh> a(C0715Uh uh) {
        C1723mG mGVar = new C1723mG(uh);
        ZF zf = this.f4457b;
        zf.getClass();
        return a(uh, C1654lG.a(zf), new C1861oG(this), mGVar);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ SW a(AbstractC2136sG sGVar, C0715Uh uh, AbstractC2221tW tWVar, C1448iG iGVar) {
        return JW.a(sGVar.a(uh), tWVar, this.f4456a);
    }

    public final SW<Void> b(C0715Uh uh) {
        if (C2512xfa.b(uh.k)) {
            return JW.a((Throwable) new C0896aF(YR.f3561b, "Pool key missing from removeUrl call."));
        }
        return a(uh, new C1999qG(this), new C1930pG(this), C1792nG.f5026a);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ SW c(C0715Uh uh) {
        return this.f4458c.get().F(uh.k);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ SW d(C0715Uh uh) {
        return this.f4457b.a(uh.k);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ SW e(C0715Uh uh) {
        return this.f4458c.get().b(uh, Binder.getCallingUid());
    }
}
