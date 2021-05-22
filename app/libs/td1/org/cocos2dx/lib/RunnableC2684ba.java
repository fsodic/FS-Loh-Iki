package org.cocos2dx.lib;

/* renamed from: org.cocos2dx.lib.ba  reason: case insensitive filesystem */
class RunnableC2684ba implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ int f6359a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ float f6360b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ float f6361c;
    final /* synthetic */ Cocos2dxGLSurfaceView d;

    RunnableC2684ba(Cocos2dxGLSurfaceView cocos2dxGLSurfaceView, int i, float f, float f2) {
        this.d = cocos2dxGLSurfaceView;
        this.f6359a = i;
        this.f6360b = f;
        this.f6361c = f2;
    }

    public void run() {
        this.d.mCocos2dxRenderer.handleActionDown(this.f6359a, this.f6360b, this.f6361c);
    }
}
