package com.google.android.gms.common.api.internal;

import android.os.Looper;
import android.os.Message;
import android.util.Log;
import b.c.b.a.d.b.h;

/* access modifiers changed from: package-private */
public final class T extends h {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ Q f1235a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    T(Q q, Looper looper) {
        super(looper);
        this.f1235a = q;
    }

    public final void handleMessage(Message message) {
        int i = message.what;
        if (i == 1) {
            ((S) message.obj).a(this.f1235a);
        } else if (i != 2) {
            StringBuilder sb = new StringBuilder(31);
            sb.append("Unknown message id: ");
            sb.append(i);
            Log.w("GACStateManager", sb.toString());
        } else {
            throw ((RuntimeException) message.obj);
        }
    }
}
