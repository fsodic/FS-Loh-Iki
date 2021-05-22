package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.graphics.SurfaceTexture;
import java.util.concurrent.TimeUnit;

@TargetApi(14)
/* renamed from: com.google.android.gms.internal.ads.Rm  reason: case insensitive filesystem */
public final class C0642Rm {

    /* renamed from: a  reason: collision with root package name */
    private final long f3039a = TimeUnit.MILLISECONDS.toNanos(((Long) C2392voa.e().a(C2474x.x)).longValue());

    /* renamed from: b  reason: collision with root package name */
    private long f3040b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f3041c = true;

    C0642Rm() {
    }

    public final void a() {
        this.f3041c = true;
    }

    public final void a(SurfaceTexture surfaceTexture, AbstractC0304Em em) {
        if (em != null) {
            long timestamp = surfaceTexture.getTimestamp();
            if (this.f3041c || Math.abs(timestamp - this.f3040b) >= this.f3039a) {
                this.f3041c = false;
                this.f3040b = timestamp;
                C2452wk.f5921a.post(new RunnableC0616Qm(this, em));
            }
        }
    }
}
