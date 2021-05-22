package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.Handler;

/* renamed from: com.google.android.gms.internal.ads.qja  reason: case insensitive filesystem */
public final class C2038qja implements AbstractC2313uja, AbstractC2382vja {

    /* renamed from: a  reason: collision with root package name */
    private final Uri f5344a;

    /* renamed from: b  reason: collision with root package name */
    private final AbstractC1420hka f5345b;

    /* renamed from: c  reason: collision with root package name */
    private final Qha f5346c;
    private final int d;
    private final Handler e;
    private final AbstractC1969pja f;
    private final Uga g;
    private final String h = null;
    private final int i;
    private AbstractC2313uja j;
    private Sga k;
    private boolean l;

    public C2038qja(Uri uri, AbstractC1420hka hka, Qha qha, int i2, Handler handler, AbstractC1969pja pja, String str, int i3) {
        this.f5344a = uri;
        this.f5345b = hka;
        this.f5346c = qha;
        this.d = i2;
        this.e = handler;
        this.f = pja;
        this.i = i3;
        this.g = new Uga();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2382vja
    public final AbstractC2175sja a(int i2, AbstractC1076cka cka) {
        C2453wka.a(i2 == 0);
        return new C1486ija(this.f5344a, this.f5345b.a(), this.f5346c.a(), this.d, this.e, this.f, this, cka, null, this.i);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2382vja
    public final void a() {
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2313uja
    public final void a(Sga sga, Object obj) {
        boolean z = false;
        if (sga.a(0, this.g, false).d != -9223372036854775807L) {
            z = true;
        }
        if (!this.l || z) {
            this.k = sga;
            this.l = z;
            this.j.a(this.k, null);
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2382vja
    public final void a(AbstractC2175sja sja) {
        ((C1486ija) sja).g();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2382vja
    public final void a(AbstractC2376vga vga, boolean z, AbstractC2313uja uja) {
        this.j = uja;
        this.k = new Jja(-9223372036854775807L, false);
        uja.a(this.k, null);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2382vja
    public final void b() {
        this.j = null;
    }
}
