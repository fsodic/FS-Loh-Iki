package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.d;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.gms.internal.ads.wr  reason: case insensitive filesystem */
public final class C2465wr implements Sea<C2120rr> {

    /* renamed from: a  reason: collision with root package name */
    private final _ea<C0686Te> f5932a;

    /* renamed from: b  reason: collision with root package name */
    private final _ea<C1983pr> f5933b;

    /* renamed from: c  reason: collision with root package name */
    private final _ea<Executor> f5934c;
    private final _ea<C1776mr> d;
    private final _ea<d> e;

    private C2465wr(_ea<C0686Te> _ea, _ea<C1983pr> _ea2, _ea<Executor> _ea3, _ea<C1776mr> _ea4, _ea<d> _ea5) {
        this.f5932a = _ea;
        this.f5933b = _ea2;
        this.f5934c = _ea3;
        this.d = _ea4;
        this.e = _ea5;
    }

    public static C2465wr a(_ea<C0686Te> _ea, _ea<C1983pr> _ea2, _ea<Executor> _ea3, _ea<C1776mr> _ea4, _ea<d> _ea5) {
        return new C2465wr(_ea, _ea2, _ea3, _ea4, _ea5);
    }

    @Override // com.google.android.gms.internal.ads._ea
    public final /* synthetic */ Object get() {
        return new C2120rr(this.f5932a.get(), this.f5933b.get(), this.f5934c.get(), this.d.get(), this.e.get());
    }
}
