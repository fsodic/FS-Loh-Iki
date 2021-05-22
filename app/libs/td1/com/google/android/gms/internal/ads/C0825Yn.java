package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.ads.Yn  reason: case insensitive filesystem */
public final class C0825Yn {

    /* renamed from: a  reason: collision with root package name */
    private final ArrayList<C1695lka> f3593a = new ArrayList<>();

    /* renamed from: b  reason: collision with root package name */
    private long f3594b;

    C0825Yn() {
    }

    /* access modifiers changed from: package-private */
    public final long a() {
        Iterator<C1695lka> it = this.f3593a.iterator();
        while (it.hasNext()) {
            Map<String, List<String>> a2 = it.next().a();
            if (a2 != null) {
                for (Map.Entry<String, List<String>> entry : a2.entrySet()) {
                    try {
                        if ("content-length".equalsIgnoreCase(entry.getKey())) {
                            this.f3594b = Math.max(this.f3594b, Long.parseLong(entry.getValue().get(0)));
                        }
                    } catch (RuntimeException unused) {
                    }
                }
                it.remove();
            }
        }
        return this.f3594b;
    }

    /* access modifiers changed from: package-private */
    public final void a(C1695lka lka) {
        this.f3593a.add(lka);
    }
}
