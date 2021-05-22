package com.google.android.gms.internal.ads;

import java.util.Map;
import java.util.concurrent.Executor;

public final class JB {

    /* renamed from: a  reason: collision with root package name */
    private final Executor f2297a;

    /* renamed from: b  reason: collision with root package name */
    private final C0335Fr f2298b;

    /* renamed from: c  reason: collision with root package name */
    private final C0601Px f2299c;

    JB(Executor executor, C0335Fr fr, C0601Px px) {
        this.f2297a = executor;
        this.f2299c = px;
        this.f2298b = fr;
    }

    public final void a(AbstractC1564jo joVar) {
        if (joVar != null) {
            this.f2299c.a(joVar.getView());
            this.f2299c.a(new MB(joVar), this.f2297a);
            this.f2299c.a(new LB(joVar), this.f2297a);
            this.f2299c.a(this.f2298b, this.f2297a);
            this.f2298b.a(joVar);
            joVar.a("/trackActiveViewUnit", new OB(this));
            joVar.a("/untrackActiveViewUnit", new NB(this));
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void a(AbstractC1564jo joVar, Map map) {
        this.f2298b.a();
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void b(AbstractC1564jo joVar, Map map) {
        this.f2298b.b();
    }
}
