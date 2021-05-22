package com.google.android.gms.ads.internal.overlay;

import android.content.Context;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.google.android.gms.internal.ads.AbstractC1564jo;

public final class i {

    /* renamed from: a  reason: collision with root package name */
    public final int f1107a;

    /* renamed from: b  reason: collision with root package name */
    public final ViewGroup.LayoutParams f1108b;

    /* renamed from: c  reason: collision with root package name */
    public final ViewGroup f1109c;
    public final Context d;

    public i(AbstractC1564jo joVar) {
        this.f1108b = joVar.getLayoutParams();
        ViewParent parent = joVar.getParent();
        this.d = joVar.u();
        if (parent == null || !(parent instanceof ViewGroup)) {
            throw new g("Could not get the parent of the WebView for an overlay.");
        }
        this.f1109c = (ViewGroup) parent;
        this.f1107a = this.f1109c.indexOfChild(joVar.getView());
        this.f1109c.removeView(joVar.getView());
        joVar.d(true);
    }
}
