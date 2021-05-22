package org.cocos2dx.lib;

import android.graphics.Color;

class D implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ int f6269a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ int f6270b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ int f6271c;
    final /* synthetic */ int d;
    final /* synthetic */ int e;

    D(int i, int i2, int i3, int i4, int i5) {
        this.f6269a = i;
        this.f6270b = i2;
        this.f6271c = i3;
        this.d = i4;
        this.e = i5;
    }

    public void run() {
        Cocos2dxEditBox cocos2dxEditBox = (Cocos2dxEditBox) Cocos2dxEditBoxHelper.mEditBoxArray.get(this.f6269a);
        if (cocos2dxEditBox != null) {
            cocos2dxEditBox.setTextColor(Color.argb(this.f6270b, this.f6271c, this.d, this.e));
        }
    }
}
