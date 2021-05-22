package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.gms.internal.ads.ht  reason: case insensitive filesystem */
public final class C1434ht {

    /* renamed from: a  reason: collision with root package name */
    private final Executor f4526a;

    /* renamed from: b  reason: collision with root package name */
    private final ScheduledExecutorService f4527b;

    /* renamed from: c  reason: collision with root package name */
    private final SW<C1365gt> f4528c;
    private volatile boolean d = true;

    public C1434ht(Executor executor, ScheduledExecutorService scheduledExecutorService, SW<C1365gt> sw) {
        this.f4526a = executor;
        this.f4527b = scheduledExecutorService;
        this.f4528c = sw;
    }

    /* access modifiers changed from: private */
    public final void a(List<? extends SW<? extends C0952at>> list, GW<C0952at> gw) {
        if (list == null || list.isEmpty()) {
            this.f4526a.execute(new RunnableC1640kt(gw));
            return;
        }
        SW a2 = JW.a((Object) null);
        Iterator<? extends SW<? extends C0952at>> it = list.iterator();
        while (it.hasNext()) {
            a2 = JW.a(JW.a(a2, Throwable.class, new C1571jt(gw), this.f4526a), new C1778mt(this, gw, (SW) it.next()), this.f4526a);
        }
        JW.a(a2, new C1847nt(this, gw), this.f4526a);
    }

    /* access modifiers changed from: private */
    public final void c() {
        C0875_l.e.execute(new RunnableC1709lt(this));
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ SW a(GW gw, SW sw, C0952at atVar) {
        if (atVar != null) {
            gw.a(atVar);
        }
        return JW.a(sw, C2639za.f6190b.a().longValue(), TimeUnit.MILLISECONDS, this.f4527b);
    }

    public final void a(GW<C0952at> gw) {
        JW.a(this.f4528c, new C1916ot(this, gw), this.f4526a);
    }

    public final boolean a() {
        return this.d;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void b() {
        this.d = false;
    }
}
