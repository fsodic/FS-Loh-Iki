package org.cocos2dx.lib;

class I implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ int f6288a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ String f6289b;

    I(int i, String str) {
        this.f6288a = i;
        this.f6289b = str;
    }

    public void run() {
        Cocos2dxEditBox cocos2dxEditBox = (Cocos2dxEditBox) Cocos2dxEditBoxHelper.mEditBoxArray.get(this.f6288a);
        if (cocos2dxEditBox != null) {
            cocos2dxEditBox.setChangedTextProgrammatically(true);
            cocos2dxEditBox.setText(this.f6289b);
            cocos2dxEditBox.setSelection(cocos2dxEditBox.getText().length());
        }
    }
}
