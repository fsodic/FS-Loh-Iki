package b.c.b.a.d.f;

import android.os.Bundle;
import b.c.b.a.d.f.I;

final class K extends I.a {
    private final /* synthetic */ String e;
    private final /* synthetic */ String f;
    private final /* synthetic */ Bundle g;
    private final /* synthetic */ I h;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    K(I i, String str, String str2, Bundle bundle) {
        super(i);
        this.h = i;
        this.e = str;
        this.f = str2;
        this.g = bundle;
    }

    /* access modifiers changed from: package-private */
    @Override // b.c.b.a.d.f.I.a
    public final void a() {
        I.c(this.h).a(this.e, this.f, this.g);
    }
}
