package com.google.android.gms.internal.ads;

import java.util.HashSet;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.rP  reason: case insensitive filesystem */
public final class C2076rP implements Sea<C1112dO<JSONObject>> {
    public static C1112dO<JSONObject> a(AbstractC0613Qj qj, Object obj, C2558yO yOVar, WO wo, Lea<C2144sO> lea, Lea<DO> lea2, Lea<HO> lea3, Lea<NO> lea4, Lea<SO> lea5, Lea<C0906aP> lea6, Lea<C1250fP> lea7, Lea<C2214tP> lea8, Executor executor, ScheduledExecutorService scheduledExecutorService) {
        HashSet hashSet = new HashSet();
        hashSet.add((OO) obj);
        hashSet.add(yOVar);
        hashSet.add(wo);
        if (((Boolean) C2392voa.e().a(C2474x.Gd)).booleanValue()) {
            hashSet.add(lea.get());
        }
        if (((Boolean) C2392voa.e().a(C2474x.Hd)).booleanValue()) {
            hashSet.add(lea2.get());
        }
        if (((Boolean) C2392voa.e().a(C2474x.Id)).booleanValue()) {
            hashSet.add(lea3.get());
        }
        if (((Boolean) C2392voa.e().a(C2474x.Jd)).booleanValue()) {
            hashSet.add(lea4.get());
        }
        if (((Boolean) C2392voa.e().a(C2474x.Nd)).booleanValue()) {
            hashSet.add(new C1868oN(lea6.get(), ((Long) C2392voa.e().a(C2474x.mc)).longValue(), scheduledExecutorService));
        }
        if (((Boolean) C2392voa.e().a(C2474x.Pd)).booleanValue()) {
            hashSet.add(lea7.get());
        }
        if (((Boolean) C2392voa.e().a(C2474x.Qd)).booleanValue()) {
            hashSet.add(lea8.get());
        }
        C1112dO<JSONObject> dOVar = new C1112dO<>(executor, hashSet);
        Xea.a(dOVar, "Cannot return null from a non-@Nullable @Provides method");
        return dOVar;
    }
}
