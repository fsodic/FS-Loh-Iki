package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;
import org.json.JSONObject;

/* access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.ads.uG  reason: case insensitive filesystem */
public final /* synthetic */ class CallableC2274uG implements Callable {

    /* renamed from: a  reason: collision with root package name */
    private final SW f5696a;

    /* renamed from: b  reason: collision with root package name */
    private final SW f5697b;

    /* renamed from: c  reason: collision with root package name */
    private final SW f5698c;

    CallableC2274uG(SW sw, SW sw2, SW sw3) {
        this.f5696a = sw;
        this.f5697b = sw2;
        this.f5698c = sw3;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        return new GG((NG) this.f5696a.get(), (JSONObject) this.f5697b.get(), (C0871_h) this.f5698c.get());
    }
}
