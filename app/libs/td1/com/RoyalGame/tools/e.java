package com.RoyalGame.tools;

import com.google.android.gms.ads.h;

/* access modifiers changed from: package-private */
public class e implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ boolean f986a;

    e(boolean z) {
        this.f986a = z;
    }

    public void run() {
        int i;
        h hVar;
        boolean z = this.f986a;
        utils.needShowingAd = z;
        if (utils.receiveAd) {
            if (z) {
                if (utils.adView.getVisibility() != 0) {
                    hVar = utils.adView;
                    i = 0;
                } else {
                    return;
                }
            } else if (utils.adView.getVisibility() == 0) {
                hVar = utils.adView;
                i = 8;
            } else {
                return;
            }
            hVar.setVisibility(i);
        }
    }
}
