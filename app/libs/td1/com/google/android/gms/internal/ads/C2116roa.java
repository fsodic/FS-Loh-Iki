package com.google.android.gms.internal.ads;

import android.content.Context;
import b.c.b.a.c.b;

/* access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.ads.roa  reason: case insensitive filesystem */
public final class C2116roa extends AbstractC2185soa<Eoa> {

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ Context f5456b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ String f5457c;
    private final /* synthetic */ AbstractC1891of d;
    private final /* synthetic */ C1565joa e;

    C2116roa(C1565joa joa, Context context, String str, AbstractC1891of ofVar) {
        this.e = joa;
        this.f5456b = context;
        this.f5457c = str;
        this.d = ofVar;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.AbstractC2185soa
    public final /* synthetic */ Eoa a() {
        C1565joa.b(this.f5456b, "native_ad");
        return new Spa();
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.google.android.gms.internal.ads.AbstractC2185soa
    public final /* synthetic */ Eoa a(Voa voa) {
        return voa.b(b.a(this.f5456b), this.f5457c, this.d, 201604000);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.google.android.gms.internal.ads.AbstractC2185soa
    public final /* synthetic */ Eoa b() {
        return this.e.f4725b.a(this.f5456b, this.f5457c, this.d);
    }
}
