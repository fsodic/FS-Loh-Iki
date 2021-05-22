package org.cocos2dx.lib;

/* renamed from: org.cocos2dx.lib.u  reason: case insensitive filesystem */
class RunnableC2721u implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ int f6418a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ int f6419b;

    RunnableC2721u(int i, int i2) {
        this.f6418a = i;
        this.f6419b = i2;
    }

    public void run() {
        Cocos2dxEditBox cocos2dxEditBox = (Cocos2dxEditBox) Cocos2dxEditBoxHelper.mEditBoxArray.get(this.f6418a);
        if (cocos2dxEditBox != null) {
            cocos2dxEditBox.setTextHorizontalAlignment(this.f6419b);
        }
    }
}
