package org.cocos2dx.lib;

import android.media.MediaPlayer;

/* access modifiers changed from: package-private */
/* renamed from: org.cocos2dx.lib.la  reason: case insensitive filesystem */
public class C2704la implements MediaPlayer.OnVideoSizeChangedListener {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ Cocos2dxVideoView f6392a;

    C2704la(Cocos2dxVideoView cocos2dxVideoView) {
        this.f6392a = cocos2dxVideoView;
    }

    public void onVideoSizeChanged(MediaPlayer mediaPlayer, int i, int i2) {
        this.f6392a.mVideoWidth = mediaPlayer.getVideoWidth();
        this.f6392a.mVideoHeight = mediaPlayer.getVideoHeight();
        if (this.f6392a.mVideoWidth != 0 && this.f6392a.mVideoHeight != 0) {
            this.f6392a.getHolder().setFixedSize(this.f6392a.mVideoWidth, this.f6392a.mVideoHeight);
        }
    }
}
