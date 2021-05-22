package com.google.android.gms.ads.internal;

import android.view.MotionEvent;
import android.view.View;

/* access modifiers changed from: package-private */
public final class n implements View.OnTouchListener {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ l f1092a;

    n(l lVar) {
        this.f1092a = lVar;
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        if (this.f1092a.h == null) {
            return false;
        }
        this.f1092a.h.a(motionEvent);
        return false;
    }
}
