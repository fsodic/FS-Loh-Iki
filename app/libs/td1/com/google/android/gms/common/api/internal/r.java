package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.g;

/* access modifiers changed from: package-private */
public final class r implements g.a {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ BasePendingResult f1291a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ C0166q f1292b;

    r(C0166q qVar, BasePendingResult basePendingResult) {
        this.f1292b = qVar;
        this.f1291a = basePendingResult;
    }

    @Override // com.google.android.gms.common.api.g.a
    public final void a(Status status) {
        this.f1292b.f1287a.remove(this.f1291a);
    }
}
