package com.google.android.gms.internal.ads;

import android.content.Context;
import b.c.b.a.c.b;

/* access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.ads.toa  reason: case insensitive filesystem */
public final class C2254toa extends AbstractC2185soa<AbstractC2103ri> {

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ Context f5660b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ AbstractC1891of f5661c;
    private final /* synthetic */ C1565joa d;

    C2254toa(C1565joa joa, Context context, AbstractC1891of ofVar) {
        this.d = joa;
        this.f5660b = context;
        this.f5661c = ofVar;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.AbstractC2185soa
    public final /* synthetic */ AbstractC2103ri a() {
        C1565joa.b(this.f5660b, "rewarded_video");
        return new aqa();
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.google.android.gms.internal.ads.AbstractC2185soa
    public final /* synthetic */ AbstractC2103ri a(Voa voa) {
        return voa.c(b.a(this.f5660b), this.f5661c, 201604000);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.google.android.gms.internal.ads.AbstractC2185soa
    public final /* synthetic */ AbstractC2103ri b() {
        return this.d.e.a(this.f5660b, this.f5661c);
    }
}
