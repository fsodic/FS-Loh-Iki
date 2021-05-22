package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.gms.internal.ads.wE  reason: case insensitive filesystem */
public final class C2410wE implements Sea<C2272uE> {

    /* renamed from: a  reason: collision with root package name */
    private final _ea<Executor> f5870a;

    /* renamed from: b  reason: collision with root package name */
    private final _ea<C0849Zl> f5871b;

    /* renamed from: c  reason: collision with root package name */
    private final _ea<Context> f5872c;
    private final _ea<C0823Yl> d;

    public C2410wE(_ea<Executor> _ea, _ea<C0849Zl> _ea2, _ea<Context> _ea3, _ea<C0823Yl> _ea4) {
        this.f5870a = _ea;
        this.f5871b = _ea2;
        this.f5872c = _ea3;
        this.d = _ea4;
    }

    @Override // com.google.android.gms.internal.ads._ea
    public final /* synthetic */ Object get() {
        return new C2272uE(this.f5870a.get(), this.f5871b.get(), this.f5872c.get(), this.d.get());
    }
}
