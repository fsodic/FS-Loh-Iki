package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;
import org.json.JSONObject;

/* access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.ads.vG  reason: case insensitive filesystem */
public final /* synthetic */ class CallableC2343vG implements Callable {

    /* renamed from: a  reason: collision with root package name */
    private final SW f5790a;

    /* renamed from: b  reason: collision with root package name */
    private final SW f5791b;

    CallableC2343vG(SW sw, SW sw2) {
        this.f5790a = sw;
        this.f5791b = sw2;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        return new KG((JSONObject) this.f5790a.get(), (C0871_h) this.f5791b.get());
    }
}
