package org.cocos2dx.lib;

/* renamed from: org.cocos2dx.lib.x  reason: case insensitive filesystem */
class RunnableC2727x implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ int f6432a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ int f6433b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ int f6434c;
    final /* synthetic */ int d;
    final /* synthetic */ int e;

    RunnableC2727x(int i, int i2, int i3, int i4, int i5) {
        this.f6432a = i;
        this.f6433b = i2;
        this.f6434c = i3;
        this.d = i4;
        this.e = i5;
    }

    public void run() {
        Cocos2dxEditBox cocos2dxEditBox = (Cocos2dxEditBox) Cocos2dxEditBoxHelper.mEditBoxArray.get(this.f6432a);
        if (cocos2dxEditBox != null) {
            cocos2dxEditBox.setEditBoxViewRect(this.f6433b, this.f6434c, this.d, this.e);
        }
    }
}
