package c.a.a.a.i.c.a;

import c.a.a.a.e.a.e;
import c.a.a.a.e.b;
import c.a.a.a.e.d;
import c.a.a.a.e.o;
import c.a.a.a.i.c.h;
import c.a.a.a.l.g;
import c.a.a.a.p.a;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

@Deprecated
public class i implements b {

    /* renamed from: a  reason: collision with root package name */
    public c.a.a.a.h.b f805a = new c.a.a.a.h.b(i.class);

    /* renamed from: b  reason: collision with root package name */
    protected final c.a.a.a.e.c.i f806b;

    /* renamed from: c  reason: collision with root package name */
    protected final a f807c;
    protected final e d;
    protected final d e;
    protected final e f;

    @Deprecated
    public i(g gVar, c.a.a.a.e.c.i iVar) {
        a.a(iVar, "Scheme registry");
        this.f806b = iVar;
        this.f = new e();
        this.e = a(iVar);
        this.d = (e) a(gVar);
        this.f807c = this.d;
    }

    /* access modifiers changed from: protected */
    public d a(c.a.a.a.e.c.i iVar) {
        return new h(iVar);
    }

    @Override // c.a.a.a.e.b
    public c.a.a.a.e.e a(c.a.a.a.e.b.b bVar, Object obj) {
        return new h(this, this.d.a(bVar, obj), bVar);
    }

    /* access modifiers changed from: protected */
    @Deprecated
    public a a(g gVar) {
        return new e(this.e, gVar);
    }

    @Override // c.a.a.a.e.b
    public void a(o oVar, long j, TimeUnit timeUnit) {
        boolean d2;
        e eVar;
        c.a.a.a.h.b bVar;
        String str;
        c.a.a.a.h.b bVar2;
        String str2;
        c.a.a.a.h.b bVar3;
        String str3;
        a.a(oVar instanceof c, "Connection class mismatch, connection not obtained from this manager");
        c cVar = (c) oVar;
        if (cVar.f() != null) {
            c.a.a.a.p.b.a(cVar.b() == this, "Connection not obtained from this manager");
        }
        synchronized (cVar) {
            b bVar4 = (b) cVar.f();
            if (bVar4 != null) {
                try {
                    if (cVar.isOpen() && !cVar.d()) {
                        cVar.shutdown();
                    }
                    d2 = cVar.d();
                    if (this.f805a.a()) {
                        if (d2) {
                            bVar3 = this.f805a;
                            str3 = "Released connection is reusable.";
                        } else {
                            bVar3 = this.f805a;
                            str3 = "Released connection is not reusable.";
                        }
                        bVar3.a(str3);
                    }
                    cVar.a();
                    eVar = this.d;
                } catch (IOException e2) {
                    if (this.f805a.a()) {
                        this.f805a.a("Exception shutting down released connection.", e2);
                    }
                    d2 = cVar.d();
                    if (this.f805a.a()) {
                        if (d2) {
                            bVar = this.f805a;
                            str = "Released connection is reusable.";
                        } else {
                            bVar = this.f805a;
                            str = "Released connection is not reusable.";
                        }
                        bVar.a(str);
                    }
                    cVar.a();
                    eVar = this.d;
                } catch (Throwable th) {
                    boolean d3 = cVar.d();
                    if (this.f805a.a()) {
                        if (d3) {
                            bVar2 = this.f805a;
                            str2 = "Released connection is reusable.";
                        } else {
                            bVar2 = this.f805a;
                            str2 = "Released connection is not reusable.";
                        }
                        bVar2.a(str2);
                    }
                    cVar.a();
                    this.d.a(bVar4, d3, j, timeUnit);
                    throw th;
                }
                eVar.a(bVar4, d2, j, timeUnit);
            }
        }
    }

    /* access modifiers changed from: protected */
    public void finalize() {
        try {
            shutdown();
        } finally {
            super.finalize();
        }
    }

    @Override // c.a.a.a.e.b
    public c.a.a.a.e.c.i getSchemeRegistry() {
        return this.f806b;
    }

    @Override // c.a.a.a.e.b
    public void shutdown() {
        this.f805a.a("Shutting down");
        this.d.e();
    }
}
