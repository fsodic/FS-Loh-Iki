package c.a.a.a.b.c;

import c.a.a.a.AbstractC0121e;
import c.a.a.a.b.f.a;
import c.a.a.a.l;
import c.a.a.a.m;

public abstract class g extends k implements m {
    private l h;

    public void a(l lVar) {
        this.h = lVar;
    }

    @Override // c.a.a.a.b.c.d, java.lang.Object
    public Object clone() {
        g gVar = (g) super.clone();
        l lVar = this.h;
        if (lVar != null) {
            gVar.h = (l) a.a(lVar);
        }
        return gVar;
    }

    @Override // c.a.a.a.m
    public boolean expectContinue() {
        AbstractC0121e firstHeader = getFirstHeader("Expect");
        return firstHeader != null && "100-continue".equalsIgnoreCase(firstHeader.getValue());
    }

    @Override // c.a.a.a.m
    public l getEntity() {
        return this.h;
    }
}
