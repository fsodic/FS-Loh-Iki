package com.google.android.gms.internal.ads;

import android.media.MediaCodecInfo;
import android.media.MediaCodecList;

/* access modifiers changed from: package-private */
public final class Wia implements Sia {
    private Wia() {
    }

    @Override // com.google.android.gms.internal.ads.Sia
    public final MediaCodecInfo a(int i) {
        return MediaCodecList.getCodecInfoAt(i);
    }

    @Override // com.google.android.gms.internal.ads.Sia
    public final boolean a() {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.Sia
    public final boolean a(String str, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return "video/avc".equals(str);
    }

    @Override // com.google.android.gms.internal.ads.Sia
    public final int b() {
        return MediaCodecList.getCodecCount();
    }
}
