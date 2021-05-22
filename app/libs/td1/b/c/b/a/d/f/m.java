package b.c.b.a.d.f;

import android.os.Bundle;
import b.c.b.a.d.f.I;

final class m extends I.a {
    private final /* synthetic */ Bundle e;
    private final /* synthetic */ B f;
    private final /* synthetic */ I g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    m(I i, Bundle bundle, B b2) {
        super(i);
        this.g = i;
        this.e = bundle;
        this.f = b2;
    }

    /* access modifiers changed from: package-private */
    @Override // b.c.b.a.d.f.I.a
    public final void a() {
        I.c(this.g).a(this.e, this.f, this.f478a);
    }

    /* access modifiers changed from: protected */
    @Override // b.c.b.a.d.f.I.a
    public final void b() {
        this.f.i(null);
    }
}
