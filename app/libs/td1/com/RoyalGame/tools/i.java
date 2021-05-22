package com.RoyalGame.tools;

import com.google.android.gms.games.b;

class i implements Runnable {
    i() {
    }

    public void run() {
        if (utils.mHelper.isSignedIn()) {
            utils.instance.startActivityForResult(b.j.a(utils.mHelper.getApiClient()), 5001);
        }
    }
}
