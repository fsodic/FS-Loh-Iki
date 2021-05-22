package com.google.android.gms.internal.ads;

import java.util.Map;

/* access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.ads.lr  reason: case insensitive filesystem */
public final class C1707lr implements AbstractC0268Dc<Object> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ C1776mr f4912a;

    C1707lr(C1776mr mrVar) {
        this.f4912a = mrVar;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0268Dc
    public final void a(Object obj, Map<String, String> map) {
        if (this.f4912a.a(map)) {
            this.f4912a.f5003c.execute(new RunnableC1914or(this));
        }
    }
}
