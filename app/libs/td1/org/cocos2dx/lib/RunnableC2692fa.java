package org.cocos2dx.lib;

/* renamed from: org.cocos2dx.lib.fa  reason: case insensitive filesystem */
class RunnableC2692fa implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ int f6374a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ float f6375b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ float f6376c;
    final /* synthetic */ Cocos2dxGLSurfaceView d;

    RunnableC2692fa(Cocos2dxGLSurfaceView cocos2dxGLSurfaceView, int i, float f, float f2) {
        this.d = cocos2dxGLSurfaceView;
        this.f6374a = i;
        this.f6375b = f;
        this.f6376c = f2;
    }

    public void run() {
        this.d.mCocos2dxRenderer.handleActionUp(this.f6374a, this.f6375b, this.f6376c);
    }
}
