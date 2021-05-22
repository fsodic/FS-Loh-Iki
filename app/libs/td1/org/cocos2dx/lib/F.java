package org.cocos2dx.lib;

import android.graphics.Color;

class F implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ int f6277a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ int f6278b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ int f6279c;
    final /* synthetic */ int d;
    final /* synthetic */ int e;

    F(int i, int i2, int i3, int i4, int i5) {
        this.f6277a = i;
        this.f6278b = i2;
        this.f6279c = i3;
        this.d = i4;
        this.e = i5;
    }

    public void run() {
        Cocos2dxEditBox cocos2dxEditBox = (Cocos2dxEditBox) Cocos2dxEditBoxHelper.mEditBoxArray.get(this.f6277a);
        if (cocos2dxEditBox != null) {
            cocos2dxEditBox.setHintTextColor(Color.argb(this.f6278b, this.f6279c, this.d, this.e));
        }
    }
}
