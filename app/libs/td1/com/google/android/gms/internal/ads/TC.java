package com.google.android.gms.internal.ads;

import android.view.MotionEvent;
import android.view.View;

/* access modifiers changed from: package-private */
public final /* synthetic */ class TC implements View.OnTouchListener {

    /* renamed from: a  reason: collision with root package name */
    private final OC f3150a;

    TC(OC oc) {
        this.f3150a = oc;
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        return this.f3150a.a(view, motionEvent);
    }
}
