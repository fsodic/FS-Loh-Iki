package c.a.a.a.i.c.a;

import c.a.a.a.e.a.c;
import c.a.a.a.e.d;
import c.a.a.a.e.h;
import c.a.a.a.e.q;
import c.a.a.a.h.b;
import c.a.a.a.l.g;
import c.a.a.a.p.a;
import java.io.IOException;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;

@Deprecated
public class e extends a {
    public b e;
    private final Lock f;
    protected final d g;
    protected final c.a.a.a.e.a.d h;
    protected final Set<b> i;
    protected final Queue<b> j;
    protected final Queue<j> k;
    protected final Map<c.a.a.a.e.b.b, g> l;
    private final long m;
    private final TimeUnit n;
    protected volatile boolean o;
    protected volatile int p;
    protected volatile int q;

    public e(d dVar, c.a.a.a.e.a.d dVar2, int i2) {
        this(dVar, dVar2, i2, -1, TimeUnit.MILLISECONDS);
    }

    public e(d dVar, c.a.a.a.e.a.d dVar2, int i2, long j2, TimeUnit timeUnit) {
        this.e = new b(e.class);
        a.a(dVar, "Connection operator");
        a.a(dVar2, "Connections per route");
        this.f = this.f794b;
        this.i = this.f795c;
        this.g = dVar;
        this.h = dVar2;
        this.p = i2;
        this.j = a();
        this.k = c();
        this.l = b();
        this.m = j2;
        this.n = timeUnit;
    }

    @Deprecated
    public e(d dVar, g gVar) {
        this(dVar, c.a(gVar), c.b(gVar));
    }

    private void b(b bVar) {
        q c2 = bVar.c();
        if (c2 != null) {
            try {
                c2.close();
            } catch (IOException e2) {
                this.e.a("I/O error closing connection", e2);
            }
        }
    }

    /* access modifiers changed from: protected */
    public b a(c.a.a.a.e.b.b bVar, Object obj, long j2, TimeUnit timeUnit, k kVar) {
        d dVar;
        b bVar2 = null;
        Date date = j2 > 0 ? new Date(System.currentTimeMillis() + timeUnit.toMillis(j2)) : null;
        this.f.lock();
        try {
            g a2 = a(bVar, true);
            j jVar = null;
            while (bVar2 == null) {
                boolean z = false;
                c.a.a.a.p.b.a(!this.o, "Connection pool shut down");
                if (this.e.a()) {
                    this.e.a("[" + bVar + "] total kept alive: " + this.j.size() + ", total issued: " + this.i.size() + ", total allocated: " + this.q + " out of " + this.p);
                }
                bVar2 = a(a2, obj);
                if (bVar2 != null) {
                    break;
                }
                if (a2.b() > 0) {
                    z = true;
                }
                if (this.e.a()) {
                    this.e.a("Available capacity: " + a2.b() + " out of " + a2.c() + " [" + bVar + "][" + obj + "]");
                }
                if (z && this.q < this.p) {
                    dVar = this.g;
                } else if (!z || this.j.isEmpty()) {
                    if (this.e.a()) {
                        this.e.a("Need to wait for connection [" + bVar + "][" + obj + "]");
                    }
                    if (jVar == null) {
                        jVar = a(this.f.newCondition(), a2);
                        kVar.a(jVar);
                    }
                    try {
                        a2.a(jVar);
                        this.k.add(jVar);
                        if (!jVar.a(date) && date != null && date.getTime() <= System.currentTimeMillis()) {
                            throw new h("Timeout waiting for connection from pool");
                        }
                    } finally {
                        a2.b(jVar);
                        this.k.remove(jVar);
                    }
                } else {
                    d();
                    a2 = a(bVar, true);
                    dVar = this.g;
                }
                bVar2 = a(a2, dVar);
            }
            return bVar2;
        } finally {
            this.f.unlock();
        }
    }

    /* access modifiers changed from: protected */
    public b a(g gVar, d dVar) {
        if (this.e.a()) {
            this.e.a("Creating new connection [" + gVar.d() + "]");
        }
        b bVar = new b(dVar, gVar.d(), this.m, this.n);
        this.f.lock();
        try {
            gVar.a(bVar);
            this.q++;
            this.i.add(bVar);
            return bVar;
        } finally {
            this.f.unlock();
        }
    }

