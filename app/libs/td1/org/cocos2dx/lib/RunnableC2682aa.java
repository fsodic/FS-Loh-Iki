package org.cocos2dx.lib;

/* access modifiers changed from: package-private */
/* renamed from: org.cocos2dx.lib.aa  reason: case insensitive filesystem */
public class RunnableC2682aa implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ Cocos2dxGLSurfaceView f6357a;

    RunnableC2682aa(Cocos2dxGLSurfaceView cocos2dxGLSurfaceView) {
        this.f6357a = cocos2dxGLSurfaceView;
    }

    public void run() {
        this.f6357a.mCocos2dxRenderer.handleOnPause();
    }
}
