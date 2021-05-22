package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;
import org.json.JSONObject;

/* access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.ads.wI  reason: case insensitive filesystem */
public final /* synthetic */ class CallableC2414wI implements Callable {

    /* renamed from: a  reason: collision with root package name */
    private final C2138sI f5875a;

    /* renamed from: b  reason: collision with root package name */
    private final SW f5876b;

    /* renamed from: c  reason: collision with root package name */
    private final SW f5877c;
    private final BR d;
    private final C1941pR e;
    private final JSONObject f;

    CallableC2414wI(C2138sI sIVar, SW sw, SW sw2, BR br, C1941pR pRVar, JSONObject jSONObject) {
        this.f5875a = sIVar;
        this.f5876b = sw;
        this.f5877c = sw2;
        this.d = br;
        this.e = pRVar;
        this.f = jSONObject;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        return this.f5875a.a(this.f5876b, this.f5877c, this.d, this.e, this.f);
    }
}
