package com.google.android.gms.internal.ads;

import android.app.Activity;
import b.c.b.a.c.b;

/* access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.ads.moa  reason: case insensitive filesystem */
public final class C1772moa extends AbstractC2185soa<AbstractC0792Xg> {

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ Activity f4994b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ C1565joa f4995c;

    C1772moa(C1565joa joa, Activity activity) {
        this.f4995c = joa;
        this.f4994b = activity;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.AbstractC2185soa
    public final /* synthetic */ AbstractC0792Xg a() {
        C1565joa.b(this.f4994b, "ad_overlay");
        return null;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.google.android.gms.internal.ads.AbstractC2185soa
    public final /* synthetic */ AbstractC0792Xg a(Voa voa) {
        return voa.w(b.a(this.f4994b));
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.google.android.gms.internal.ads.AbstractC2185soa
    public final /* synthetic */ AbstractC0792Xg b() {
        return this.f4995c.g.a(this.f4994b);
    }
}
