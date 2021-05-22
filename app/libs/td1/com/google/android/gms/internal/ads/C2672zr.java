package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Set;
import java.util.concurrent.Executor;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.zr  reason: case insensitive filesystem */
public final class C2672zr implements Sea<Set<C0523Mx<AbstractC1229ev>>> {

    /* renamed from: a  reason: collision with root package name */
    private final _ea<C2120rr> f6216a;

    /* renamed from: b  reason: collision with root package name */
    private final _ea<Executor> f6217b;

    /* renamed from: c  reason: collision with root package name */
    private final _ea<JSONObject> f6218c;

    private C2672zr(_ea<C2120rr> _ea, _ea<Executor> _ea2, _ea<JSONObject> _ea3) {
        this.f6216a = _ea;
        this.f6217b = _ea2;
        this.f6218c = _ea3;
    }

    public static C2672zr a(_ea<C2120rr> _ea, _ea<Executor> _ea2, _ea<JSONObject> _ea3) {
        return new C2672zr(_ea, _ea2, _ea3);
    }

    @Override // com.google.android.gms.internal.ads._ea
    public final /* synthetic */ Object get() {
        Set emptySet = this.f6218c.get() == null ? Collections.emptySet() : Collections.singleton(new C0523Mx(this.f6216a.get(), this.f6217b.get()));
        Xea.a(emptySet, "Cannot return null from a non-@Nullable @Provides method");
        return emptySet;
    }
}
