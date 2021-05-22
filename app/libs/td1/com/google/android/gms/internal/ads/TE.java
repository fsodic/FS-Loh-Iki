package com.google.android.gms.internal.ads;

/* access modifiers changed from: package-private */
public final /* synthetic */ class TE implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final PE f3152a;

    /* renamed from: b  reason: collision with root package name */
    private final Object f3153b;

    /* renamed from: c  reason: collision with root package name */
    private final C1423hm f3154c;
    private final String d;
    private final long e;

    TE(PE pe, Object obj, C1423hm hmVar, String str, long j) {
        this.f3152a = pe;
        this.f3153b = obj;
        this.f3154c = hmVar;
        this.d = str;
        this.e = j;
    }

    public final void run() {
        this.f3152a.a(this.f3153b, this.f3154c, this.d, this.e);
    }
}
