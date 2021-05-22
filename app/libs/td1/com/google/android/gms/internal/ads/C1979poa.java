package com.google.android.gms.internal.ads;

import android.content.Context;
import b.c.b.a.c.b;

/* access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.ads.poa  reason: case insensitive filesystem */
public final class C1979poa extends AbstractC2185soa<AbstractC1017bpa> {

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ Context f5274b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ C1565joa f5275c;

    C1979poa(C1565joa joa, Context context) {
        this.f5275c = joa;
        this.f5274b = context;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.AbstractC2185soa
    public final /* synthetic */ AbstractC1017bpa a() {
        C1565joa.b(this.f5274b, "mobile_ads_settings");
        return new Ypa();
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.google.android.gms.internal.ads.AbstractC2185soa
    public final /* synthetic */ AbstractC1017bpa a(Voa voa) {
        return voa.d(b.a(this.f5274b), 201604000);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.google.android.gms.internal.ads.AbstractC2185soa
    public final /* synthetic */ AbstractC1017bpa b() {
        return this.f5275c.f4726c.b(this.f5274b);
    }
}
