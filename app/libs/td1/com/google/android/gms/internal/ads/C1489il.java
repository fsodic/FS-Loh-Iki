package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.il  reason: case insensitive filesystem */
public final class C1489il {

    /* renamed from: a  reason: collision with root package name */
    private static C1126db f4596a;

    /* renamed from: b  reason: collision with root package name */
    private static final Object f4597b = new Object();
    @Deprecated

    /* renamed from: c  reason: collision with root package name */
    private static final AbstractC1765ml<Void> f4598c = new C1421hl();

    public C1489il(Context context) {
        a(context.getApplicationContext() != null ? context.getApplicationContext() : context);
    }

    public static SW<C1912opa> a(String str) {
        C1423hm hmVar = new C1423hm();
        f4596a.a(new C1903ol(str, hmVar));
        return hmVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0027  */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x002c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static com.google.android.gms.internal.ads.C1126db a(android.content.Context r3) {
        /*
            java.lang.Object r0 = com.google.android.gms.internal.ads.C1489il.f4597b
            monitor-enter(r0)
            com.google.android.gms.internal.ads.db r1 = com.google.android.gms.internal.ads.C1489il.f4596a     // Catch:{ all -> 0x0036 }
            if (r1 != 0) goto L_0x0032
            com.google.android.gms.internal.ads.C2474x.a(r3)     // Catch:{ all -> 0x0036 }
            boolean r1 = com.google.android.gms.common.util.c.a()     // Catch:{ all -> 0x0036 }
            if (r1 != 0) goto L_0x0024
            com.google.android.gms.internal.ads.i<java.lang.Boolean> r1 = com.google.android.gms.internal.ads.C2474x.Gc     // Catch:{ all -> 0x0036 }
            com.google.android.gms.internal.ads.t r2 = com.google.android.gms.internal.ads.C2392voa.e()     // Catch:{ all -> 0x0036 }
            java.lang.Object r1 = r2.a(r1)     // Catch:{ all -> 0x0036 }
            java.lang.Boolean r1 = (java.lang.Boolean) r1     // Catch:{ all -> 0x0036 }
            boolean r1 = r1.booleanValue()     // Catch:{ all -> 0x0036 }
            if (r1 == 0) goto L_0x0024
            r1 = 1
            goto L_0x0025
        L_0x0024:
            r1 = 0
        L_0x0025:
            if (r1 == 0) goto L_0x002c
            com.google.android.gms.internal.ads.db r3 = com.google.android.gms.internal.ads.C0822Yk.a(r3)     // Catch:{ all -> 0x0036 }
            goto L_0x0030
        L_0x002c:
            com.google.android.gms.internal.ads.db r3 = com.google.android.gms.internal.ads.C2464wq.a(r3)     // Catch:{ all -> 0x0036 }
        L_0x0030:
            com.google.android.gms.internal.ads.C1489il.f4596a = r3     // Catch:{ all -> 0x0036 }
        L_0x0032:
            com.google.android.gms.internal.ads.db r3 = com.google.android.gms.internal.ads.C1489il.f4596a     // Catch:{ all -> 0x0036 }
            monitor-exit(r0)     // Catch:{ all -> 0x0036 }
            return r3
        L_0x0036:
            r3 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0036 }
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C1489il.a(android.content.Context):com.google.android.gms.internal.ads.db");
    }

    public final SW<String> a(int i, String str, Map<String, String> map, byte[] bArr) {
        C1696ll llVar = new C1696ll(null);
        C1627kl klVar = new C1627kl(this, str, llVar);
        C0563Ol ol = new C0563Ol(null);
        C1558jl jlVar = new C1558jl(this, i, str, llVar, klVar, bArr, map, ol);
        if (C0563Ol.a()) {
            try {
                ol.a(str, "GET", jlVar.a(), jlVar.h());
            } catch (C2173sia e) {
                C0745Vl.d(e.getMessage());
            }
        }
        f4596a.a(jlVar);
        return llVar;
    }

    public final SW<String> a(String str, Map<String, String> map) {
        return a(0, str, map, null);
    }
}
