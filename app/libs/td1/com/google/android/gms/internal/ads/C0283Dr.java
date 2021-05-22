package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Set;
import java.util.concurrent.Executor;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.Dr  reason: case insensitive filesystem */
public final class C0283Dr implements Sea<Set<C0523Mx<AbstractC1835nla>>> {

    /* renamed from: a  reason: collision with root package name */
    private final _ea<C2120rr> f1828a;

    /* renamed from: b  reason: collision with root package name */
    private final _ea<Executor> f1829b;

    /* renamed from: c  reason: collision with root package name */
    private final _ea<JSONObject> f1830c;

    private C0283Dr(_ea<C2120rr> _ea, _ea<Executor> _ea2, _ea<JSONObject> _ea3) {
        this.f1828a = _ea;
        this.f1829b = _ea2;
        this.f1830c = _ea3;
    }

    public static C0283Dr a(_ea<C2120rr> _ea, _ea<Executor> _ea2, _ea<JSONObject> _ea3) {
        return new C0283Dr(_ea, _ea2, _ea3);
    }

    @Override // com.google.android.gms.internal.ads._ea
    public final /* synthetic */ Object get() {
        Set emptySet = this.f1830c.get() == null ? Collections.emptySet() : Collections.singleton(new C0523Mx(this.f1828a.get(), this.f1829b.get()));
        Xea.a(emptySet, "Cannot return null from a non-@Nullable @Provides method");
        return emptySet;
    }
}
