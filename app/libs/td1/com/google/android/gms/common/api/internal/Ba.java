package com.google.android.gms.common.api.internal;

import a.c.b;
import b.c.b.a.h.f;
import com.google.android.gms.common.api.c;
import com.google.android.gms.common.api.e;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public final class Ba {

    /* renamed from: a  reason: collision with root package name */
    private final b<za<?>, b.c.b.a.b.b> f1195a = new b<>();

    /* renamed from: b  reason: collision with root package name */
    private final b<za<?>, String> f1196b = new b<>();

    /* renamed from: c  reason: collision with root package name */
    private final f<Map<za<?>, String>> f1197c = new f<>();
    private int d;
    private boolean e = false;

    public Ba(Iterable<? extends e<?>> iterable) {
        Iterator<? extends e<?>> it = iterable.iterator();
        while (it.hasNext()) {
            this.f1195a.put(((e) it.next()).e(), null);
        }
        this.d = this.f1195a.keySet().size();
    }

    public final b.c.b.a.h.e<Map<za<?>, String>> a() {
        return this.f1197c.a();
    }

    public final void a(za<?> zaVar, b.c.b.a.b.b bVar, String str) {
        this.f1195a.put(zaVar, bVar);
        this.f1196b.put(zaVar, str);
        this.d--;
        if (!bVar.P()) {
            this.e = true;
        }
        if (this.d != 0) {
            return;
        }
        if (this.e) {
            this.f1197c.a(new c(this.f1195a));
            return;
        }
        this.f1197c.a(this.f1196b);
    }

    public final Set<za<?>> b() {
        return this.f1195a.keySet();
    }
}
