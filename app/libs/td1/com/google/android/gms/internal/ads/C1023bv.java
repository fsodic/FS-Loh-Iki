package com.google.android.gms.internal.ads;

import java.util.Set;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.gms.internal.ads.bv  reason: case insensitive filesystem */
public final class C1023bv implements Sea<C0702Tu> {

    /* renamed from: a  reason: collision with root package name */
    private final _ea<C0806Xu> f3952a;

    /* renamed from: b  reason: collision with root package name */
    private final _ea<Set<C0523Mx<AbstractC0624Qu>>> f3953b;

    /* renamed from: c  reason: collision with root package name */
    private final _ea<Executor> f3954c;

    private C1023bv(_ea<C0806Xu> _ea, _ea<Set<C0523Mx<AbstractC0624Qu>>> _ea2, _ea<Executor> _ea3) {
        this.f3952a = _ea;
        this.f3953b = _ea2;
        this.f3954c = _ea3;
    }

    public static C1023bv a(_ea<C0806Xu> _ea, _ea<Set<C0523Mx<AbstractC0624Qu>>> _ea2, _ea<Executor> _ea3) {
        return new C1023bv(_ea, _ea2, _ea3);
    }

    @Override // com.google.android.gms.internal.ads._ea
    public final /* synthetic */ Object get() {
        return new C0702Tu(this.f3952a.get(), this.f3953b.get(), this.f3954c.get());
    }
}
