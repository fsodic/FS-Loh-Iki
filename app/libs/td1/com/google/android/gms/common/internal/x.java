package com.google.android.gms.common.internal;

import android.os.Bundle;
import com.google.android.gms.common.api.f;
import com.google.android.gms.common.internal.AbstractC0176b;

/* access modifiers changed from: package-private */
public final class x implements AbstractC0176b.a {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ f.b f1393a;

    x(f.b bVar) {
        this.f1393a = bVar;
    }

    @Override // com.google.android.gms.common.internal.AbstractC0176b.a
    public final void onConnected(Bundle bundle) {
        this.f1393a.onConnected(bundle);
    }

    @Override // com.google.android.gms.common.internal.AbstractC0176b.a
    public final void onConnectionSuspended(int i) {
        this.f1393a.onConnectionSuspended(i);
    }
}
