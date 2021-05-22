package org.cocos2dx.lib;

/* renamed from: org.cocos2dx.lib.v  reason: case insensitive filesystem */
class RunnableC2723v implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ int f6422a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ int f6423b;

    RunnableC2723v(int i, int i2) {
        this.f6422a = i;
        this.f6423b = i2;
    }

    public void run() {
        Cocos2dxEditBox cocos2dxEditBox = (Cocos2dxEditBox) Cocos2dxEditBoxHelper.mEditBoxArray.get(this.f6422a);
        if (cocos2dxEditBox != null) {
            cocos2dxEditBox.setInputMode(this.f6423b);
        }
    }
}
