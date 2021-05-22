package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

final class Nca extends Lca {

    /* renamed from: c  reason: collision with root package name */
    private static final Class<?> f2674c = Collections.unmodifiableList(Collections.emptyList()).getClass();

    private Nca() {
        super();
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v10, resolved type: java.util.ArrayList */
    /* JADX WARN: Multi-variable type inference failed */
    private static <L> List<L> a(Object obj, long j, int i) {
        List<L> b2;
        Jca jca;
        List<L> c2 = c(obj, j);
        if (c2.isEmpty()) {
            b2 = c2 instanceof Mca ? new Jca(i) : (!(c2 instanceof AbstractC1681lda) || !(c2 instanceof Cca)) ? new ArrayList<>(i) : ((Cca) c2).b(i);
        } else {
            if (f2674c.isAssignableFrom(c2.getClass())) {
                ArrayList arrayList = new ArrayList(c2.size() + i);
                arrayList.addAll(c2);
                jca = arrayList;
            } else if (c2 instanceof Uda) {
                Jca jca2 = new Jca(c2.size() + i);
                jca2.addAll((Uda) c2);
                jca = jca2;
            } else if (!(c2 instanceof AbstractC1681lda) || !(c2 instanceof Cca)) {
                return c2;
            } else {
                Cca cca = (Cca) c2;
                if (cca.d()) {
                    return c2;
                }
                b2 = cca.b(c2.size() + i);
            }
            Vda.a(obj, j, jca);
            return jca;
        }
        Vda.a(obj, j, b2);
        return b2;
    }

    private static <E> List<E> c(Object obj, long j) {
        return (List) Vda.f(obj, j);
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.Lca
    public final <L> List<L> a(Object obj, long j) {
        return a(obj, j, 10);
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.Lca
    public final <E> void a(Object obj, Object obj2, long j) {
        List c2 = c(obj2, j);
        List a2 = a(obj, j, c2.size());
        int size = a2.size();
        int size2 = c2.size();
        if (size > 0 && size2 > 0) {
            a2.addAll(c2);
        }
        if (size > 0) {
            c2 = a2;
        }
        Vda.a(obj, j, c2);
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.Lca
    public final void b(Object obj, long j) {
        Object obj2;
        List list = (List) Vda.f(obj, j);
        if (list instanceof Mca) {
            obj2 = ((Mca) list).i();
        } else if (!f2674c.isAssignableFrom(list.getClass())) {
            if (!(list instanceof AbstractC1681lda) || !(list instanceof Cca)) {
                obj2 = Collections.unmodifiableList(list);
            } else {
                Cca cca = (Cca) list;
                if (cca.d()) {
                    cca.c();
                    return;
                }
                return;
            }
        } else {
            return;
        }
        Vda.a(obj, j, obj2);
    }
}
