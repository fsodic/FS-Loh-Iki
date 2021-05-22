package org.cocos2dx.lib;

class G implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ int f6281a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ int f6282b;

    G(int i, int i2) {
        this.f6281a = i;
        this.f6282b = i2;
    }

    public void run() {
        Cocos2dxEditBox cocos2dxEditBox = (Cocos2dxEditBox) Cocos2dxEditBoxHelper.mEditBoxArray.get(this.f6281a);
        if (cocos2dxEditBox != null) {
            cocos2dxEditBox.setMaxLength(this.f6282b);
        }
    }
}
