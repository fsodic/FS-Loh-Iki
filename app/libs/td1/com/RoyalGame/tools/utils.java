package com.RoyalGame.tools;

import android.app.Activity;
import android.app.Dialog;
import com.google.android.gms.ads.h;
import com.google.android.gms.ads.k;
import java.util.HashMap;
import java.util.Locale;

public class utils {
    private static h adView = null;
    private static Dialog exitDialog = null;
    public static HashMap<String, Integer> hashmap = null;
    public static Activity instance = null;
    private static k interstitial = null;
    public static boolean isShowLead = false;
    public static GameHelper mHelper = null;
    public static boolean needShowingAd = true;
    public static boolean receiveAd = false;
    public static int score;

    static {
        System.loadLibrary("MyGame");
    }

    public static void gameServicesSignIn() {
        instance.runOnUiThread(new f());
    }

    public static void incrementAchievement(String str, int i) {
        instance.runOnUiThread(new g(str, i));
    }

    public static int isSignIn() {
        Locale locale = instance.getResources().getConfiguration().locale;
        return mHelper.isSignedIn() ? 1 : 0;
    }

    public static int isZh() {
        return instance.getResources().getConfiguration().locale.getLanguage().endsWith("zh") ? 1 : 0;
    }

    public static void onReceiveAd() {
        receiveAd = true;
        if (needShowingAd) {
            playAd(true);
        }
    }

    static void playAd(boolean z) {
        instance.runOnUiThread(new e(z));
    }

    public static void prepareFullAd() {
        instance.runOnUiThread(new c());
    }

    public static void reportScore(String str, int i) {
        instance.runOnUiThread(new k(str, i));
    }

    public static void setActivity(Activity activity) {
        instance = activity;
        hashmap = new HashMap<>();
    }

    public static void setAdView(h hVar) {
        adView = hVar;
    }

    public static void setGameHelper(GameHelper gameHelper) {
        mHelper = gameHelper;
    }

    public static void showAchievements() {
        instance.runOnUiThread(new i());
    }

    public static void showFullAd() {
        instance.runOnUiThread(new d());
    }

    public static void showLeaderboards() {
        instance.runOnUiThread(new j());
    }

    public static void unlockAchievement(String str) {
        instance.runOnUiThread(new h(str));
    }
}
