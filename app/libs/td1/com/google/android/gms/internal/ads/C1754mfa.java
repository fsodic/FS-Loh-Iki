package com.google.android.gms.internal.ads;

import android.view.View;
import java.util.HashMap;
import java.util.Map;

/* access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.ads.mfa  reason: case insensitive filesystem */
public final class C1754mfa implements UU {

    /* renamed from: a  reason: collision with root package name */
    private final VT f4971a;

    /* renamed from: b  reason: collision with root package name */
    private final C1324gU f4972b;

    /* renamed from: c  reason: collision with root package name */
    private final View$OnAttachStateChangeListenerC2650zfa f4973c;
    private final C1685lfa d;

    C1754mfa(VT vt, C1324gU gUVar, View$OnAttachStateChangeListenerC2650zfa zfa, C1685lfa lfa) {
        this.f4971a = vt;
        this.f4972b = gUVar;
        this.f4973c = zfa;
        this.d = lfa;
    }

    private final Map<String, Object> d() {
        HashMap hashMap = new HashMap();
        C1511jB d2 = this.f4972b.d();
        hashMap.put("v", this.f4971a.a());
        hashMap.put("gms", Boolean.valueOf(this.f4971a.d()));
        hashMap.put("int", d2.n());
        hashMap.put("up", Boolean.valueOf(this.d.a()));
        hashMap.put("t", new Throwable());
        return hashMap;
    }

    @Override // com.google.android.gms.internal.ads.UU
    public final Map<String, Object> a() {
        Map<String, Object> d2 = d();
        C1511jB a2 = this.f4972b.a();
        d2.put("gai", Boolean.valueOf(this.f4971a.b()));
        d2.put("did", a2.p());
        d2.put("dst", Integer.valueOf(a2.q().a()));
        d2.put("doo", Boolean.valueOf(a2.r()));
        return d2;
    }

    /* access modifiers changed from: package-private */
    public final void a(View view) {
        this.f4973c.a(view);
    }

    @Override // com.google.android.gms.internal.ads.UU
    public final Map<String, Object> b() {
        return d();
    }

    @Override // com.google.android.gms.internal.ads.UU
    public final Map<String, Object> c() {
        Map<String, Object> d2 = d();
        d2.put("lts", Long.valueOf(this.f4973c.a()));
        return d2;
    }
}
