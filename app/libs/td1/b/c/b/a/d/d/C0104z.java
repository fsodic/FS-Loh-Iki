package b.c.b.a.d.d;

import b.c.b.a.d.d.M;
import java.util.List;

/* renamed from: b.c.b.a.d.d.z  reason: case insensitive filesystem */
final class C0104z implements qb {

    /* renamed from: a  reason: collision with root package name */
    private final AbstractC0100x f461a;

    private C0104z(AbstractC0100x xVar) {
        O.a((Object) xVar, "output");
        this.f461a = xVar;
        this.f461a.f460c = this;
    }

    public static C0104z a(AbstractC0100x xVar) {
        C0104z zVar = xVar.f460c;
        return zVar != null ? zVar : new C0104z(xVar);
    }

    @Override // b.c.b.a.d.d.qb
    public final int a() {
        return M.d.l;
    }

    @Override // b.c.b.a.d.d.qb
    public final void a(int i) {
        this.f461a.a(i, 4);
    }

    @Override // b.c.b.a.d.d.qb
    public final void a(int i, double d) {
        this.f461a.a(i, d);
    }

    @Override // b.c.b.a.d.d.qb
    public final void a(int i, float f) {
        this.f461a.a(i, f);
    }

    @Override // b.c.b.a.d.d.qb
    public final void a(int i, int i2) {
        this.f461a.b(i, i2);
    }

    @Override // b.c.b.a.d.d.qb
    public final void a(int i, long j) {
        this.f461a.c(i, j);
    }

    @Override // b.c.b.a.d.d.qb
    public final void a(int i, AbstractC0071i iVar) {
        this.f461a.a(i, iVar);
    }

    @Override // b.c.b.a.d.d.qb
    public final void a(int i, Object obj) {
        if (obj instanceof AbstractC0071i) {
            this.f461a.b(i, (AbstractC0071i) obj);
        } else {
            this.f461a.a(i, (AbstractC0089ra) obj);
        }
    }

    @Override // b.c.b.a.d.d.qb
    public final void a(int i, Object obj, Fa fa) {
        AbstractC0100x xVar = this.f461a;
        xVar.a(i, 3);
        fa.a((Object) ((AbstractC0089ra) obj), (qb) xVar.f460c);
        xVar.a(i, 4);
    }

    @Override // b.c.b.a.d.d.qb
    public final void a(int i, String str) {
        this.f461a.a(i, str);
    }

    @Override // b.c.b.a.d.d.qb
    public final void a(int i, List<AbstractC0071i> list) {
        for (int i2 = 0; i2 < list.size(); i2++) {
            this.f461a.a(i, list.get(i2));
        }
    }

    @Override // b.c.b.a.d.d.qb
    public final void a(int i, List<?> list, Fa fa) {
        for (int i2 = 0; i2 < list.size(); i2++) {
            b(i, list.get(i2), fa);
        }
    }

