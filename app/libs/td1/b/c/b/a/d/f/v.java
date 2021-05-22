package b.c.b.a.d.f;

import android.app.Activity;
import b.c.b.a.c.b;
import b.c.b.a.d.f.I;

final class v extends I.a {
    private final /* synthetic */ Activity e;
    private final /* synthetic */ I.b f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    v(I.b bVar, Activity activity) {
        super(I.this);
        this.f = bVar;
        this.e = activity;
    }

    /* access modifiers changed from: package-private */
    @Override // b.c.b.a.d.f.I.a
    public final void a() {
        I.c(I.this).d(b.a(this.e), this.f479b);
    }
}
