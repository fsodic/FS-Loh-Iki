package com.google.android.gms.internal.ads;

import java.util.Map;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.gms.internal.ads.oE */
public final class C1859oE {

    /* renamed from: a */
    private final C2272uE f5104a;

    /* renamed from: b */
    private final Executor f5105b;

    /* renamed from: c */
    private final Map<String, String> f5106c;

    public C1859oE(C2272uE uEVar, Executor executor) {
        this.f5104a = uEVar;
        this.f5106c = uEVar.a();
        this.f5105b = executor;
    }

    public final C1790nE a() {
        C1790nE nEVar = new C1790nE(this);
        nEVar.c();
        return nEVar;
    }
}
