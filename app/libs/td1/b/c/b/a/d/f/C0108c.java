package b.c.b.a.d.f;

import b.c.b.a.d.f.I;

/* renamed from: b.c.b.a.d.f.c  reason: case insensitive filesystem */
final class C0108c extends I.a {
    private final /* synthetic */ String e;
    private final /* synthetic */ String f;
    private final /* synthetic */ B g;
    private final /* synthetic */ I h;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C0108c(I i, String str, String str2, B b2) {
        super(i);
        this.h = i;
        this.e = str;
        this.f = str2;
        this.g = b2;
    }

    /* access modifiers changed from: package-private */
    @Override // b.c.b.a.d.f.I.a
    public final void a() {
        I.c(this.h).a(this.e, this.f, this.g);
    }

    /* access modifiers changed from: protected */
    @Override // b.c.b.a.d.f.I.a
    public final void b() {
        this.g.i(null);
    }
}
