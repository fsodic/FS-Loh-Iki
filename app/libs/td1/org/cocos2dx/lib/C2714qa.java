package org.cocos2dx.lib;

import android.media.MediaPlayer;

/* access modifiers changed from: package-private */
/* renamed from: org.cocos2dx.lib.qa  reason: case insensitive filesystem */
public class C2714qa implements MediaPlayer.OnBufferingUpdateListener {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ Cocos2dxVideoView f6406a;

    C2714qa(Cocos2dxVideoView cocos2dxVideoView) {
        this.f6406a = cocos2dxVideoView;
    }

    public void onBufferingUpdate(MediaPlayer mediaPlayer, int i) {
        this.f6406a.mCurrentBufferPercentage = i;
    }
}
