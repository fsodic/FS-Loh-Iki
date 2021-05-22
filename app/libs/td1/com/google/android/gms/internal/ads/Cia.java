package com.google.android.gms.internal.ads;

/* access modifiers changed from: package-private */
public final class Cia {

    /* renamed from: a  reason: collision with root package name */
    public final Kia f1713a = new Kia();

    /* renamed from: b  reason: collision with root package name */
    public final Xha f1714b;

    /* renamed from: c  reason: collision with root package name */
    public Iia f1715c;
    public C2449wia d;
    public int e;
    public int f;
    public int g;
    public _ha h;
    public Hia i;

    public Cia(Xha xha) {
        this.f1714b = xha;
    }

    public final void a() {
        Kia kia = this.f1713a;
        kia.e = 0;
        kia.s = 0;
        kia.m = false;
        kia.r = false;
        kia.o = null;
        this.e = 0;
        this.g = 0;
        this.f = 0;
        this.h = null;
        this.i = null;
    }

    public final void a(Iia iia, C2449wia wia) {
        C2453wka.a(iia);
        this.f1715c = iia;
        C2453wka.a(wia);
        this.d = wia;
        this.f1714b.a(iia.f);
        a();
    }
}
