package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.AbstractC1808nW;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.ads.xW  reason: case insensitive filesystem */
public final class C2497xW<V> extends AbstractC1808nW<Object, V> {
    private AbstractC2635zW<?> p;

    C2497xW(AbstractC2634zV<? extends SW<?>> zVVar, boolean z, Executor executor, Callable<V> callable) {
        super(zVVar, z, false);
        this.p = new C2428wW(this, callable, executor);
        k();
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.AbstractC1808nW
    public final void a(int i, Object obj) {
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.AbstractC1808nW
    public final void a(AbstractC1808nW.a aVar) {
        super.a(aVar);
        if (aVar == AbstractC1808nW.a.OUTPUT_FUTURE_DONE) {
            this.p = null;
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.C1120dW
    public final void c() {
        AbstractC2635zW<?> zWVar = this.p;
        if (zWVar != null) {
            zWVar.a();
        }
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.AbstractC1808nW
    public final void l() {
        AbstractC2635zW<?> zWVar = this.p;
        if (zWVar != null) {
            zWVar.e();
        }
    }
}
