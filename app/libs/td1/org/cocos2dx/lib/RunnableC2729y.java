package org.cocos2dx.lib;

/* renamed from: org.cocos2dx.lib.y  reason: case insensitive filesystem */
class RunnableC2729y implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ int f6437a;

    RunnableC2729y(int i) {
        this.f6437a = i;
    }

    public void run() {
        Cocos2dxEditBoxHelper.openKeyboardOnUiThread(this.f6437a);
    }
}
