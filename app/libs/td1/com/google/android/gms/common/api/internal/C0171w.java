package com.google.android.gms.common.api.internal;

/* renamed from: com.google.android.gms.common.api.internal.w  reason: case insensitive filesystem */
final class C0171w extends S {

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ C0170v f1305b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C0171w(C0170v vVar, P p) {
        super(p);
        this.f1305b = vVar;
    }

    @Override // com.google.android.gms.common.api.internal.S
    public final void a() {
        this.f1305b.onConnectionSuspended(1);
    }
}
