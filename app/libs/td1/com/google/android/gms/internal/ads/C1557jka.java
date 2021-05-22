package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.util.Arrays;

/* renamed from: com.google.android.gms.internal.ads.jka  reason: case insensitive filesystem */
public final class C1557jka {

    /* renamed from: a  reason: collision with root package name */
    public final Uri f4716a;

    /* renamed from: b  reason: collision with root package name */
    public final byte[] f4717b;

    /* renamed from: c  reason: collision with root package name */
    public final long f4718c;
    public final long d;
    public final long e;
    public final String f;
    public final int g;

    public C1557jka(Uri uri) {
        this(uri, 0);
    }

    private C1557jka(Uri uri, int i) {
        this(uri, 0, -1, null, 0);
    }

    private C1557jka(Uri uri, long j, long j2, long j3, String str, int i) {
        this(uri, null, j, j2, j3, str, i);
    }

    public C1557jka(Uri uri, long j, long j2, String str) {
        this(uri, j, j, j2, str, 0);
    }

    private C1557jka(Uri uri, long j, long j2, String str, int i) {
        this(uri, 0, 0, -1, null, 0);
    }

    public C1557jka(Uri uri, byte[] bArr, long j, long j2, long j3, String str, int i) {
        boolean z = true;
        C2453wka.a(j >= 0);
        C2453wka.a(j2 >= 0);
        if (j3 <= 0 && j3 != -1) {
            z = false;
        }
        C2453wka.a(z);
        this.f4716a = uri;
        this.f4717b = bArr;
        this.f4718c = j;
        this.d = j2;
        this.e = j3;
        this.f = str;
        this.g = i;
    }

    public final boolean a(int i) {
        return (this.g & 1) == 1;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f4716a);
        String arrays = Arrays.toString(this.f4717b);
        long j = this.f4718c;
        long j2 = this.d;
        long j3 = this.e;
        String str = this.f;
        int i = this.g;
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 93 + String.valueOf(arrays).length() + String.valueOf(str).length());
        sb.append("DataSpec[");
        sb.append(valueOf);
        sb.append(", ");
        sb.append(arrays);
        sb.append(", ");
        sb.append(j);
        sb.append(", ");
        sb.append(j2);
        sb.append(", ");
        sb.append(j3);
        sb.append(", ");
        sb.append(str);
        sb.append(", ");
        sb.append(i);
        sb.append("]");
        return sb.toString();
    }
}
