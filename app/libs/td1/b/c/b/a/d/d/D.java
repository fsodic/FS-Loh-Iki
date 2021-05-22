package b.c.b.a.d.d;

import b.c.b.a.d.d.M;
import java.util.Map;

final class D extends C<Object> {
    D() {
    }

    /* access modifiers changed from: package-private */
    @Override // b.c.b.a.d.d.C
    public final int a(Map.Entry<?, ?> entry) {
        entry.getKey();
        throw new NoSuchMethodError();
    }

    /* access modifiers changed from: package-private */
    @Override // b.c.b.a.d.d.C
    public final F<Object> a(Object obj) {
        return ((M.c) obj).zzrw;
    }

    /* access modifiers changed from: package-private */
    @Override // b.c.b.a.d.d.C
    public final void a(qb qbVar, Map.Entry<?, ?> entry) {
        entry.getKey();
        throw new NoSuchMethodError();
    }

    /* access modifiers changed from: package-private */
    @Override // b.c.b.a.d.d.C
    public final boolean a(AbstractC0089ra raVar) {
        return raVar instanceof M.c;
    }

    /* access modifiers changed from: package-private */
    @Override // b.c.b.a.d.d.C
    public final F<Object> b(Object obj) {
        return ((M.c) obj).k();
    }

    /* access modifiers changed from: package-private */
    @Override // b.c.b.a.d.d.C
    public final void c(Object obj) {
        a(obj).e();
    }
}
