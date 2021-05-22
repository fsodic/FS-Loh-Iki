package com.google.android.gms.internal.ads;

import android.content.Context;

/* access modifiers changed from: package-private */
public final /* synthetic */ class Lpa implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final Ipa f2541a;

    /* renamed from: b  reason: collision with root package name */
    private final Context f2542b;

    Lpa(Ipa ipa, Context context) {
        this.f2541a = ipa;
        this.f2542b = context;
    }

    public final void run() {
        this.f2541a.a(this.f2542b);
    }
}
