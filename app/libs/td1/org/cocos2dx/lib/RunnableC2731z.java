package org.cocos2dx.lib;

/* renamed from: org.cocos2dx.lib.z  reason: case insensitive filesystem */
class RunnableC2731z implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ int f6439a;

    RunnableC2731z(int i) {
        this.f6439a = i;
    }

    public void run() {
        Cocos2dxEditBoxHelper.closeKeyboardOnUiThread(this.f6439a);
    }
}
