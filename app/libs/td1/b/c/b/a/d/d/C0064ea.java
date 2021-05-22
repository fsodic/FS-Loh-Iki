package b.c.b.a.d.d;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: b.c.b.a.d.d.ea  reason: case insensitive filesystem */
final class C0064ea extends AbstractC0060ca {

    /* renamed from: c  reason: collision with root package name */
    private static final Class<?> f420c = Collections.unmodifiableList(Collections.emptyList()).getClass();

    private C0064ea() {
        super();
    }

    private static <E> List<E> b(Object obj, long j) {
        return (List) cb.f(obj, j);
    }

    /* access modifiers changed from: package-private */
    @Override // b.c.b.a.d.d.AbstractC0060ca
    public final void a(Object obj, long j) {
        Object obj2;
        List list = (List) cb.f(obj, j);
        if (list instanceof AbstractC0058ba) {
            obj2 = ((AbstractC0058ba) list).j();
        } else if (!f420c.isAssignableFrom(list.getClass())) {
            if (!(list instanceof Ca) || !(list instanceof Q)) {
                obj2 = Collections.unmodifiableList(list);
            } else {
                Q q = (Q) list;
                if (q.e()) {
                    q.f();
                    return;
                }
                return;
            }
        } else {
            return;
        }
        cb.a(obj, j, obj2);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v11, resolved type: java.util.ArrayList */
    /* JADX WARN: Multi-variable type inference failed */
    /* access modifiers changed from: package-private */
    @Override // b.c.b.a.d.d.AbstractC0060ca
    public final <E> void a(Object obj, Object obj2, long j) {
        C0056aa aaVar;
        List b2 = b(obj2, j);
        int size = b2.size();
        List b3 = b(obj, j);
        if (b3.isEmpty()) {
            b3 = b3 instanceof AbstractC0058ba ? new C0056aa(size) : (!(b3 instanceof Ca) || !(b3 instanceof Q)) ? new ArrayList(size) : ((Q) b3).a(size);
            cb.a(obj, j, b3);
        } else {
            if (f420c.isAssignableFrom(b3.getClass())) {
                ArrayList arrayList = new ArrayList(b3.size() + size);
                arrayList.addAll(b3);
                aaVar = arrayList;
            } else if (b3 instanceof _a) {
                C0056aa aaVar2 = new C0056aa(b3.size() + size);
                aaVar2.addAll((_a) b3);
                aaVar = aaVar2;
            } else if ((b3 instanceof Ca) && (b3 instanceof Q)) {
                Q q = (Q) b3;
                if (!q.e()) {
                    Q<E> a2 = q.a(b3.size() + size);
                    cb.a(obj, j, a2);
                    b3 = a2;
                }
            }
            cb.a(obj, j, aaVar);
            b3 = aaVar;
        }
        int size2 = b3.size();
        int size3 = b2.size();
        if (size2 > 0 && size3 > 0) {
            b3.addAll(b2);
        }
        if (size2 > 0) {
            b2 = b3;
        }
        cb.a(obj, j, b2);
    }
}
