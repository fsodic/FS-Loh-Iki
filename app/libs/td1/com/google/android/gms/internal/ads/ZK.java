package com.google.android.gms.internal.ads;

import android.net.Uri;
import b.c.b.a.c.a;
import java.util.concurrent.Callable;

final /* synthetic */ class ZK implements Callable {

    /* renamed from: a  reason: collision with root package name */
    private final XK f3627a;

    /* renamed from: b  reason: collision with root package name */
    private final Uri f3628b;

    /* renamed from: c  reason: collision with root package name */
    private final a f3629c;

    ZK(XK xk, Uri uri, a aVar) {
        this.f3627a = xk;
        this.f3628b = uri;
        this.f3629c = aVar;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        return this.f3627a.a(this.f3628b, this.f3629c);
    }
}
