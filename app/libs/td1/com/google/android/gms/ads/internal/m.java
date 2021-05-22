package com.google.android.gms.ads.internal;

import com.google.android.gms.internal.ads.C1955pca;
import com.google.android.gms.internal.ads.Raa;
import java.util.concurrent.Callable;

/* access modifiers changed from: package-private */
public final class m implements Callable<C1955pca> {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ l f1091a;

    m(l lVar) {
        this.f1091a = lVar;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // java.util.concurrent.Callable
    public final /* synthetic */ C1955pca call() {
        return new C1955pca(Raa.a(this.f1091a.f1088a.f3587a, this.f1091a.d, false));
    }
}
