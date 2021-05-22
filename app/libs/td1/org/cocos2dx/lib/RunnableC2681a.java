package org.cocos2dx.lib;

/* access modifiers changed from: package-private */
/* renamed from: org.cocos2dx.lib.a  reason: case insensitive filesystem */
public class RunnableC2681a implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ boolean f6355a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ Cocos2dxActivity f6356b;

    RunnableC2681a(Cocos2dxActivity cocos2dxActivity, boolean z) {
        this.f6356b = cocos2dxActivity;
        this.f6355a = z;
    }

    public void run() {
        this.f6356b.mGLSurfaceView.setKeepScreenOn(this.f6355a);
    }
}
