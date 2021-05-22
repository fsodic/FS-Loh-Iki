package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.AbstractC2399vu;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.gms.internal.ads.jQ  reason: case insensitive filesystem */
final class C1526jQ<R extends AbstractC2399vu<? extends C0952at>> {

    /* renamed from: a  reason: collision with root package name */
    private final AbstractC2079rS f4668a;

    /* renamed from: b  reason: collision with root package name */
    private final AbstractC2146sQ f4669b;

    /* renamed from: c  reason: collision with root package name */
    private final AbstractC2077rQ<R> f4670c;
    private final Executor d;
    private C1802nQ e;

    public C1526jQ(AbstractC2079rS rSVar, AbstractC2146sQ sQVar, AbstractC2077rQ<R> rQVar, Executor executor) {
        this.f4668a = rSVar;
        this.f4669b = sQVar;
        this.f4670c = rQVar;
        this.d = executor;
    }

    /* access modifiers changed from: private */
    @Deprecated
    public final BS b() {
        GR b2 = this.f4670c.a(this.f4669b).a().b();
        return this.f4668a.a(b2.d, b2.f, b2.j);
    }

    public final SW<C1802nQ> a() {
        SW sw;
        C1802nQ nQVar = this.e;
        if (nQVar != null) {
            return JW.a(nQVar);
        }
        if (!C2294ua.f5731a.a().booleanValue()) {
            this.e = new C1802nQ(null, b(), null);
            sw = JW.a(this.e);
        } else {
            sw = AW.c((SW) this.f4670c.a(this.f4669b).a(new ZP(this.f4668a.a().j)).a().a().a(this.f4668a.a())).a(new C1871oQ(this), this.d).a(C1448iG.class, new C1664lQ(this), this.d);
        }
        return JW.a(sw, C1733mQ.f4944a, this.d);
    }
}
