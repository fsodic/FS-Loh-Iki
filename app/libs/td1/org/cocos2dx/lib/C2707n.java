package org.cocos2dx.lib;

import android.text.Editable;
import android.text.TextWatcher;

/* renamed from: org.cocos2dx.lib.n  reason: case insensitive filesystem */
class C2707n implements TextWatcher {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ Cocos2dxEditBox f6396a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ A f6397b;

    C2707n(A a2, Cocos2dxEditBox cocos2dxEditBox) {
        this.f6397b = a2;
        this.f6396a = cocos2dxEditBox;
    }

    public void afterTextChanged(Editable editable) {
        if (!this.f6396a.getChangedTextProgrammatically().booleanValue() && ((Boolean) this.f6396a.getTag()).booleanValue()) {
            Cocos2dxEditBoxHelper.access$000().runOnGLThread(new RunnableC2705m(this, editable));
        }
        this.f6396a.setChangedTextProgrammatically(false);
    }

    public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }
}
