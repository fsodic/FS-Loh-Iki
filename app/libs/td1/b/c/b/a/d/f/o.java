package b.c.b.a.d.f;

import b.c.b.a.d.f.I;

final class o extends I.a {
    private final /* synthetic */ String e;
    private final /* synthetic */ B f;
    private final /* synthetic */ I g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    o(I i, String str, B b2) {
        super(i);
        this.g = i;
        this.e = str;
        this.f = b2;
    }

    /* access modifiers changed from: package-private */
    @Override // b.c.b.a.d.f.I.a
    public final void a() {
        I.c(this.g).a(this.e, this.f);
    }

    /* access modifiers changed from: protected */
    @Override // b.c.b.a.d.f.I.a
    public final void b() {
        this.f.i(null);
    }
}
