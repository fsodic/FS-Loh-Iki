package com.google.android.gms.common.api.internal;

import b.c.b.a.b.b;
import com.google.android.gms.common.api.internal.C0146f;

final class Y implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ b f1240a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ C0146f.a f1241b;

    Y(C0146f.a aVar, b bVar) {
        this.f1241b = aVar;
        this.f1240a = bVar;
    }

    public final void run() {
        this.f1241b.onConnectionFailed(this.f1240a);
    }
}
