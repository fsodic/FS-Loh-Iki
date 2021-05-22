package b.c.b.a.d.f;

import android.app.Activity;
import b.c.b.a.c.b;
import b.c.b.a.d.f.I;

final class z extends I.a {
    private final /* synthetic */ Activity e;
    private final /* synthetic */ B f;
    private final /* synthetic */ I.b g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    z(I.b bVar, Activity activity, B b2) {
        super(I.this);
        this.g = bVar;
        this.e = activity;
        this.f = b2;
    }

    /* access modifiers changed from: package-private */
    @Override // b.c.b.a.d.f.I.a
    public final void a() {
        I.c(I.this).a(b.a(this.e), this.f, this.f479b);
    }
}
