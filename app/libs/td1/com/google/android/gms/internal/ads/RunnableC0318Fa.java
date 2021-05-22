package com.google.android.gms.internal.ads;

/* access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.ads.Fa  reason: case insensitive filesystem */
public final class RunnableC0318Fa implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ String f1965a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ long f1966b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ AbstractC0959b f1967c;

    RunnableC0318Fa(AbstractC0959b bVar, String str, long j) {
        this.f1967c = bVar;
        this.f1965a = str;
        this.f1966b = j;
    }

    public final void run() {
        this.f1967c.f3859a.a(this.f1965a, this.f1966b);
        this.f1967c.f3859a.a(this.f1967c.toString());
    }
}
