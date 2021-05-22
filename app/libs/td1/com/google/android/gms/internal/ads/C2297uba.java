package com.google.android.gms.internal.ads;

import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.util.List;
import java.util.Vector;
import java.util.concurrent.ConcurrentHashMap;

/* access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.ads.uba  reason: case insensitive filesystem */
public final class C2297uba {

    /* renamed from: a  reason: collision with root package name */
    private final ConcurrentHashMap<C2228tba, List<Throwable>> f5733a = new ConcurrentHashMap<>(16, 0.75f, 10);

    /* renamed from: b  reason: collision with root package name */
    private final ReferenceQueue<Throwable> f5734b = new ReferenceQueue<>();

    C2297uba() {
    }

    public final List<Throwable> a(Throwable th, boolean z) {
        while (true) {
            Reference<? extends Throwable> poll = this.f5734b.poll();
            if (poll == null) {
                break;
            }
            this.f5733a.remove(poll);
        }
        List<Throwable> list = this.f5733a.get(new C2228tba(th, null));
        if (!z || list != null) {
            return list;
        }
        Vector vector = new Vector(2);
        List<Throwable> putIfAbsent = this.f5733a.putIfAbsent(new C2228tba(th, this.f5734b), vector);
        return putIfAbsent == null ? vector : putIfAbsent;
    }
}
