package org.cocos2dx.lib;

class S implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ int[] f6326a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ float[] f6327b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ float[] f6328c;
    final /* synthetic */ Cocos2dxGLSurfaceView d;

    S(Cocos2dxGLSurfaceView cocos2dxGLSurfaceView, int[] iArr, float[] fArr, float[] fArr2) {
        this.d = cocos2dxGLSurfaceView;
        this.f6326a = iArr;
        this.f6327b = fArr;
        this.f6328c = fArr2;
    }

    public void run() {
        this.d.mCocos2dxRenderer.handleActionCancel(this.f6326a, this.f6327b, this.f6328c);
    }
}
