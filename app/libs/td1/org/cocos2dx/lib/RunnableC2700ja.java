package org.cocos2dx.lib;

/* renamed from: org.cocos2dx.lib.ja  reason: case insensitive filesystem */
class RunnableC2700ja implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ byte[] f6386a;

    RunnableC2700ja(byte[] bArr) {
        this.f6386a = bArr;
    }

    public void run() {
        Cocos2dxHelper.nativeSetEditTextDialogResult(this.f6386a);
    }
}
