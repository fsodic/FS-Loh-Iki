package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;

/* access modifiers changed from: package-private */
public final /* synthetic */ class SG implements Callable {

    /* renamed from: a  reason: collision with root package name */
    private final RG f3065a;

    private SG(RG rg) {
        this.f3065a = rg;
    }

    static Callable a(RG rg) {
        return new SG(rg);
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        return this.f3065a.getWritableDatabase();
    }
}
