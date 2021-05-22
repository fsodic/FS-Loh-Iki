package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.ShortBuffer;

/* renamed from: com.google.android.gms.internal.ads.yha  reason: case insensitive filesystem */
public final class C2585yha implements Yga {

    /* renamed from: a  reason: collision with root package name */
    private int f6117a = -1;

    /* renamed from: b  reason: collision with root package name */
    private int f6118b = -1;

    /* renamed from: c  reason: collision with root package name */
    private C2378vha f6119c;
    private float d = 1.0f;
    private float e = 1.0f;
    private ByteBuffer f = Yga.f3578a;
    private ShortBuffer g = this.f.asShortBuffer();
    private ByteBuffer h = Yga.f3578a;
    private long i;
    private long j;
    private boolean k;

    public final float a(float f2) {
        this.d = Jka.a(f2, 0.1f, 8.0f);
        return this.d;
    }

    @Override // com.google.android.gms.internal.ads.Yga
    public final ByteBuffer a() {
        ByteBuffer byteBuffer = this.h;
        this.h = Yga.f3578a;
        return byteBuffer;
    }

    @Override // com.google.android.gms.internal.ads.Yga
    public final void a(ByteBuffer byteBuffer) {
        if (byteBuffer.hasRemaining()) {
            ShortBuffer asShortBuffer = byteBuffer.asShortBuffer();
            int remaining = byteBuffer.remaining();
            this.i += (long) remaining;
            this.f6119c.a(asShortBuffer);
            byteBuffer.position(byteBuffer.position() + remaining);
        }
        int b2 = (this.f6119c.b() * this.f6117a) << 1;
        if (b2 > 0) {
            if (this.f.capacity() < b2) {
                this.f = ByteBuffer.allocateDirect(b2).order(ByteOrder.nativeOrder());
                this.g = this.f.asShortBuffer();
            } else {
                this.f.clear();
                this.g.clear();
            }
            this.f6119c.b(this.g);
            this.j += (long) b2;
            this.f.limit(b2);
            this.h = this.f;
        }
    }

    @Override // com.google.android.gms.internal.ads.Yga
    public final boolean a(int i2, int i3, int i4) {
        if (i4 != 2) {
            throw new Xga(i2, i3, i4);
        } else if (this.f6118b == i2 && this.f6117a == i3) {
            return false;
        } else {
            this.f6118b = i2;
            this.f6117a = i3;
            return true;
        }
    }

    public final float b(float f2) {
        this.e = Jka.a(f2, 0.1f, 8.0f);
        return f2;
    }

    @Override // com.google.android.gms.internal.ads.Yga
    public final int b() {
        return 2;
    }

    @Override // com.google.android.gms.internal.ads.Yga
    public final boolean c() {
        return Math.abs(this.d - 1.0f) >= 0.01f || Math.abs(this.e - 1.0f) >= 0.01f;
    }

    @Override // com.google.android.gms.internal.ads.Yga
    public final void d() {
        this.f6119c.a();
        this.k = true;
    }

    @Override // com.google.android.gms.internal.ads.Yga
    public final int e() {
        return this.f6117a;
    }

    public final long f() {
        return this.i;
    }

    @Override // com.google.android.gms.internal.ads.Yga
    public final void flush() {
        this.f6119c = new C2378vha(this.f6118b, this.f6117a);
        this.f6119c.a(this.d);
        this.f6119c.b(this.e);
        this.h = Yga.f3578a;
        this.i = 0;
        this.j = 0;
        this.k = false;
    }

    public final long g() {
        return this.j;
    }

    @Override // com.google.android.gms.internal.ads.Yga
    public final boolean q() {
        if (!this.k) {
            return false;
        }
        C2378vha vha = this.f6119c;
        return vha == null || vha.b() == 0;
    }

    @Override // com.google.android.gms.internal.ads.Yga
    public final void reset() {
        this.f6119c = null;
        this.f = Yga.f3578a;
        this.g = this.f.asShortBuffer();
        this.h = Yga.f3578a;
        this.f6117a = -1;
        this.f6118b = -1;
        this.i = 0;
        this.j = 0;
        this.k = false;
    }
}
