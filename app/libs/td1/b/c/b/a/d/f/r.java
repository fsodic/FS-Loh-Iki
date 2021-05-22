package b.c.b.a.d.f;

import android.os.Bundle;
import b.c.b.a.d.f.I;

final class r extends I.a {
    private final /* synthetic */ Long e;
    private final /* synthetic */ String f;
    private final /* synthetic */ String g;
    private final /* synthetic */ Bundle h;
    private final /* synthetic */ boolean i;
    private final /* synthetic */ boolean j;
    private final /* synthetic */ I k;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    r(I i2, Long l, String str, String str2, Bundle bundle, boolean z, boolean z2) {
        super(i2);
        this.k = i2;
        this.e = l;
        this.f = str;
        this.g = str2;
        this.h = bundle;
        this.i = z;
        this.j = z2;
    }

    /* access modifiers changed from: package-private */
    @Override // b.c.b.a.d.f.I.a
    public final void a() {
        Long l = this.e;
        I.c(this.k).a(this.f, this.g, this.h, this.i, this.j, l == null ? this.f478a : l.longValue());
    }
}
