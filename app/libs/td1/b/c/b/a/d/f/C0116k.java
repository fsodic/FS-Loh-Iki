package b.c.b.a.d.f;

import b.c.b.a.d.f.I;

/* renamed from: b.c.b.a.d.f.k  reason: case insensitive filesystem */
final class C0116k extends I.a {
    private final /* synthetic */ String e;
    private final /* synthetic */ String f;
    private final /* synthetic */ boolean g;
    private final /* synthetic */ B h;
    private final /* synthetic */ I i;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C0116k(I i2, String str, String str2, boolean z, B b2) {
        super(i2);
        this.i = i2;
        this.e = str;
        this.f = str2;
        this.g = z;
        this.h = b2;
    }

    /* access modifiers changed from: package-private */
    @Override // b.c.b.a.d.f.I.a
    public final void a() {
        I.c(this.i).a(this.e, this.f, this.g, this.h);
    }

    /* access modifiers changed from: protected */
    @Override // b.c.b.a.d.f.I.a
    public final void b() {
        this.h.i(null);
    }
}
