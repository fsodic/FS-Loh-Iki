package com.RoyalGame.tools;

import com.google.android.gms.games.b;

class h implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ String f989a;

    h(String str) {
        this.f989a = str;
    }

    public void run() {
        if (utils.mHelper.isSignedIn()) {
            b.j.a(utils.mHelper.getApiClient(), this.f989a);
        }
    }
}
