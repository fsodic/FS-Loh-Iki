package org.cocos2dx.lib;

/* renamed from: org.cocos2dx.lib.o  reason: case insensitive filesystem */
class RunnableC2709o implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ View$OnFocusChangeListenerC2713q f6399a;

    RunnableC2709o(View$OnFocusChangeListenerC2713q qVar) {
        this.f6399a = qVar;
    }

    public void run() {
        View$OnFocusChangeListenerC2713q qVar = this.f6399a;
        qVar.f6404a.endAction = 0;
        Cocos2dxEditBoxHelper.__editBoxEditingDidBegin(qVar.f6405b.f);
    }
}
