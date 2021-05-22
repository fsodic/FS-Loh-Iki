package b.c.b.a.d.f;

import b.c.b.a.c.b;
import b.c.b.a.d.f.I;

final class p extends I.a {
    private final /* synthetic */ String e;
    private final /* synthetic */ String f;
    private final /* synthetic */ Object g;
    private final /* synthetic */ boolean h;
    private final /* synthetic */ I i;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    p(I i2, String str, String str2, Object obj, boolean z) {
        super(i2);
        this.i = i2;
        this.e = str;
        this.f = str2;
        this.g = obj;
        this.h = z;
    }

    /* access modifiers changed from: package-private */
    @Override // b.c.b.a.d.f.I.a
    public final void a() {
        I.c(this.i).a(this.e, this.f, b.a(this.g), this.h, this.f478a);
    }
}
