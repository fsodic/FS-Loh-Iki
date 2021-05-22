package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.ads.Xj  reason: case insensitive filesystem */
public final class C0795Xj {

    /* renamed from: a  reason: collision with root package name */
    private long f3516a = -1;

    /* renamed from: b  reason: collision with root package name */
    private long f3517b = -1;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ C0821Yj f3518c;

    public C0795Xj(C0821Yj yj) {
        this.f3518c = yj;
    }

    public final Bundle a() {
        Bundle bundle = new Bundle();
        bundle.putLong("topen", this.f3516a);
        bundle.putLong("tclose", this.f3517b);
        return bundle;
    }

    public final long b() {
        return this.f3517b;
    }

    public final void c() {
        this.f3517b = this.f3518c.f3581a.b();
    }

    public final void d() {
        this.f3516a = this.f3518c.f3581a.b();
    }
}
