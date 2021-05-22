package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;

/* renamed from: com.google.android.gms.internal.ads.jO  reason: case insensitive filesystem */
final /* synthetic */ class CallableC1524jO implements Callable {

    /* renamed from: a  reason: collision with root package name */
    private final C1593kO f4666a;

    CallableC1524jO(C1593kO kOVar) {
        this.f4666a = kOVar;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        return this.f4666a.b();
    }
}
