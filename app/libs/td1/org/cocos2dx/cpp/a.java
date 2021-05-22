package org.cocos2dx.cpp;

import android.widget.Toast;
import com.RoyalGame.tools.GameHelper;
import com.RoyalGame.tools.utils;
import com.google.android.gms.games.b;
import java.io.PrintStream;
import java.util.Map;

class a implements GameHelper.GameHelperListener {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ AppActivity f6239a;

    a(AppActivity appActivity) {
        this.f6239a = appActivity;
    }

    @Override // com.RoyalGame.tools.GameHelper.GameHelperListener
    public void onSignInFailed() {
    }

    @Override // com.RoyalGame.tools.GameHelper.GameHelperListener
    public void onSignInSucceeded() {
        for (Map.Entry<String, Integer> entry : utils.hashmap.entrySet()) {
            PrintStream printStream = System.out;
            printStream.println(entry.getKey() + "/" + entry.getValue());
            b.m.a(this.f6239a.mHelper.getApiClient(), entry.getKey(), (long) entry.getValue().intValue());
        }
        if (utils.isShowLead) {
            try {
                AppActivity.instance.startActivityForResult(b.m.a(this.f6239a.mHelper.getApiClient()), 5001);
            } catch (Exception e) {
                e.printStackTrace();
                Toast makeText = Toast.makeText(AppActivity.instance, "Have you install Google Play Games?", 1);
                makeText.setGravity(17, 0, 350);
                makeText.show();
            }
        }
        utils.isShowLead = false;
    }
}
