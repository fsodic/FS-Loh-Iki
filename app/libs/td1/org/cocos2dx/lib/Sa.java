package org.cocos2dx.lib;

class Sa implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ String f6329a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ int f6330b;

    Sa(String str, int i) {
        this.f6329a = str;
        this.f6330b = i;
    }

    public void run() {
        GameControllerAdapter.access$000(this.f6329a, this.f6330b);
    }
}
