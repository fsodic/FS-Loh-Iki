package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.media.MediaCodec;
import android.os.Handler;

@TargetApi(23)
final class Wka implements MediaCodec.OnFrameRenderedListener {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ Uka f3456a;

    private Wka(Uka uka, MediaCodec mediaCodec) {
        this.f3456a = uka;
        mediaCodec.setOnFrameRenderedListener(this, new Handler());
    }

    public final void onFrameRendered(MediaCodec mediaCodec, long j, long j2) {
        Uka uka = this.f3456a;
        if (this == uka.za) {
            uka.n();
        }
    }
}
