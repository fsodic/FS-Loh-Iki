package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.b.d;
import com.google.android.gms.ads.b.j;
import java.util.ArrayList;

public final class GR {

    /* renamed from: a  reason: collision with root package name */
    public final _oa f2036a;

    /* renamed from: b  reason: collision with root package name */
    public final C1028c f2037b;

    /* renamed from: c  reason: collision with root package name */
    public final C1956pd f2038c;
    public final Zna d;
    public final C1015boa e;
    public final String f;
    public final ArrayList<String> g;
    public final ArrayList<String> h;
    public final C0578Pa i;
    public final C1496ioa j;
    public final int k;
    public final j l;
    public final Uoa m;
    public final C2147sR n;
    public final boolean o;

    private GR(IR ir) {
        this.e = IR.a(ir);
        this.f = IR.b(ir);
        this.f2036a = IR.c(ir);
        this.d = new Zna(IR.m(ir).f3677a, IR.m(ir).f3678b, IR.m(ir).f3679c, IR.m(ir).d, IR.m(ir).e, IR.m(ir).f, IR.m(ir).g, IR.m(ir).h || IR.n(ir), IR.m(ir).i, IR.m(ir).j, IR.m(ir).k, IR.m(ir).l, IR.m(ir).m, IR.m(ir).n, IR.m(ir).o, IR.m(ir).p, IR.m(ir).q, IR.m(ir).r, IR.m(ir).s, IR.m(ir).t, IR.m(ir).u, IR.m(ir).v);
        this.f2037b = IR.o(ir) != null ? IR.o(ir) : IR.p(ir) != null ? IR.p(ir).f : null;
        this.g = IR.d(ir);
        this.h = IR.e(ir);
        this.i = IR.d(ir) == null ? null : IR.p(ir) == null ? new C0578Pa(new d.a().a()) : IR.p(ir);
        this.j = IR.f(ir);
        this.k = IR.g(ir);
        this.l = IR.h(ir);
        this.m = IR.i(ir);
        this.f2038c = IR.j(ir);
        this.n = new C2147sR(IR.k(ir));
        this.o = IR.l(ir);
    }

    public final AbstractC0631Rb a() {
        j jVar = this.l;
        if (jVar == null) {
            return null;
        }
        return jVar.N();
    }
}
