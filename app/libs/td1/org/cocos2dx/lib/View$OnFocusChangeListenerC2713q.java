package org.cocos2dx.lib;

import android.util.Log;
import android.view.View;

/* renamed from: org.cocos2dx.lib.q  reason: case insensitive filesystem */
class View$OnFocusChangeListenerC2713q implements View.OnFocusChangeListener {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ Cocos2dxEditBox f6404a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ A f6405b;

    View$OnFocusChangeListenerC2713q(A a2, Cocos2dxEditBox cocos2dxEditBox) {
        this.f6405b = a2;
        this.f6404a = cocos2dxEditBox;
    }

    public void onFocusChange(View view, boolean z) {
        String str;
        String str2;
        this.f6404a.setTag(true);
        this.f6404a.setChangedTextProgrammatically(false);
        if (z) {
            Cocos2dxEditBoxHelper.mCocos2dxActivity.runOnGLThread(new RunnableC2709o(this));
            Cocos2dxEditBox cocos2dxEditBox = this.f6404a;
            cocos2dxEditBox.setSelection(cocos2dxEditBox.getText().length());
            Cocos2dxEditBoxHelper.mFrameLayout.setEnableForceDoLayout(true);
            Cocos2dxEditBoxHelper.mCocos2dxActivity.getGLSurfaceView().setSoftKeyboardShown(true);
            str2 = Cocos2dxEditBoxHelper.TAG;
            str = "edit box get focus";
        } else {
            this.f6404a.setVisibility(8);
            Cocos2dxEditBoxHelper.mCocos2dxActivity.runOnGLThread(new RunnableC2711p(this, new String(this.f6404a.getText().toString())));
            Cocos2dxEditBoxHelper.mCocos2dxActivity.hideVirtualButton();
            Cocos2dxEditBoxHelper.mFrameLayout.setEnableForceDoLayout(false);
            str2 = Cocos2dxEditBoxHelper.TAG;
            str = "edit box lose focus";
        }
        Log.d(str2, str);
    }
}
