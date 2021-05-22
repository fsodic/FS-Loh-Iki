package org.cocos2dx.lib;

import android.graphics.Typeface;
import android.util.Log;

class C implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ int f6253a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ String f6254b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ float f6255c;

    C(int i, String str, float f) {
        this.f6253a = i;
        this.f6254b = str;
        this.f6255c = f;
    }

    public void run() {
        Typeface typeface;
        Cocos2dxEditBox cocos2dxEditBox = (Cocos2dxEditBox) Cocos2dxEditBoxHelper.mEditBoxArray.get(this.f6253a);
        if (cocos2dxEditBox != null) {
            if (!this.f6254b.isEmpty()) {
                if (this.f6254b.endsWith(".ttf")) {
                    try {
                        Cocos2dxActivity unused = Cocos2dxEditBoxHelper.mCocos2dxActivity;
                        typeface = Cocos2dxTypefaces.get(Cocos2dxActivity.getContext(), this.f6254b);
                    } catch (Exception unused2) {
                        Log.e("Cocos2dxEditBoxHelper", "error to create ttf type face: " + this.f6254b);
                    }
                }
                typeface = Typeface.create(this.f6254b, 0);
            } else {
                typeface = Typeface.DEFAULT;
            }
            float f = this.f6255c;
            if (f >= 0.0f) {
                cocos2dxEditBox.setTextSize(0, f);
            }
            cocos2dxEditBox.setTypeface(typeface);
        }
    }
}
