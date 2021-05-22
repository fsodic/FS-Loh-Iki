package com.google.android.gms.internal.ads;

import java.util.List;

/* access modifiers changed from: package-private */
public final /* synthetic */ class VE implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final PE f3316a;

    /* renamed from: b  reason: collision with root package name */
    private final SR f3317b;

    /* renamed from: c  reason: collision with root package name */
    private final AbstractC1267fd f3318c;
    private final List d;
    private final String e;

    VE(PE pe, SR sr, AbstractC1267fd fdVar, List list, String str) {
        this.f3316a = pe;
        this.f3317b = sr;
        this.f3318c = fdVar;
        this.d = list;
        this.e = str;
    }

    public final void run() {
        this.f3316a.a(this.f3317b, this.f3318c, this.d, this.e);
    }
}
