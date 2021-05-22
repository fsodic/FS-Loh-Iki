package org.cocos2dx.lib;

import android.text.Editable;

/* renamed from: org.cocos2dx.lib.m  reason: case insensitive filesystem */
class RunnableC2705m implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ Editable f6393a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ C2707n f6394b;

    RunnableC2705m(C2707n nVar, Editable editable) {
        this.f6394b = nVar;
        this.f6393a = editable;
    }

    public void run() {
        Cocos2dxEditBoxHelper.__editBoxEditingChanged(this.f6394b.f6397b.f, this.f6393a.toString());
    }
}
