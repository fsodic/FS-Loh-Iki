package com.google.android.gms.internal.ads;

import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.ol  reason: case insensitive filesystem */
public final class C1903ol extends AbstractC0959b<C1912opa> {
    private final C1423hm<C1912opa> p;
    private final Map<String, String> q;
    private final C0563Ol r;

    public C1903ol(String str, C1423hm<C1912opa> hmVar) {
        this(str, null, hmVar);
    }

    private C1903ol(String str, Map<String, String> map, C1423hm<C1912opa> hmVar) {
        super(0, str, new C1834nl(hmVar));
        this.q = null;
        this.p = hmVar;
        this.r = new C0563Ol();
        this.r.a(str, "GET", null, null);
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.AbstractC0959b
    public final C0191Ad<C1912opa> a(C1912opa opa) {
        return C0191Ad.a(opa, C2318um.a(opa));
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.AbstractC0959b
    public final /* synthetic */ void a(C1912opa opa) {
        C1912opa opa2 = opa;
        this.r.a(opa2.f5179c, opa2.f5177a);
        C0563Ol ol = this.r;
        byte[] bArr = opa2.f5178b;
        if (C0563Ol.a() && bArr != null) {
            ol.a(bArr);
        }
        this.p.b(opa2);
    }
}
