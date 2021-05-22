package org.cocos2dx.lib;

import android.app.AlertDialog;
import android.content.res.Resources;
import android.media.MediaPlayer;
import android.util.Log;

/* access modifiers changed from: package-private */
/* renamed from: org.cocos2dx.lib.pa  reason: case insensitive filesystem */
public class C2712pa implements MediaPlayer.OnErrorListener {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ Cocos2dxVideoView f6403a;

    C2712pa(Cocos2dxVideoView cocos2dxVideoView) {
        this.f6403a = cocos2dxVideoView;
    }

    public boolean onError(MediaPlayer mediaPlayer, int i, int i2) {
        String str = this.f6403a.TAG;
        Log.d(str, "Error: " + i + "," + i2);
        this.f6403a.mCurrentState = -1;
        this.f6403a.mTargetState = -1;
        if ((this.f6403a.mOnErrorListener == null || !this.f6403a.mOnErrorListener.onError(this.f6403a.mMediaPlayer, i, i2)) && this.f6403a.getWindowToken() != null) {
            Resources resources = this.f6403a.mCocos2dxActivity.getResources();
            new AlertDialog.Builder(this.f6403a.mCocos2dxActivity).setTitle(resources.getString(resources.getIdentifier("VideoView_error_title", "string", "android"))).setMessage(resources.getIdentifier(i == 200 ? "VideoView_error_text_invalid_progressive_playback" : "VideoView_error_text_unknown", "string", "android")).setPositiveButton(resources.getString(resources.getIdentifier("VideoView_error_button", "string", "android")), new DialogInterface$OnClickListenerC2710oa(this)).setCancelable(false).show();
        }
        return true;
    }
}
