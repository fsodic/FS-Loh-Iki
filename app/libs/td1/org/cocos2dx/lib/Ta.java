package org.cocos2dx.lib;

class Ta implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ String f6333a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ int f6334b;

    Ta(String str, int i) {
        this.f6333a = str;
        this.f6334b = i;
    }

    public void run() {
        GameControllerAdapter.access$100(this.f6333a, this.f6334b);
    }
}
