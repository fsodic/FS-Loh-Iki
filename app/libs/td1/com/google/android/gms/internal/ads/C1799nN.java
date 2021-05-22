package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.q;
import java.util.Set;

/* renamed from: com.google.android.gms.internal.ads.nN  reason: case insensitive filesystem */
public final class C1799nN implements AbstractC1180eO<C1592kN> {

    /* renamed from: a  reason: collision with root package name */
    private final VW f5034a;

    /* renamed from: b  reason: collision with root package name */
    private final Context f5035b;

    /* renamed from: c  reason: collision with root package name */
    private final Set<String> f5036c;

    public C1799nN(VW vw, Context context, Set<String> set) {
        this.f5034a = vw;
        this.f5035b = context;
        this.f5036c = set;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1180eO
    public final SW<C1592kN> a() {
        return this.f5034a.a(new CallableC1730mN(this));
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ C1592kN b() {
        return (!((Boolean) C2392voa.e().a(C2474x.bd)).booleanValue() || !C1592kN.a(this.f5036c)) ? new C1592kN(null) : new C1592kN(q.r().a(this.f5035b));
    }
}
