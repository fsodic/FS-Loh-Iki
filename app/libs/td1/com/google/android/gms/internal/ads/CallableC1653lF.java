package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.gms.internal.ads.lF  reason: case insensitive filesystem */
final /* synthetic */ class CallableC1653lF implements Callable {

    /* renamed from: a  reason: collision with root package name */
    private final C1955pca f4831a;

    /* renamed from: b  reason: collision with root package name */
    private final Context f4832b;

    CallableC1653lF(C1955pca pca, Context context) {
        this.f4831a = pca;
        this.f4832b = context;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        C1955pca pca = this.f4831a;
        return pca.a().a(this.f4832b);
    }
}
