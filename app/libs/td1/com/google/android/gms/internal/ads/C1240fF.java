package com.google.android.gms.internal.ads;

import java.util.concurrent.ExecutionException;

/* access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.ads.fF  reason: case insensitive filesystem */
public final /* synthetic */ class C1240fF implements AbstractC2221tW {

    /* renamed from: a  reason: collision with root package name */
    static final AbstractC2221tW f4277a = new C1240fF();

    private C1240fF() {
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2221tW
    public final SW b(Object obj) {
        return JW.a(((ExecutionException) obj).getCause());
    }
}
