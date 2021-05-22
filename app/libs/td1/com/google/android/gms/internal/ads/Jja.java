package com.google.android.gms.internal.ads;

public final class Jja extends Sga {

    /* renamed from: b  reason: collision with root package name */
    private static final Object f2345b = new Object();

    /* renamed from: c  reason: collision with root package name */
    private final long f2346c;
    private final long d;
    private final long e;
    private final long f;
    private final boolean g;
    private final boolean h;

    private Jja(long j, long j2, long j3, long j4, boolean z, boolean z2) {
        this.f2346c = j;
        this.d = j2;
        this.e = 0;
        this.f = 0;
        this.g = z;
        this.h = false;
    }

    public Jja(long j, boolean z) {
        this(j, j, 0, 0, z, false);
    }

    @Override // com.google.android.gms.internal.ads.Sga
    public final int a(Object obj) {
        return f2345b.equals(obj) ? 0 : -1;
    }

    @Override // com.google.android.gms.internal.ads.Sga
    public final Tga a(int i, Tga tga, boolean z, long j) {
        C2453wka.a(i, 0, 1);
        boolean z2 = this.g;
        long j2 = this.d;
        tga.f3197a = null;
        tga.f3198b = -9223372036854775807L;
        tga.f3199c = -9223372036854775807L;
        tga.d = z2;
        tga.e = false;
        tga.h = 0;
        tga.i = j2;
        tga.f = 0;
        tga.g = 0;
        tga.j = 0;
        return tga;
    }

    @Override // com.google.android.gms.internal.ads.Sga
    public final Uga a(int i, Uga uga, boolean z) {
        C2453wka.a(i, 0, 1);
        Object obj = z ? f2345b : null;
        uga.a(obj, obj, 0, this.f2346c, 0, false);
        return uga;
    }

    @Override // com.google.android.gms.internal.ads.Sga
    public final int b() {
        return 1;
    }

    @Override // com.google.android.gms.internal.ads.Sga
    public final int c() {
        return 1;
    }
}
