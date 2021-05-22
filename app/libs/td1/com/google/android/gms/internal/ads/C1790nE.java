package com.google.android.gms.internal.ads;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.google.android.gms.internal.ads.nE  reason: case insensitive filesystem */
public final class C1790nE {

    /* renamed from: a  reason: collision with root package name */
    private final Map<String, String> f5022a = new ConcurrentHashMap();

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ C1859oE f5023b;

    C1790nE(C1859oE oEVar) {
        this.f5023b = oEVar;
    }

    /* access modifiers changed from: private */
    public final C1790nE c() {
        this.f5022a.putAll(C1859oE.a(this.f5023b));
        return this;
    }

    public final C1790nE a(C1941pR pRVar) {
        this.f5022a.put("aai", pRVar.t);
        return this;
    }

    public final C1790nE a(C2078rR rRVar) {
        this.f5022a.put("gqi", rRVar.f5410b);
        return this;
    }

    public final C1790nE a(String str, String str2) {
        this.f5022a.put(str, str2);
        return this;
    }

    public final void a() {
        C1859oE.b(this.f5023b).execute(new RunnableC1997qE(this));
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void b() {
        C1859oE.c(this.f5023b).a(this.f5022a);
    }
}
