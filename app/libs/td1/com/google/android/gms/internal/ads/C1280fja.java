package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.fja  reason: case insensitive filesystem */
public final class C1280fja implements Hja {

    /* renamed from: a  reason: collision with root package name */
    private final Hja[] f4327a;

    public C1280fja(Hja[] hjaArr) {
        this.f4327a = hjaArr;
    }

    @Override // com.google.android.gms.internal.ads.Hja
    public final long a() {
        long j = Long.MAX_VALUE;
        for (Hja hja : this.f4327a) {
            long a2 = hja.a();
            if (a2 != Long.MIN_VALUE) {
                j = Math.min(j, a2);
            }
        }
        if (j == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        return j;
    }

    @Override // com.google.android.gms.internal.ads.Hja
    public final boolean c(long j) {
        boolean z;
        boolean z2 = false;
        do {
            long a2 = a();
            if (a2 == Long.MIN_VALUE) {
                break;
            }
            Hja[] hjaArr = this.f4327a;
            z = false;
            for (Hja hja : hjaArr) {
                if (hja.a() == a2) {
                    z |= hja.c(j);
                }
            }
            z2 |= z;
        } while (z);
        return z2;
    }
}
