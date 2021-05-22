package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Callable;

/* access modifiers changed from: package-private */
public final /* synthetic */ class TT implements Callable {

    /* renamed from: a  reason: collision with root package name */
    private final Context f3180a;

    TT(Context context) {
        this.f3180a = context;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        return UT.a(this.f3180a);
    }
}
