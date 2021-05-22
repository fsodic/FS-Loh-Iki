package com.google.android.gms.internal.ads;

import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;

/* access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.ads.tba  reason: case insensitive filesystem */
public final class C2228tba extends WeakReference<Throwable> {

    /* renamed from: a  reason: collision with root package name */
    private final int f5624a;

    public C2228tba(Throwable th, ReferenceQueue<Throwable> referenceQueue) {
        super(th, referenceQueue);
        if (th != null) {
            this.f5624a = System.identityHashCode(th);
            return;
        }
        throw new NullPointerException("The referent cannot be null");
    }

    public final boolean equals(Object obj) {
        if (obj != null && obj.getClass() == C2228tba.class) {
            if (this == obj) {
                return true;
            }
            C2228tba tba = (C2228tba) obj;
            return this.f5624a == tba.f5624a && get() == tba.get();
        }
    }

    public final int hashCode() {
        return this.f5624a;
    }
}
