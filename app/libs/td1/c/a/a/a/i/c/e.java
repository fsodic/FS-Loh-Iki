package c.a.a.a.i.c;

import c.a.a.a.AbstractC0125i;
import c.a.a.a.e.b;
import c.a.a.a.e.c.i;
import c.a.a.a.e.d;
import c.a.a.a.e.o;
import c.a.a.a.p.a;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;

@Deprecated
public class e implements b {

    /* renamed from: a  reason: collision with root package name */
    private static final AtomicLong f819a = new AtomicLong();

    /* renamed from: b  reason: collision with root package name */
    public c.a.a.a.h.b f820b = new c.a.a.a.h.b(e.class);

    /* renamed from: c  reason: collision with root package name */
    private final i f821c;
    private final d d;
    private l e;
    private p f;
    private volatile boolean g;

    public e(i iVar) {
        a.a(iVar, "Scheme registry");
        this.f821c = iVar;
        this.d = a(iVar);
    }

    private void a() {
        c.a.a.a.p.b.a(!this.g, "Connection manager has been shut down");
    }

    private void a(AbstractC0125i iVar) {
        try {
            iVar.shutdown();
        } catch (IOException e2) {
            if (this.f820b.a()) {
                this.f820b.a("I/O exception shutting down connection", e2);
            }
        }
    }

    /* access modifiers changed from: protected */
    public d a(i iVar) {
        return new h(iVar);
    }

    @Override // c.a.a.a.e.b
    public final c.a.a.a.e.e a(c.a.a.a.e.b.b bVar, Object obj) {
        return new d(this, bVar, obj);
    }

    @Override // c.a.a.a.e.b
    public void a(o oVar, long j, TimeUnit timeUnit) {
        String str;
        a.a(oVar instanceof p, "Connection class mismatch, connection not obtained from this manager");
        p pVar = (p) oVar;
        synchronized (pVar) {
            if (this.f820b.a()) {
                this.f820b.a("Releasing connection " + oVar);
            }
            if (pVar.c() != null) {
                c.a.a.a.p.b.a(pVar.b() == this, "Connection not obtained from this manager");
                synchronized (this) {
                    if (this.g) {
                        a(pVar);
                        return;
                    }
                    try {
                        if (pVar.isOpen() && !pVar.d()) {
                            a(pVar);
                        }
                        if (pVar.d()) {
                            this.e.a(j, timeUnit != null ? timeUnit : TimeUnit.MILLISECONDS);
                            if (this.f820b.a()) {
                                if (j > 0) {
                                    str = "for " + j + " " + timeUnit;
                                } else {
                                    str = "indefinitely";
                                }
                                this.f820b.a("Connection can be kept alive " + str);
                            }
                        }
                    } finally {
                        pVar.a();
                        this.f = null;
                        if (this.e.h()) {
                            this.e = null;
                        }
                    }
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public o b(c.a.a.a.e.b.b bVar, Object obj) {
        p pVar;
        a.a(bVar, "Route");
        synchronized (this) {
            a();
            if (this.f820b.a()) {
                c.a.a.a.h.b bVar2 = this.f820b;
                bVar2.a("Get connection for route " + bVar);
            }
            c.a.a.a.p.b.a(this.f == null, "Invalid use of BasicClientConnManager: connection still allocated.\nMake sure to release the connection before allocating another one.");
            if (this.e != null && !this.e.f().equals(bVar)) {
                this.e.d();
                this.e = null;
            }
            if (this.e == null) {
                this.e = new l(this.f820b, Long.toString(f819a.getAndIncrement()), bVar, this.d.createConnection(), 0, TimeUnit.MILLISECONDS);
            }
            if (this.e.a(System.currentTimeMillis())) {
                this.e.d();
                this.e.g().d();
            }
            this.f = new p(this, this.d, this.e);
            pVar = this.f;
        }
        return pVar;
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
    public i getSchemeRegistry() {
        return this.f821c;
    }

    @Override // c.a.a.a.e.b
    public void shutdown() {
        synchronized (this) {
            this.g = true;
            try {
                if (this.e != null) {
                    this.e.d();
                }
            } finally {
                this.e = null;
                this.f = null;
            }
        }
    }
}
