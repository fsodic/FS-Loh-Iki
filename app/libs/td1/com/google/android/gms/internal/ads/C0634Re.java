package com.google.android.gms.internal.ads;

/* access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.ads.Re  reason: case insensitive filesystem */
public final class C0634Re implements AbstractC1560jm {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ C1423hm f3027a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ C2027qe f3028b;

    C0634Re(C0582Pe pe, C1423hm hmVar, C2027qe qeVar) {
        this.f3027a = hmVar;
        this.f3028b = qeVar;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1560jm
    public final void run() {
        this.f3027a.a(new C0270De("Unable to obtain a JavascriptEngine."));
        this.f3028b.c();
    }
}
