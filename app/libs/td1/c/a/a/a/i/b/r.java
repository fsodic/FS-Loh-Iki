package c.a.a.a.i.b;

import c.a.a.a.AbstractC0121e;
import c.a.a.a.g.f;
import c.a.a.a.l;
import c.a.a.a.m;
import java.io.InputStream;
import java.io.OutputStream;

@Deprecated
public class r extends v implements m {
    private l h;
    private boolean i;

    /* access modifiers changed from: package-private */
    public class a extends f {
        a(l lVar) {
            super(lVar);
        }

        @Override // c.a.a.a.g.f, c.a.a.a.l
        public void consumeContent() {
            r.this.i = true;
            super.consumeContent();
        }

        @Override // c.a.a.a.g.f, c.a.a.a.l
        public InputStream getContent() {
            r.this.i = true;
            return super.getContent();
        }

        @Override // c.a.a.a.g.f, c.a.a.a.l
        public void writeTo(OutputStream outputStream) {
            r.this.i = true;
            super.writeTo(outputStream);
        }
    }

    public r(m mVar) {
        super(mVar);
        a(mVar.getEntity());
    }

    public void a(l lVar) {
        this.h = lVar != null ? new a(lVar) : null;
        this.i = false;
    }

    @Override // c.a.a.a.m
    public boolean expectContinue() {
        AbstractC0121e firstHeader = getFirstHeader("Expect");
        return firstHeader != null && "100-continue".equalsIgnoreCase(firstHeader.getValue());
    }

    @Override // c.a.a.a.i.b.v
    public boolean g() {
        l lVar = this.h;
        return lVar == null || lVar.isRepeatable() || !this.i;
    }

    @Override // c.a.a.a.m
    public l getEntity() {
        return this.h;
    }
}
