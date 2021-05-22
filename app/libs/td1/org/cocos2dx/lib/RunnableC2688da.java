package org.cocos2dx.lib;

/* renamed from: org.cocos2dx.lib.da  reason: case insensitive filesystem */
class RunnableC2688da implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ int[] f6367a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ float[] f6368b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ float[] f6369c;
    final /* synthetic */ Cocos2dxGLSurfaceView d;

    RunnableC2688da(Cocos2dxGLSurfaceView cocos2dxGLSurfaceView, int[] iArr, float[] fArr, float[] fArr2) {
        this.d = cocos2dxGLSurfaceView;
        this.f6367a = iArr;
        this.f6368b = fArr;
        this.f6369c = fArr2;
    }

    public void run() {
        this.d.mCocos2dxRenderer.handleActionMove(this.f6367a, this.f6368b, this.f6369c);
    }
}
