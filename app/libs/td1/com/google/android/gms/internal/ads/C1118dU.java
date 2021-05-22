package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.DeadObjectException;
import android.os.HandlerThread;
import b.c.b.a.b.b;
import com.google.android.gms.common.internal.AbstractC0176b;
import com.google.android.gms.internal.ads.C1511jB;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;

/* access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.ads.dU  reason: case insensitive filesystem */
public final class C1118dU implements AbstractC0176b.a, AbstractC0176b.AbstractC0028b {

    /* renamed from: a  reason: collision with root package name */
    private CU f4081a;

    /* renamed from: b  reason: collision with root package name */
    private final String f4082b;

    /* renamed from: c  reason: collision with root package name */
    private final String f4083c;
    private final LinkedBlockingQueue<C1511jB> d;
    private final HandlerThread e = new HandlerThread("GassClient");

    public C1118dU(Context context, String str, String str2) {
        this.f4082b = str;
        this.f4083c = str2;
        this.e.start();
        this.f4081a = new CU(context, this.e.getLooper(), this, this, 9200000);
        this.d = new LinkedBlockingQueue<>();
        this.f4081a.l();
    }

    private final void a() {
        CU cu = this.f4081a;
        if (cu == null) {
            return;
        }
        if (cu.isConnected() || this.f4081a.c()) {
            this.f4081a.a();
        }
    }

    private final FU b() {
        try {
            return this.f4081a.z();
        } catch (DeadObjectException | IllegalStateException unused) {
            return null;
        }
    }

    private static C1511jB c() {
        C1511jB.a u = C1511jB.u();
        u.u(32768);
        return (C1511jB) u.j();
    }

    public final C1511jB a(int i) {
        C1511jB jBVar;
        try {
            jBVar = this.d.poll(5000, TimeUnit.MILLISECONDS);
        } catch (InterruptedException unused) {
            jBVar = null;
        }
        return jBVar == null ? c() : jBVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0031, code lost:
        a();
        r3.e.quit();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0039, code lost:
        throw r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0025, code lost:
        r4 = move-exception;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:8:0x0027 */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0025 A[ExcHandler: all (r4v3 'th' java.lang.Throwable A[CUSTOM_DECLARE]), Splitter:B:2:0x0006] */
    @Override // com.google.android.gms.common.internal.AbstractC0176b.a
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onConnected(android.os.Bundle r4) {
        /*
            r3 = this;
            com.google.android.gms.internal.ads.FU r4 = r3.b()
            if (r4 == 0) goto L_0x003a
            com.google.android.gms.internal.ads.BU r0 = new com.google.android.gms.internal.ads.BU     // Catch:{ Throwable -> 0x0027, all -> 0x0025 }
            java.lang.String r1 = r3.f4082b     // Catch:{ Throwable -> 0x0027, all -> 0x0025 }
            java.lang.String r2 = r3.f4083c     // Catch:{ Throwable -> 0x0027, all -> 0x0025 }
            r0.<init>(r1, r2)     // Catch:{ Throwable -> 0x0027, all -> 0x0025 }
            com.google.android.gms.internal.ads.DU r4 = r4.a(r0)     // Catch:{ Throwable -> 0x0027, all -> 0x0025 }
            com.google.android.gms.internal.ads.jB r4 = r4.L()     // Catch:{ Throwable -> 0x0027, all -> 0x0025 }
            java.util.concurrent.LinkedBlockingQueue<com.google.android.gms.internal.ads.jB> r0 = r3.d     // Catch:{ Throwable -> 0x0027, all -> 0x0025 }
            r0.put(r4)     // Catch:{ Throwable -> 0x0027, all -> 0x0025 }
        L_0x001c:
            r3.a()
            android.os.HandlerThread r4 = r3.e
            r4.quit()
            return
        L_0x0025:
            r4 = move-exception
            goto L_0x0031
        L_0x0027:
            java.util.concurrent.LinkedBlockingQueue<com.google.android.gms.internal.ads.jB> r4 = r3.d     // Catch:{ InterruptedException -> 0x001c, all -> 0x0025 }
            com.google.android.gms.internal.ads.jB r0 = c()     // Catch:{ InterruptedException -> 0x001c, all -> 0x0025 }
            r4.put(r0)     // Catch:{ InterruptedException -> 0x001c, all -> 0x0025 }
            goto L_0x001c
        L_0x0031:
            r3.a()
            android.os.HandlerThread r0 = r3.e
            r0.quit()
            throw r4
        L_0x003a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C1118dU.onConnected(android.os.Bundle):void");
    }

    @Override // com.google.android.gms.common.internal.AbstractC0176b.AbstractC0028b
    public final void onConnectionFailed(b bVar) {
        try {
            this.d.put(c());
        } catch (InterruptedException unused) {
        }
    }

    @Override // com.google.android.gms.common.internal.AbstractC0176b.a
    public final void onConnectionSuspended(int i) {
        try {
            this.d.put(c());
        } catch (InterruptedException unused) {
        }
    }
}
