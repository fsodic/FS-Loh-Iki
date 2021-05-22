package org.cocos2dx.lib;

import android.view.KeyEvent;
import android.widget.TextView;

/* renamed from: org.cocos2dx.lib.s  reason: case insensitive filesystem */
class C2717s implements TextView.OnEditorActionListener {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ Cocos2dxEditBox f6410a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ A f6411b;

    C2717s(A a2, Cocos2dxEditBox cocos2dxEditBox) {
        this.f6411b = a2;
        this.f6410a = cocos2dxEditBox;
    }

    public boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
        if (i == 5) {
            this.f6410a.endAction = 1;
            Cocos2dxEditBoxHelper.access$300(this.f6411b.f);
            return true;
        } else if (i != 6 && i != 4 && i != 3 && i != 2) {
            return false;
        } else {
            this.f6410a.endAction = 3;
            Cocos2dxEditBoxHelper.access$300(this.f6411b.f);
            return false;
        }
    }
}
