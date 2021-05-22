package com.google.android.gms.internal.ads;

import java.util.Map;

/* access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.ads.le  reason: case insensitive filesystem */
public final class C1682le implements AbstractC0268Dc<AbstractC0244Ce> {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ C1955pca f4871a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ AbstractC0607Qd f4872b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ C2661zl f4873c;
    private final /* synthetic */ C1132de d;

    C1682le(C1132de deVar, C1955pca pca, AbstractC0607Qd qd, C2661zl zlVar) {
        this.d = deVar;
        this.f4871a = pca;
        this.f4872b = qd;
        this.f4873c = zlVar;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.util.Map] */
    @Override // com.google.android.gms.internal.ads.AbstractC0268Dc
    public final /* synthetic */ void a(AbstractC0244Ce ce, Map map) {
        synchronized (this.d.f4119a) {
            C0745Vl.c("JS Engine is requesting an update");
            if (this.d.h == 0) {
                C0745Vl.c("Starting reload.");
                this.d.h = 2;
                this.d.a(this.f4871a);
            }
            this.f4872b.b("/requestReload", (AbstractC0268Dc) this.f4873c.a());
        }
    }
}
