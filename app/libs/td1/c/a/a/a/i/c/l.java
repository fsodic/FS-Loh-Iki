package c.a.a.a.i.c;

import c.a.a.a.e.b.b;
import c.a.a.a.e.b.f;
import c.a.a.a.e.q;
import c.a.a.a.m.a;
import java.io.IOException;
import java.util.Date;
import java.util.concurrent.TimeUnit;

/* access modifiers changed from: package-private */
@Deprecated
public class l extends a<b, q> {
    public c.a.a.a.h.b i;
    private final f j;

    public l(c.a.a.a.h.b bVar, String str, b bVar2, q qVar, long j2, TimeUnit timeUnit) {
        super(str, bVar2, qVar, j2, timeUnit);
        this.i = bVar;
        this.j = new f(bVar2);
    }

    @Override // c.a.a.a.m.a
    public boolean a(long j2) {
        boolean a2 = super.a(j2);
        if (a2 && this.i.a()) {
            c.a.a.a.h.b bVar = this.i;
            bVar.a("Connection " + this + " expired @ " + new Date(b()));
        }
        return a2;
    }

    public void d() {
        try {
            ((q) a()).close();
        } catch (IOException e) {
            this.i.a("I/O error closing connection", e);
        }
    }

    /* access modifiers changed from: package-private */
    public b e() {
        return this.j.e();
    }

    /* access modifiers changed from: package-private */
    public b f() {
        return (b) c();
    }

    /* access modifiers changed from: package-private */
    public f g() {
        return this.j;
    }

    public boolean h() {
        return !((q) a()).isOpen();
    }
}
