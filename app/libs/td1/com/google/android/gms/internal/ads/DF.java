package com.google.android.gms.internal.ads;

import java.util.concurrent.TimeoutException;

final /* synthetic */ class DF implements AbstractC2221tW {

    /* renamed from: a  reason: collision with root package name */
    static final AbstractC2221tW f1753a = new DF();

    private DF() {
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2221tW
    public final SW b(Object obj) {
        TimeoutException timeoutException = (TimeoutException) obj;
        return JW.a((Throwable) new C0896aF(YR.e, "Timed out waiting for ad response."));
    }
}
