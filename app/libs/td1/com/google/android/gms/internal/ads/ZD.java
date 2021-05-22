package com.google.android.gms.internal.ads;

import java.util.Map;

public final class ZD implements IT {

    /* renamed from: a  reason: collision with root package name */
    private Map<EnumC2563yT, C0895aE> f3616a;

    /* renamed from: b  reason: collision with root package name */
    private Dma f3617b;

    ZD(Dma dma, Map<EnumC2563yT, C0895aE> map) {
        this.f3616a = map;
        this.f3617b = dma;
    }

    @Override // com.google.android.gms.internal.ads.IT
    public final void a(EnumC2563yT yTVar, String str) {
    }

    @Override // com.google.android.gms.internal.ads.IT
    public final void a(EnumC2563yT yTVar, String str, Throwable th) {
        if (this.f3616a.containsKey(yTVar)) {
            this.f3617b.a(this.f3616a.get(yTVar).f3788c);
        }
    }

    @Override // com.google.android.gms.internal.ads.IT
    public final void b(EnumC2563yT yTVar, String str) {
        if (this.f3616a.containsKey(yTVar)) {
            this.f3617b.a(this.f3616a.get(yTVar).f3786a);
        }
    }

    @Override // com.google.android.gms.internal.ads.IT
    public final void c(EnumC2563yT yTVar, String str) {
        if (this.f3616a.containsKey(yTVar)) {
            this.f3617b.a(this.f3616a.get(yTVar).f3787b);
        }
    }
}
