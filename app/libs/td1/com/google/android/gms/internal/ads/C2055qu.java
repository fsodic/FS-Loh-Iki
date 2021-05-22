package com.google.android.gms.internal.ads;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Bundle;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.qu  reason: case insensitive filesystem */
public final class C2055qu {

    /* renamed from: a  reason: collision with root package name */
    private final BT f5375a;

    /* renamed from: b  reason: collision with root package name */
    private final C0823Yl f5376b;

    /* renamed from: c  reason: collision with root package name */
    private final ApplicationInfo f5377c;
    private final String d;
    private final List<String> e;
    private final PackageInfo f;
    private final Lea<SW<String>> g;
    private final AbstractC1901ok h;
    private final String i;
    private final C1112dO<Bundle> j;

    public C2055qu(BT bt, C0823Yl yl, ApplicationInfo applicationInfo, String str, List<String> list, PackageInfo packageInfo, Lea<SW<String>> lea, AbstractC1901ok okVar, String str2, C1112dO<Bundle> dOVar) {
        this.f5375a = bt;
        this.f5376b = yl;
        this.f5377c = applicationInfo;
        this.d = str;
        this.e = list;
        this.f = packageInfo;
        this.g = lea;
        this.h = okVar;
        this.i = str2;
        this.j = dOVar;
    }

    public final SW<Bundle> a() {
        return this.f5375a.a(EnumC2563yT.SIGNALS).a(this.j.a(new Bundle())).a();
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ C0715Uh a(SW sw) {
        return new C0715Uh((Bundle) sw.get(), this.f5376b, this.f5377c, this.d, this.e, this.f, this.g.get().get(), this.h.c(), this.i, null, null);
    }

    public final SW<C0715Uh> b() {
        SW<Bundle> a2 = a();
        return this.f5375a.a(EnumC2563yT.REQUEST_PARCEL, a2, this.g.get()).a(new CallableC2261tu(this, a2)).a();
    }
}
