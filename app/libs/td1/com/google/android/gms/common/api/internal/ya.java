package com.google.android.gms.common.api.internal;

import b.c.b.a.b.d;
import b.c.b.a.h.f;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.C0146f;
import com.google.android.gms.common.api.internal.C0154j;

public final class ya extends wa<Boolean> {

    /* renamed from: c  reason: collision with root package name */
    private final C0154j.a<?> f1312c;

    public ya(C0154j.a<?> aVar, f<Boolean> fVar) {
        super(4, fVar);
        this.f1312c = aVar;
    }

    @Override // com.google.android.gms.common.api.internal.wa, com.google.android.gms.common.api.internal.M
    public final /* bridge */ /* synthetic */ void a(Status status) {
        super.a(status);
    }

    @Override // com.google.android.gms.common.api.internal.M
    public final /* bridge */ /* synthetic */ void a(C0166q qVar, boolean z) {
    }

    @Override // com.google.android.gms.common.api.internal.wa, com.google.android.gms.common.api.internal.M
    public final /* bridge */ /* synthetic */ void a(RuntimeException runtimeException) {
        super.a(runtimeException);
    }

    @Override // com.google.android.gms.common.api.internal.AbstractC0155ja
    public final d[] b(C0146f.a<?> aVar) {
        C0153ia iaVar = aVar.i().get(this.f1312c);
        if (iaVar == null) {
            return null;
        }
        return iaVar.f1271a.b();
    }

    @Override // com.google.android.gms.common.api.internal.AbstractC0155ja
    public final boolean c(C0146f.a<?> aVar) {
        C0153ia iaVar = aVar.i().get(this.f1312c);
        return iaVar != null && iaVar.f1271a.c();
    }

    @Override // com.google.android.gms.common.api.internal.wa
    public final void d(C0146f.a<?> aVar) {
        C0153ia remove = aVar.i().remove(this.f1312c);
        if (remove != null) {
            remove.f1272b.a(aVar.f(), this.f1306b);
            remove.f1271a.a();
            return;
        }
        this.f1306b.b((T) false);
    }
}
