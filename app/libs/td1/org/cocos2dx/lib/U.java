package org.cocos2dx.lib;

class U implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ int f6335a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ Cocos2dxGLSurfaceView f6336b;

    U(Cocos2dxGLSurfaceView cocos2dxGLSurfaceView, int i) {
        this.f6336b = cocos2dxGLSurfaceView;
        this.f6335a = i;
    }

    public void run() {
        this.f6336b.mCocos2dxRenderer.handleKeyUp(this.f6335a);
    }
}
