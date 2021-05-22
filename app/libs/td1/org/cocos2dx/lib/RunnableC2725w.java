package org.cocos2dx.lib;

/* renamed from: org.cocos2dx.lib.w  reason: case insensitive filesystem */
class RunnableC2725w implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ int f6427a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ int f6428b;

    RunnableC2725w(int i, int i2) {
        this.f6427a = i;
        this.f6428b = i2;
    }

    public void run() {
        Cocos2dxEditBox cocos2dxEditBox = (Cocos2dxEditBox) Cocos2dxEditBoxHelper.mEditBoxArray.get(this.f6427a);
        if (cocos2dxEditBox != null) {
            cocos2dxEditBox.setInputFlag(this.f6428b);
        }
    }
}
