package com.google.android.gms.ads.internal.overlay;

import android.content.Context;
import android.view.MotionEvent;
import android.widget.RelativeLayout;
import com.google.android.gms.internal.ads.C0536Nk;

/* access modifiers changed from: package-private */
public final class j extends RelativeLayout {

    /* renamed from: a  reason: collision with root package name */
    private C0536Nk f1110a;

    /* renamed from: b  reason: collision with root package name */
    boolean f1111b;

    public j(Context context, String str, String str2) {
        super(context);
        this.f1110a = new C0536Nk(context, str);
        this.f1110a.b(str2);
    }

    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.f1111b) {
            return false;
        }
        this.f1110a.a(motionEvent);
        return false;
    }
}
