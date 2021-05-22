package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.a.d;
import com.google.android.gms.common.internal.q;

public final class za<O extends a.d> {

    /* renamed from: a  reason: collision with root package name */
    private final boolean f1314a = true;

    /* renamed from: b  reason: collision with root package name */
    private final int f1315b;

    /* renamed from: c  reason: collision with root package name */
    private final a<O> f1316c;
    private final O d;

    private za(a<O> aVar) {
        this.f1316c = aVar;
        this.d = null;
        this.f1315b = System.identityHashCode(this);
    }

    public static <O extends a.d> za<O> a(a<O> aVar) {
        return new za<>(aVar);
    }

    public final String a() {
        return this.f1316c.b();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof za)) {
            return false;
        }
        za zaVar = (za) obj;
        return !this.f1314a && !zaVar.f1314a && q.a(this.f1316c, zaVar.f1316c) && q.a(this.d, zaVar.d);
    }

    public final int hashCode() {
        return this.f1315b;
    }
}
