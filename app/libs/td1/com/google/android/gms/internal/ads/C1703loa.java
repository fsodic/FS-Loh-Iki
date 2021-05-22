package com.google.android.gms.internal.ads;

import android.content.Context;
import b.c.b.a.c.b;

/* access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.ads.loa  reason: case insensitive filesystem */
public final class C1703loa extends AbstractC2185soa<Loa> {

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ Context f4907b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ C1015boa f4908c;
    private final /* synthetic */ String d;
    private final /* synthetic */ AbstractC1891of e;
    private final /* synthetic */ C1565joa f;

    C1703loa(C1565joa joa, Context context, C1015boa boa, String str, AbstractC1891of ofVar) {
        this.f = joa;
        this.f4907b = context;
        this.f4908c = boa;
        this.d = str;
        this.e = ofVar;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.google.android.gms.internal.ads.AbstractC2185soa
    public final /* synthetic */ Loa a() {
        C1565joa.b(this.f4907b, "banner");
        return new Wpa();
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.google.android.gms.internal.ads.AbstractC2185soa
    public final /* synthetic */ Loa a(Voa voa) {
        return voa.c(b.a(this.f4907b), this.f4908c, this.d, this.e, 201604000);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.google.android.gms.internal.ads.AbstractC2185soa
    public final /* synthetic */ Loa b() {
        return this.f.f4724a.a(this.f4907b, this.f4908c, this.d, this.e, 1);
    }
}
