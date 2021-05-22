package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Arrays;

/* renamed from: com.google.android.gms.internal.ads.wja  reason: case insensitive filesystem */
public final class C2451wja implements AbstractC2382vja {

    /* renamed from: a  reason: collision with root package name */
    private final AbstractC2382vja[] f5918a;

    /* renamed from: b  reason: collision with root package name */
    private final ArrayList<AbstractC2382vja> f5919b;

    /* renamed from: c  reason: collision with root package name */
    private final Tga f5920c = new Tga();
    private AbstractC2313uja d;
    private Sga e;
    private Object f;
    private int g = -1;
    private C2589yja h;

    public C2451wja(AbstractC2382vja... vjaArr) {
        this.f5918a = vjaArr;
        this.f5919b = new ArrayList<>(Arrays.asList(vjaArr));
    }

    /* access modifiers changed from: private */
    public final void a(int i, Sga sga, Object obj) {
        C2589yja yja;
        if (this.h == null) {
            int b2 = sga.b();
            int i2 = 0;
            while (true) {
                if (i2 >= b2) {
                    if (this.g == -1) {
                        this.g = sga.c();
                    } else if (sga.c() != this.g) {
                        yja = new C2589yja(1);
                    }
                    yja = null;
                } else if (sga.a(i2, this.f5920c, false).e) {
                    yja = new C2589yja(0);
                    break;
                } else {
                    i2++;
                }
            }
            this.h = yja;
        }
        if (this.h == null) {
            this.f5919b.remove(this.f5918a[i]);
            if (i == 0) {
                this.e = sga;
                this.f = obj;
            }
            if (this.f5919b.isEmpty()) {
                this.d.a(this.e, this.f);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2382vja
    public final AbstractC2175sja a(int i, AbstractC1076cka cka) {
        AbstractC2175sja[] sjaArr = new AbstractC2175sja[this.f5918a.length];
        for (int i2 = 0; i2 < sjaArr.length; i2++) {
            sjaArr[i2] = this.f5918a[i2].a(i, cka);
        }
        return new C2520xja(sjaArr);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2382vja
    public final void a() {
        C2589yja yja = this.h;
        if (yja == null) {
            for (AbstractC2382vja vja : this.f5918a) {
                vja.a();
            }
            return;
        }
        throw yja;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2382vja
    public final void a(AbstractC2175sja sja) {
        C2520xja xja = (C2520xja) sja;
        int i = 0;
        while (true) {
            AbstractC2382vja[] vjaArr = this.f5918a;
            if (i < vjaArr.length) {
                vjaArr[i].a(xja.f6011a[i]);
                i++;
            } else {
                return;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2382vja
    public final void a(AbstractC2376vga vga, boolean z, AbstractC2313uja uja) {
        this.d = uja;
        int i = 0;
        while (true) {
            AbstractC2382vja[] vjaArr = this.f5918a;
            if (i < vjaArr.length) {
                vjaArr[i].a(vga, false, new C2658zja(this, i));
                i++;
            } else {
                return;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2382vja
    public final void b() {
        for (AbstractC2382vja vja : this.f5918a) {
            vja.b();
        }
    }
}
