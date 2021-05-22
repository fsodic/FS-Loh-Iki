package org.cocos2dx.lib;

/* access modifiers changed from: package-private */
public class V implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ String f6340a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ Cocos2dxGLSurfaceView f6341b;

    V(Cocos2dxGLSurfaceView cocos2dxGLSurfaceView, String str) {
        this.f6341b = cocos2dxGLSurfaceView;
        this.f6340a = str;
    }

    public void run() {
        this.f6341b.mCocos2dxRenderer.handleInsertText(this.f6340a);
    }
}
