package com.google.android.gms.internal.ads;

import android.os.Bundle;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.gms.internal.ads.aM  reason: case insensitive filesystem */
public final class C0903aM implements AbstractC1180eO<AbstractC0905aO<Bundle>> {

    /* renamed from: a  reason: collision with root package name */
    private final Executor f3798a;

    /* renamed from: b  reason: collision with root package name */
    private final C0847Zj f3799b;

    C0903aM(Executor executor, C0847Zj zj) {
        this.f3798a = executor;
        this.f3799b = zj;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1180eO
    public final SW<AbstractC0905aO<Bundle>> a() {
        return ((Boolean) C2392voa.e().a(C2474x.Db)).booleanValue() ? JW.a((Object) null) : JW.a(this.f3799b.j(), YL.f3552a, this.f3798a);
    }
}
