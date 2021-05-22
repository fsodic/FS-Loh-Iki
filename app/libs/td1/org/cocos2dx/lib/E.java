package org.cocos2dx.lib;

class E implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ int f6273a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ String f6274b;

    E(int i, String str) {
        this.f6273a = i;
        this.f6274b = str;
    }

    public void run() {
        Cocos2dxEditBox cocos2dxEditBox = (Cocos2dxEditBox) Cocos2dxEditBoxHelper.mEditBoxArray.get(this.f6273a);
        if (cocos2dxEditBox != null) {
            cocos2dxEditBox.setHint(this.f6274b);
        }
    }
}
