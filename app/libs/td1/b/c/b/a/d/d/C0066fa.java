package b.c.b.a.d.d;

/* renamed from: b.c.b.a.d.d.fa  reason: case insensitive filesystem */
final class C0066fa extends AbstractC0060ca {
    private C0066fa() {
        super();
    }

    private static <E> Q<E> b(Object obj, long j) {
        return (Q) cb.f(obj, j);
    }

    /* access modifiers changed from: package-private */
    @Override // b.c.b.a.d.d.AbstractC0060ca
    public final void a(Object obj, long j) {
        b(obj, j).f();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.util.List] */
    /* access modifiers changed from: package-private */
    @Override // b.c.b.a.d.d.AbstractC0060ca
    public final <E> void a(Object obj, Object obj2, long j) {
        Q<E> b2 = b(obj, j);
        Q<E> b3 = b(obj2, j);
        int size = b2.size();
        int size2 = b3.size();
        Q<E> q = b2;
        q = b2;
        if (size > 0 && size2 > 0) {
            boolean e = b2.e();
            Q<E> q2 = b2;
            if (!e) {
                q2 = b2.a(size2 + size);
            }
            q2.addAll(b3);
            q = q2;
        }
        if (size > 0) {
            b3 = q;
        }
        cb.a(obj, j, b3);
    }
}
