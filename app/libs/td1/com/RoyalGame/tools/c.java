package com.RoyalGame.tools;

import com.google.android.gms.ads.e;
import com.google.android.gms.ads.k;

class c implements Runnable {
    c() {
    }

    public void run() {
        System.out.println("prepare ad");
        if (utils.interstitial == null) {
            k unused = utils.interstitial = new k(utils.instance);
            utils.interstitial.a(config.interstitial_id);
        }
        if (!utils.interstitial.b()) {
            utils.interstitial.a(new e.a().a());
        }
    }
}
