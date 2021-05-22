package com.google.android.gms.common.api.internal;

import android.os.Bundle;
import b.c.b.a.b.b;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.f;
import com.google.android.gms.common.internal.r;

public final class Ea implements f.b, f.c {

    /* renamed from: a  reason: collision with root package name */
    public final a<?> f1207a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f1208b;

    /* renamed from: c  reason: collision with root package name */
    private Fa f1209c;

    public Ea(a<?> aVar, boolean z) {
        this.f1207a = aVar;
        this.f1208b = z;
    }

    private final void a() {
        r.a(this.f1209c, "Callbacks must be attached to a ClientConnectionHelper instance before connecting the client.");
    }

    public final void a(Fa fa) {
        this.f1209c = fa;
    }

    @Override // com.google.android.gms.common.api.f.b
    public final void onConnected(Bundle bundle) {
        a();
        this.f1209c.onConnected(bundle);
    }

    @Override // com.google.android.gms.common.api.f.c
    public final void onConnectionFailed(b bVar) {
        a();
        this.f1209c.a(bVar, this.f1207a, this.f1208b);
    }

    @Override // com.google.android.gms.common.api.f.b
    public final void onConnectionSuspended(int i) {
        a();
        this.f1209c.onConnectionSuspended(i);
    }
}
