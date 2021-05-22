package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.Collections;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;

public final class WD implements Sea<Set<C0523Mx<IT>>> {

    /* renamed from: a  reason: collision with root package name */
    private final _ea<String> f3393a;

    /* renamed from: b  reason: collision with root package name */
    private final _ea<Context> f3394b;

    /* renamed from: c  reason: collision with root package name */
    private final _ea<Executor> f3395c;
    private final _ea<Map<EnumC2563yT, C0895aE>> d;

    public WD(_ea<String> _ea, _ea<Context> _ea2, _ea<Executor> _ea3, _ea<Map<EnumC2563yT, C0895aE>> _ea4) {
        this.f3393a = _ea;
        this.f3394b = _ea2;
        this.f3395c = _ea3;
        this.d = _ea4;
    }

    @Override // com.google.android.gms.internal.ads._ea
    public final /* synthetic */ Object get() {
        Set set;
        String str = this.f3393a.get();
        Context context = this.f3394b.get();
        Executor executor = this.f3395c.get();
        Map<EnumC2563yT, C0895aE> map = this.d.get();
        if (((Boolean) C2392voa.e().a(C2474x.Wc)).booleanValue()) {
            Dma dma = new Dma(new Hma(context));
            dma.a(new YD(str));
            set = Collections.singleton(new C0523Mx(new ZD(dma, map), executor));
        } else {
            set = Collections.emptySet();
        }
        Xea.a(set, "Cannot return null from a non-@Nullable @Provides method");
        return set;
    }
}
