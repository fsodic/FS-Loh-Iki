package org.cocos2dx.lib;

class P implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ int f6317a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ float f6318b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ float f6319c;
    final /* synthetic */ Cocos2dxGLSurfaceView d;

    P(Cocos2dxGLSurfaceView cocos2dxGLSurfaceView, int i, float f, float f2) {
        this.d = cocos2dxGLSurfaceView;
        this.f6317a = i;
        this.f6318b = f;
        this.f6319c = f2;
    }

    public void run() {
        this.d.mCocos2dxRenderer.handleActionUp(this.f6317a, this.f6318b, this.f6319c);
    }
}
