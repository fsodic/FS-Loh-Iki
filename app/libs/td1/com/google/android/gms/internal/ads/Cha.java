package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.media.MediaCodec;

@TargetApi(24)
final class Cha {

    /* renamed from: a  reason: collision with root package name */
    private final MediaCodec.CryptoInfo f1711a;

    /* renamed from: b  reason: collision with root package name */
    private final MediaCodec.CryptoInfo.Pattern f1712b;

    private Cha(MediaCodec.CryptoInfo cryptoInfo) {
        this.f1711a = cryptoInfo;
        this.f1712b = new MediaCodec.CryptoInfo.Pattern(0, 0);
    }

    /* access modifiers changed from: private */
    public final void a(int i, int i2) {
        this.f1712b.set(i, i2);
        this.f1711a.setPattern(this.f1712b);
    }
}
