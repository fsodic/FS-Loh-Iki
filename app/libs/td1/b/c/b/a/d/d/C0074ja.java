package b.c.b.a.d.d;

/* access modifiers changed from: package-private */
/* renamed from: b.c.b.a.d.d.ja  reason: case insensitive filesystem */
public final class C0074ja implements AbstractC0088qa {

    /* renamed from: a  reason: collision with root package name */
    private AbstractC0088qa[] f435a;

    C0074ja(AbstractC0088qa... qaVarArr) {
        this.f435a = qaVarArr;
    }

    @Override // b.c.b.a.d.d.AbstractC0088qa
    public final boolean a(Class<?> cls) {
        for (AbstractC0088qa qaVar : this.f435a) {
            if (qaVar.a(cls)) {
                return true;
            }
        }
        return false;
    }

    @Override // b.c.b.a.d.d.AbstractC0088qa
    public final AbstractC0086pa b(Class<?> cls) {
        AbstractC0088qa[] qaVarArr = this.f435a;
        for (AbstractC0088qa qaVar : qaVarArr) {
            if (qaVar.a(cls)) {
                return qaVar.b(cls);
            }
        }
        String valueOf = String.valueOf(cls.getName());
        throw new UnsupportedOperationException(valueOf.length() != 0 ? "No factory is available for message type: ".concat(valueOf) : new String("No factory is available for message type: "));
    }
}
