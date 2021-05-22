package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import android.view.View;
import android.view.ViewGroup;
import b.c.b.a.c.b;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.android.gms.internal.ads.Hs  reason: case insensitive filesystem */
public final class C0388Hs extends AbstractC0951as {
    private final AbstractC0631Rb h;
    private final Runnable i;
    private final Executor j;

    public C0388Hs(C0882_s _sVar, AbstractC0631Rb rb, Runnable runnable, Executor executor) {
        super(_sVar);
        this.h = rb;
        this.i = runnable;
        this.j = executor;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0951as
    public final void a(ViewGroup viewGroup, C1015boa boa) {
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void a(Runnable runnable) {
        try {
            if (!this.h.I(b.a(runnable))) {
                runnable.run();
            }
        } catch (RemoteException unused) {
            runnable.run();
        }
    }

    @Override // com.google.android.gms.internal.ads.C0952at
    public final void b() {
        this.j.execute(new RunnableC0440Js(this, new RunnableC0466Ks(new AtomicReference(this.i))));
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0951as
    public final AbstractC2532xpa g() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0951as
    public final C1872oR h() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0951as
    public final View i() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0951as
    public final C1872oR j() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0951as
    public final int k() {
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0951as
    public final void l() {
    }
}
