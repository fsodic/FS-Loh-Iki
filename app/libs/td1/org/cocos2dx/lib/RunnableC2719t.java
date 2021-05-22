package org.cocos2dx.lib;

/* renamed from: org.cocos2dx.lib.t  reason: case insensitive filesystem */
class RunnableC2719t implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ int f6414a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ int f6415b;

    RunnableC2719t(int i, int i2) {
        this.f6414a = i;
        this.f6415b = i2;
    }

    public void run() {
        Cocos2dxEditBox cocos2dxEditBox = (Cocos2dxEditBox) Cocos2dxEditBoxHelper.mEditBoxArray.get(this.f6414a);
        if (cocos2dxEditBox != null) {
            cocos2dxEditBox.setReturnType(this.f6415b);
        }
    }
}
