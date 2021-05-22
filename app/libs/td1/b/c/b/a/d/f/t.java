package b.c.b.a.d.f;

import android.app.Activity;
import android.os.Bundle;
import b.c.b.a.c.b;
import b.c.b.a.d.f.I;

final class t extends I.a {
    private final /* synthetic */ Activity e;
    private final /* synthetic */ Bundle f;
    private final /* synthetic */ I.b g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    t(I.b bVar, Activity activity, Bundle bundle) {
        super(I.this);
        this.g = bVar;
        this.e = activity;
        this.f = bundle;
    }

    /* access modifiers changed from: package-private */
    @Override // b.c.b.a.d.f.I.a
    public final void a() {
        I.c(I.this).a(b.a(this.e), this.f, this.f479b);
    }
}
