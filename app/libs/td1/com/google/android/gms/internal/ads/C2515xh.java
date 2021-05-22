package com.google.android.gms.internal.ads;

import java.lang.Thread;

/* access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.ads.xh  reason: case insensitive filesystem */
public final class C2515xh implements Thread.UncaughtExceptionHandler {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ Thread.UncaughtExceptionHandler f6004a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ C2170sh f6005b;

    C2515xh(C2170sh shVar, Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
        this.f6005b = shVar;
        this.f6004a = uncaughtExceptionHandler;
    }

    public final void uncaughtException(Thread thread, Throwable th) {
        try {
            this.f6005b.a(thread, th);
            Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.f6004a;
            if (uncaughtExceptionHandler != null) {
                uncaughtExceptionHandler.uncaughtException(thread, th);
            }
        } catch (Throwable th2) {
            Thread.UncaughtExceptionHandler uncaughtExceptionHandler2 = this.f6004a;
            if (uncaughtExceptionHandler2 != null) {
                uncaughtExceptionHandler2.uncaughtException(thread, th);
            }
            throw th2;
        }
    }
}
