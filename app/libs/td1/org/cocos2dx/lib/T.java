package org.cocos2dx.lib;

class T implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ int f6331a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ Cocos2dxGLSurfaceView f6332b;

    T(Cocos2dxGLSurfaceView cocos2dxGLSurfaceView, int i) {
        this.f6332b = cocos2dxGLSurfaceView;
        this.f6331a = i;
    }

    public void run() {
        this.f6332b.mCocos2dxRenderer.handleKeyDown(this.f6331a);
    }
}
