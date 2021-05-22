package org.cocos2dx.lib;

import android.view.KeyEvent;
import android.view.View;

/* renamed from: org.cocos2dx.lib.r  reason: case insensitive filesystem */
class View$OnKeyListenerC2715r implements View.OnKeyListener {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ Cocos2dxEditBox f6407a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ A f6408b;

    View$OnKeyListenerC2715r(A a2, Cocos2dxEditBox cocos2dxEditBox) {
        this.f6408b = a2;
        this.f6407a = cocos2dxEditBox;
    }

    public boolean onKey(View view, int i, KeyEvent keyEvent) {
        if (keyEvent.getAction() != 0 || i != 66 || (this.f6407a.getInputType() & 131072) == 131072) {
            return false;
        }
        Cocos2dxEditBoxHelper.closeKeyboardOnUiThread(this.f6408b.f);
        return true;
    }
}
