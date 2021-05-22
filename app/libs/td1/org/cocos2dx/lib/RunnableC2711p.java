package org.cocos2dx.lib;

/* renamed from: org.cocos2dx.lib.p  reason: case insensitive filesystem */
class RunnableC2711p implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ String f6401a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ View$OnFocusChangeListenerC2713q f6402b;

    RunnableC2711p(View$OnFocusChangeListenerC2713q qVar, String str) {
        this.f6402b = qVar;
        this.f6401a = str;
    }

    public void run() {
        View$OnFocusChangeListenerC2713q qVar = this.f6402b;
        Cocos2dxEditBoxHelper.__editBoxEditingDidEnd(qVar.f6405b.f, this.f6401a, qVar.f6404a.endAction);
    }
}
