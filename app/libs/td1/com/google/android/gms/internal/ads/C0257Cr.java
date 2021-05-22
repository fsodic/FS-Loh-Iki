package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.overlay.o;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.Executor;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.Cr  reason: case insensitive filesystem */
public final class C0257Cr implements Sea<Set<C0523Mx<o>>> {

    /* renamed from: a  reason: collision with root package name */
    private final _ea<C2120rr> f1734a;

    /* renamed from: b  reason: collision with root package name */
    private final _ea<Executor> f1735b;

    /* renamed from: c  reason: collision with root package name */
    private final _ea<JSONObject> f1736c;

    private C0257Cr(_ea<C2120rr> _ea, _ea<Executor> _ea2, _ea<JSONObject> _ea3) {
        this.f1734a = _ea;
        this.f1735b = _ea2;
        this.f1736c = _ea3;
    }

    public static C0257Cr a(_ea<C2120rr> _ea, _ea<Executor> _ea2, _ea<JSONObject> _ea3) {
        return new C0257Cr(_ea, _ea2, _ea3);
    }

    @Override // com.google.android.gms.internal.ads._ea
    public final /* synthetic */ Object get() {
        Set emptySet = this.f1736c.get() == null ? Collections.emptySet() : Collections.singleton(new C0523Mx(this.f1734a.get(), this.f1735b.get()));
        Xea.a(emptySet, "Cannot return null from a non-@Nullable @Provides method");
        return emptySet;
    }
}
