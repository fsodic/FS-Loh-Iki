package com.google.android.gms.internal.ads;

import java.util.List;

/* access modifiers changed from: package-private */
public abstract class Lca {

    /* renamed from: a  reason: collision with root package name */
    private static final Lca f2509a = new Nca();

    /* renamed from: b  reason: collision with root package name */
    private static final Lca f2510b = new Rca();

    private Lca() {
    }

    static Lca a() {
        return f2509a;
    }

    static Lca b() {
        return f2510b;
    }

    /* access modifiers changed from: package-private */
    public abstract <L> List<L> a(Object obj, long j);

    /* access modifiers changed from: package-private */
    public abstract <L> void a(Object obj, Object obj2, long j);

    /* access modifiers changed from: package-private */
    public abstract void b(Object obj, long j);
}
