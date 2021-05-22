package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* renamed from: com.google.android.gms.internal.ads.vr  reason: case insensitive filesystem */
public final class C2396vr implements Sea<C1776mr> {

    /* renamed from: a  reason: collision with root package name */
    private final _ea<C1490ila> f5846a;

    /* renamed from: b  reason: collision with root package name */
    private final _ea<C0686Te> f5847b;

    /* renamed from: c  reason: collision with root package name */
    private final _ea<Executor> f5848c;

    private C2396vr(_ea<C1490ila> _ea, _ea<C0686Te> _ea2, _ea<Executor> _ea3) {
        this.f5846a = _ea;
        this.f5847b = _ea2;
        this.f5848c = _ea3;
    }

    public static C2396vr a(_ea<C1490ila> _ea, _ea<C0686Te> _ea2, _ea<Executor> _ea3) {
        return new C2396vr(_ea, _ea2, _ea3);
    }

    @Override // com.google.android.gms.internal.ads._ea
    public final /* synthetic */ Object get() {
        C1776mr mrVar = new C1776mr(this.f5846a.get().a(), this.f5847b.get(), this.f5848c.get());
        Xea.a(mrVar, "Cannot return null from a non-@Nullable @Provides method");
        return mrVar;
    }
}
