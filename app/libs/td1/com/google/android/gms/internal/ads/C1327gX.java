package com.google.android.gms.internal.ads;

import java.util.concurrent.TimeoutException;

/* renamed from: com.google.android.gms.internal.ads.gX  reason: case insensitive filesystem */
final class C1327gX extends TimeoutException {
    private C1327gX(String str) {
        super(str);
    }

    public final synchronized Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }
}