    @Override // b.c.b.a.d.d.qb
    public final void a(int i, List<Boolean> list, boolean z) {
        int i2 = 0;
        if (z) {
            this.f461a.a(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += AbstractC0100x.b(list.get(i4).booleanValue());
            }
            this.f461a.k(i3);
            while (i2 < list.size()) {
                this.f461a.a(list.get(i2).booleanValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f461a.a(i, list.get(i2).booleanValue());
            i2++;
        }
    }

    @Override // b.c.b.a.d.d.qb
    public final void a(int i, boolean z) {
        this.f461a.a(i, z);
    }

    @Override // b.c.b.a.d.d.qb
    public final void b(int i) {
        this.f461a.a(i, 3);
    }

    @Override // b.c.b.a.d.d.qb
    public final void b(int i, int i2) {
        this.f461a.b(i, i2);
    }

    @Override // b.c.b.a.d.d.qb
    public final void b(int i, long j) {
        this.f461a.c(i, j);
    }

    @Override // b.c.b.a.d.d.qb
    public final void b(int i, Object obj, Fa fa) {
        this.f461a.a(i, (AbstractC0089ra) obj, fa);
    }

    @Override // b.c.b.a.d.d.qb
    public final void b(int i, List<String> list) {
        int i2 = 0;
        if (list instanceof AbstractC0058ba) {
            AbstractC0058ba baVar = (AbstractC0058ba) list;
            while (i2 < list.size()) {
                Object f = baVar.f(i2);
                if (f instanceof String) {
                    this.f461a.a(i, (String) f);
                } else {
                    this.f461a.a(i, (AbstractC0071i) f);
                }
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f461a.a(i, list.get(i2));
            i2++;
        }
    }

    @Override // b.c.b.a.d.d.qb
    public final void b(int i, List<?> list, Fa fa) {
        for (int i2 = 0; i2 < list.size(); i2++) {
            a(i, list.get(i2), fa);
        }
    }

    @Override // b.c.b.a.d.d.qb
    public final void b(int i, List<Integer> list, boolean z) {
        int i2 = 0;
        if (z) {
            this.f461a.a(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += AbstractC0100x.c(list.get(i4).intValue());
            }
            this.f461a.k(i3);
            while (i2 < list.size()) {
                this.f461a.j(list.get(i2).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f461a.b(i, list.get(i2).intValue());
            i2++;
        }
    }

    @Override // b.c.b.a.d.d.qb
    public final void c(int i, int i2) {
        this.f461a.e(i, i2);
    }

    @Override // b.c.b.a.d.d.qb
    public final void c(int i, long j) {
        this.f461a.a(i, j);
    }

    @Override // b.c.b.a.d.d.qb
    public final void c(int i, List<Integer> list, boolean z) {
        int i2 = 0;
        if (z) {
            this.f461a.a(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += AbstractC0100x.h(list.get(i4).intValue());
            }
            this.f461a.k(i3);
            while (i2 < list.size()) {
                this.f461a.j(list.get(i2).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f461a.b(i, list.get(i2).intValue());
            i2++;
        }
    }

    @Override // b.c.b.a.d.d.qb
    public final void d(int i, int i2) {
        this.f461a.c(i, i2);
    }

    @Override // b.c.b.a.d.d.qb
    public final void d(int i, long j) {
        this.f461a.b(i, j);
    }

    @Override // b.c.b.a.d.d.qb
    public final void d(int i, List<Long> list, boolean z) {
        int i2 = 0;
        if (z) {
            this.f461a.a(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += AbstractC0100x.d(list.get(i4).longValue());
            }
            this.f461a.k(i3);
            while (i2 < list.size()) {
                this.f461a.a(list.get(i2).longValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f461a.a(i, list.get(i2).longValue());
            i2++;
        }
    }

    @Override // b.c.b.a.d.d.qb
    public final void e(int i, int i2) {
        this.f461a.e(i, i2);
    }

    @Override // b.c.b.a.d.d.qb
    public final void e(int i, long j) {
        this.f461a.a(i, j);
    }

    @Override // b.c.b.a.d.d.qb
    public final void e(int i, List<Long> list, boolean z) {
        int i2 = 0;
        if (z) {
            this.f461a.a(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += AbstractC0100x.h(list.get(i4).longValue());
            }
            this.f461a.k(i3);
            while (i2 < list.size()) {
                this.f461a.c(list.get(i2).longValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f461a.c(i, list.get(i2).longValue());
            i2++;
        }
    }

    @Override // b.c.b.a.d.d.qb
    public final void f(int i, int i2) {
        this.f461a.d(i, i2);
    }

    @Override // b.c.b.a.d.d.qb
    public final void f(int i, List<Integer> list, boolean z) {
        int i2 = 0;
        if (z) {
            this.f461a.a(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += AbstractC0100x.f(list.get(i4).intValue());
            }
            this.f461a.k(i3);
            while (i2 < list.size()) {
                this.f461a.a(list.get(i2).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f461a.e(i, list.get(i2).intValue());
            i2++;
        }
    }

    @Override // b.c.b.a.d.d.qb
    public final void g(int i, List<Integer> list, boolean z) {
        int i2 = 0;
        if (z) {
            this.f461a.a(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += AbstractC0100x.d(list.get(i4).intValue());
            }
            this.f461a.k(i3);
            while (i2 < list.size()) {
                this.f461a.k(list.get(i2).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f461a.c(i, list.get(i2).intValue());
            i2++;
        }
    }

    @Override // b.c.b.a.d.d.qb
    public final void h(int i, List<Integer> list, boolean z) {
        int i2 = 0;
        if (z) {
            this.f461a.a(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += AbstractC0100x.g(list.get(i4).intValue());
            }
            this.f461a.k(i3);
            while (i2 < list.size()) {
                this.f461a.a(list.get(i2).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f461a.e(i, list.get(i2).intValue());
            i2++;
        }
    }

    @Override // b.c.b.a.d.d.qb
    public final void i(int i, List<Long> list, boolean z) {
        int i2 = 0;
        if (z) {
            this.f461a.a(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += AbstractC0100x.g(list.get(i4).longValue());
            }
            this.f461a.k(i3);
            while (i2 < list.size()) {
                this.f461a.c(list.get(i2).longValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f461a.c(i, list.get(i2).longValue());
            i2++;
        }
    }

    @Override // b.c.b.a.d.d.qb
    public final void j(int i, List<Long> list, boolean z) {
        int i2 = 0;
        if (z) {
            this.f461a.a(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += AbstractC0100x.f(list.get(i4).longValue());
            }
            this.f461a.k(i3);
            while (i2 < list.size()) {
                this.f461a.b(list.get(i2).longValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f461a.b(i, list.get(i2).longValue());
            i2++;
        }
    }

    @Override // b.c.b.a.d.d.qb
    public final void k(int i, List<Long> list, boolean z) {
        int i2 = 0;
        if (z) {
            this.f461a.a(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += AbstractC0100x.e(list.get(i4).longValue());
            }
            this.f461a.k(i3);
            while (i2 < list.size()) {
                this.f461a.a(list.get(i2).longValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f461a.a(i, list.get(i2).longValue());
            i2++;
        }
    }

    @Override // b.c.b.a.d.d.qb
    public final void l(int i, List<Integer> list, boolean z) {
        int i2 = 0;
        if (z) {
            this.f461a.a(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += AbstractC0100x.e(list.get(i4).intValue());
            }
            this.f461a.k(i3);
            while (i2 < list.size()) {
                this.f461a.l(list.get(i2).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f461a.d(i, list.get(i2).intValue());
            i2++;
        }
    }

    @Override // b.c.b.a.d.d.qb
    public final void m(int i, List<Double> list, boolean z) {
        int i2 = 0;
        if (z) {
            this.f461a.a(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += AbstractC0100x.b(list.get(i4).doubleValue());
            }
            this.f461a.k(i3);
            while (i2 < list.size()) {
                this.f461a.a(list.get(i2).doubleValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f461a.a(i, list.get(i2).doubleValue());
            i2++;
        }
    }

    @Override // b.c.b.a.d.d.qb
    public final void n(int i, List<Float> list, boolean z) {
        int i2 = 0;
        if (z) {
            this.f461a.a(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += AbstractC0100x.b(list.get(i4).floatValue());
            }
            this.f461a.k(i3);
            while (i2 < list.size()) {
                this.f461a.a(list.get(i2).floatValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f461a.a(i, list.get(i2).floatValue());
            i2++;
        }
    }
}
