package c.a.a.a.i.f;

import c.a.a.a.AbstractC0121e;
import c.a.a.a.B;
import c.a.a.a.C;
import c.a.a.a.d.b;
import c.a.a.a.j.c;
import c.a.a.a.j.f;
import c.a.a.a.k.k;
import c.a.a.a.k.v;
import c.a.a.a.l.g;
import c.a.a.a.p.d;
import c.a.a.a.q;
import c.a.a.a.y;
import java.util.ArrayList;
import java.util.List;

public abstract class a<T extends q> implements c<T> {

    /* renamed from: a  reason: collision with root package name */
    private final f f875a;

    /* renamed from: b  reason: collision with root package name */
    private final b f876b;

    /* renamed from: c  reason: collision with root package name */
    private final List<d> f877c;
    protected final v d;
    private int e;
    private T f;

    @Deprecated
    public a(f fVar, v vVar, g gVar) {
        c.a.a.a.p.a.a(fVar, "Session input buffer");
        c.a.a.a.p.a.a(gVar, "HTTP parameters");
        this.f875a = fVar;
        this.f876b = c.a.a.a.l.f.a(gVar);
        this.d = vVar == null ? k.f928b : vVar;
        this.f877c = new ArrayList();
        this.e = 0;
    }

    public static AbstractC0121e[] a(f fVar, int i, int i2, v vVar) {
        ArrayList arrayList = new ArrayList();
        if (vVar == null) {
            vVar = k.f928b;
        }
        return a(fVar, i, i2, vVar, arrayList);
    }

    public static AbstractC0121e[] a(f fVar, int i, int i2, v vVar, List<d> list) {
        int i3;
        c.a.a.a.p.a.a(fVar, "Session input buffer");
        c.a.a.a.p.a.a(vVar, "Line parser");
        c.a.a.a.p.a.a((Object) list, "Header line list");
        d dVar = null;
        d dVar2 = null;
        while (true) {
            if (dVar == null) {
                dVar = new d(64);
            } else {
                dVar.clear();
            }
            i3 = 0;
            if (fVar.a(dVar) == -1 || dVar.length() < 1) {
                AbstractC0121e[] eVarArr = new AbstractC0121e[list.size()];
            } else {
                if ((dVar.charAt(0) == ' ' || dVar.charAt(0) == '\t') && dVar2 != null) {
                    while (i3 < dVar.length() && ((r3 = dVar.charAt(i3)) == ' ' || r3 == '\t')) {
                        i3++;
                    }
                    if (i2 <= 0 || ((dVar2.length() + 1) + dVar.length()) - i3 <= i2) {
                        dVar2.append(' ');
                        dVar2.a(dVar, i3, dVar.length() - i3);
                    } else {
                        throw new y("Maximum line length limit exceeded");
                    }
                } else {
                    list.add(dVar);
                    dVar2 = dVar;
                    dVar = null;
                }
                if (i > 0 && list.size() >= i) {
                    throw new y("Maximum header count exceeded");
                }
            }
        }
        AbstractC0121e[] eVarArr2 = new AbstractC0121e[list.size()];
        while (i3 < list.size()) {
            try {
                eVarArr2[i3] = vVar.a(list.get(i3));
                i3++;
            } catch (B e2) {
                throw new C(e2.getMessage());
            }
        }
        return eVarArr2;
    }

    /* access modifiers changed from: protected */
    public abstract T a(f fVar);

    @Override // c.a.a.a.j.c
    public T parse() {
        int i = this.e;
        if (i == 0) {
            try {
                this.f = a(this.f875a);
                this.e = 1;
            } catch (B e2) {
                throw new C(e2.getMessage(), e2);
            }
        } else if (i != 1) {
            throw new IllegalStateException("Inconsistent parser state");
        }
        this.f.a(a(this.f875a, this.f876b.d(), this.f876b.e(), this.d, this.f877c));
        T t = this.f;
        this.f = null;
        this.f877c.clear();
        this.e = 0;
        return t;
    }
}
