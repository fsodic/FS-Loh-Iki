package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.io.InputStream;

/* renamed from: com.google.android.gms.internal.ads.Ii  reason: case insensitive filesystem */
public class C0404Ii implements Poa {

    /* renamed from: a  reason: collision with root package name */
    private static final boolean f2254a = C0558Og.f2767b;
    @Deprecated

    /* renamed from: b  reason: collision with root package name */
    private final AbstractC2389vn f2255b;

    /* renamed from: c  reason: collision with root package name */
    private final AbstractC1757mh f2256c;
    private final C1415hi d;

    public C0404Ii(AbstractC1757mh mhVar) {
        this(mhVar, new C1415hi(4096));
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: com.google.android.gms.internal.ads.mh */
    /* JADX WARN: Multi-variable type inference failed */
    private C0404Ii(AbstractC1757mh mhVar, C1415hi hiVar) {
        this.f2256c = mhVar;
        this.f2255b = mhVar;
        this.d = hiVar;
    }

    private static void a(String str, AbstractC0959b<?> bVar, C0713Uf uf) {
        AbstractC2511xf k = bVar.k();
        int j = bVar.j();
        try {
            k.a(uf);
            bVar.a(String.format("%s-retry [timeout=%s]", str, Integer.valueOf(j)));
        } catch (C0713Uf e) {
            bVar.a(String.format("%s-timeout-giveup [timeout=%s]", str, Integer.valueOf(j)));
            throw e;
        }
    }

    private final byte[] a(InputStream inputStream, int i) {
        C2531xp xpVar = new C2531xp(this.d, i);
        if (inputStream != null) {
            try {
                byte[] a2 = this.d.a(1024);
                while (true) {
                    int read = inputStream.read(a2);
                    if (read == -1) {
                        break;
                    }
                    xpVar.write(a2, 0, read);
                }
                byte[] byteArray = xpVar.toByteArray();
                if (inputStream != null) {
                    try {
                        inputStream.close();
                    } catch (IOException unused) {
                        C0558Og.c("Error occurred when closing InputStream", new Object[0]);
                    }
                }
                this.d.a(a2);
                xpVar.close();
                return byteArray;
            } catch (Throwable th) {
                if (inputStream != null) {
                    try {
                        inputStream.close();
                    } catch (IOException unused2) {
                        C0558Og.c("Error occurred when closing InputStream", new Object[0]);
                    }
                }
                this.d.a((byte[]) null);
                xpVar.close();
                throw th;
            }
        } else {
            throw new C0790Xe();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:101:0x01ff, code lost:
        throw new com.google.android.gms.internal.ads.C(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:102:0x0200, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:103:0x0201, code lost:
        r2 = java.lang.String.valueOf(r22.c());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:104:0x0211, code lost:
        if (r2.length() != 0) goto L_0x0213;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:105:0x0213, code lost:
        r2 = "Bad URL ".concat(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:106:0x0218, code lost:
        r2 = new java.lang.String("Bad URL ");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:108:0x0220, code lost:
        throw new java.lang.RuntimeException(r2, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:109:0x0221, code lost:
        r0 = new com.google.android.gms.internal.ads.C1962pg();
        r5 = "socket";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x018c, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x018d, code lost:
        r17 = r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x0190, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x0191, code lost:
        r17 = r5;
        r10 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x0194, code lost:
        r13 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x0197, code lost:
        r0 = r10.c();
        com.google.android.gms.internal.ads.C0558Og.b("Unexpected response code %d for %s", java.lang.Integer.valueOf(r0), r22.c());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x01ae, code lost:
        if (r13 != null) goto L_0x01b0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x01b0, code lost:
        r5 = new com.google.android.gms.internal.ads.C1912opa(r0, r13, false, android.os.SystemClock.elapsedRealtime() - r3, r17);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x01c0, code lost:
        if (r0 == 401) goto L_0x01ea;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x01c9, code lost:
        if (r0 < 400) goto L_0x01d6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x01d5, code lost:
        throw new com.google.android.gms.internal.ads.C2386vla(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x01d8, code lost:
        if (r0 < 500) goto L_0x01e4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x01e3, code lost:
        throw new com.google.android.gms.internal.ads.C0790Xe(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x01e9, code lost:
        throw new com.google.android.gms.internal.ads.C0790Xe(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x01ea, code lost:
        r0 = new com.google.android.gms.internal.ads.C2173sia(r5);
        r5 = "auth";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x01f2, code lost:
        r0 = new com.google.android.gms.internal.ads.Ppa();
        r5 = "network";
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:102:0x0200 A[ExcHandler: MalformedURLException (r0v2 'e' java.net.MalformedURLException A[CUSTOM_DECLARE]), Splitter:B:2:0x000f] */
    /* JADX WARNING: Removed duplicated region for block: B:110:? A[ExcHandler: SocketTimeoutException (unused java.net.SocketTimeoutException), SYNTHETIC, Splitter:B:2:0x000f] */
    /* JADX WARNING: Removed duplicated region for block: B:114:0x01fa A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x0197  */
    @Override // com.google.android.gms.internal.ads.Poa
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.google.android.gms.internal.ads.C1912opa a(com.google.android.gms.internal.ads.AbstractC0959b<?> r22) {
        /*
        // Method dump skipped, instructions count: 557
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C0404Ii.a(com.google.android.gms.internal.ads.b):com.google.android.gms.internal.ads.opa");
    }
}
