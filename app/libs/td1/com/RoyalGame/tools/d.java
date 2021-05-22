package com.RoyalGame.tools;

class d implements Runnable {
    d() {
    }

    public void run() {
        System.out.println("show ad..");
        if (utils.interstitial.b()) {
            utils.interstitial.c();
        } else {
            System.out.println("full ad not ready");
        }
    }
}
