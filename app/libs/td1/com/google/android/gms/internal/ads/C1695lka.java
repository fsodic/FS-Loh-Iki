package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.util.Log;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import java.util.regex.Pattern;

/* renamed from: com.google.android.gms.internal.ads.lka  reason: case insensitive filesystem */
public final class C1695lka implements AbstractC1213eka {

    /* renamed from: a  reason: collision with root package name */
    private static final Pattern f4900a = Pattern.compile("^bytes (\\d+)-(\\d+)/(\\d+)$");

    /* renamed from: b  reason: collision with root package name */
    private static final AtomicReference<byte[]> f4901b = new AtomicReference<>();

    /* renamed from: c  reason: collision with root package name */
    private final boolean f4902c;
    private final int d;
    private final int e;
    private final String f;
    private final Fka<String> g = null;
    private final C1764mka h;
    private final C1764mka i;
    private final AbstractC2177ska<? super C1695lka> j;
    private C1557jka k;
    private HttpURLConnection l;
    private InputStream m;
    private boolean n;
    private long o;
    private long p;
    private long q;
    private long r;

    public C1695lka(String str, Fka<String> fka, AbstractC2177ska<? super C1695lka> ska, int i2, int i3, boolean z, C1764mka mka) {
        C2453wka.a(str);
        this.f = str;
        this.j = ska;
        this.i = new C1764mka();
        this.d = i2;
        this.e = i3;
        this.f4902c = true;
        this.h = null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0044  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static long a(java.net.HttpURLConnection r10) {
        /*
        // Method dump skipped, instructions count: 204
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C1695lka.a(java.net.HttpURLConnection):long");
    }

    private final HttpURLConnection a(URL url, byte[] bArr, long j2, long j3, boolean z, boolean z2) {
        HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
        httpURLConnection.setConnectTimeout(this.d);
        httpURLConnection.setReadTimeout(this.e);
        for (Map.Entry<String, String> entry : this.i.a().entrySet()) {
            httpURLConnection.setRequestProperty(entry.getKey(), entry.getValue());
        }
        if (!(j2 == 0 && j3 == -1)) {
            StringBuilder sb = new StringBuilder(27);
            sb.append("bytes=");
            sb.append(j2);
            sb.append("-");
            String sb2 = sb.toString();
            if (j3 != -1) {
                String valueOf = String.valueOf(sb2);
                StringBuilder sb3 = new StringBuilder(String.valueOf(valueOf).length() + 20);
                sb3.append(valueOf);
                sb3.append((j2 + j3) - 1);
                sb2 = sb3.toString();
            }
            httpURLConnection.setRequestProperty("Range", sb2);
        }
        httpURLConnection.setRequestProperty("User-Agent", this.f);
        if (!z) {
            httpURLConnection.setRequestProperty("Accept-Encoding", "identity");
        }
        httpURLConnection.setInstanceFollowRedirects(z2);
        httpURLConnection.setDoOutput(bArr != null);
        if (bArr != null) {
            httpURLConnection.setRequestMethod("POST");
            if (bArr.length != 0) {
                httpURLConnection.setFixedLengthStreamingMode(bArr.length);
                httpURLConnection.connect();
                OutputStream outputStream = httpURLConnection.getOutputStream();
                outputStream.write(bArr);
                outputStream.close();
                return httpURLConnection;
            }
        }
        httpURLConnection.connect();
        return httpURLConnection;
    }

    private final void b() {
        HttpURLConnection httpURLConnection = this.l;
        if (httpURLConnection != null) {
            try {
                httpURLConnection.disconnect();
            } catch (Exception e2) {
                Log.e("DefaultHttpDataSource", "Unexpected error while disconnecting", e2);
            }
            this.l = null;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0094, code lost:
        if (r0 != 0) goto L_0x0098;
     */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00cc  */
    @Override // com.google.android.gms.internal.ads.AbstractC1213eka
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final long a(com.google.android.gms.internal.ads.C1557jka r25) {
        /*
        // Method dump skipped, instructions count: 432
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C1695lka.a(com.google.android.gms.internal.ads.jka):long");
    }

    public final Map<String, List<String>> a() {
        HttpURLConnection httpURLConnection = this.l;
        if (httpURLConnection == null) {
            return null;
        }
        return httpURLConnection.getHeaderFields();
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
        // Method dump skipped, instructions count: 162
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C1695lka.close():void");
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1213eka
    public final Uri getUri() {
        HttpURLConnection httpURLConnection = this.l;
        if (httpURLConnection == null) {
            return null;
        }
        return Uri.parse(httpURLConnection.getURL().toString());
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1213eka
    public final int read(byte[] bArr, int i2, int i3) {
        try {
            if (this.q != this.o) {
                byte[] andSet = f4901b.getAndSet(null);
                if (andSet == null) {
                    andSet = new byte[4096];
                }
                while (this.q != this.o) {
                    int read = this.m.read(andSet, 0, (int) Math.min(this.o - this.q, (long) andSet.length));
                    if (Thread.interrupted()) {
                        throw new InterruptedIOException();
                    } else if (read != -1) {
                        this.q += (long) read;
                        if (this.j != null) {
                            this.j.a(this, read);
                        }
                    } else {
                        throw new EOFException();
                    }
                }
                f4901b.set(andSet);
            }
            if (i3 == 0) {
                return 0;
            }
            if (this.p != -1) {
                long j2 = this.p - this.r;
                if (j2 == 0) {
                    return -1;
                }
                i3 = (int) Math.min((long) i3, j2);
            }
            int read2 = this.m.read(bArr, i2, i3);
            if (read2 != -1) {
                this.r += (long) read2;
                if (this.j != null) {
                    this.j.a(this, read2);
                }
                return read2;
            } else if (this.p == -1) {
                return -1;
            } else {
                throw new EOFException();
            }
        } catch (IOException e2) {
            throw new C1626kka(e2, this.k, 2);
        }
    }
}
