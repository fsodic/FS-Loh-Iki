package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.q;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.gms.internal.ads.nF  reason: case insensitive filesystem */
public final class C1791nF implements Sea<SW<String>> {

    /* renamed from: a  reason: collision with root package name */
    private final _ea<BT> f5024a;

    /* renamed from: b  reason: collision with root package name */
    private final _ea<Context> f5025b;

    private C1791nF(_ea<BT> _ea, _ea<Context> _ea2) {
        this.f5024a = _ea;
        this.f5025b = _ea2;
    }

    public static C1791nF a(_ea<BT> _ea, _ea<Context> _ea2) {
        return new C1791nF(_ea, _ea2);
    }

    @Override // com.google.android.gms.internal.ads._ea
    public final /* synthetic */ Object get() {
        C1598kT a2 = this.f5024a.get().a(EnumC2563yT.WEBVIEW_COOKIE).a(new CallableC1515jF(q.e().c(this.f5025b.get()))).a(1, TimeUnit.SECONDS).a(Exception.class, C1447iF.f4549a).a();
        Xea.a(a2, "Cannot return null from a non-@Nullable @Provides method");
        return a2;
    }
}
