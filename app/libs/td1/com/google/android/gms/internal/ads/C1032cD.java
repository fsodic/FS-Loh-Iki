package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import com.google.android.gms.common.util.o;

@TargetApi(19)
/* renamed from: com.google.android.gms.internal.ads.cD  reason: case insensitive filesystem */
public final class C1032cD {

    /* renamed from: a  reason: collision with root package name */
    private Context f3968a;

    /* renamed from: b  reason: collision with root package name */
    private PopupWindow f3969b;

    private static PopupWindow b(Context context, View view) {
        Window window = context instanceof Activity ? ((Activity) context).getWindow() : null;
        if (window == null || window.getDecorView() == null || ((Activity) context).isDestroyed()) {
            return null;
        }
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        frameLayout.addView(view, -1, -1);
        PopupWindow popupWindow = new PopupWindow((View) frameLayout, 1, 1, false);
        popupWindow.setOutsideTouchable(true);
        popupWindow.setClippingEnabled(false);
        C0745Vl.a("Displaying the 1x1 popup off the screen.");
        try {
            popupWindow.showAtLocation(window.getDecorView(), 0, -1, -1);
            return popupWindow;
        } catch (Exception unused) {
            return null;
        }
    }

    public final void a() {
        Context context = this.f3968a;
        if (context != null && this.f3969b != null) {
            if ((!(context instanceof Activity) || !((Activity) context).isDestroyed()) && this.f3969b.isShowing()) {
                this.f3969b.dismiss();
            }
            this.f3968a = null;
            this.f3969b = null;
        }
    }

    public final void a(Context context, View view) {
        if (o.f() && !o.h()) {
            this.f3969b = b(context, view);
            if (this.f3969b == null) {
                context = null;
            }
            this.f3968a = context;
        }
    }
}
