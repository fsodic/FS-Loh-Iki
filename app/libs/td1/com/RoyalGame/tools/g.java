package com.RoyalGame.tools;

import com.google.android.gms.games.b;

class g implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ String f987a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ int f988b;

    g(String str, int i) {
        this.f987a = str;
        this.f988b = i;
    }

    public void run() {
        if (utils.mHelper.isSignedIn()) {
            b.j.a(utils.mHelper.getApiClient(), this.f987a, this.f988b);
        }
    }
}
