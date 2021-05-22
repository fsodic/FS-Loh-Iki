package org.cocos2dx.lib;

import java.util.concurrent.CountDownLatch;

class Ya implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private CountDownLatch f6351a;

    /* renamed from: b  reason: collision with root package name */
    private boolean[] f6352b;

    /* renamed from: c  reason: collision with root package name */
    private final int f6353c;
    private final String d;

    Ya(CountDownLatch countDownLatch, boolean[] zArr, int i, String str) {
        this.f6351a = countDownLatch;
        this.f6352b = zArr;
        this.f6353c = i;
        this.d = str;
    }

    public void run() {
        this.f6352b[0] = Cocos2dxWebViewHelper._shouldStartLoading(this.f6353c, this.d);
        this.f6351a.countDown();
    }
}
