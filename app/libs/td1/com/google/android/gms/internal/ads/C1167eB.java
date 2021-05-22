package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.d;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.gms.internal.ads.eB  reason: case insensitive filesystem */
public final class C1167eB implements Sea<C1030cB> {

    /* renamed from: a  reason: collision with root package name */
    private final _ea<C1489il> f4174a;

    /* renamed from: b  reason: collision with root package name */
    private final _ea<d> f4175b;

    /* renamed from: c  reason: collision with root package name */
    private final _ea<Executor> f4176c;

    public C1167eB(_ea<C1489il> _ea, _ea<d> _ea2, _ea<Executor> _ea3) {
        this.f4174a = _ea;
        this.f4175b = _ea2;
        this.f4176c = _ea3;
    }

    @Override // com.google.android.gms.internal.ads._ea
    public final /* synthetic */ Object get() {
        return new C1030cB(this.f4174a.get(), this.f4175b.get(), this.f4176c.get());
    }
}
