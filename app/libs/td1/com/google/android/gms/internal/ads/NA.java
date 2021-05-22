package com.google.android.gms.internal.ads;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.WindowManager;

/* access modifiers changed from: package-private */
public final /* synthetic */ class NA implements ViewTreeObserver.OnScrollChangedListener {

    /* renamed from: a  reason: collision with root package name */
    private final View f2631a;

    /* renamed from: b  reason: collision with root package name */
    private final AbstractC1564jo f2632b;

    /* renamed from: c  reason: collision with root package name */
    private final String f2633c;
    private final WindowManager.LayoutParams d;
    private final int e;
    private final WindowManager f;

    NA(View view, AbstractC1564jo joVar, String str, WindowManager.LayoutParams layoutParams, int i, WindowManager windowManager) {
        this.f2631a = view;
        this.f2632b = joVar;
        this.f2633c = str;
        this.d = layoutParams;
        this.e = i;
        this.f = windowManager;
    }

    public final void onScrollChanged() {
        View view = this.f2631a;
        AbstractC1564jo joVar = this.f2632b;
        String str = this.f2633c;
        WindowManager.LayoutParams layoutParams = this.d;
        int i = this.e;
        WindowManager windowManager = this.f;
        Rect rect = new Rect();
        if (view.getGlobalVisibleRect(rect) && joVar.getView().getWindowToken() != null) {
            layoutParams.y = (("1".equals(str) || "2".equals(str)) ? rect.bottom : rect.top) - i;
            windowManager.updateViewLayout(joVar.getView(), layoutParams);
        }
    }
}
