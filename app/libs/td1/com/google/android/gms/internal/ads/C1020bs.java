package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.d;
import java.util.concurrent.ScheduledExecutorService;

/* renamed from: com.google.android.gms.internal.ads.bs  reason: case insensitive filesystem */
public final class C1020bs implements Sea<C0729Uv> {

    /* renamed from: a  reason: collision with root package name */
    private final _ea<ScheduledExecutorService> f3948a;

    /* renamed from: b  reason: collision with root package name */
    private final _ea<d> f3949b;

    public C1020bs(_ea<ScheduledExecutorService> _ea, _ea<d> _ea2) {
        this.f3948a = _ea;
        this.f3949b = _ea2;
    }

    public static C0729Uv a(ScheduledExecutorService scheduledExecutorService, d dVar) {
        C0729Uv uv = new C0729Uv(scheduledExecutorService, dVar);
        Xea.a(uv, "Cannot return null from a non-@Nullable @Provides method");
        return uv;
    }

    @Override // com.google.android.gms.internal.ads._ea
    public final /* synthetic */ Object get() {
        return a(this.f3948a.get(), this.f3949b.get());
    }
}
