package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.google.android.gms.ads.internal.q;

/* access modifiers changed from: package-private */
public final /* synthetic */ class YE implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final PE f3539a;

    /* renamed from: b  reason: collision with root package name */
    private final C1423hm f3540b;

    YE(PE pe, C1423hm hmVar) {
        this.f3539a = pe;
        this.f3540b = hmVar;
    }

    public final void run() {
        C1423hm hmVar = this.f3540b;
        String c2 = q.g().i().m().c();
        if (!TextUtils.isEmpty(c2)) {
            hmVar.b(c2);
        } else {
            hmVar.a(new Exception());
        }
    }
}
