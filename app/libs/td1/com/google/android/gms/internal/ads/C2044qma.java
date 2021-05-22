package com.google.android.gms.internal.ads;

import android.os.Handler;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.gms.internal.ads.qma  reason: case insensitive filesystem */
public final class C2044qma implements AbstractC0763Wd {

    /* renamed from: a  reason: collision with root package name */
    private final Executor f5356a;

    public C2044qma(Handler handler) {
        this.f5356a = new Wla(this, handler);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0763Wd
    public final void a(AbstractC0959b<?> bVar, C0191Ad<?> ad) {
        a(bVar, ad, null);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0763Wd
    public final void a(AbstractC0959b<?> bVar, C0191Ad<?> ad, Runnable runnable) {
        bVar.l();
        bVar.a("post-response");
        this.f5356a.execute(new Una(bVar, ad, runnable));
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0763Wd
    public final void a(AbstractC0959b<?> bVar, C0713Uf uf) {
        bVar.a("post-error");
        this.f5356a.execute(new Una(bVar, C0191Ad.a(uf), null));
    }
}