    /* access modifiers changed from: protected */
    public b a(g gVar, Object obj) {
        this.f.lock();
        boolean z = false;
        b bVar = null;
        while (!z) {
            try {
                bVar = gVar.a(obj);
                if (bVar != null) {
                    if (this.e.a()) {
                        this.e.a("Getting free connection [" + gVar.d() + "][" + obj + "]");
                    }
                    this.j.remove(bVar);
                    if (bVar.a(System.currentTimeMillis())) {
                        if (this.e.a()) {
                            this.e.a("Closing expired free connection [" + gVar.d() + "][" + obj + "]");
                        }
                        b(bVar);
                        gVar.a();
                        this.q--;
                    } else {
                        this.i.add(bVar);
                    }
                } else if (this.e.a()) {
                    this.e.a("No free connections [" + gVar.d() + "][" + obj + "]");
                }
                z = true;
            } catch (Throwable th) {
                this.f.unlock();
                throw th;
            }
        }
        this.f.unlock();
        return bVar;
    }

    public f a(c.a.a.a.e.b.b bVar, Object obj) {
        return new d(this, new k(), bVar, obj);
    }

    /* access modifiers changed from: protected */
    public g a(c.a.a.a.e.b.b bVar) {
        return new g(bVar, this.h);
    }

    /* access modifiers changed from: protected */
    public g a(c.a.a.a.e.b.b bVar, boolean z) {
        this.f.lock();
        try {
            g gVar = this.l.get(bVar);
            if (gVar == null && z) {
                gVar = a(bVar);
                this.l.put(bVar, gVar);
            }
            return gVar;
        } finally {
            this.f.unlock();
        }
    }

    /* access modifiers changed from: protected */
    public j a(Condition condition, g gVar) {
        return new j(condition, gVar);
    }

    /* access modifiers changed from: protected */
    public Queue<b> a() {
        return new LinkedList();
    }

    /* access modifiers changed from: protected */
    public void a(b bVar) {
        c.a.a.a.e.b.b d = bVar.d();
        if (this.e.a()) {
            this.e.a("Deleting connection [" + d + "][" + bVar.a() + "]");
        }
        this.f.lock();
        try {
            b(bVar);
            g a2 = a(d, true);
            a2.b(bVar);
            this.q--;
            if (a2.f()) {
                this.l.remove(d);
            }
        } finally {
            this.f.unlock();
        }
    }

    public void a(b bVar, boolean z, long j2, TimeUnit timeUnit) {
        String str;
        c.a.a.a.e.b.b d = bVar.d();
        if (this.e.a()) {
            this.e.a("Releasing connection [" + d + "][" + bVar.a() + "]");
        }
        this.f.lock();
        try {
            if (this.o) {
                b(bVar);
                return;
            }
            this.i.remove(bVar);
            g a2 = a(d, true);
            if (!z || a2.b() < 0) {
                b(bVar);
                a2.a();
                this.q--;
            } else {
                if (this.e.a()) {
                    if (j2 > 0) {
                        str = "for " + j2 + " " + timeUnit;
                    } else {
                        str = "indefinitely";
                    }
                    this.e.a("Pooling connection [" + d + "][" + bVar.a() + "]; keep alive " + str);
                }
                a2.c(bVar);
                bVar.a(j2, timeUnit);
                this.j.add(bVar);
            }
            a(a2);
            this.f.unlock();
        } finally {
            this.f.unlock();
        }
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x006b A[Catch:{ all -> 0x0074 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void a(c.a.a.a.i.c.a.g r4) {
        /*
        // Method dump skipped, instructions count: 123
        */
        throw new UnsupportedOperationException("Method not decompiled: c.a.a.a.i.c.a.e.a(c.a.a.a.i.c.a.g):void");
    }

    /* access modifiers changed from: protected */
    public Map<c.a.a.a.e.b.b, g> b() {
        return new HashMap();
    }

    /* access modifiers changed from: protected */
    public Queue<j> c() {
        return new LinkedList();
    }

    /* access modifiers changed from: protected */
    public void d() {
        this.f.lock();
        try {
            b remove = this.j.remove();
            if (remove != null) {
                a(remove);
            } else if (this.e.a()) {
                this.e.a("No free connection to delete");
            }
        } finally {
            this.f.unlock();
        }
    }

    public void e() {
        this.f.lock();
        try {
            if (!this.o) {
                this.o = true;
                Iterator<b> it = this.i.iterator();
                while (it.hasNext()) {
                    it.remove();
                    b(it.next());
                }
                Iterator<b> it2 = this.j.iterator();
                while (it2.hasNext()) {
                    b next = it2.next();
                    it2.remove();
                    if (this.e.a()) {
                        b bVar = this.e;
                        bVar.a("Closing connection [" + next.d() + "][" + next.a() + "]");
                    }
                    b(next);
                }
                Iterator<j> it3 = this.k.iterator();
                while (it3.hasNext()) {
                    it3.remove();
                    it3.next().b();
                }
                this.l.clear();
                this.f.unlock();
            }
        } finally {
            this.f.unlock();
        }
    }
}
