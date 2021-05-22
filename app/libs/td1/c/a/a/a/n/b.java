package c.a.a.a.n;

import c.a.a.a.r;
import c.a.a.a.s;
import c.a.a.a.t;
import c.a.a.a.v;
import java.util.ArrayList;
import java.util.List;

@Deprecated
public final class b implements g, i, j, Cloneable {

    /* renamed from: a  reason: collision with root package name */
    protected final List<s> f959a = new ArrayList();

    /* renamed from: b  reason: collision with root package name */
    protected final List<v> f960b = new ArrayList();

    public s a(int i) {
        if (i < 0 || i >= this.f959a.size()) {
            return null;
        }
        return this.f959a.get(i);
    }

    /* access modifiers changed from: protected */
    public void a(b bVar) {
        bVar.f959a.clear();
        bVar.f959a.addAll(this.f959a);
        bVar.f960b.clear();
        bVar.f960b.addAll(this.f960b);
    }

    @Override // c.a.a.a.s
    public void a(r rVar, e eVar) {
        for (s sVar : this.f959a) {
            sVar.a(rVar, eVar);
        }
    }

    public final void a(s sVar) {
        b(sVar);
    }

    public final void a(s sVar, int i) {
        b(sVar, i);
    }

    @Override // c.a.a.a.v
    public void a(t tVar, e eVar) {
        for (v vVar : this.f960b) {
            vVar.a(tVar, eVar);
        }
    }

    public final void a(v vVar) {
        b(vVar);
    }

    public v b(int i) {
        if (i < 0 || i >= this.f960b.size()) {
            return null;
        }
        return this.f960b.get(i);
    }

    public void b(s sVar) {
        if (sVar != null) {
            this.f959a.add(sVar);
        }
    }

    public void b(s sVar, int i) {
        if (sVar != null) {
            this.f959a.add(i, sVar);
        }
    }

    public void b(v vVar) {
        if (vVar != null) {
            this.f960b.add(vVar);
        }
    }

    public int c() {
        return this.f959a.size();
    }

    @Override // java.lang.Object
    public Object clone() {
        b bVar = (b) super.clone();
        a(bVar);
        return bVar;
    }

    public int d() {
        return this.f960b.size();
    }
}
