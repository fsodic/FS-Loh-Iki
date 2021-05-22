package org.cocos2dx.lib;

import android.media.MediaPlayer;

/* access modifiers changed from: package-private */
/* renamed from: org.cocos2dx.lib.na  reason: case insensitive filesystem */
public class C2708na implements MediaPlayer.OnCompletionListener {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ Cocos2dxVideoView f6398a;

    C2708na(Cocos2dxVideoView cocos2dxVideoView) {
        this.f6398a = cocos2dxVideoView;
    }

    public void onCompletion(MediaPlayer mediaPlayer) {
        this.f6398a.mCurrentState = 5;
        this.f6398a.mTargetState = 5;
        this.f6398a.release(true);
        if (this.f6398a.mOnVideoEventListener != null) {
            this.f6398a.mOnVideoEventListener.onVideoEvent(this.f6398a.mViewTag, 3);
        }
    }
}
