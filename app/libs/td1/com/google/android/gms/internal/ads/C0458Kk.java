package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.app.Activity;
import android.content.res.Configuration;
import android.util.DisplayMetrics;
import android.view.WindowManager;
import com.google.android.gms.ads.internal.q;

@TargetApi(24)
/* renamed from: com.google.android.gms.internal.ads.Kk  reason: case insensitive filesystem */
public class C0458Kk extends C0380Hk {
    private static boolean a(int i, int i2, int i3) {
        return Math.abs(i - i2) <= i3;
    }

    @Override // com.google.android.gms.internal.ads.C0224Bk
    public final boolean a(Activity activity, Configuration configuration) {
        if (!((Boolean) C2392voa.e().a(C2474x.Sc)).booleanValue()) {
            return false;
        }
        if (((Boolean) C2392voa.e().a(C2474x.Uc)).booleanValue()) {
            return activity.isInMultiWindowMode();
        }
        C2392voa.a();
        int b2 = C0459Kl.b(activity, configuration.screenHeightDp);
        int b3 = C0459Kl.b(activity, configuration.screenWidthDp);
        q.c();
        DisplayMetrics a2 = C2452wk.a((WindowManager) activity.getApplicationContext().getSystemService("window"));
        int i = a2.heightPixels;
        int i2 = a2.widthPixels;
        int identifier = activity.getResources().getIdentifier("status_bar_height", "dimen", "android");
        int dimensionPixelSize = identifier > 0 ? activity.getResources().getDimensionPixelSize(identifier) : 0;
        double d = (double) activity.getResources().getDisplayMetrics().density;
        Double.isNaN(d);
        int round = ((int) Math.round(d + 0.5d)) * ((Integer) C2392voa.e().a(C2474x.Rc)).intValue();
        return !(a(i, b2 + dimensionPixelSize, round) && a(i2, b3, round));
    }
}
