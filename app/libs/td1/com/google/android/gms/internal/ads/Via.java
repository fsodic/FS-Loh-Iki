package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.media.MediaCodecInfo;
import android.media.MediaCodecList;

/* access modifiers changed from: package-private */
@TargetApi(21)
public final class Via implements Sia {

    /* renamed from: a  reason: collision with root package name */
    private final int f3361a;

    /* renamed from: b  reason: collision with root package name */
    private MediaCodecInfo[] f3362b;

    public Via(boolean z) {
        this.f3361a = z ? 1 : 0;
    }

    private final void c() {
        if (this.f3362b == null) {
            this.f3362b = new MediaCodecList(this.f3361a).getCodecInfos();
        }
    }

    @Override // com.google.android.gms.internal.ads.Sia
    public final MediaCodecInfo a(int i) {
        c();
        return this.f3362b[i];
    }

    @Override // com.google.android.gms.internal.ads.Sia
    public final boolean a() {
        return true;
    }

    @Override // com.google.android.gms.internal.ads.Sia
    public final boolean a(String str, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureSupported("secure-playback");
    }

    @Override // com.google.android.gms.internal.ads.Sia
    public final int b() {
        c();
        return this.f3362b.length;
    }
}
