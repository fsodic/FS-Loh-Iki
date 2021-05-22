package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

final class Uja implements AbstractC1192ea {

    /* renamed from: a  reason: collision with root package name */
    private final Map<String, List<AbstractC0959b<?>>> f3275a = new HashMap();

    /* renamed from: b  reason: collision with root package name */
    private final Tia f3276b;

    Uja(Tia tia) {
        this.f3276b = tia;
    }

    /* access modifiers changed from: private */
    public final synchronized boolean b(AbstractC0959b<?> bVar) {
        String f = bVar.f();
        if (this.f3275a.containsKey(f)) {
            List<AbstractC0959b<?>> list = this.f3275a.get(f);
            if (list == null) {
                list = new ArrayList<>();
            }
            bVar.a("waiting-for-response");
            list.add(bVar);
            this.f3275a.put(f, list);
            if (C0558Og.f2767b) {
                C0558Og.a("Request for cacheKey=%s is in flight, putting on hold.", f);
            }
            return true;
        }
        this.f3275a.put(f, null);
        bVar.a((AbstractC1192ea) this);
        if (C0558Og.f2767b) {
            C0558Og.a("new request, sending to network %s", f);
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1192ea
    public final synchronized void a(AbstractC0959b<?> bVar) {
        String f = bVar.f();
        List<AbstractC0959b<?>> remove = this.f3275a.remove(f);
        if (remove != null && !remove.isEmpty()) {
            if (C0558Og.f2767b) {
                C0558Og.c("%d waiting requests for cacheKey=%s; resend to network", Integer.valueOf(remove.size()), f);
            }
            AbstractC0959b<?> remove2 = remove.remove(0);
            this.f3275a.put(f, remove);
            remove2.a((AbstractC1192ea) this);
            try {
                Tia.a(this.f3276b).put(remove2);
            } catch (InterruptedException e) {
                C0558Og.b("Couldn't add request to queue. %s", e.toString());
                Thread.currentThread().interrupt();
                this.f3276b.a();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1192ea
    public final void a(AbstractC0959b<?> bVar, C0191Ad<?> ad) {
        List<AbstractC0959b<?>> remove;
        C2244tja tja = ad.f1526b;
        if (tja == null || tja.a()) {
            a(bVar);
            return;
        }
        String f = bVar.f();
        synchronized (this) {
            remove = this.f3275a.remove(f);
        }
        if (remove != null) {
            if (C0558Og.f2767b) {
                C0558Og.c("Releasing %d waiting requests for cacheKey=%s.", Integer.valueOf(remove.size()), f);
            }
            for (AbstractC0959b<?> bVar2 : remove) {
                Tia.b(this.f3276b).a(bVar2, ad);
            }
        }
    }
}
