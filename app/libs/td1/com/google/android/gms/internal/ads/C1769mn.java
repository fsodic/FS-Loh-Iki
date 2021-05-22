package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.net.HttpURLConnection;
import java.net.Socket;
import java.net.SocketException;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import java.util.regex.Pattern;
import javax.net.ssl.SSLSocketFactory;

/* access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.ads.mn  reason: case insensitive filesystem */
public final class C1769mn implements AbstractC1213eka {

    /* renamed from: a  reason: collision with root package name */
    private static final Pattern f4988a = Pattern.compile("^bytes (\\d+)-(\\d+)/(\\d+)$");

    /* renamed from: b  reason: collision with root package name */
    private static final AtomicReference<byte[]> f4989b = new AtomicReference<>();

    /* renamed from: c  reason: collision with root package name */
    private SSLSocketFactory f4990c = new C1976pn(this);
    private final int d;
    private final int e;
    private final String f;
    private final C1764mka g;
    private final AbstractC2177ska<? super C1769mn> h;
    private C1557jka i;
    private HttpURLConnection j;
    private InputStream k;
    private boolean l;
    private long m;
    private long n;
    private long o;
    private long p;
    private int q;
    private Set<Socket> r = new HashSet();

    C1769mn(String str, AbstractC2177ska<? super C1769mn> ska, int i2, int i3, int i4) {
        C2453wka.a(str);
        this.f = str;
        this.h = ska;
        this.g = new C1764mka();
        this.d = i2;
        this.e = i3;
        this.q = i4;
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0042  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static long a(java.net.HttpURLConnection r9) {
        /*
        // Method dump skipped, instructions count: 202
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C1769mn.a(java.net.HttpURLConnection):long");
    }

    private final void a() {
        HttpURLConnection httpURLConnection = this.j;
        if (httpURLConnection != null) {
            try {
                httpURLConnection.disconnect();
            } catch (Exception e2) {
                C0745Vl.b("Unexpected error while disconnecting", e2);
            }
            this.j = null;
        }
    }

    /* access modifiers changed from: private */
    public final void a(Socket socket) {
        this.r.add(socket);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:59:0x0146, code lost:
        if (r4 != 0) goto L_0x014c;
     */
    /* JADX WARNING: Removed duplicated region for block: B:117:0x012d A[EDGE_INSN: B:117:0x012d->B:50:0x012d ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x00db A[Catch:{ IOException -> 0x0241 }] */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00e8 A[Catch:{ IOException -> 0x0241 }] */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00ea A[Catch:{ IOException -> 0x0241 }] */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00f0 A[Catch:{ IOException -> 0x0241 }] */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0123 A[Catch:{ IOException -> 0x0241 }] */
    @Override // com.google.android.gms.internal.ads.AbstractC1213eka
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final long a(com.google.android.gms.internal.ads.C1557jka r24) {
        /*
        // Method dump skipped, instructions count: 613
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C1769mn.a(com.google.android.gms.internal.ads.jka):long");
    }

    /* access modifiers changed from: package-private */
    public final void a(int i2) {
        this.q = i2;
        for (Socket socket : this.r) {
            if (!socket.isClosed()) {
                try {
                    socket.setReceiveBufferSize(this.q);
                } catch (SocketException e2) {
                    C0745Vl.c("Failed to update receive buffer size.", e2);
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0038, code lost:
        if (r3 > 2048) goto L_0x003a;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:26:0x006b */
    @Override // com.google.android.gms.internal.ads.AbstractC1213eka
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void close() {
        /*
        // Method dump skipped, instructions count: 172
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C1769mn.close():void");
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1213eka
    public final Uri getUri() {
        HttpURLConnection httpURLConnection = this.j;
        if (httpURLConnection == null) {
            return null;
        }
        return Uri.parse(httpURLConnection.getURL().toString());
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1213eka
    public final int read(byte[] bArr, int i2, int i3) {
        try {
            if (this.o != this.m) {
                byte[] andSet = f4989b.getAndSet(null);
                if (andSet == null) {
                    andSet = new byte[4096];
                }
                while (this.o != this.m) {
                    int read = this.k.read(andSet, 0, (int) Math.min(this.m - this.o, (long) andSet.length));
                    if (Thread.interrupted()) {
                        throw new InterruptedIOException();
                    } else if (read != -1) {
                        this.o += (long) read;
                        if (this.h != null) {
                            this.h.a(this, read);
                        }
                    } else {
                        throw new EOFException();
                    }
                }
                f4989b.set(andSet);
            }
            if (i3 == 0) {
                return 0;
            }
            if (this.n != -1) {
                long j2 = this.n - this.p;
                if (j2 == 0) {
                    return -1;
                }
                i3 = (int) Math.min((long) i3, j2);
            }
            int read2 = this.k.read(bArr, i2, i3);
            if (read2 != -1) {
                this.p += (long) read2;
                if (this.h != null) {
                    this.h.a(this, read2);
                }
                return read2;
            } else if (this.n == -1) {
                return -1;
            } else {
                throw new EOFException();
            }
        } catch (IOException e2) {
            throw new C1626kka(e2, this.i, 2);
        }
    }
}
