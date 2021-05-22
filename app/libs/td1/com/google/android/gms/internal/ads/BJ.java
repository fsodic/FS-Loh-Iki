package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.internal.ads.AbstractC2331uv;
import java.util.Iterator;

public final class BJ<AdT, AdapterT, ListenerT extends AbstractC2331uv> implements AbstractC1793nH<AdT> {

    /* renamed from: a  reason: collision with root package name */
    private final AbstractC1862oH<AdapterT, ListenerT> f1597a;

    /* renamed from: b  reason: collision with root package name */
    private final AbstractC2000qH<AdT, AdapterT, ListenerT> f1598b;

    /* renamed from: c  reason: collision with root package name */
    private final BT f1599c;
    private final VW d;

    public BJ(BT bt, VW vw, AbstractC1862oH<AdapterT, ListenerT> oHVar, AbstractC2000qH<AdT, AdapterT, ListenerT> qHVar) {
        this.f1599c = bt;
        this.d = vw;
        this.f1598b = qHVar;
        this.f1597a = oHVar;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1793nH
    public final SW<AdT> a(BR br, C1941pR pRVar) {
        C1931pH<AdapterT, ListenerT> pHVar;
        Iterator<String> it = pRVar.q.iterator();
        while (true) {
            if (!it.hasNext()) {
                pHVar = null;
                break;
            }
            try {
                pHVar = this.f1597a.a(it.next(), pRVar.s);
                break;
            } catch (MR unused) {
            }
        }
        if (pHVar == null) {
            return JW.a((Throwable) new EI("unable to instantiate mediation adapter class"));
        }
        C1423hm hmVar = new C1423hm();
        pHVar.f5212c.a(new GJ(this, hmVar));
        if (pRVar.E) {
            Bundle bundle = br.f1610a.f5888a.d.m;
            Bundle bundle2 = bundle.getBundle(AdMobAdapter.class.getName());
            if (bundle2 == null) {
                bundle2 = new Bundle();
                bundle.putBundle(AdMobAdapter.class.getName(), bundle2);
            }
            bundle2.putBoolean("render_test_ad_label", true);
        }
        return this.f1599c.a(EnumC2563yT.ADAPTER_LOAD_AD_SYN).a(new EJ(this, br, pRVar, pHVar), this.d).a(EnumC2563yT.ADAPTER_LOAD_AD_ACK).a((SW) hmVar).a(EnumC2563yT.ADAPTER_WRAP_ADAPTER).a((AbstractC1461iT<O2, O2>) new DJ(this, br, pRVar, pHVar)).a();
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ Object a(BR br, C1941pR pRVar, C1931pH pHVar, Void r4) {
        return this.f1598b.a(br, pRVar, pHVar);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void a(BR br, C1941pR pRVar, C1931pH pHVar) {
        this.f1598b.b(br, pRVar, pHVar);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1793nH
    public final boolean b(BR br, C1941pR pRVar) {
        return !pRVar.q.isEmpty();
    }
}
