package com.google.android.gms.internal.ads;

import java.util.List;
import java.util.concurrent.Callable;

/* access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.ads.fO  reason: case insensitive filesystem */
public final /* synthetic */ class CallableC1249fO implements Callable {

    /* renamed from: a  reason: collision with root package name */
    private final List f4288a;

    /* renamed from: b  reason: collision with root package name */
    private final Object f4289b;

    CallableC1249fO(List list, Object obj) {
        this.f4288a = list;
        this.f4289b = obj;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        List<SW> list = this.f4288a;
        Object obj = this.f4289b;
        for (SW sw : list) {
            AbstractC0905aO aOVar = (AbstractC0905aO) sw.get();
            if (aOVar != null) {
                aOVar.a(obj);
            }
        }
        return obj;
    }
}
