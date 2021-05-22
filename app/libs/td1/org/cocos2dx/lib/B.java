package org.cocos2dx.lib;

import android.util.Log;

class B implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ int f6251a;

    B(int i) {
        this.f6251a = i;
    }

    public void run() {
        Cocos2dxEditBox cocos2dxEditBox = (Cocos2dxEditBox) Cocos2dxEditBoxHelper.mEditBoxArray.get(this.f6251a);
        if (cocos2dxEditBox != null) {
            Cocos2dxEditBoxHelper.mEditBoxArray.remove(this.f6251a);
            Cocos2dxEditBoxHelper.mFrameLayout.removeView(cocos2dxEditBox);
            Log.e(Cocos2dxEditBoxHelper.TAG, "remove EditBox");
        }
    }
}
