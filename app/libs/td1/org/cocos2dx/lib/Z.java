package org.cocos2dx.lib;

/* access modifiers changed from: package-private */
public class Z implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ Cocos2dxGLSurfaceView f6354a;

    Z(Cocos2dxGLSurfaceView cocos2dxGLSurfaceView) {
        this.f6354a = cocos2dxGLSurfaceView;
    }

    public void run() {
        this.f6354a.mCocos2dxRenderer.handleOnResume();
    }
}
