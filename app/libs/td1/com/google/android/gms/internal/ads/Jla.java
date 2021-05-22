package com.google.android.gms.internal.ads;

import android.webkit.ValueCallback;

/* access modifiers changed from: package-private */
public final class Jla implements ValueCallback<String> {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ Gla f2350a;

    Jla(Gla gla) {
        this.f2350a = gla;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // android.webkit.ValueCallback
    public final /* synthetic */ void onReceiveValue(String str) {
        Gla gla = this.f2350a;
        gla.e.a(gla.f2072b, gla.f2073c, str, gla.d);
    }
}
