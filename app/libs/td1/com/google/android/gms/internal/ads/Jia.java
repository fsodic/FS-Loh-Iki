package com.google.android.gms.internal.ads;

/* access modifiers changed from: package-private */
public final class Jia {

    /* renamed from: a  reason: collision with root package name */
    public final int f2342a;

    /* renamed from: b  reason: collision with root package name */
    public final long[] f2343b;

    /* renamed from: c  reason: collision with root package name */
    public final int[] f2344c;
    public final int d;
    public final long[] e;
    public final int[] f;

    public Jia(long[] jArr, int[] iArr, int i, long[] jArr2, int[] iArr2) {
        boolean z = true;
        C2453wka.a(iArr.length == jArr2.length);
        C2453wka.a(jArr.length == jArr2.length);
        C2453wka.a(iArr2.length != jArr2.length ? false : z);
        this.f2343b = jArr;
        this.f2344c = iArr;
        this.d = i;
        this.e = jArr2;
        this.f = iArr2;
        this.f2342a = jArr.length;
    }

    public final int a(long j) {
        for (int a2 = Jka.a(this.e, j, true, false); a2 >= 0; a2--) {
            if ((this.f[a2] & 1) != 0) {
                return a2;
            }
        }
        return -1;
    }

    public final int b(long j) {
        for (int b2 = Jka.b(this.e, j, true, false); b2 < this.e.length; b2++) {
            if ((this.f[b2] & 1) != 0) {
                return b2;
            }
        }
        return -1;
    }
}
