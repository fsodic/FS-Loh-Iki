package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import java.util.Arrays;
import java.util.List;

@TargetApi(16)
/* renamed from: com.google.android.gms.internal.ads._n  reason: case insensitive filesystem */
public final class C0877_n extends AbstractC0565On implements AbstractC0227Bn {
    private C2251tn d;
    private String e;
    private boolean f;
    private Exception g;
    private boolean h;

    public C0877_n(AbstractC0798Xm xm, C0824Ym ym) {
        super(xm);
        this.d = new C2251tn(xm.getContext(), ym);
        this.d.a((AbstractC0227Bn) this);
    }

    private static String b(String str, Exception exc) {
        String canonicalName = exc.getClass().getCanonicalName();
        String message = exc.getMessage();
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 2 + String.valueOf(canonicalName).length() + String.valueOf(message).length());
        sb.append(str);
        sb.append("/");
        sb.append(canonicalName);
        sb.append(":");
        sb.append(message);
        return sb.toString();
    }

    private final void c(String str) {
        synchronized (this) {
            this.f = true;
            notify();
            a();
        }
        String str2 = this.e;
        if (str2 != null) {
            String b2 = b(str2);
            Exception exc = this.g;
            if (exc != null) {
                a(this.e, b2, "badUrl", b(str, exc));
            } else {
                a(this.e, b2, "externalAbort", "Programmatic precache abort.");
            }
        }
    }

    @Override // com.google.android.gms.common.api.h, com.google.android.gms.internal.ads.AbstractC0565On
    public final void a() {
        C2251tn tnVar = this.d;
        if (tnVar != null) {
            tnVar.a((AbstractC0227Bn) null);
            this.d.c();
        }
        super.a();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0227Bn
    public final void a(int i) {
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0227Bn
    public final void a(int i, int i2) {
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0227Bn
    public final void a(String str, Exception exc) {
        String str2 = (String) C2392voa.e().a(C2474x.l);
        if (str2 != null) {
            List asList = Arrays.asList(str2.split(","));
            if (asList.contains("all") || asList.contains(exc.getClass().getCanonicalName())) {
                return;
            }
        }
        this.g = exc;
        C0745Vl.c("Precache error", exc);
        c(str);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0227Bn
    public final void a(boolean z, long j) {
        AbstractC0798Xm xm = this.f2790c.get();
        if (xm != null) {
            C0875_l.e.execute(new RunnableC1083co(xm, z, j));
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0565On
    public final boolean a(String str) {
        return a(str, new String[]{str});
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0087, code lost:
        if (r33.g == null) goto L_0x008e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x008d, code lost:
        throw r33.g;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0097, code lost:
        throw new java.io.IOException("Abort requested before buffering finished. ");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x0157, code lost:
        r0 = th;
     */
    @Override // com.google.android.gms.internal.ads.AbstractC0565On
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean a(java.lang.String r34, java.lang.String[] r35) {
        /*
        // Method dump skipped, instructions count: 423
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C0877_n.a(java.lang.String, java.lang.String[]):boolean");
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.AbstractC0565On
    public final String b(String str) {
        String valueOf = String.valueOf(super.b(str));
        return valueOf.length() != 0 ? "cache:".concat(valueOf) : new String("cache:");
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0565On
    public final void b() {
        c((String) null);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0565On
    public final void b(int i) {
        this.d.g().c(i);
    }

    public final C2251tn c() {
        synchronized (this) {
            this.h = true;
            notify();
        }
        this.d.a((AbstractC0227Bn) null);
        C2251tn tnVar = this.d;
        this.d = null;
        return tnVar;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0565On
    public final void c(int i) {
        this.d.g().d(i);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0565On
    public final void d(int i) {
        this.d.g().a(i);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0565On
    public final void e(int i) {
        this.d.g().b(i);
    }
}
