package com.google.android.gms.internal.ads;

import android.os.Looper;
import android.os.Message;
import com.google.android.gms.ads.internal.q;

/* renamed from: com.google.android.gms.internal.ads.pk  reason: case insensitive filesystem */
public final class HandlerC1970pk extends _U {
    public HandlerC1970pk(Looper looper) {
        super(looper);
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads._U
    public final void a(Message message) {
        try {
            super.a(message);
        } catch (Throwable th) {
            q.c();
            C2452wk.a(q.g().a(), th);
            throw th;
        }
    }

    public final void handleMessage(Message message) {
        try {
            super.handleMessage(message);
        } catch (Exception e) {
            q.g().a(e, "AdMobHandler.handleMessage");
        }
    }
}
