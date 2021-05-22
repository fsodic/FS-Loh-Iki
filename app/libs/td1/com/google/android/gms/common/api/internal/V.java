package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.internal.ComponentCallbacks2C0138b;

/* access modifiers changed from: package-private */
public final class V implements ComponentCallbacks2C0138b.a {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ C0146f f1237a;

    V(C0146f fVar) {
        this.f1237a = fVar;
    }

    @Override // com.google.android.gms.common.api.internal.ComponentCallbacks2C0138b.a
    public final void a(boolean z) {
        this.f1237a.q.sendMessage(this.f1237a.q.obtainMessage(1, Boolean.valueOf(z)));
    }
}
