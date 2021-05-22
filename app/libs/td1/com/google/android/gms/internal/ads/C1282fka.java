package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.io.IOException;

/* renamed from: com.google.android.gms.internal.ads.fka  reason: case insensitive filesystem */
public final class C1282fka implements AbstractC1213eka {

    /* renamed from: a  reason: collision with root package name */
    private final byte[] f4331a;

    /* renamed from: b  reason: collision with root package name */
    private Uri f4332b;

    /* renamed from: c  reason: collision with root package name */
    private int f4333c;
    private int d;

    public C1282fka(byte[] bArr) {
        C2453wka.a(bArr);
        C2453wka.a(bArr.length > 0);
        this.f4331a = bArr;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1213eka
    public final long a(C1557jka jka) {
        this.f4332b = jka.f4716a;
        long j = jka.d;
        this.f4333c = (int) j;
        long j2 = jka.e;
        if (j2 == -1) {
            j2 = ((long) this.f4331a.length) - j;
        }
        this.d = (int) j2;
        int i = this.d;
        if (i > 0 && this.f4333c + i <= this.f4331a.length) {
            return (long) i;
        }
        int i2 = this.f4333c;
        long j3 = jka.e;
        int length = this.f4331a.length;
        StringBuilder sb = new StringBuilder(77);
        sb.append("Unsatisfiable range: [");
        sb.append(i2);
        sb.append(", ");
        sb.append(j3);
        sb.append("], length: ");
        sb.append(length);
        throw new IOException(sb.toString());
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1213eka
    public final void close() {
        this.f4332b = null;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1213eka
    public final Uri getUri() {
        return this.f4332b;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1213eka
    public final int read(byte[] bArr, int i, int i2) {
        if (i2 == 0) {
            return 0;
        }
        int i3 = this.d;
        if (i3 == 0) {
            return -1;
        }
        int min = Math.min(i2, i3);
        System.arraycopy(this.f4331a, this.f4333c, bArr, i, min);
        this.f4333c += min;
        this.d -= min;
        return min;
    }
}
