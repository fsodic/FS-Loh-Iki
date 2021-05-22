package com.google.android.gms.internal.ads;

import java.util.Map;

/* access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.ads.jl  reason: case insensitive filesystem */
public final class C1558jl extends C0800Xo {
    private final /* synthetic */ byte[] r;
    private final /* synthetic */ Map s;
    private final /* synthetic */ C0563Ol t;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C1558jl(C1489il ilVar, int i, String str, AbstractC2440we weVar, AbstractC0923ad adVar, byte[] bArr, Map map, C0563Ol ol) {
        super(i, str, weVar, adVar);
        this.r = bArr;
        this.s = map;
        this.t = ol;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0959b
    public final Map<String, String> a() {
        Map<String, String> map = this.s;
        return map == null ? super.a() : map;
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.C0800Xo
    /* renamed from: c */
    public final void a(String str) {
        this.t.a(str);
        super.c(str);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0959b
    public final byte[] h() {
        byte[] bArr = this.r;
        return bArr == null ? super.h() : bArr;
    }
}
