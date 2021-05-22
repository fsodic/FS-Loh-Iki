package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.gms.internal.ads.iM  reason: case insensitive filesystem */
public final class C1454iM implements AbstractC1180eO<C1247fM> {

    /* renamed from: a  reason: collision with root package name */
    private final Context f4557a;

    /* renamed from: b  reason: collision with root package name */
    private final ScheduledExecutorService f4558b;

    /* renamed from: c  reason: collision with root package name */
    private final Executor f4559c;

    public C1454iM(Context context, ScheduledExecutorService scheduledExecutorService, Executor executor) {
        this.f4557a = context;
        this.f4558b = scheduledExecutorService;
        this.f4559c = executor;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1180eO
    public final SW<C1247fM> a() {
        if (!((Boolean) C2392voa.e().a(C2474x.ke)).booleanValue()) {
            return JW.a((Object) null);
        }
        C1423hm hmVar = new C1423hm();
        try {
            new C1385hM(hmVar).a(false);
        } catch (Throwable unused) {
            C0745Vl.b("ArCoreApk is not ready.");
            hmVar.b(false);
        }
        return JW.a(JW.a(JW.a(hmVar, 200, TimeUnit.MILLISECONDS, this.f4558b), new C1591kM(this), this.f4559c), Throwable.class, C1522jM.f4664a, this.f4559c);
    }
}
