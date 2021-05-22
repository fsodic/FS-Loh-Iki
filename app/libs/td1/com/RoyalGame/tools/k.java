package com.RoyalGame.tools;

import com.google.android.gms.games.b;

class k implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ String f990a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ int f991b;

    k(String str, int i) {
        this.f990a = str;
        this.f991b = i;
    }

    public void run() {
        utils.hashmap.put(this.f990a, Integer.valueOf(this.f991b));
        if (utils.mHelper.isSignedIn()) {
            b.m.a(utils.mHelper.getApiClient(), this.f990a, (long) utils.score);
        }
    }
}
