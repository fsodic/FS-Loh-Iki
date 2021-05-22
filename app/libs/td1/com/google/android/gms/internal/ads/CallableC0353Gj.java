package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Callable;

/* access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.ads.Gj  reason: case insensitive filesystem */
public final /* synthetic */ class CallableC0353Gj implements Callable {

    /* renamed from: a  reason: collision with root package name */
    private final C2243tj f2063a;

    /* renamed from: b  reason: collision with root package name */
    private final Context f2064b;

    CallableC0353Gj(C2243tj tjVar, Context context) {
        this.f2063a = tjVar;
        this.f2064b = context;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        return this.f2063a.g(this.f2064b);
    }
}
