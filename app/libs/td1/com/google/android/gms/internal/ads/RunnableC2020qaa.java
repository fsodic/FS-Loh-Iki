package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.view.View;

/* renamed from: com.google.android.gms.internal.ads.qaa  reason: case insensitive filesystem */
final class RunnableC2020qaa implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ Context f5325a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ String f5326b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ View f5327c;
    private final /* synthetic */ Activity d;

    RunnableC2020qaa(C1810nY nYVar, Context context, String str, View view, Activity activity) {
        this.f5325a = context;
        this.f5326b = str;
        this.f5327c = view;
        this.d = activity;
    }

    public final void run() {
        try {
            C1810nY.u.a(this.f5325a, this.f5326b, this.f5327c, this.d);
        } catch (Exception e) {
            C1810nY.w.a(2021, -1, e);
        }
    }
}
