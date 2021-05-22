package org.cocos2dx.lib;

class Xa implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ ResizeLayout f6347a;

    Xa(ResizeLayout resizeLayout) {
        this.f6347a = resizeLayout;
    }

    public void run() {
        this.f6347a.requestLayout();
        this.f6347a.invalidate();
    }
}
