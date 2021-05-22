package com.google.android.gms.internal.ads;

import java.util.List;

final class Rca extends Lca {
    private Rca() {
        super();
    }

    private static <E> Cca<E> c(Object obj, long j) {
        return (Cca) Vda.f(obj, j);
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.Lca
    public final <L> List<L> a(Object obj, long j) {
        Cca c2 = c(obj, j);
        if (c2.d()) {
            return c2;
        }
        int size = c2.size();
        Cca b2 = c2.b(size == 0 ? 10 : size << 1);
        Vda.a(obj, j, b2);
        return b2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.util.List] */
    /* access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.Lca
    public final <E> void a(Object obj, Object obj2, long j) {
        Cca<E> c2 = c(obj, j);
        Cca<E> c3 = c(obj2, j);
        int size = c2.size();
        int size2 = c3.size();
        Cca<E> cca = c2;
        cca = c2;
        if (size > 0 && size2 > 0) {
            boolean d = c2.d();
            Cca<E> cca2 = c2;
            if (!d) {
                cca2 = c2.b(size2 + size);
            }
            cca2.addAll(c3);
            cca = cca2;
        }
        if (size > 0) {
            c3 = cca;
        }
        Vda.a(obj, j, c3);
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.Lca
    public final void b(Object obj, long j) {
        c(obj, j).c();
    }
}
