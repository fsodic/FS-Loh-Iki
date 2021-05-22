package com.RoyalGame.tools;

import android.widget.Toast;
import com.google.android.gms.games.b;

class j implements Runnable {
    j() {
    }

    public void run() {
        if (utils.mHelper.isSignedIn()) {
            try {
                utils.instance.startActivityForResult(b.m.a(utils.mHelper.getApiClient()), 5001);
            } catch (Exception e) {
                e.printStackTrace();
                Toast makeText = Toast.makeText(utils.instance, "Have you install Google Play Games?", 1);
                makeText.setGravity(17, 0, 350);
                makeText.show();
            }
        } else {
            utils.isShowLead = true;
            utils.mHelper.beginUserInitiatedSignIn();
        }
    }
}
