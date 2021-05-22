package com.google.android.gms.internal.ads;

public final class Nha implements Vha {

    /* renamed from: a  reason: collision with root package name */
    private final int f2685a;

    /* renamed from: b  reason: collision with root package name */
    private final int[] f2686b;

    /* renamed from: c  reason: collision with root package name */
    private final long[] f2687c;
    private final long[] d;
    private final long[] e;
    private final long f;

    public Nha(int[] iArr, long[] jArr, long[] jArr2, long[] jArr3) {
        this.f2686b = iArr;
        this.f2687c = jArr;
        this.d = jArr2;
        this.e = jArr3;
        this.f2685a = iArr.length;
        int i = this.f2685a;
        if (i > 0) {
            this.f = jArr2[i - 1] + jArr3[i - 1];
        } else {
            this.f = 0;
        }
    }

    @Override // com.google.android.gms.internal.ads.Vha
    public final long a(long j) {
        return this.f2687c[Jka.a(this.e, j, true, true)];
    }

    @Override // com.google.android.gms.internal.ads.Vha
    public final boolean b() {
        return true;
    }

    @Override // com.google.android.gms.internal.ads.Vha
    public final long c() {
        return this.f;
    }
}
