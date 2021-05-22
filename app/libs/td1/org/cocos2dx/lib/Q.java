package org.cocos2dx.lib;

class Q implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ int[] f6320a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ float[] f6321b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ float[] f6322c;
    final /* synthetic */ Cocos2dxGLSurfaceView d;

    Q(Cocos2dxGLSurfaceView cocos2dxGLSurfaceView, int[] iArr, float[] fArr, float[] fArr2) {
        this.d = cocos2dxGLSurfaceView;
        this.f6320a = iArr;
        this.f6321b = fArr;
        this.f6322c = fArr2;
    }

    public void run() {
        this.d.mCocos2dxRenderer.handleActionCancel(this.f6320a, this.f6321b, this.f6322c);
    }
}
