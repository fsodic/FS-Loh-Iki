package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

/* access modifiers changed from: package-private */
public final class Bga extends Handler {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ C2583yga f1633a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    Bga(C2583yga yga, Looper looper) {
        super(looper);
        this.f1633a = yga;
    }

    public final void handleMessage(Message message) {
        this.f1633a.a(message);
    }
}
