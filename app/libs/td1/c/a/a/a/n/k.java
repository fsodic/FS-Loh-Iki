package c.a.a.a.n;

import c.a.a.a.r;
import c.a.a.a.s;
import c.a.a.a.t;
import c.a.a.a.v;

public final class k implements g {

    /* renamed from: a  reason: collision with root package name */
    private final s[] f967a;

    /* renamed from: b  reason: collision with root package name */
    private final v[] f968b;

    public k(s[] sVarArr, v[] vVarArr) {
        if (sVarArr != null) {
            int length = sVarArr.length;
            this.f967a = new s[length];
            System.arraycopy(sVarArr, 0, this.f967a, 0, length);
        } else {
            this.f967a = new s[0];
        }
        if (vVarArr != null) {
            int length2 = vVarArr.length;
            this.f968b = new v[length2];
            System.arraycopy(vVarArr, 0, this.f968b, 0, length2);
            return;
        }
        this.f968b = new v[0];
    }

    @Override // c.a.a.a.s
    public void a(r rVar, e eVar) {
        for (s sVar : this.f967a) {
            sVar.a(rVar, eVar);
        }
    }

    @Override // c.a.a.a.v
    public void a(t tVar, e eVar) {
        for (v vVar : this.f968b) {
            vVar.a(tVar, eVar);
        }
    }
}
