package com.google.android.gms.internal.ads;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Bundle;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.su  reason: case insensitive filesystem */
public final class C2192su implements Sea<C2055qu> {

    /* renamed from: a  reason: collision with root package name */
    private final _ea<BT> f5564a;

    /* renamed from: b  reason: collision with root package name */
    private final _ea<C0823Yl> f5565b;

    /* renamed from: c  reason: collision with root package name */
    private final _ea<ApplicationInfo> f5566c;
    private final _ea<String> d;
    private final _ea<List<String>> e;
    private final _ea<PackageInfo> f;
    private final _ea<SW<String>> g;
    private final _ea<AbstractC1901ok> h;
    private final _ea<String> i;
    private final _ea<C1112dO<Bundle>> j;

    private C2192su(_ea<BT> _ea, _ea<C0823Yl> _ea2, _ea<ApplicationInfo> _ea3, _ea<String> _ea4, _ea<List<String>> _ea5, _ea<PackageInfo> _ea6, _ea<SW<String>> _ea7, _ea<AbstractC1901ok> _ea8, _ea<String> _ea9, _ea<C1112dO<Bundle>> _ea10) {
        this.f5564a = _ea;
        this.f5565b = _ea2;
        this.f5566c = _ea3;
        this.d = _ea4;
        this.e = _ea5;
        this.f = _ea6;
        this.g = _ea7;
        this.h = _ea8;
        this.i = _ea9;
        this.j = _ea10;
    }

    public static C2192su a(_ea<BT> _ea, _ea<C0823Yl> _ea2, _ea<ApplicationInfo> _ea3, _ea<String> _ea4, _ea<List<String>> _ea5, _ea<PackageInfo> _ea6, _ea<SW<String>> _ea7, _ea<AbstractC1901ok> _ea8, _ea<String> _ea9, _ea<C1112dO<Bundle>> _ea10) {
        return new C2192su(_ea, _ea2, _ea3, _ea4, _ea5, _ea6, _ea7, _ea8, _ea9, _ea10);
    }

    @Override // com.google.android.gms.internal.ads._ea
    public final /* synthetic */ Object get() {
        return new C2055qu(this.f5564a.get(), this.f5565b.get(), this.f5566c.get(), this.d.get(), this.e.get(), this.f.get(), Oea.b(this.g), this.h.get(), this.i.get(), this.j.get());
    }
}
