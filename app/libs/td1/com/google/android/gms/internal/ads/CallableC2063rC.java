package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.a;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.gms.internal.ads.rC */
public final class CallableC2063rC implements Callable<C1306gC> {

    /* renamed from: a */
    private final a f5390a;

    /* renamed from: b */
    private final C2115ro f5391b;

    /* renamed from: c */
    private final Context f5392c;
    private final Executor d;
    private final C1955pca e;
    private final C0823Yl f;

    public CallableC2063rC(Context context, Executor executor, C1955pca pca, C0823Yl yl, a aVar, C2115ro roVar) {
        this.f5392c = context;
        this.d = executor;
        this.e = pca;
        this.f = yl;
        this.f5390a = aVar;
        this.f5391b = roVar;
    }

    @Override // java.util.concurrent.Callable
    public final /* synthetic */ C1306gC call() {
        C1306gC gCVar = new C1306gC(this);
        gCVar.b();
        return gCVar;
    }
}
