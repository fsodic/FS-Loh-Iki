package b.c.b.a.d.f;

import b.c.b.a.d.f.I;

final class l extends I.a {
    private final /* synthetic */ B e;
    private final /* synthetic */ I f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    l(I i, B b2) {
        super(i);
        this.f = i;
        this.e = b2;
    }

    /* access modifiers changed from: package-private */
    @Override // b.c.b.a.d.f.I.a
    public final void a() {
        I.c(this.f).e(this.e);
    }

    /* access modifiers changed from: protected */
    @Override // b.c.b.a.d.f.I.a
    public final void b() {
        this.e.i(null);
    }
}
