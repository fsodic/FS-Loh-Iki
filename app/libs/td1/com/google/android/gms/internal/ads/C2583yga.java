package com.google.android.gms.internal.ads;

import android.annotation.SuppressLint;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

/* renamed from: com.google.android.gms.internal.ads.yga  reason: case insensitive filesystem */
final class C2583yga implements AbstractC2376vga {

    /* renamed from: a  reason: collision with root package name */
    private final Mga[] f6114a;

    /* renamed from: b  reason: collision with root package name */
    private final Zja f6115b;

    /* renamed from: c  reason: collision with root package name */
    private final _ja f6116c;
    private final Handler d;
    private final Aga e;
    private final CopyOnWriteArraySet<AbstractC2307uga> f;
    private final Tga g;
    private final Uga h;
    private boolean i;
    private boolean j;
    private int k;
    private int l;
    private int m;
    private int n;
    private boolean o;
    private Sga p;
    private Object q;
    private Lja r;
    private _ja s;
    private Nga t;
    private Cga u;
    private int v;
    private int w;
    private long x;

    @SuppressLint({"HandlerLeak"})
    public C2583yga(Mga[] mgaArr, Zja zja, Lga lga) {
        String str = Jka.e;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 26);
        sb.append("Init ExoPlayerLib/2.4.2 [");
        sb.append(str);
        sb.append("]");
        Log.i("ExoPlayerImpl", sb.toString());
        C2453wka.b(mgaArr.length > 0);
        C2453wka.a(mgaArr);
        this.f6114a = mgaArr;
        C2453wka.a(zja);
        this.f6115b = zja;
        this.j = false;
        this.k = 0;
        this.l = 1;
        this.f = new CopyOnWriteArraySet<>();
        this.f6116c = new _ja(new Yja[mgaArr.length]);
        this.p = Sga.f3113a;
        this.g = new Tga();
        this.h = new Uga();
        this.r = Lja.f2520a;
        this.s = this.f6116c;
        this.t = Nga.f2682a;
        this.d = new Bga(this, Looper.myLooper() != null ? Looper.myLooper() : Looper.getMainLooper());
        this.u = new Cga(0, 0);
        this.e = new Aga(mgaArr, zja, lga, this.j, 0, this.d, this.u, this);
    }

    private final int b() {
        if (this.p.a() || this.m > 0) {
            return this.v;
        }
        this.p.a(this.u.f1705a, this.h, false);
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2376vga
    public final int P() {
        return this.l;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2376vga
    public final boolean Q() {
        return this.j;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2376vga
    public final int R() {
        return this.f6114a.length;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2376vga
    public final long S() {
        if (this.p.a() || this.m > 0) {
            return this.x;
        }
        this.p.a(this.u.f1705a, this.h, false);
        return this.h.a() + C2238tga.a(this.u.d);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2376vga
    public final long T() {
        if (this.p.a() || this.m > 0) {
            return this.x;
        }
        this.p.a(this.u.f1705a, this.h, false);
        return this.h.a() + C2238tga.a(this.u.f1707c);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2376vga
    public final void a() {
        this.e.b();
        this.d.removeCallbacksAndMessages(null);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2376vga
    public final void a(long j2) {
        int b2 = b();
        if (b2 < 0 || (!this.p.a() && b2 >= this.p.b())) {
            throw new Iga(this.p, b2, j2);
        }
        this.m++;
        this.v = b2;
        if (!this.p.a()) {
            this.p.a(b2, this.g, false);
            long b3 = this.g.j + (j2 == -9223372036854775807L ? this.g.h : C2238tga.b(j2));
            long j3 = this.p.a(0, this.h, false).d;
            if (j3 != -9223372036854775807L) {
                int i2 = (b3 > j3 ? 1 : (b3 == j3 ? 0 : -1));
            }
        }
        this.w = 0;
        if (j2 == -9223372036854775807L) {
            this.x = 0;
            this.e.a(this.p, b2, -9223372036854775807L);
            return;
        }
        this.x = j2;
        this.e.a(this.p, b2, C2238tga.b(j2));
        Iterator<AbstractC2307uga> it = this.f.iterator();
        while (it.hasNext()) {
            it.next().a();
        }
    }

    /* access modifiers changed from: package-private */
    public final void a(Message message) {
        boolean z = true;
        switch (message.what) {
            case 0:
                this.n--;
                return;
            case 1:
                this.l = message.arg1;
                Iterator<AbstractC2307uga> it = this.f.iterator();
                while (it.hasNext()) {
                    it.next().a(this.j, this.l);
                }
                return;
            case 2:
                if (message.arg1 == 0) {
                    z = false;
                }
                this.o = z;
                Iterator<AbstractC2307uga> it2 = this.f.iterator();
                while (it2.hasNext()) {
                    it2.next().a(this.o);
                }
                return;
            case 3:
                if (this.n == 0) {
                    C0938aka aka = (C0938aka) message.obj;
                    this.i = true;
                    this.r = aka.f3834a;
                    this.s = aka.f3835b;
                    this.f6115b.a(aka.f3836c);
                    Iterator<AbstractC2307uga> it3 = this.f.iterator();
                    while (it3.hasNext()) {
                        it3.next().a(this.r, this.s);
                    }
                    return;
                }
                return;
            case 4:
                int i2 = this.m - 1;
                this.m = i2;
                if (i2 == 0) {
                    this.u = (Cga) message.obj;
                    if (message.arg1 != 0) {
                        Iterator<AbstractC2307uga> it4 = this.f.iterator();
                        while (it4.hasNext()) {
                            it4.next().a();
                        }
                        return;
                    }
                    return;
                }
                return;
            case 5:
                if (this.m == 0) {
                    this.u = (Cga) message.obj;
                    Iterator<AbstractC2307uga> it5 = this.f.iterator();
                    while (it5.hasNext()) {
                        it5.next().a();
                    }
                    return;
                }
                return;
            case 6:
                Ega ega = (Ega) message.obj;
                this.m -= ega.d;
                if (this.n == 0) {
                    this.p = ega.f1880a;
                    this.q = ega.f1881b;
                    this.u = ega.f1882c;
                    Iterator<AbstractC2307uga> it6 = this.f.iterator();
                    while (it6.hasNext()) {
                        it6.next().a(this.p, this.q);
                    }
                    return;
                }
                return;
            case 7:
                Nga nga = (Nga) message.obj;
                if (!this.t.equals(nga)) {
                    this.t = nga;
                    Iterator<AbstractC2307uga> it7 = this.f.iterator();
                    while (it7.hasNext()) {
                        it7.next().a(nga);
                    }
                    return;
                }
                return;
            case 8:
                C2169sga sga = (C2169sga) message.obj;
                Iterator<AbstractC2307uga> it8 = this.f.iterator();
                while (it8.hasNext()) {
                    it8.next().a(sga);
                }
                return;
            default:
                throw new IllegalStateException();
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2376vga
    public final void a(AbstractC2307uga uga) {
        this.f.add(uga);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2376vga
    public final void a(AbstractC2382vja vja) {
        if (!this.p.a() || this.q != null) {
            this.p = Sga.f3113a;
            this.q = null;
            Iterator<AbstractC2307uga> it = this.f.iterator();
            while (it.hasNext()) {
                it.next().a(this.p, this.q);
            }
        }
        if (this.i) {
            this.i = false;
            this.r = Lja.f2520a;
            this.s = this.f6116c;
            this.f6115b.a((Object) null);
            Iterator<AbstractC2307uga> it2 = this.f.iterator();
            while (it2.hasNext()) {
                it2.next().a(this.r, this.s);
            }
        }
        this.n++;
        this.e.a(vja, true);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2376vga
    public final void a(boolean z) {
        if (this.j != z) {
            this.j = z;
            this.e.a(z);
            Iterator<AbstractC2307uga> it = this.f.iterator();
            while (it.hasNext()) {
                it.next().a(z, this.l);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2376vga
    public final void a(C2445wga... wgaArr) {
        this.e.b(wgaArr);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2376vga
    public final void b(AbstractC2307uga uga) {
        this.f.remove(uga);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2376vga
    public final void b(C2445wga... wgaArr) {
        this.e.a(wgaArr);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2376vga
    public final long getDuration() {
        if (this.p.a()) {
            return -9223372036854775807L;
        }
        return C2238tga.a(this.p.a(b(), this.g, false).i);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2376vga
    public final void stop() {
        this.e.c();
    }
}
