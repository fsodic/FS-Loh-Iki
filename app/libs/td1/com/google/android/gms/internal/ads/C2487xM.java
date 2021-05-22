package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.d;
import com.google.android.gms.internal.ads.AbstractC0905aO;

/* access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.ads.xM  reason: case insensitive filesystem */
public final class C2487xM<S extends AbstractC0905aO<?>> {

    /* renamed from: a  reason: collision with root package name */
    public final SW<S> f5973a;

    /* renamed from: b  reason: collision with root package name */
    private final long f5974b;

    /* renamed from: c  reason: collision with root package name */
    private final d f5975c;

    public C2487xM(SW<S> sw, long j, d dVar) {
        this.f5973a = sw;
        this.f5975c = dVar;
        this.f5974b = dVar.b() + j;
    }

    public final boolean a() {
        return this.f5974b < this.f5975c.b();
    }
}
