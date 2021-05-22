package org.cocos2dx.lib;

/* renamed from: org.cocos2dx.lib.ca  reason: case insensitive filesystem */
class RunnableC2686ca implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ int f6363a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ float f6364b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ float f6365c;
    final /* synthetic */ Cocos2dxGLSurfaceView d;

    RunnableC2686ca(Cocos2dxGLSurfaceView cocos2dxGLSurfaceView, int i, float f, float f2) {
        this.d = cocos2dxGLSurfaceView;
        this.f6363a = i;
        this.f6364b = f;
        this.f6365c = f2;
    }

    public void run() {
        this.d.mCocos2dxRenderer.handleActionDown(this.f6363a, this.f6364b, this.f6365c);
    }
}
