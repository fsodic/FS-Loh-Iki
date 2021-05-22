package b.c.b.a.d.f;

import b.c.b.a.c.b;
import b.c.b.a.d.f.I;

final class n extends I.a {
    private final /* synthetic */ int e = 5;
    private final /* synthetic */ String f;
    private final /* synthetic */ Object g;
    private final /* synthetic */ Object h;
    private final /* synthetic */ Object i;
    private final /* synthetic */ I j;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    n(I i2, boolean z, int i3, String str, Object obj, Object obj2, Object obj3) {
        super(false);
        this.j = i2;
        this.f = str;
        this.g = obj;
        this.h = null;
        this.i = null;
    }

    /* access modifiers changed from: package-private */
    @Override // b.c.b.a.d.f.I.a
    public final void a() {
        I.c(this.j).a(this.e, this.f, b.a(this.g), b.a(this.h), b.a(this.i));
    }
}
