package org.cocos2dx.lib;

/* renamed from: org.cocos2dx.lib.ea  reason: case insensitive filesystem */
class RunnableC2690ea implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ int[] f6371a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ float[] f6372b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ float[] f6373c;
    final /* synthetic */ Cocos2dxGLSurfaceView d;

    RunnableC2690ea(Cocos2dxGLSurfaceView cocos2dxGLSurfaceView, int[] iArr, float[] fArr, float[] fArr2) {
        this.d = cocos2dxGLSurfaceView;
        this.f6371a = iArr;
        this.f6372b = fArr;
        this.f6373c = fArr2;
    }

    public void run() {
        this.d.mCocos2dxRenderer.handleActionMove(this.f6371a, this.f6372b, this.f6373c);
    }
}
