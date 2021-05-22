package com.google.android.gms.internal.ads;

import android.content.Context;
import b.c.b.a.c.b;

/* access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.ads.ooa  reason: case insensitive filesystem */
public final class C1910ooa extends AbstractC2185soa<Loa> {

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ Context f5172b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ C1015boa f5173c;
    private final /* synthetic */ String d;
    private final /* synthetic */ C1565joa e;

    C1910ooa(C1565joa joa, Context context, C1015boa boa, String str) {
        this.e = joa;
        this.f5172b = context;
        this.f5173c = boa;
        this.d = str;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.google.android.gms.internal.ads.AbstractC2185soa
    public final /* synthetic */ Loa a() {
        C1565joa.b(this.f5172b, "search");
        return new Wpa();
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.google.android.gms.internal.ads.AbstractC2185soa
    public final /* synthetic */ Loa a(Voa voa) {
        return voa.a(b.a(this.f5172b), this.f5173c, this.d, 201604000);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.google.android.gms.internal.ads.AbstractC2185soa
    public final /* synthetic */ Loa b() {
        return this.e.f4724a.a(this.f5172b, this.f5173c, this.d, null, 3);
    }
}
