package org.cocos2dx.lib;

class H implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ int f6285a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ boolean f6286b;

    H(int i, boolean z) {
        this.f6285a = i;
        this.f6286b = z;
    }

    public void run() {
        Cocos2dxEditBox cocos2dxEditBox = (Cocos2dxEditBox) Cocos2dxEditBoxHelper.mEditBoxArray.get(this.f6285a);
        if (cocos2dxEditBox != null) {
            cocos2dxEditBox.setVisibility(this.f6286b ? 0 : 8);
        }
    }
}
