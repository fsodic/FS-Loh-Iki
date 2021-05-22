package com.google.android.gms.common.api.internal;

import android.os.Looper;
import android.os.Message;
import android.util.Log;
import b.c.b.a.d.b.h;

/* access modifiers changed from: package-private */
public final class N extends h {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ K f1228a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    N(K k, Looper looper) {
        super(looper);
        this.f1228a = k;
    }

    public final void handleMessage(Message message) {
        int i = message.what;
        if (i == 1) {
            this.f1228a.l();
        } else if (i != 2) {
            StringBuilder sb = new StringBuilder(31);
            sb.append("Unknown message id: ");
            sb.append(i);
            Log.w("GoogleApiClientImpl", sb.toString());
        } else {
            this.f1228a.j();
        }
    }
}
