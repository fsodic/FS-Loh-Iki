package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

public class _U extends Handler {
    public _U(Looper looper) {
        super(looper);
    }

    /* access modifiers changed from: protected */
    public void a(Message message) {
        super.dispatchMessage(message);
    }

    public final void dispatchMessage(Message message) {
        a(message);
    }
}
