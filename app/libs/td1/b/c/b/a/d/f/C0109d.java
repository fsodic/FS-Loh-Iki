package b.c.b.a.d.f;

import android.app.Activity;
import b.c.b.a.c.b;
import b.c.b.a.d.f.I;

/* renamed from: b.c.b.a.d.f.d  reason: case insensitive filesystem */
final class C0109d extends I.a {
    private final /* synthetic */ Activity e;
    private final /* synthetic */ String f;
    private final /* synthetic */ String g;
    private final /* synthetic */ I h;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C0109d(I i, Activity activity, String str, String str2) {
        super(i);
        this.h = i;
        this.e = activity;
        this.f = str;
        this.g = str2;
    }

    /* access modifiers changed from: package-private */
    @Override // b.c.b.a.d.f.I.a
    public final void a() {
        I.c(this.h).a(b.a(this.e), this.f, this.g, this.f478a);
    }
}
