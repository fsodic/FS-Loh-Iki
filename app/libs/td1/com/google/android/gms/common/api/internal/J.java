package com.google.android.gms.common.api.internal;

import android.os.Bundle;
import b.c.b.a.b.b;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.i;
import java.util.Collections;

public final class J implements P {

    /* renamed from: a  reason: collision with root package name */
    private final Q f1219a;

    public J(Q q) {
        this.f1219a = q;
    }

    @Override // com.google.android.gms.common.api.internal.P
    public final <A extends a.b, T extends AbstractC0140c<? extends i, A>> T a(T t) {
        throw new IllegalStateException("GoogleApiClient is not connected yet.");
    }

    @Override // com.google.android.gms.common.api.internal.P
    public final void a(b bVar, a<?> aVar, boolean z) {
    }

    @Override // com.google.android.gms.common.api.internal.P
    public final boolean a() {
        return true;
    }

    @Override // com.google.android.gms.common.api.internal.P
    public final void b() {
        for (a.f fVar : this.f1219a.f.values()) {
            fVar.a();
        }
        this.f1219a.n.q = Collections.emptySet();
    }

    @Override // com.google.android.gms.common.api.internal.P
    public final void connect() {
        this.f1219a.c();
    }

    @Override // com.google.android.gms.common.api.internal.P
    public final void onConnected(Bundle bundle) {
    }

    @Override // com.google.android.gms.common.api.internal.P
    public final void onConnectionSuspended(int i) {
    }
}
