package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

/* access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.ads.wha  reason: case insensitive filesystem */
public final class C2447wha implements Yga {

    /* renamed from: a  reason: collision with root package name */
    private int f5911a = -1;

    /* renamed from: b  reason: collision with root package name */
    private int f5912b = -1;

    /* renamed from: c  reason: collision with root package name */
    private int f5913c = 0;
    private ByteBuffer d;
    private ByteBuffer e;
    private boolean f;

    public C2447wha() {
        ByteBuffer byteBuffer = Yga.f3578a;
        this.d = byteBuffer;
        this.e = byteBuffer;
    }

    @Override // com.google.android.gms.internal.ads.Yga
    public final ByteBuffer a() {
        ByteBuffer byteBuffer = this.e;
        this.e = Yga.f3578a;
        return byteBuffer;
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x002b  */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x003a  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0043  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0081 A[LOOP:2: B:23:0x0081->B:24:0x0083, LOOP_START, PHI: r0 
      PHI: (r0v2 int) = (r0v0 int), (r0v3 int) binds: [B:14:0x0041, B:24:0x0083] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // com.google.android.gms.internal.ads.Yga
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(java.nio.ByteBuffer r8) {
        /*
        // Method dump skipped, instructions count: 173
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C2447wha.a(java.nio.ByteBuffer):void");
    }

    @Override // com.google.android.gms.internal.ads.Yga
    public final boolean a(int i, int i2, int i3) {
        if (i3 != 3 && i3 != 2 && i3 != Integer.MIN_VALUE && i3 != 1073741824) {
            throw new Xga(i, i2, i3);
        } else if (this.f5911a == i && this.f5912b == i2 && this.f5913c == i3) {
            return false;
        } else {
            this.f5911a = i;
            this.f5912b = i2;
            this.f5913c = i3;
            if (i3 != 2) {
                return true;
            }
            this.d = Yga.f3578a;
            return true;
        }
    }

    @Override // com.google.android.gms.internal.ads.Yga
    public final int b() {
        return 2;
    }

    @Override // com.google.android.gms.internal.ads.Yga
    public final boolean c() {
        int i = this.f5913c;
        return (i == 0 || i == 2) ? false : true;
    }

    @Override // com.google.android.gms.internal.ads.Yga
    public final void d() {
        this.f = true;
    }

    @Override // com.google.android.gms.internal.ads.Yga
    public final int e() {
        return this.f5912b;
    }

    @Override // com.google.android.gms.internal.ads.Yga
    public final void flush() {
        this.e = Yga.f3578a;
        this.f = false;
    }

    @Override // com.google.android.gms.internal.ads.Yga
    public final boolean q() {
        return this.f && this.e == Yga.f3578a;
    }

    @Override // com.google.android.gms.internal.ads.Yga
    public final void reset() {
        flush();
        this.d = Yga.f3578a;
        this.f5911a = -1;
        this.f5912b = -1;
        this.f5913c = 0;
    }
}
