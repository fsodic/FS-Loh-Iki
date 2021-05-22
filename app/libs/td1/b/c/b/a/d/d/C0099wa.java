package b.c.b.a.d.d;

import java.util.Iterator;
import java.util.Map;

/* renamed from: b.c.b.a.d.d.wa  reason: case insensitive filesystem */
final class C0099wa<T> implements Fa<T> {

    /* renamed from: a  reason: collision with root package name */
    private final AbstractC0089ra f455a;

    /* renamed from: b  reason: collision with root package name */
    private final Xa<?, ?> f456b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f457c;
    private final C<?> d;

    private C0099wa(Xa<?, ?> xa, C<?> c2, AbstractC0089ra raVar) {
        this.f456b = xa;
        this.f457c = c2.a(raVar);
        this.d = c2;
        this.f455a = raVar;
    }

    static <T> C0099wa<T> a(Xa<?, ?> xa, C<?> c2, AbstractC0089ra raVar) {
        return new C0099wa<>(xa, c2, raVar);
    }

    @Override // b.c.b.a.d.d.Fa
    public final void a(T t, qb qbVar) {
        int i;
        Object obj;
        Iterator<Map.Entry<?, Object>> d2 = this.d.a((Object) t).d();
        while (d2.hasNext()) {
            Map.Entry<?, Object> next = d2.next();
            H h = (H) next.getKey();
            if (h.Q() != pb.MESSAGE || h.R() || h.P()) {
                throw new IllegalStateException("Found invalid MessageSet item.");
            }
            if (next instanceof X) {
                i = h.O();
                obj = ((X) next).a().a();
            } else {
                i = h.O();
                obj = next.getValue();
            }
            qbVar.a(i, obj);
        }
        Xa<?, ?> xa = this.f456b;
        xa.b(xa.c(t), qbVar);
    }

    @Override // b.c.b.a.d.d.Fa
    public final boolean a(T t) {
        return this.d.a((Object) t).c();
    }

    @Override // b.c.b.a.d.d.Fa
    public final boolean a(T t, T t2) {
        if (!this.f456b.c(t).equals(this.f456b.c(t2))) {
            return false;
        }
        if (this.f457c) {
            return this.d.a((Object) t).equals(this.d.a((Object) t2));
        }
        return true;
    }

    @Override // b.c.b.a.d.d.Fa
    public final int b(T t) {
        int hashCode = this.f456b.c(t).hashCode();
        return this.f457c ? (hashCode * 53) + this.d.a((Object) t).hashCode() : hashCode;
    }

    @Override // b.c.b.a.d.d.Fa
    public final void b(T t, T t2) {
        Ha.a(this.f456b, t, t2);
        if (this.f457c) {
            Ha.a(this.d, t, t2);
        }
    }

    @Override // b.c.b.a.d.d.Fa
    public final int c(T t) {
        Xa<?, ?> xa = this.f456b;
        int d2 = xa.d(xa.c(t)) + 0;
        return this.f457c ? d2 + this.d.a((Object) t).g() : d2;
    }

    @Override // b.c.b.a.d.d.Fa
    public final void d(T t) {
        this.f456b.a(t);
        this.d.c(t);
    }
}
