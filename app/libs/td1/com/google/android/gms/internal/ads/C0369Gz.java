package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.common.util.d;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.gms.internal.ads.Gz  reason: case insensitive filesystem */
public final class C0369Gz implements Sea<C0335Fr> {

    /* renamed from: a  reason: collision with root package name */
    private final _ea<C1490ila> f2089a;

    /* renamed from: b  reason: collision with root package name */
    private final _ea<Executor> f2090b;

    /* renamed from: c  reason: collision with root package name */
    private final _ea<Context> f2091c;
    private final _ea<d> d;

    public C0369Gz(_ea<C1490ila> _ea, _ea<Executor> _ea2, _ea<Context> _ea3, _ea<d> _ea4) {
        this.f2089a = _ea;
        this.f2090b = _ea2;
        this.f2091c = _ea3;
        this.d = _ea4;
    }

    @Override // com.google.android.gms.internal.ads._ea
    public final /* synthetic */ Object get() {
        C0335Fr fr = new C0335Fr(this.f2090b.get(), new C1983pr(this.f2091c.get(), this.f2089a.get()), this.d.get());
        Xea.a(fr, "Cannot return null from a non-@Nullable @Provides method");
        return fr;
    }
}
