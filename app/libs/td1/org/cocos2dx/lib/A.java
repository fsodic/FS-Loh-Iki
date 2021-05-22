package org.cocos2dx.lib;

import android.widget.FrameLayout;

/* access modifiers changed from: package-private */
public class A implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ float f6247a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ int f6248b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ int f6249c;
    final /* synthetic */ int d;
    final /* synthetic */ int e;
    final /* synthetic */ int f;

    A(float f2, int i, int i2, int i3, int i4, int i5) {
        this.f6247a = f2;
        this.f6248b = i;
        this.f6249c = i2;
        this.d = i3;
        this.e = i4;
        this.f = i5;
    }

    public void run() {
        Cocos2dxEditBox cocos2dxEditBox = new Cocos2dxEditBox(Cocos2dxEditBoxHelper.mCocos2dxActivity);
        cocos2dxEditBox.setFocusable(true);
        cocos2dxEditBox.setFocusableInTouchMode(true);
        cocos2dxEditBox.setInputFlag(5);
        cocos2dxEditBox.setInputMode(6);
        cocos2dxEditBox.setReturnType(0);
        cocos2dxEditBox.setHintTextColor(-7829368);
        cocos2dxEditBox.setVisibility(8);
        cocos2dxEditBox.setBackgroundColor(0);
        cocos2dxEditBox.setTextColor(-1);
        cocos2dxEditBox.setSingleLine();
        cocos2dxEditBox.setOpenGLViewScaleX(this.f6247a);
        cocos2dxEditBox.setPadding(Cocos2dxEditBoxHelper.getPadding(this.f6247a), 0, 0, 0);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.leftMargin = this.f6248b;
        layoutParams.topMargin = this.f6249c;
        layoutParams.width = this.d;
        layoutParams.height = this.e;
        layoutParams.gravity = 51;
        Cocos2dxEditBoxHelper.mFrameLayout.addView(cocos2dxEditBox, layoutParams);
        cocos2dxEditBox.setTag(false);
        cocos2dxEditBox.addTextChangedListener(new C2707n(this, cocos2dxEditBox));
        cocos2dxEditBox.setOnFocusChangeListener(new View$OnFocusChangeListenerC2713q(this, cocos2dxEditBox));
        cocos2dxEditBox.setOnKeyListener(new View$OnKeyListenerC2715r(this, cocos2dxEditBox));
        cocos2dxEditBox.setOnEditorActionListener(new C2717s(this, cocos2dxEditBox));
        Cocos2dxEditBoxHelper.mEditBoxArray.put(this.f, cocos2dxEditBox);
    }
}
