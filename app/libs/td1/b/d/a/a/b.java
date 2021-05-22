package b.d.a.a;

import b.d.a.a.d;
import c.a.a.a.AbstractC0121e;
import c.a.a.a.AbstractC0122f;
import c.a.a.a.l;
import c.a.a.a.n.e;
import c.a.a.a.t;
import c.a.a.a.v;

/* access modifiers changed from: package-private */
public class b implements v {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ d f562a;

    b(d dVar) {
        this.f562a = dVar;
    }

    @Override // c.a.a.a.v
    public void a(t tVar, e eVar) {
        AbstractC0121e contentEncoding;
        l entity = tVar.getEntity();
        if (!(entity == null || (contentEncoding = entity.getContentEncoding()) == null)) {
            for (AbstractC0122f fVar : contentEncoding.getElements()) {
                if (fVar.getName().equalsIgnoreCase("gzip")) {
                    tVar.a(new d.a(entity));
                    return;
                }
            }
        }
    }
}
