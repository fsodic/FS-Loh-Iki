package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.media.MediaCodec;

public final class Aha {

    /* renamed from: a  reason: collision with root package name */
    public byte[] f1538a;

    /* renamed from: b  reason: collision with root package name */
    private byte[] f1539b;

    /* renamed from: c  reason: collision with root package name */
    private int f1540c;
    public int[] d;
    public int[] e;
    private int f;
    private int g;
    private int h;
    private final MediaCodec.CryptoInfo i;
    private final Cha j;

    public Aha() {
        this.i = Jka.f2347a >= 16 ? new MediaCodec.CryptoInfo() : null;
        this.j = Jka.f2347a >= 24 ? new Cha(this.i) : null;
    }

    @TargetApi(16)
    public final MediaCodec.CryptoInfo a() {
        return this.i;
    }

    public final void a(int i2, int[] iArr, int[] iArr2, byte[] bArr, byte[] bArr2, int i3) {
        this.f = i2;
        this.d = iArr;
        this.e = iArr2;
        this.f1539b = bArr;
        this.f1538a = bArr2;
        this.f1540c = i3;
        this.g = 0;
        this.h = 0;
        int i4 = Jka.f2347a;
        if (i4 >= 16) {
            MediaCodec.CryptoInfo cryptoInfo = this.i;
            cryptoInfo.numSubSamples = this.f;
            cryptoInfo.numBytesOfClearData = this.d;
            cryptoInfo.numBytesOfEncryptedData = this.e;
            cryptoInfo.key = this.f1539b;
            cryptoInfo.iv = this.f1538a;
            cryptoInfo.mode = this.f1540c;
            if (i4 >= 24) {
                this.j.a(0, 0);
            }
        }
    }
}
