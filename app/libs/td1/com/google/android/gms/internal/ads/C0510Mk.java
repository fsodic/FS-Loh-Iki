package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.app.Activity;
import android.graphics.Rect;
import android.text.TextUtils;
import android.view.DisplayCutout;
import android.view.View;
import android.view.Window;
import android.view.WindowInsets;
import android.view.WindowManager;
import com.google.android.gms.ads.internal.q;
import java.util.Locale;
import org.cocos2dx.lib.BuildConfig;

@TargetApi(28)
/* renamed from: com.google.android.gms.internal.ads.Mk  reason: case insensitive filesystem */
public final class C0510Mk extends C0432Jk {
    static /* synthetic */ WindowInsets a(Activity activity, View view, WindowInsets windowInsets) {
        if (q.g().i().i() == null) {
            DisplayCutout displayCutout = windowInsets.getDisplayCutout();
            String str = BuildConfig.FLAVOR;
            if (displayCutout != null) {
                AbstractC1901ok i = q.g().i();
                for (Rect rect : displayCutout.getBoundingRects()) {
                    String format = String.format(Locale.US, "%d,%d,%d,%d", Integer.valueOf(rect.left), Integer.valueOf(rect.top), Integer.valueOf(rect.right), Integer.valueOf(rect.bottom));
                    if (!TextUtils.isEmpty(str)) {
                        str = String.valueOf(str).concat("|");
                    }
                    String valueOf = String.valueOf(str);
                    String valueOf2 = String.valueOf(format);
                    str = valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf);
                }
                i.b(str);
            } else {
                q.g().i().b(str);
            }
        }
        a(false, activity);
        return view.onApplyWindowInsets(windowInsets);
    }

    private static void a(boolean z, Activity activity) {
        Window window = activity.getWindow();
        WindowManager.LayoutParams attributes = window.getAttributes();
        int i = attributes.layoutInDisplayCutoutMode;
        int i2 = z ? 1 : 2;
        if (i2 != i) {
            attributes.layoutInDisplayCutoutMode = i2;
            window.setAttributes(attributes);
        }
    }

    @Override // com.google.android.gms.internal.ads.C0224Bk
    public final void a(Activity activity) {
        if (((Boolean) C2392voa.e().a(C2474x.Fa)).booleanValue() && q.g().i().i() == null && !activity.isInMultiWindowMode()) {
            a(true, activity);
            activity.getWindow().getDecorView().setOnApplyWindowInsetsListener(new View$OnApplyWindowInsetsListenerC0484Lk(this, activity));
        }
    }
}
