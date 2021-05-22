package c.a.a.a.i.c.a;

import c.a.a.a.e.a.d;
import c.a.a.a.h.b;
import c.a.a.a.p.a;
import java.util.LinkedList;
import java.util.Queue;

@Deprecated
public class g {

    /* renamed from: a  reason: collision with root package name */
    public b f799a = new b(g.class);

    /* renamed from: b  reason: collision with root package name */
    protected final c.a.a.a.e.b.b f800b;

    /* renamed from: c  reason: collision with root package name */
    protected final int f801c;
    protected final d d;
    protected final LinkedList<b> e;
    protected final Queue<j> f;
    protected int g;

    public g(c.a.a.a.e.b.b bVar, d dVar) {
        this.f800b = bVar;
        this.d = dVar;
        this.f801c = dVar.a(bVar);
        this.e = new LinkedList<>();
        this.f = new LinkedList();
        this.g = 0;
    }

    /* JADX WARNING: Removed duplicated region for block: B:5:0x0018  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public c.a.a.a.i.c.a.b a(java.lang.Object r4) {
        /*
            r3 = this;
            java.util.LinkedList<c.a.a.a.i.c.a.b> r0 = r3.e
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x0032
            java.util.LinkedList<c.a.a.a.i.c.a.b> r0 = r3.e
            int r1 = r0.size()
            java.util.ListIterator r0 = r0.listIterator(r1)
        L_0x0012:
            boolean r1 = r0.hasPrevious()
            if (r1 == 0) goto L_0x0032
            java.lang.Object r1 = r0.previous()
            c.a.a.a.i.c.a.b r1 = (c.a.a.a.i.c.a.b) r1
            java.lang.Object r2 = r1.a()
            if (r2 == 0) goto L_0x002e
            java.lang.Object r2 = r1.a()
            boolean r2 = c.a.a.a.p.h.a(r4, r2)
            if (r2 == 0) goto L_0x0012
        L_0x002e:
            r0.remove()
            return r1
        L_0x0032:
            int r4 = r3.b()
            if (r4 != 0) goto L_0x005c
            java.util.LinkedList<c.a.a.a.i.c.a.b> r4 = r3.e
            boolean r4 = r4.isEmpty()
            if (r4 != 0) goto L_0x005c
            java.util.LinkedList<c.a.a.a.i.c.a.b> r4 = r3.e
            java.lang.Object r4 = r4.remove()
            c.a.a.a.i.c.a.b r4 = (c.a.a.a.i.c.a.b) r4
            r4.b()
            c.a.a.a.e.q r0 = r4.c()
            r0.close()     // Catch:{ IOException -> 0x0053 }
            goto L_0x005b
        L_0x0053:
            r0 = move-exception
            c.a.a.a.h.b r1 = r3.f799a
            java.lang.String r2 = "I/O error closing connection"
            r1.a(r2, r0)
        L_0x005b:
            return r4
        L_0x005c:
            r4 = 0
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: c.a.a.a.i.c.a.g.a(java.lang.Object):c.a.a.a.i.c.a.b");
    }

    public void a() {
        c.a.a.a.p.b.a(this.g > 0, "There is no entry that could be dropped");
        this.g--;
    }

    public void a(b bVar) {
        a.a(this.f800b.equals(bVar.d()), "Entry not planned for this pool");
        this.g++;
    }

    public void a(j jVar) {
        a.a(jVar, "Waiting thread");
        this.f.add(jVar);
    }

    public int b() {
        return this.d.a(this.f800b) - this.g;
    }

    public void b(j jVar) {
        if (jVar != null) {
            this.f.remove(jVar);
        }
    }

    public boolean b(b bVar) {
        boolean remove = this.e.remove(bVar);
        if (remove) {
            this.g--;
        }
        return remove;
    }

    public final int c() {
        return this.f801c;
    }

    public void c(b bVar) {
        int i = this.g;
        if (i < 1) {
            throw new IllegalStateException("No entry created for this pool. " + this.f800b);
        } else if (i > this.e.size()) {
            this.e.add(bVar);
        } else {
            throw new IllegalStateException("No entry allocated from this pool. " + this.f800b);
        }
    }

    public final c.a.a.a.e.b.b d() {
        return this.f800b;
    }

    public boolean e() {
        return !this.f.isEmpty();
    }

    public boolean f() {
        return this.g < 1 && this.f.isEmpty();
    }

    public j g() {
        return this.f.peek();
    }
}
