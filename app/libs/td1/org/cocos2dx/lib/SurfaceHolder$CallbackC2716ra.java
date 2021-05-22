package org.cocos2dx.lib;

import android.view.SurfaceHolder;

/* access modifiers changed from: package-private */
/* renamed from: org.cocos2dx.lib.ra  reason: case insensitive filesystem */
public class SurfaceHolder$CallbackC2716ra implements SurfaceHolder.Callback {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ Cocos2dxVideoView f6409a;

    SurfaceHolder$CallbackC2716ra(Cocos2dxVideoView cocos2dxVideoView) {
        this.f6409a = cocos2dxVideoView;
    }

    public void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
        boolean z = true;
        boolean z2 = this.f6409a.mTargetState == 3;
        if (!(this.f6409a.mVideoWidth == i2 && this.f6409a.mVideoHeight == i3)) {
            z = false;
        }
        if (this.f6409a.mMediaPlayer != null && z2 && z) {
            if (this.f6409a.mSeekWhenPrepared != 0) {
                Cocos2dxVideoView cocos2dxVideoView = this.f6409a;
                cocos2dxVideoView.seekTo(cocos2dxVideoView.mSeekWhenPrepared);
            }
            this.f6409a.start();
        }
    }

    public void surfaceCreated(SurfaceHolder surfaceHolder) {
        this.f6409a.mSurfaceHolder = surfaceHolder;
        this.f6409a.openVideo();
    }

    public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        this.f6409a.mSurfaceHolder = null;
        this.f6409a.release(true);
    }
}
