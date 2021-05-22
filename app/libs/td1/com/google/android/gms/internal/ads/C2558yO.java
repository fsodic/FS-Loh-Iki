package com.google.android.gms.internal.ads;

import android.content.pm.PackageInfo;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.gms.internal.ads.yO  reason: case insensitive filesystem */
public final class C2558yO implements AbstractC1180eO<C2351vO> {

    /* renamed from: a  reason: collision with root package name */
    private final AbstractC0743Vj f6075a;

    /* renamed from: b  reason: collision with root package name */
    private final Executor f6076b;

    /* renamed from: c  reason: collision with root package name */
    private final String f6077c;
    private final PackageInfo d;

    public C2558yO(AbstractC0743Vj vj, Executor executor, String str, PackageInfo packageInfo) {
        this.f6075a = vj;
        this.f6076b = executor;
        this.f6077c = str;
        this.d = packageInfo;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1180eO
    public final SW<C2351vO> a() {
        return JW.a(JW.a(this.f6075a.a(this.f6077c, this.d), C2489xO.f5978a, this.f6076b), Throwable.class, new AO(this), this.f6076b);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ SW a(Throwable th) {
        return JW.a(new C2351vO(this.f6077c));
    }
}
