package com.google.android.gms.internal.ads;

import android.view.View;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.gms.internal.ads.qy  reason: case insensitive filesystem */
public class C2059qy {

    /* renamed from: a  reason: collision with root package name */
    private final AbstractC0732Uy f5381a;

    /* renamed from: b  reason: collision with root package name */
    private final AbstractC1564jo f5382b;

    public C2059qy(AbstractC0732Uy uy) {
        this(uy, null);
    }

    public C2059qy(AbstractC0732Uy uy, AbstractC1564jo joVar) {
        this.f5381a = uy;
        this.f5382b = joVar;
    }

    public final C0523Mx<AbstractC0366Gw> a(Executor executor) {
        return new C0523Mx<>(new C2196sy(this.f5382b), executor);
    }

    public final AbstractC1564jo a() {
        return this.f5382b;
    }

    public Set<C0523Mx<AbstractC0520Mu>> a(C0836Yy yy) {
        return Collections.singleton(C0523Mx.a(yy, C0875_l.f));
    }

    public final AbstractC0732Uy b() {
        return this.f5381a;
    }

    public final View c() {
        AbstractC1564jo joVar = this.f5382b;
        if (joVar != null) {
            return joVar.getWebView();
        }
        return null;
    }

    public final View d() {
        AbstractC1564jo joVar = this.f5382b;
        if (joVar == null) {
            return null;
        }
        return joVar.getWebView();
    }
}
