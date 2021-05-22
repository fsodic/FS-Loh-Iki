package org.cocos2dx.lib;

import android.media.MediaPlayer;

/* access modifiers changed from: package-private */
/* renamed from: org.cocos2dx.lib.ma  reason: case insensitive filesystem */
public class C2706ma implements MediaPlayer.OnPreparedListener {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ Cocos2dxVideoView f6395a;

    C2706ma(Cocos2dxVideoView cocos2dxVideoView) {
        this.f6395a = cocos2dxVideoView;
    }

    public void onPrepared(MediaPlayer mediaPlayer) {
        this.f6395a.mCurrentState = 2;
        if (this.f6395a.mOnPreparedListener != null) {
            this.f6395a.mOnPreparedListener.onPrepared(this.f6395a.mMediaPlayer);
        }
        this.f6395a.mVideoWidth = mediaPlayer.getVideoWidth();
        this.f6395a.mVideoHeight = mediaPlayer.getVideoHeight();
        int i = this.f6395a.mSeekWhenPrepared;
        if (i != 0) {
            this.f6395a.seekTo(i);
        }
        if (!(this.f6395a.mVideoWidth == 0 || this.f6395a.mVideoHeight == 0)) {
            this.f6395a.fixSize();
        }
        if (this.f6395a.mTargetState == 3) {
            this.f6395a.start();
        }
    }
}
