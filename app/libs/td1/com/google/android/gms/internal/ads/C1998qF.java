package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;

/* renamed from: com.google.android.gms.internal.ads.qF  reason: case insensitive filesystem */
public final class C1998qF implements Sea<PackageInfo> {

    /* renamed from: a  reason: collision with root package name */
    private final _ea<Context> f5299a;

    /* renamed from: b  reason: collision with root package name */
    private final _ea<ApplicationInfo> f5300b;

    private C1998qF(_ea<Context> _ea, _ea<ApplicationInfo> _ea2) {
        this.f5299a = _ea;
        this.f5300b = _ea2;
    }

    public static C1998qF a(_ea<Context> _ea, _ea<ApplicationInfo> _ea2) {
        return new C1998qF(_ea, _ea2);
    }

    @Override // com.google.android.gms.internal.ads._ea
    public final /* synthetic */ Object get() {
        return C1309gF.a(this.f5299a.get(), this.f5300b.get());
    }
}
