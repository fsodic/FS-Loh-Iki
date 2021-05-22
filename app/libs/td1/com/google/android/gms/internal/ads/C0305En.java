package com.google.android.gms.internal.ads;

import android.net.Uri;

/* renamed from: com.google.android.gms.internal.ads.En  reason: case insensitive filesystem */
final class C0305En implements AbstractC1213eka {

    /* renamed from: a  reason: collision with root package name */
    private final AbstractC1213eka f1902a;

    /* renamed from: b  reason: collision with root package name */
    private final long f1903b;

    /* renamed from: c  reason: collision with root package name */
    private final AbstractC1213eka f1904c;
    private long d;
    private Uri e;

    C0305En(AbstractC1213eka eka, int i, AbstractC1213eka eka2) {
        this.f1902a = eka;
        this.f1903b = (long) i;
        this.f1904c = eka2;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1213eka
    public final long a(C1557jka jka) {
        C1557jka jka2;
        C1557jka jka3;
        this.e = jka.f4716a;
        long j = jka.d;
        long j2 = this.f1903b;
        if (j >= j2) {
            jka2 = null;
        } else {
            long j3 = jka.e;
            jka2 = new C1557jka(jka.f4716a, j, j3 != -1 ? Math.min(j3, j2 - j) : j2 - j, null);
        }
        long j4 = jka.e;
        if (j4 == -1 || jka.d + j4 > this.f1903b) {
            long max = Math.max(this.f1903b, jka.d);
            long j5 = jka.e;
            jka3 = new C1557jka(jka.f4716a, max, j5 != -1 ? Math.min(j5, (jka.d + j5) - this.f1903b) : -1, null);
        } else {
            jka3 = null;
        }
        long j6 = 0;
        long a2 = jka2 != null ? this.f1902a.a(jka2) : 0;
        if (jka3 != null) {
            j6 = this.f1904c.a(jka3);
        }
        this.d = jka.d;
        if (a2 == -1 || j6 == -1) {
            return -1;
        }
        return a2 + j6;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1213eka
    public final void close() {
        this.f1902a.close();
        this.f1904c.close();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1213eka
    public final Uri getUri() {
        return this.e;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1213eka
    public final int read(byte[] bArr, int i, int i2) {
        int i3;
        long j = this.d;
        long j2 = this.f1903b;
        if (j < j2) {
            i3 = this.f1902a.read(bArr, i, (int) Math.min((long) i2, j2 - j));
            this.d += (long) i3;
        } else {
            i3 = 0;
        }
        if (this.d < this.f1903b) {
            return i3;
        }
        int read = this.f1904c.read(bArr, i + i3, i2 - i3);
        int i4 = i3 + read;
        this.d += (long) read;
        return i4;
    }
}
