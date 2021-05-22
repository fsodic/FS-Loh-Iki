package com.google.android.gms.common.api.internal;

import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;

/* renamed from: com.google.android.gms.common.api.internal.k  reason: case insensitive filesystem */
public class C0156k {

    /* renamed from: a  reason: collision with root package name */
    private final Set<C0154j<?>> f1276a = Collections.newSetFromMap(new WeakHashMap());

    public final void a() {
        for (C0154j<?> jVar : this.f1276a) {
            jVar.a();
        }
        this.f1276a.clear();
    }
}
