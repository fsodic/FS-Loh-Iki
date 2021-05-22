package org.cocos2dx.lib;

/* access modifiers changed from: package-private */
public class W implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ Cocos2dxGLSurfaceView f6345a;

    W(Cocos2dxGLSurfaceView cocos2dxGLSurfaceView) {
        this.f6345a = cocos2dxGLSurfaceView;
    }

    public void run() {
        this.f6345a.mCocos2dxRenderer.handleDeleteBackward();
    }
}
