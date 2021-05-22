package com.google.android.gms.internal.ads;

import java.util.Map;

/* access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.ads.nr  reason: case insensitive filesystem */
public final class C1845nr implements AbstractC0268Dc<Object> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ C1776mr f5084a;

    C1845nr(C1776mr mrVar) {
        this.f5084a = mrVar;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0268Dc
    public final void a(Object obj, Map<String, String> map) {
        if (this.f5084a.a(map)) {
            this.f5084a.f5003c.execute(new RunnableC2052qr(this));
        }
    }
}
