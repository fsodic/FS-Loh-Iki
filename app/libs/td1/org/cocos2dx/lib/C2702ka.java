package org.cocos2dx.lib;

import org.cocos2dx.lib.Cocos2dxVideoHelper;
import org.cocos2dx.lib.Cocos2dxVideoView;

/* access modifiers changed from: package-private */
/* renamed from: org.cocos2dx.lib.ka  reason: case insensitive filesystem */
public class C2702ka implements Cocos2dxVideoView.OnVideoEventListener {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ Cocos2dxVideoHelper f6390a;

    C2702ka(Cocos2dxVideoHelper cocos2dxVideoHelper) {
        this.f6390a = cocos2dxVideoHelper;
    }

    @Override // org.cocos2dx.lib.Cocos2dxVideoView.OnVideoEventListener
    public void onVideoEvent(int i, int i2) {
        this.f6390a.mActivity.runOnGLThread(new Cocos2dxVideoHelper.a(i, i2));
    }
}
