package com.google.android.gms.common.api.internal;

import b.c.b.a.h.f;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.b;
import com.google.android.gms.common.api.g;
import com.google.android.gms.common.api.i;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.WeakHashMap;

/* renamed from: com.google.android.gms.common.api.internal.q  reason: case insensitive filesystem */
public final class C0166q {

    /* renamed from: a  reason: collision with root package name */
    private final Map<BasePendingResult<?>, Boolean> f1287a = Collections.synchronizedMap(new WeakHashMap());

    /* renamed from: b  reason: collision with root package name */
    private final Map<f<?>, Boolean> f1288b = Collections.synchronizedMap(new WeakHashMap());

    private final void a(boolean z, Status status) {
        HashMap hashMap;
        HashMap hashMap2;
        synchronized (this.f1287a) {
            hashMap = new HashMap(this.f1287a);
        }
        synchronized (this.f1288b) {
            hashMap2 = new HashMap(this.f1288b);
        }
        for (Map.Entry entry : hashMap.entrySet()) {
            if (z || ((Boolean) entry.getValue()).booleanValue()) {
                ((BasePendingResult) entry.getKey()).c(status);
            }
        }
        for (Map.Entry entry2 : hashMap2.entrySet()) {
            if (z || ((Boolean) entry2.getValue()).booleanValue()) {
                ((f) entry2.getKey()).b((Exception) new b(status));
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final void a(BasePendingResult<? extends i> basePendingResult, boolean z) {
        this.f1287a.put(basePendingResult, Boolean.valueOf(z));
        basePendingResult.a((g.a) new r(this, basePendingResult));
    }

    /* access modifiers changed from: package-private */
    public final boolean a() {
        return !this.f1287a.isEmpty() || !this.f1288b.isEmpty();
    }

    public final void b() {
        a(false, C0146f.f1254a);
    }

    public final void c() {
        a(true, sa.f1293a);
    }
}
