package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.q;

/* renamed from: com.google.android.gms.internal.ads.aH  reason: case insensitive filesystem */
public final class C0898aH implements IT {

    /* renamed from: a  reason: collision with root package name */
    private final _G f3791a;

    C0898aH(_G _g) {
        this.f3791a = _g;
    }

    @Override // com.google.android.gms.internal.ads.IT
    public final void a(EnumC2563yT yTVar, String str) {
    }

    @Override // com.google.android.gms.internal.ads.IT
    public final void a(EnumC2563yT yTVar, String str, Throwable th) {
        if (((Boolean) C2392voa.e().a(C2474x.fe)).booleanValue() && EnumC2563yT.RENDERER == yTVar && this.f3791a.c() != 0) {
            this.f3791a.b(q.j().b() - this.f3791a.c());
        }
    }

    @Override // com.google.android.gms.internal.ads.IT
    public final void b(EnumC2563yT yTVar, String str) {
        if (((Boolean) C2392voa.e().a(C2474x.fe)).booleanValue() && EnumC2563yT.RENDERER == yTVar) {
            this.f3791a.c(q.j().b());
        }
    }

    @Override // com.google.android.gms.internal.ads.IT
    public final void c(EnumC2563yT yTVar, String str) {
        if (((Boolean) C2392voa.e().a(C2474x.fe)).booleanValue() && EnumC2563yT.RENDERER == yTVar && this.f3791a.c() != 0) {
            this.f3791a.b(q.j().b() - this.f3791a.c());
        }
    }
}
