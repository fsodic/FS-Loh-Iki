package org.cocos2dx.lib;

import android.content.DialogInterface;

/* renamed from: org.cocos2dx.lib.oa  reason: case insensitive filesystem */
class DialogInterface$OnClickListenerC2710oa implements DialogInterface.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ C2712pa f6400a;

    DialogInterface$OnClickListenerC2710oa(C2712pa paVar) {
        this.f6400a = paVar;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        if (this.f6400a.f6403a.mOnVideoEventListener != null) {
            this.f6400a.f6403a.mOnVideoEventListener.onVideoEvent(this.f6400a.f6403a.mViewTag, 3);
        }
    }
}
