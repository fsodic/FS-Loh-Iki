package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.AbstractC1679lca;
import java.util.Iterator;
import java.util.Map;

/* access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.ads.jca  reason: case insensitive filesystem */
public final class C1541jca<T extends AbstractC1679lca<T>> {

    /* renamed from: a  reason: collision with root package name */
    private static final C1541jca f4691a = new C1541jca(true);

    /* renamed from: b  reason: collision with root package name */
    final Bda<T, Object> f4692b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f4693c;
    private boolean d;

    private C1541jca() {
        this.f4692b = Bda.a(16);
    }

    private C1541jca(Bda<T, Object> bda) {
        this.f4692b = bda;
        e();
    }

    private C1541jca(boolean z) {
        this(Bda.a(0));
        e();
    }

    public static int a(AbstractC1679lca<?> lca, Object obj) {
        lca.L();
        throw null;
    }

    private static <T extends AbstractC1679lca<T>> boolean a(Map.Entry<T, Object> entry) {
        entry.getKey().M();
        throw null;
    }

    private final void b(T t, Object obj) {
        t.N();
        throw null;
    }

    private final void b(Map.Entry<T, Object> entry) {
        T key = entry.getKey();
        Object value = entry.getValue();
        if (value instanceof Gca) {
            Gca gca = (Gca) value;
            Gca.c();
            throw null;
        }
        key.N();
        throw null;
    }

    private static int c(Map.Entry<T, Object> entry) {
        entry.getValue();
        entry.getKey().M();
        throw null;
    }

    public static <T extends AbstractC1679lca<T>> C1541jca<T> f() {
        return f4691a;
    }

    /* access modifiers changed from: package-private */
    public final Iterator<Map.Entry<T, Object>> a() {
        return this.d ? new Hca(this.f4692b.e().iterator()) : this.f4692b.e().iterator();
    }

    public final void a(C1541jca<T> jca) {
        if (jca.f4692b.c() <= 0) {
            Iterator<Map.Entry<T, Object>> it = jca.f4692b.d().iterator();
            if (it.hasNext()) {
                b(it.next());
                throw null;
            }
            return;
        }
        b(jca.f4692b.b(0));
        throw null;
    }

    public final boolean b() {
        return this.f4693c;
    }

    public final boolean c() {
        if (this.f4692b.c() <= 0) {
            Iterator<Map.Entry<T, Object>> it = this.f4692b.d().iterator();
            if (!it.hasNext()) {
                return true;
            }
            a(it.next());
            throw null;
        }
        a(this.f4692b.b(0));
        throw null;
    }

    public final /* synthetic */ Object clone() {
        C1541jca jca = new C1541jca();
        if (this.f4692b.c() <= 0) {
            Iterator<Map.Entry<T, Object>> it = this.f4692b.d().iterator();
            if (!it.hasNext()) {
                jca.d = this.d;
                return jca;
            }
            Map.Entry<T, Object> next = it.next();
            jca.b(next.getKey(), next.getValue());
            throw null;
        }
        Map.Entry<T, Object> b2 = this.f4692b.b(0);
        jca.b(b2.getKey(), b2.getValue());
        throw null;
    }

    public final Iterator<Map.Entry<T, Object>> d() {
        return this.d ? new Hca(this.f4692b.entrySet().iterator()) : this.f4692b.entrySet().iterator();
    }

    public final void e() {
        if (!this.f4693c) {
            this.f4692b.b();
            this.f4693c = true;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1541jca)) {
            return false;
        }
        return this.f4692b.equals(((C1541jca) obj).f4692b);
    }

    public final int g() {
        if (this.f4692b.c() <= 0) {
            Iterator<Map.Entry<T, Object>> it = this.f4692b.d().iterator();
            if (!it.hasNext()) {
                return 0;
            }
            c(it.next());
            throw null;
        }
        c(this.f4692b.b(0));
        throw null;
    }

    public final int hashCode() {
        return this.f4692b.hashCode();
    }
}
