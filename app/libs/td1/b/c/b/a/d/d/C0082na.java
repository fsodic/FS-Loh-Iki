package b.c.b.a.d.d;

import java.util.Iterator;
import java.util.Map;

/* renamed from: b.c.b.a.d.d.na  reason: case insensitive filesystem */
final class C0082na implements AbstractC0080ma {
    C0082na() {
    }

    @Override // b.c.b.a.d.d.AbstractC0080ma
    public final int a(int i, Object obj, Object obj2) {
        C0078la laVar = (C0078la) obj;
        if (laVar.isEmpty()) {
            return 0;
        }
        Iterator it = laVar.entrySet().iterator();
        if (!it.hasNext()) {
            return 0;
        }
        Map.Entry entry = (Map.Entry) it.next();
        entry.getKey();
        entry.getValue();
        throw new NoSuchMethodError();
    }

    @Override // b.c.b.a.d.d.AbstractC0080ma
    public final Object a(Object obj, Object obj2) {
        C0078la laVar = (C0078la) obj;
        C0078la laVar2 = (C0078la) obj2;
        if (!laVar2.isEmpty()) {
            if (!laVar.c()) {
                laVar = laVar.e();
            }
            laVar.a(laVar2);
        }
        return laVar;
    }

    @Override // b.c.b.a.d.d.AbstractC0080ma
    public final Map<?, ?> a(Object obj) {
        return (C0078la) obj;
    }

    @Override // b.c.b.a.d.d.AbstractC0080ma
    public final C0076ka<?, ?> b(Object obj) {
        throw new NoSuchMethodError();
    }

    @Override // b.c.b.a.d.d.AbstractC0080ma
    public final Object c(Object obj) {
        ((C0078la) obj).d();
        return obj;
    }
}
