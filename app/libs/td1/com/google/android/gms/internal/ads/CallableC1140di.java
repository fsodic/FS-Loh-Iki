package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.q;
import java.util.concurrent.Callable;

/* access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.ads.di  reason: case insensitive filesystem */
public final class CallableC1140di implements Callable<C0845Zh> {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ Context f4129a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ C0933ai f4130b;

    CallableC1140di(C0933ai aiVar, Context context) {
        this.f4130b = aiVar;
        this.f4129a = context;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // java.util.concurrent.Callable
    public final /* synthetic */ C0845Zh call() {
        C0845Zh zh;
        C1071ci ciVar = (C1071ci) this.f4130b.f3831a.get(this.f4129a);
        if (ciVar != null) {
            if (!(ciVar.f4017a + C1468ia.f4573a.a().longValue() < q.j().a())) {
                zh = new C1002bi(this.f4129a, ciVar.f4018b).a();
                this.f4130b.f3831a.put(this.f4129a, new C1071ci(this.f4130b, zh));
                return zh;
            }
        }
        zh = new C1002bi(this.f4129a).a();
        this.f4130b.f3831a.put(this.f4129a, new C1071ci(this.f4130b, zh));
        return zh;
    }
}
