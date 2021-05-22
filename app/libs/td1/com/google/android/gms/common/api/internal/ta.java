package com.google.android.gms.common.api.internal;

/* access modifiers changed from: package-private */
public final class ta implements va {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ sa f1298a;

    ta(sa saVar) {
        this.f1298a = saVar;
    }

    @Override // com.google.android.gms.common.api.internal.va
    public final void a(BasePendingResult<?> basePendingResult) {
        this.f1298a.f1295c.remove(basePendingResult);
    }
}
