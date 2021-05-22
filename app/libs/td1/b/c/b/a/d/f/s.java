package b.c.b.a.d.f;

import android.os.Bundle;
import b.c.b.a.d.f.I;

final class s extends I.a {
    private final /* synthetic */ Bundle e;
    private final /* synthetic */ I f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    s(I i, Bundle bundle) {
        super(i);
        this.f = i;
        this.e = bundle;
    }

    /* access modifiers changed from: package-private */
    @Override // b.c.b.a.d.f.I.a
    public final void a() {
        I.c(this.f).a(this.e, this.f478a);
    }
}
