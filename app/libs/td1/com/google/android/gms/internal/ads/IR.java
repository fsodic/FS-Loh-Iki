package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.b.j;
import com.google.android.gms.common.internal.r;
import java.util.ArrayList;

public final class IR {

    /* renamed from: a */
    private Zna f2226a;

    /* renamed from: b */
    private C1015boa f2227b;

    /* renamed from: c */
    private _oa f2228c;
    private String d;
    private C1028c e;
    private boolean f;
    private ArrayList<String> g;
    private ArrayList<String> h;
    private C0578Pa i;
    private C1496ioa j;
    private j k;
    private Uoa l;
    private int m = 1;
    private C1956pd n;
    private C2285uR o = new C2285uR();
    private boolean p = false;

    public final IR a(int i2) {
        this.m = i2;
        return this;
    }

    public final IR a(j jVar) {
        this.k = jVar;
        if (jVar != null) {
            this.f = jVar.L();
            this.l = jVar.M();
        }
        return this;
    }

    public final IR a(GR gr) {
        this.o.a(gr.n);
        this.f2226a = gr.d;
        this.f2227b = gr.e;
        this.f2228c = gr.f2036a;
        this.d = gr.f;
        this.e = gr.f2037b;
        this.g = gr.g;
        this.h = gr.h;
        this.i = gr.i;
        this.j = gr.j;
        a(gr.l);
        this.p = gr.o;
        return this;
    }

    public final IR a(C0578Pa pa) {
        this.i = pa;
        return this;
    }

    public final IR a(Zna zna) {
        this.f2226a = zna;
        return this;
    }

    public final IR a(_oa _oa) {
        this.f2228c = _oa;
        return this;
    }

    public final IR a(C1015boa boa) {
        this.f2227b = boa;
        return this;
    }

    public final IR a(C1028c cVar) {
        this.e = cVar;
        return this;
    }

    public final IR a(C1496ioa ioa) {
        this.j = ioa;
        return this;
    }

    public final IR a(C1956pd pdVar) {
        this.n = pdVar;
        this.e = new C1028c(false, true, false);
        return this;
    }

    public final IR a(String str) {
        this.d = str;
        return this;
    }

    public final IR a(ArrayList<String> arrayList) {
        this.g = arrayList;
        return this;
    }

    public final IR a(boolean z) {
        this.p = z;
        return this;
    }

    public final Zna a() {
        return this.f2226a;
    }

    public final IR b(ArrayList<String> arrayList) {
        this.h = arrayList;
        return this;
    }

    public final IR b(boolean z) {
        this.f = z;
        return this;
    }

    public final String b() {
        return this.d;
    }

    public final C2285uR c() {
        return this.o;
    }

    public final GR d() {
        r.a((Object) this.d, (Object) "ad unit must not be null");
        r.a(this.f2227b, "ad size must not be null");
        r.a(this.f2226a, "ad request must not be null");
        return new GR(this);
    }

    public final C1015boa e() {
        return this.f2227b;
    }
}
