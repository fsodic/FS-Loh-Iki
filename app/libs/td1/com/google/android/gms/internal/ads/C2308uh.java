package com.google.android.gms.internal.ads;

import java.lang.Thread;

/* access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.ads.uh  reason: case insensitive filesystem */
public final class C2308uh implements Thread.UncaughtExceptionHandler {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ Thread.UncaughtExceptionHandler f5745a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ C2170sh f5746b;

    C2308uh(C2170sh shVar, Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
        this.f5746b = shVar;
        this.f5745a = uncaughtExceptionHandler;
    }

    public final void uncaughtException(Thread thread, Throwable th) {
        try {
            this.f5746b.a(thread, th);
            Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.f5745a;
            if (uncaughtExceptionHandler != null) {
                uncaughtExceptionHandler.uncaughtException(thread, th);
            }
        } catch (Throwable th2) {
            Thread.UncaughtExceptionHandler uncaughtExceptionHandler2 = this.f5745a;
            if (uncaughtExceptionHandler2 != null) {
                uncaughtExceptionHandler2.uncaughtException(thread, th);
            }
            throw th2;
        }
    }
}
