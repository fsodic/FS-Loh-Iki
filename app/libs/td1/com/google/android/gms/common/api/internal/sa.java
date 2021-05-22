package com.google.android.gms.common.api.internal;

import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.i;
import com.google.android.gms.common.api.j;
import com.google.android.gms.common.api.o;
import java.util.Collections;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;

public final class sa {

    /* renamed from: a  reason: collision with root package name */
    public static final Status f1293a = new Status(8, "The connection to Google Play services was lost");

    /* renamed from: b  reason: collision with root package name */
    private static final BasePendingResult<?>[] f1294b = new BasePendingResult[0];

    /* renamed from: c  reason: collision with root package name */
    final Set<BasePendingResult<?>> f1295c = Collections.synchronizedSet(Collections.newSetFromMap(new WeakHashMap()));
    private final va d = new ta(this);
    private final Map<a.c<?>, a.f> e;

    public sa(Map<a.c<?>, a.f> map) {
        this.e = map;
    }

    public final void a() {
        BasePendingResult[] basePendingResultArr = (BasePendingResult[]) this.f1295c.toArray(f1294b);
        for (BasePendingResult basePendingResult : basePendingResultArr) {
            o oVar = null;
            basePendingResult.a((va) null);
            if (basePendingResult.d() != null) {
                basePendingResult.a((j) null);
                IBinder k = this.e.get(((AbstractC0140c) basePendingResult).h()).k();
                if (basePendingResult.c()) {
                    basePendingResult.a(new ua(basePendingResult, null, k, null));
                } else {
                    if (k == null || !k.isBinderAlive()) {
                        basePendingResult.a((va) null);
                    } else {
                        ua uaVar = new ua(basePendingResult, null, k, null);
                        basePendingResult.a(uaVar);
                        try {
                            k.linkToDeath(uaVar, 0);
                        } catch (RemoteException unused) {
                        }
                    }
                    basePendingResult.a();
                    oVar.a(basePendingResult.d().intValue());
                }
            } else if (!basePendingResult.e()) {
            }
            this.f1295c.remove(basePendingResult);
        }
    }

    /* access modifiers changed from: package-private */
    public final void a(BasePendingResult<? extends i> basePendingResult) {
        this.f1295c.add(basePendingResult);
        basePendingResult.a(this.d);
    }

    public final void b() {
        for (BasePendingResult basePendingResult : (BasePendingResult[]) this.f1295c.toArray(f1294b)) {
            basePendingResult.c(f1293a);
        }
    }
}
