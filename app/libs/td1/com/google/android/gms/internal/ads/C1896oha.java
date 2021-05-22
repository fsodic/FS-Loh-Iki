package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;

/* access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.ads.oha  reason: case insensitive filesystem */
public final class C1896oha implements Yga {

    /* renamed from: a  reason: collision with root package name */
    private int f5154a = -1;

    /* renamed from: b  reason: collision with root package name */
    private int f5155b = -1;

    /* renamed from: c  reason: collision with root package name */
    private int[] f5156c;
    private boolean d;
    private int[] e;
    private ByteBuffer f;
    private ByteBuffer g;
    private boolean h;

    public C1896oha() {
        ByteBuffer byteBuffer = Yga.f3578a;
        this.f = byteBuffer;
        this.g = byteBuffer;
    }

    @Override // com.google.android.gms.internal.ads.Yga
    public final ByteBuffer a() {
        ByteBuffer byteBuffer = this.g;
        this.g = Yga.f3578a;
        return byteBuffer;
    }

    @Override // com.google.android.gms.internal.ads.Yga
    public final void a(ByteBuffer byteBuffer) {
        int position = byteBuffer.position();
        int limit = byteBuffer.limit();
        int length = (((limit - position) / (this.f5154a * 2)) * this.e.length) << 1;
        if (this.f.capacity() < length) {
            this.f = ByteBuffer.allocateDirect(length).order(ByteOrder.nativeOrder());
        } else {
            this.f.clear();
        }
        while (position < limit) {
            for (int i : this.e) {
                this.f.putShort(byteBuffer.getShort((i * 2) + position));
            }
            position += this.f5154a << 1;
        }
        byteBuffer.position(limit);
        this.f.flip();
        this.g = this.f;
    }

    public final void a(int[] iArr) {
        this.f5156c = iArr;
    }

    @Override // com.google.android.gms.internal.ads.Yga
    public final boolean a(int i, int i2, int i3) {
        boolean z = !Arrays.equals(this.f5156c, this.e);
        this.e = this.f5156c;
        if (this.e == null) {
            this.d = false;
            return z;
        } else if (i3 != 2) {
            throw new Xga(i, i2, i3);
        } else if (!z && this.f5155b == i && this.f5154a == i2) {
            return false;
        } else {
            this.f5155b = i;
            this.f5154a = i2;
            this.d = i2 != this.e.length;
            int i4 = 0;
            while (true) {
                int[] iArr = this.e;
                if (i4 >= iArr.length) {
                    return true;
                }
                int i5 = iArr[i4];
                if (i5 < i2) {
                    this.d = (i5 != i4) | this.d;
                    i4++;
                } else {
                    throw new Xga(i, i2, i3);
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.Yga
    public final int b() {
        return 2;
    }

    @Override // com.google.android.gms.internal.ads.Yga
    public final boolean c() {
        return this.d;
    }

    @Override // com.google.android.gms.internal.ads.Yga
    public final void d() {
        this.h = true;
    }

    @Override // com.google.android.gms.internal.ads.Yga
    public final int e() {
        int[] iArr = this.e;
        return iArr == null ? this.f5154a : iArr.length;
    }

    @Override // com.google.android.gms.internal.ads.Yga
    public final void flush() {
        this.g = Yga.f3578a;
        this.h = false;
    }

    @Override // com.google.android.gms.internal.ads.Yga
    public final boolean q() {
        return this.h && this.g == Yga.f3578a;
    }

    @Override // com.google.android.gms.internal.ads.Yga
    public final void reset() {
        flush();
        this.f = Yga.f3578a;
        this.f5154a = -1;
        this.f5155b = -1;
        this.e = null;
        this.d = false;
    }
}
