package com.RoyalGame.tools;

class a implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ GameHelper f983a;

    a(GameHelper gameHelper) {
        this.f983a = gameHelper;
    }

    public void run() {
        this.f983a.notifyListener(false);
    }
}
